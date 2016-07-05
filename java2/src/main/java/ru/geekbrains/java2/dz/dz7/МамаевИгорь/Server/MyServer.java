package ru.geekbrains.java2.dz.dz7.МамаевИгорь.Server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;


public class MyServer {
    private List<ClientHandler> clients = new ArrayList<>();

    public MyServer() {
        ServerSocket serverSocket = null;
        Socket socket = null;

        try {
            serverSocket = new ServerSocket(8189);
            while (true) {
                socket = serverSocket.accept();
                System.out.println("main thread - new Client");
                ClientHandler handler = new ClientHandler(socket, this);
                clients.add(handler);
                new Thread(handler).start();
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            try {
                serverSocket.close();
                socket.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

    public void remove(ClientHandler ch) {
        clients.remove(ch);
    }

    public void broadcastMsg(String msg) {
        for (ClientHandler ch :
                clients) {
            ch.sendMsg(msg);
        }
    }

}
