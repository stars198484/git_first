package ru.geekbrains.java2.dz.dz6.ВадимПрилепишев;

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
