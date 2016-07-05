package ru.geekbrains.java2.dz.dz4.AlekseyNabor;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 * Created by AlekseyN 18.06.2016.
 */
class MessageSaver {

    private File messageFile;
    private ArrayList<Message> messages;

    MessageSaver(File file) {
        this.messageFile = file;
    }

    MessageSaver(File file, ArrayList<Message> msg) {
        this.messageFile = file;
        this.messages = msg;
        saveMessage();
    }

    MessageSaver(ArrayList<Message> msg) {
        if (this.messageFile != null) {
            this.messages = msg;
            saveMessage();
        } else {
            System.err.println("No file to save");
        }
    }

    //СОХРАНЯЕМ ЛИСТ КАК ОБЪЕКТ В ФАЙЛ
    private void saveMessage() {
        try (FileOutputStream fileOut = new FileOutputStream(messageFile);
             ObjectOutputStream objOut = new ObjectOutputStream(fileOut) )
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
