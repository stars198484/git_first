package ru.geekbrains.java2.dz.dz4.СараевМаксим;

import javax.swing.*;
import java.awt.*;

/**
 * Created by desarz on 20.06.2016.
 */
public class Main {
    public static void main(String[] args) {
        // для Swing создаем диспетчер событий, далее все выполнение будет в диспетчере
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                ChatFrame frame = new ChatFrame();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setBounds(300, 300, 800, 450);
                frame.setVisible(true);
            }
        });
    }
}
