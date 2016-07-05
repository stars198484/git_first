package ru.geekbrains.java2.dz.dz6.YuryLukas;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Created by yurok on 18.06.16.
 */
public class Main {
    public static void main(String[] args) {

        ChatWindow chat = new ChatWindow();
        chat.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                chat.getCurrentBuffer().close();
            }
        });
        chat.setVisible(true);
    }
}
