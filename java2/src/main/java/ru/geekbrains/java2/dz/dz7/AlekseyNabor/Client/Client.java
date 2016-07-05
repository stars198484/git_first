package ru.geekbrains.java2.dz.dz7.AlekseyNabor.Client;

import java.io.*;
import java.net.ConnectException;
import java.net.Socket;

/**
 * Created by nabor on 27.06.2016.
 */
public class Client implements Runnable, Closeable {

    private ObjectInputStream objIn;
    private ObjectOutputStream objOut;
    private Socket socket;
    private Engine engine;
    private String srvAddress;

    //КОНСТРУКТОР КЛИЕНТА
    Client(Engine e, String srvAddress) throws IOException {
        this.engine = e;
        this.srvAddress = srvAddress;
        connect();
    }

    private void connect() {
        try {
            this.socket = new Socket(srvAddress,5010);
            objOut = new ObjectOutputStream(new BufferedOutputStream(socket.getOutputStream()));
        } catch (ConnectException e) {
            System.err.println("Ошибка подключния. Повторяем.");
            connect();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        try {
            objIn = new ObjectInputStream(new BufferedInputStream(socket.getInputStream()));
            while (true) {//ЖДЕМ ВХОДЯЩИХ СООБЩЕНИЙ
                    engine.addMessage((Message) objIn.readObject());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void pushMessage(Message message) {
        try { //ОТПРАВКА СООБЩЕНИЯ НА СЕРВЕР
            objOut.writeObject(message);
            objOut.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void close() {
        try {
            objIn.close();
            objOut.flush();
            objOut.close();
            socket.close();
        } catch (IOException e) {
            close();
        }

    }
}
