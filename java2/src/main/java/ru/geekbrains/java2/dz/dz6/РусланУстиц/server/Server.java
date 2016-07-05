package ru.geekbrains.java2.dz.dz6.РусланУстиц.server;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created by darky_000 on 24.06.2016.
 */
public class Server {

    private static final int PORT = 8081;
    private static final String EXIT = "#exit";
    private static final String DISCONNECT = "#disconnect";

    public Server() {
        try (ServerSocket serverSocket = new ServerSocket(PORT)){
            try (Socket socket = serverSocket.accept()) {
                InputStream inputStream = socket.getInputStream();
                OutputStream outputStream = socket.getOutputStream();
                try (Scanner sc = new Scanner(inputStream)) {
                    PrintWriter out = new PrintWriter(outputStream, true);
                    out.println("Connected to server");
                    while (true) {
                        String line = "";
                        if (sc.hasNext())
                            line = sc.nextLine();
                        if (line.contains(EXIT)) break;
                        if (line.contains(DISCONNECT)) {
                            System.out.println("Disconnected client");
                        }
                        out.println(line);
                    }
                    out.println("Server terminating");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Server server = new Server();
    }

    private void getConnectionInfo(Socket socket) {
        System.out.println(socket.getLocalAddress());
        System.out.println(socket.getInetAddress());
        System.out.println(socket.getLocalPort());
        System.out.println(socket.getPort());
        System.out.println(socket.getLocalSocketAddress());
        System.out.println(socket.getRemoteSocketAddress());
    }
}
