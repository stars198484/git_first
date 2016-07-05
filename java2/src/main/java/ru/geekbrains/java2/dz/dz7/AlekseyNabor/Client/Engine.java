package ru.geekbrains.java2.dz.dz7.AlekseyNabor.Client;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by AlekseyN on 18.06.2016.
 */
public class Engine {

    private File messageFile = new File("C:\\Users\\Public\\messagesLog.txt");
    private MessageLoader messageLoader;
    private MessageSaver messageSaver;
    private ArrayList<Message> messages;
    private String myName;
    private Client client;
    private BeCommForm mainForm;

    public Engine(String srvAddress) {
        messageLoader = new MessageLoader(messageFile);
        messageSaver = new MessageSaver(messageFile);
        messages = loadMessages();
        if (messages == null) { //СОЗДАТЬ СПИСОК СООБЩЕНИЙ ЕСЛИ ОН НЕ ЗАГРУЖЕН
            messages = new ArrayList<Message>();
        }

        try {
            Thread thread = new Thread(client = new Client(this,srvAddress));
            thread.start();
        } catch (IOException e) {
            e.printStackTrace();
        }

        mainForm = new BeCommForm(this);

        //AUTOSAVER Exception in thread "Thread-3" java.util.ConcurrentModificationException
        /*new Thread(new Runnable() {

            @Override
            public void run() {
                int old = messages.hashCode();
                while (true) {
                    if (old != messages.hashCode()) {
                    saveMessages();
                        old = messages.hashCode();
                        System.out.println("Автосохранение");
               }
                }
            }
        }).start();*/
    }
    //ОТПРАВИТЬ СООБЩЕНИЕ
    public void sendMessage(String message, String name) {
        Message newMsg = new Message(message,name);
        this.messages.add(newMsg);
        client.pushMessage(newMsg);
    }//ДОБАВИТЬ ВХОДЯЩЕЕ СООБЩЕНИЕ
    public void addMessage(Message message) {
        this.messages.add(message);
        mainForm.addMessage(message);
    }

    //ПРИНУДИТЕЛЬНО СОХРАНИТЬ ЛИСТ СООБЩЕНИЙ В ФАЙЛ
    void saveMessages() {
        messageSaver.saveMessage(messages);
    }

    //ЗАГРУЗКА ЛИСТА СООБЩЕНИЙ ИЗ ФАЙЛА
    private ArrayList<Message> loadMessages() {
        return messageLoader.getMessages();
    }

    //ГЕТТЕР ЛИСТА СООБЩЕНИЙ
    ArrayList<Message> getMessages() {
        return messages;
    }

    //УДАЛЕНИЕ ИСТОРИИ
    public void clearHistory() {
        this.messages = new ArrayList<Message>();
        saveMessages();
    }

    public String getMyName() {
        return this.myName;
    }

    public void setMyName(String myName) {
        this.myName = myName;
    }

}
