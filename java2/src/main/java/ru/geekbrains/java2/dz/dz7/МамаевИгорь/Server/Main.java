package ru.geekbrains.java2.dz.dz7.МамаевИгорь.Server;

/**
 * Created by Игорь on 30.06.2016.
 */
public class Main {
    public static void main(String[] args) {
        SQLHandler.connect();
        MyServer myServer = new MyServer();

    }
}
