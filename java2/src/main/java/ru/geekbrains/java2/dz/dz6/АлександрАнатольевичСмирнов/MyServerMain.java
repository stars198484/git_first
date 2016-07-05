package ru.geekbrains.java2.dz.dz6.АлександрАнатольевичСмирнов;

import java.io.*;
import java.net.*;

/**
 * Created by Alexandr SMIRNOV on 24.06.2016.
 */

public class MyServerMain {

    public static final int IP_PORT_USED = 7777;
    private static final String[] SESSION_CLOSE_COMMANDs = {"/quit", "/exit", "/logout"};
    private static final String HELP_COMMAND = "/help";

    public static void main(String[] args) {

        try (ServerSocket serverSocket = new ServerSocket(IP_PORT_USED)) {

            while (true) {

                Socket s = serverSocket.accept();
                Thread thread = new Thread(new MyServerSocket(s, SESSION_CLOSE_COMMANDs, HELP_COMMAND));
                thread.start();

            } // while

        } catch (IOException e) {
            e.printStackTrace();
        } // try

    } // psvm

}
