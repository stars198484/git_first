package ru.geekbrains.java2.dz.dz7.AlekseyNabor.Server;

import ru.geekbrains.java2.dz.dz7.AlekseyNabor.Client.Engine;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

/**
 * Created by nabor on 27.06.2016.
 */
public class Server {

    private static final int PORT = 5010;
    private ArrayList<ConnectionThread> connectionThreads = new ArrayList<ConnectionThread>();

    public Server() {
        try (ServerSocket serverSocket = new ServerSocket(5010)) {

            while (true) {
                Socket clientSocket = serverSocket.accept();

                ConnectionThread connection = new ConnectionThread(clientSocket, this);
                    connectionThreads.add(connection);
                    new Thread(connection).start();

            }

        } catch (IOException e) {
            System.err.println("Server start failed (already started?)");
        }
    }

    public ArrayList<ConnectionThread> getConnectionsList() {
        return connectionThreads;
    }

    public void broadcastSend(Object message) {
        for (ConnectionThread connectionThread : connectionThreads) {
            connectionThread.sendMessage(message);
        }
    }

}
