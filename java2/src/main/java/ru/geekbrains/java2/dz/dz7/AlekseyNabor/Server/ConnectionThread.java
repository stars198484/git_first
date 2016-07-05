package ru.geekbrains.java2.dz.dz7.AlekseyNabor.Server;

import ru.geekbrains.java2.dz.dz7.AlekseyNabor.Client.Message;

import java.io.*;
import java.net.Socket;

/**
 * Created by nabor on 27.06.2016.
 */
public class ConnectionThread implements Runnable {

    private Socket socket;
    private Server controller;
    private ObjectInputStream objIn;
    private ObjectOutputStream objOut;
        //СТРОИМ СОЕДИНЕНИЕ
    ConnectionThread(Socket socket, Server controller) throws IOException {
        this.socket = socket;
        this.controller = controller;
        this.objIn = new ObjectInputStream(new BufferedInputStream(socket.getInputStream()));
        this.objOut = new ObjectOutputStream(new BufferedOutputStream(socket.getOutputStream()));
        System.out.println(socket.getInetAddress()+" connected");
    }

    @Override
    public void run() {

        sendMessage(new Message("<font color=green>Пожалуйста, введите ваш логин и пароль (login1 pass1)</font>"));

            try (SQLConnection sqlConnection = new SQLConnection()) { //ПРОЦЕСС АВТОРИЗАЦИИ
                while (true) {
                    if (sqlConnection.auth((Message) objIn.readObject())) {
                        sendMessage(new Message("<font color=green>Авторизация прошла успешно</font>"));
                        break;
                    }
                    sendMessage(new Message("<font color=red>Авторизация не выполнена, повторите попытку</font>"));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        try {
            while (true) { //БРОДКАСТИМ ВСЕ ВХОДЯЩИЕ СООБЩЕНИЯ
                controller.broadcastSend(objIn.readObject());
            }
        } catch (IOException e) {
            System.err.println(socket.getInetAddress()+" disconnected");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                controller.getConnectionsList().remove(this);
                objOut.flush();
                objOut.close();
                objIn.close();
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    public void sendMessage(Object message) {
        try { //ОТПРАВКА СООБЩЕНИЯ КЛИЕНТУ
            objOut.writeObject(message);
            objOut.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
