package ru.geekbrains.java2.dz.dz7.РусланУстиц.client;

import ru.geekbrains.java2.dz.dz7.РусланУстиц.io.IOServer;
import ru.geekbrains.java2.dz.dz7.РусланУстиц.io.exceptions.ServerInputStreamException;

import java.io.IOException;

/**
 * Created by darky_000 on 24.06.2016.
 */
public class ServerHandler implements Runnable {

    private IOServer server;
    private ChatForm chatForm;

    private boolean stopFlag = false;

    public ServerHandler(IOServer server, ChatForm chatForm) throws IOException {
        this.server = server;
        this.chatForm = chatForm;
        Thread thread = new Thread(this);
        thread.start();
    }

    @Override
    public void run() {
        stopFlag = false;
        try {
            while (!stopFlag) {
                String line = server.read();
                chatForm.write(line);
                System.out.printf("Server: %s\n", line);
                if (line.contains("END")) {
                    chatForm.write("Disconnecting from server");
                    break;
                }
            }
        } catch (ServerInputStreamException e) {
            System.out.println("ServerHandler error: failed to read server input stream");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("ServerHandler error: Connection error");
        }
    }

    public void stop() {
        stopFlag = true;
    }

}
