package ru.geekbrains.java2.dz.dz7.ВадимПрилепишев.client;

import ru.geekbrains.java2.dz.dz7.ВадимПрилепишев.client.ClientChat;

import java.io.IOException;

/**
 * Created by Prilepishev Vadim on 18.06.2016.
 */
public class Main {
    public static void main(String[] args) {
        try {
            ClientChat clientChat = new ClientChat();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
