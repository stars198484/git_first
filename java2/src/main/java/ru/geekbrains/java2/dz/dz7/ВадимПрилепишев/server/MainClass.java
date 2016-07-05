package ru.geekbrains.java2.dz.dz7.ВадимПрилепишев.server;

import ru.geekbrains.java2.lesson7.server.SQLHandler;

public class MainClass {
    public static void main(String[] args) {
        SQLHandler.connect();
//        SQLHandler.fillTable();
        Server w = new Server();
        //SQLHandler.disconnect();
    }
}
