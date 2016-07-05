package ru.geekbrains.java2.dz.dz6.AlekseyNabor.Server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by nabor on 27.06.2016.
 */
public class Server {

    private static final int PORT = 5010;

    Server() {
        try (ServerSocket serverSocket = new ServerSocket(5010)) {

            while (true) {
                Socket clientSocket = serverSocket.accept();
                Connection connection = new Connection(clientSocket);
                new Thread(connection).start();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
