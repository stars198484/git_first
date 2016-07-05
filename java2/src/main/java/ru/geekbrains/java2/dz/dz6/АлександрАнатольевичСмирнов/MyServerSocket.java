package ru.geekbrains.java2.dz.dz6.АлександрАнатольевичСмирнов;

import java.io.*;
import java.net.*;
import java.util.*;

/**
 * Created by Alexandr SMIRNOV on 24.06.2016.
 */

public class MyServerSocket implements Runnable {

    private static Socket serverSocket;
    private static List<String> SESSION_CLOSE_COMMANDs;
    private static String HELP_COMMAND;
    private String loginUser;

    public MyServerSocket(Socket socket, String[] strings, String string) {
        this.serverSocket = socket;
        this.SESSION_CLOSE_COMMANDs = Arrays.asList(strings);
        this.HELP_COMMAND = string;
    } // MyServerSocket(Socket, String[])

//    public MyServerSocket(Socket socket) {
//        this.serverSocket = socket;
//        this.SESSION_CLOSE_COMMAND = Arrays.asList(new String[]{"/exit"});
//        this.HELP_COMMAND = "/help";
//    } // MyServerSocket(Socket)

    @Override
    public void run() {

        try {

            InputStream inputStream = serverSocket.getInputStream();
            OutputStream outputStream = serverSocket.getOutputStream();

            try (Scanner in = new Scanner(inputStream)) {

                PrintWriter out = new PrintWriter(outputStream, true);
                out.println("Connect to server. Please enter your login.");

                while (true) {

                    String line = in.nextLine();

                    if (loginUser == null){
                        loginUser = line;
                        out.println("HI, " + loginUser);
                        continue;
                    } // if

                    if (SESSION_CLOSE_COMMANDs.contains(line)){
                        out.println("");
                        out.println("Buy, " + loginUser + "! You logout!");
                        break;
                    } // if

                    // удачно получилось, пустой ввод попадает сюда
                    if (HELP_COMMAND.contains(line)) {
                        out.println("");
                        out.println("HELP: enter to exit '/quit'");
                        continue;
                    } // if

                    out.println("server: " + line);

                } // while

            } // try

        } catch (IOException e) {
            e.printStackTrace();
        } // try

    } // run()
}
