package ru.geekbrains.java2.dz.dz7.AndreyIvanov.server;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by a.ivanov on 27.06.2016.
 */
public class ChatServer {

    public static final int PORT = 7777;
    public static final String EXIT = "exit";
    private List<ClientHandler> clients = new ArrayList<ClientHandler>();

    ChatServer() {

        ServerSocket server = null;
        Socket socket = null;
        try {
            server = new ServerSocket(PORT);
            System.out.println("Server Created. Waiting for client...");

            while (true) {
                socket = server.accept();
                System.out.println("Client connected");
                ClientHandler client = new ClientHandler(this, socket);
                clients.add(client);
                new Thread(client).start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally { // Закрытие сервера
            try {
                server.close();
                System.out.println("Server closed");
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void remove(ClientHandler clientHandler) {
        clients.remove(clientHandler);
    }

    public void broadcastMsg(String msg) {
        for (ClientHandler clientHandler : clients) {
            clientHandler.sendMsg(msg);
        }
    }
}
