package ru.geekbrains.java2.dz.dz4.AlekseyNabor;

import java.io.File;
import java.util.ArrayList;

/**
 * Created by AlekseyN on 18.06.2016.
 */
public class Engine {

    private File messageFile = new File("C:\\Users\\Public\\messagesLog.txt");
    private MessageLoader messageLoader;
    private MessageSaver messageSaver;
    private ArrayList<Message> messages;
    private final String myName;
    static byte saveInterval = 0;

    Engine(String name) {
        this.myName = name;
        messageLoader = new MessageLoader(messageFile);
        messageSaver = new MessageSaver(messageFile);
        messages = loadMessages();
        if (messages == null) {
            messages = new ArrayList<Message>();
        }
    }

    //ДОБАВИТЬ СООБЩЕНИЕ В ЛИСТ. + ИНТЕРВАЛ СОХРАНЕНИЯ В ФАЙЛ КАЖДЫЕ N СООБЩЕНИЙ
    void addMessage(String message) {
        Message newMsg = new Message(message,this.myName);
        this.messages.add(newMsg);
        saveInterval++;
        if (saveInterval > 10) { saveMessages(); saveInterval = 0; }
    }

    void addMessage(String message, String name) {
        Message newMsg = new Message(message,name);
        this.messages.add(newMsg);
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
}
