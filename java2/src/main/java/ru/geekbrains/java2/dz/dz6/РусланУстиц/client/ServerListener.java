package ru.geekbrains.java2.dz.dz6.РусланУстиц.client;

import ru.geekbrains.java2.dz.dz6.РусланУстиц.io.IOServer;
import ru.geekbrains.java2.dz.dz6.РусланУстиц.io.exceptions.ServerInputStreamException;

import java.io.IOException;

/**
 * Created by darky_000 on 24.06.2016.
 */
public class ServerListener implements Runnable {

    private IOServer server;
    private ChatForm chatForm;

    private boolean stopFlag = false;

    public ServerListener(IOServer server, ChatForm chatForm) throws IOException {
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
                System.out.printf("Server response: %s\n", line);
                chatForm.writeLine("Server: " + line);
            }
        } catch (ServerInputStreamException e) {
            System.out.println("ServerListener error: failed to read server input stream");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("ServerListener error: Connection error");
        }
    }

    public void stop() {
        stopFlag = true;
    }

}
