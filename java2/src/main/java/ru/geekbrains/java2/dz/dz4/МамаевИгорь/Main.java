package ru.geekbrains.java2.dz.dz4.МамаевИгорь;

import javax.swing.*;

/**
 * Created by Игорь on 18.06.2016.
 */
public class Main {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (UnsupportedLookAndFeelException | IllegalAccessException | InstantiationException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        new MainWindow();
    }
}

