package ru.geekbrains.java2.dz.dz7.РусланУстиц.client;

import ru.geekbrains.java2.dz.dz7.РусланУстиц.io.IOServer;

import java.io.IOException;
import java.net.Socket;

/**
 * Created by darky_000 on 17.06.2016.
 */
public class Client {

    private static final String ADDRESS = "localhost";
    private static final int PORT = 8081;
    private ChatForm chatForm;
    private Socket socket;
    private IOServer server;
    private ServerHandler serverHandler;

    public Client() {
        chatForm = new ChatForm(this);
    }

    public static void main(String[] args) {
        Client client = new Client();
    }

    void startServerConnection() {
        try {
            System.out.println("Connecting to server...");
            socket = new Socket(ADDRESS, PORT);
            server = new IOServer(socket);
            chatForm.setServerManipulator(server);
            serverHandler = new ServerHandler(server, chatForm);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    void stopServerConnection() {
        try {
            System.out.println("Disconnecting from server...");
            serverHandler.stop();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
