package ru.geekbrains.java2.dz.dz7.РусланУстиц.server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

/**
 * Created by darky_000 on 28.06.2016.
 */
public class ClientHandler implements Runnable {

    private Server owner;
    private Socket socket;
    private DataOutputStream out;
    private DataInputStream in;
    private String name;

    public ClientHandler(Socket socket, Server owner) {
        try {
            this.owner = owner;
            this.socket = socket;
            out = new DataOutputStream(socket.getOutputStream());
            in = new DataInputStream(socket.getInputStream());
            name = "";
            Thread thread = new Thread(this);
            thread.start();
        } catch (IOException e) {
            System.out.println("ClientHandler error: IOException in constructor");
        }
    }

    @Override
    public void run() {
        try {
            while (true) {
                String clientMessage = in.readUTF();
                if (name.isEmpty()) {
                    String[] splittedMessage = clientMessage.split("\t");
                    String login = splittedMessage[1];
                    String password = splittedMessage[2];
                    String name = SQLHandler.getNickname(login, password);
                    if (name != null)
                        if (name.equals("ERROR: No such nickname")) {
                            authError();
                            break;
                        } else this.name = name;
                    else {
                        authError();
                        break;
                    }
                    owner.broadcastMessage(name + " connected to server");
                    clientMessage = null;
                }
                if (clientMessage != null) {
                    owner.broadcastMessage(name + ": " + clientMessage);
                    System.out.println(name + ": " + clientMessage);
                    if (clientMessage.equalsIgnoreCase("END")) break;
                }
                Thread.sleep(100);
            }
        } catch (IOException e) {
            System.out.println("ClientHandler error: IOException in run() while connected");
        } catch (InterruptedException e) {
            System.out.println("ClientHandler error: InterruptedException in run()");
        }
        try {
            System.out.println("Client disconnected");
            owner.broadcastMessage(name + " disconnected from server");
            if (!name.equals("")) owner.remove(this);
            socket.close();
        } catch (IOException e) {
            System.out.println("ClientHandler error: IOException in run() while disconnecting");
        }
    }

    public void sendMessage(String message) {
        try {
            out.writeUTF(message);
            out.flush();
        } catch (IOException e) {
            System.out.println("ClientHandler error: error in sendMessage()");
        }
    }

    private void authError() {
        sendMessage("Auth error");
        owner.remove(this);
    }
}
