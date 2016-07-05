package ru.geekbrains.java2.dz.dz4.ВадимПрилепишев;

import ru.geekbrains.java2.dz.dz4.ВадимПрилепишев.ChatWindow;

import java.io.IOException;

/**
 * Created by Prilepishev Vadim on 18.06.2016.
 */
public class Main {
    public static void main(String[] args) {
        try {
            ChatWindow chatWindow = new ChatWindow();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
