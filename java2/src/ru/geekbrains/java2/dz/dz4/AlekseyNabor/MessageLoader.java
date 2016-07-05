package ru.geekbrains.java2.dz.dz4.AlekseyNabor;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by AlekseyN on 18.06.2016.
 */
class MessageLoader {

    private File messageFile;
    private ArrayList<Message> messages;

    MessageLoader(File file) {
        this.messageFile = file;
        loadMessages();
    }

    //ЗАГРУЗКА ОБЪЕКТА С ЯВНЫМ ПРИВЕДЕНИЕМ ИЗ ФАЙЛА
    private List<Message> loadMessages() {
        try (FileInputStream fileIn = new FileInputStream(messageFile);
             ObjectInputStream objIn = new ObjectInputStream(fileIn) )
        {
                messages = ((ArrayList<Message>) objIn.readObject());
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Файл сообщений не найден. (первый запуск?)");
        } return messages;
    }

    ArrayList<Message> getMessages() {
        return this.messages;
    }

}
