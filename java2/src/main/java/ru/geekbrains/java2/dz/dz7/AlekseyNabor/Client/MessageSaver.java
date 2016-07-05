package ru.geekbrains.java2.dz.dz7.AlekseyNabor.Client;

import java.io.*;
import java.util.ArrayList;
import java.util.zip.GZIPOutputStream;

/**
 * Created by AlekseyN 18.06.2016.
 */
class MessageSaver {

    private File messageFile;
    private ArrayList<Message> messages;

    MessageSaver(File file) {
        this.messageFile = file;
    }

    //СОХРАНЯЕМ ЛИСТ КАК ОБЪЕКТ В ФАЙЛ
    private void saveMessage() {
        try (FileOutputStream fileOut = new FileOutputStream(messageFile);
             BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOut);
             GZIPOutputStream gzipOutputStream = new GZIPOutputStream(bufferedOutputStream);
             ObjectOutputStream objOut = new ObjectOutputStream(gzipOutputStream))
        {
            objOut.writeObject(messages);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    void saveMessage(ArrayList<Message> msg) {
        this.messages = msg;
        saveMessage();
    }

}
