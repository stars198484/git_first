package ru.geekbrains.java2.dz.dz6.ГерманВавилин;

import javax.swing.*;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created by gta5 on 27.06.2016.
 */
public class ChatServer implements Runnable {
    public static final String EXIT = "exit";
    public static final int port = 33000;
    public void run() {
            try (ServerSocket ss = new ServerSocket(port)) {
                System.out.println("Server is running");
                try (Socket s = ss.accept()) {
                    InputStream inputStream = s.getInputStream();
                    OutputStream outputStream = s.getOutputStream();
                    try (Scanner in = new Scanner(inputStream)) {
                        PrintWriter out = new PrintWriter(outputStream, true);
                        out.println("Server: Connect to server");
                        while (true) {
                            String line = in.nextLine();
                            if (EXIT.contains(line)) break;
                            out.println("Server: " + line);
                        }
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, "Ошибка создания сокета:\n" + e.getMessage());
            }

    }
}
