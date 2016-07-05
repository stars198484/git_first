package ru.geekbrains.java2.dz.dz7.РусланУстиц.server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by darky_000 on 24.06.2016.
 */
public class Server {

    private static final int PORT = 8081;
    private static final String EXIT = "#exit";
    private static final String DISCONNECT = "#disconnect";
    private List<ClientHandler> clients = new ArrayList<>();

    public Server() {
        ServerSocket serverSocket = null;
        Socket socket = null;
        try {
            serverSocket = new ServerSocket(PORT);
            System.out.println("Server created");
            while (true) {
                socket = serverSocket.accept();
                System.out.println("Client connected");
                ClientHandler client = new ClientHandler(socket, this);
                clients.add(client);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                serverSocket.close();
                System.out.println("Server closed");
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        SQLHandler.connect();
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

    public void remove(ClientHandler clientHandler) {
        clients.remove(clientHandler);
    }

    public void broadcastMessage(String message) {
        for (ClientHandler client : clients) {
            client.sendMessage(message);
        }
    }
}
