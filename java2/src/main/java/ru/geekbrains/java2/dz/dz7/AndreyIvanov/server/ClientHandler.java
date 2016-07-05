package ru.geekbrains.java2.dz.dz7.AndreyIvanov.server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

/**
 * Created by a.ivanov on 28.06.2016.
 */
 class ClientHandler implements Runnable {

    private ChatServer owner;
    private Socket socket;
    private DataOutputStream out;
    private DataInputStream in;
    private String name;
    private boolean auth = false;

    ClientHandler(ChatServer owner, Socket socket) {
        try {
            this.socket = socket;
            this.owner = owner;
            out = new DataOutputStream(socket.getOutputStream());
            in = new DataInputStream(socket.getInputStream());
            name = "";

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public void run() {
        try {
            while (true) {
                String readFromClient = in.readUTF();

                if(!auth) {
                    auth = authorization(readFromClient);
                }
                else if(auth) {
                    if (readFromClient != null) {
                        owner.broadcastMsg(name + ": " + readFromClient);
                        System.out.println(name + ": " + readFromClient);
                        if (readFromClient.equalsIgnoreCase("END")) break;
                    }
                    Thread.sleep(100);
                }
            }
        } catch (IOException e) {
            System.out.println("Output Error");
        } catch (InterruptedException e) {
            System.out.println("Thread sleep error");
        }
        try {
            System.out.println("Client disconnected");
            if (!name.equals("")) owner.remove(this);
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

     void sendMsg(String msg) {
        try {
            out.writeUTF(msg);
            out.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private boolean authorization(String auth) {

        boolean result = false;
        if (name.equals("")) {
            String[] n = auth.split("\t");
            String nick = SQLHandler.getNickByLoginPassword(n[1], n[2]);
            if (nick != null) {
                name = nick;
                sendMsg("Auth successfully");
                result = true;
            } else {
                sendMsg("Auth Error");
                owner.remove(this);
            }
        }
        return result;
    }
}
