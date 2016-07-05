package ru.geekbrains.java2.dz.dz6.AlekseyNabor;

import java.io.File;
import java.io.IOException;
import java.net.Socket;
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
    private static byte saveInterval = 0;

    Engine() {
        try {
            client = new Client();
        } catch (IOException e) {
            e.printStackTrace();
        }
        messageLoader = new MessageLoader(messageFile);
        messageSaver = new MessageSaver(messageFile);
        messages = loadMessages();
        if (messages == null) { //СОЗДАТЬ СПИСОК СООБЩЕНИЙ ЕСЛИ ОН НЕ ЗАГРУЖЕН
            messages = new ArrayList<Message>();
        }
        mainForm = new BeCommForm(this);
    }

/*    //ДОБАВИТЬ СООБЩЕНИЕ В ЛИСТ. + ИНТЕРВАЛ СОХРАНЕНИЯ В ФАЙЛ КАЖДЫЕ N СООБЩЕНИЙ
    void addMessage(String message) {
        Message newMsg = new Message(message,this.myName);
        this.messages.add(newMsg);
        saveInterval++;
        if (saveInterval > 10) { saveMessages(); saveInterval = 0; }
    }*/

    public void addMessage(String message, String name) {
        Message newMsg = new Message(message,name);
        this.messages.add(newMsg);
        client.sendMessage(newMsg);
        mainForm.addMessage(newMsg);
    }
    public void addMessage(Message message) {
        this.messages.add(message);
        mainForm.addMessage(message);
    }

    //ПРИНУДИТЕЛЬНО СОХРАНИТЬ ЛИСТ СООБЩЕНИЙ В ФАЙЛ
    void saveMessages() {
        messageSaver.saveMessage(messages);
    }

    //ДОБАВИТЬ СООБЩЕНИЕ И СОХРАНИТЬ ЛИСТ СООБЩЕНИЙ В ФАЙЛ
    public void saveMessages(Message m) {
        this.messages.add(m);
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

    public void setMyName(String myName) {
        this.myName = myName;
    }

    public String getMyName() {
        return this.myName;
    }

}
