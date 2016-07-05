package ru.geekbrains.java2.dz.dz6.AlekseyNabor;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.GZIPInputStream;

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
             BufferedInputStream bufferedInputStream = new BufferedInputStream(fileIn);
             GZIPInputStream gzipInputStream = new GZIPInputStream(bufferedInputStream);
             ObjectInputStream objIn = new ObjectInputStream(gzipInputStream))
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
