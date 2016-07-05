package ru.geekbrains.java2.dz.dz7.МамаевИгорь.Server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.text.DateFormat;
import java.util.Date;

public class ClientHandler implements Runnable {
    Socket socket;
    MyServer owner;
    DataInputStream in;
    DataOutputStream out;
    String name = "";

    public ClientHandler(Socket socket, MyServer myServer) {
        this.socket = socket;
        this.owner = myServer;

        try {
            in = new DataInputStream(socket.getInputStream());
            out = new DataOutputStream(socket.getOutputStream());
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void run() {
        System.out.println("client Thread - new Client");
        try {
            while (true) {
                String message = in.readUTF();
                System.out.println(message);
                if (name.isEmpty()) {
                    String n[] = message.split("/");

                    if (n[0].equals("auth")) {
                        String t = SQLHandler.getNickByLoginPassword(n[1], n[2]);
                        if (t != null) {
                            name = t;
                            sendMsg("server: Auth complete");
                        } else {
                            sendMsg("server: Auth Error, you need to registration");
                            continue;
                        }
                    } else if (n[0].equals("registration")) {
                        SQLHandler.registration(n[1], n[2], n[3]);
                        name = n[3];
                        sendMsg("server: Registration - ok, Auth complete");
                    } else sendMsg("server: Registration please");

                } else if (message != null) {
                    owner.broadcastMsg(name + " (" + DateFormat.getInstance().format(new Date()) + "): " + message);
                    System.out.println(name + " (" + DateFormat.getInstance().format(new Date()) + "): " + message);
                    if (message.equalsIgnoreCase("END")) break;
                }

                Thread.sleep(100);
            }
        } catch (IOException | InterruptedException ex) {
            ex.printStackTrace();

        }
        try {
            System.out.println("Client disconnected");
            owner.remove(this);
            socket.close();
            in.close();
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void sendMsg(String msg) {
        try {
            out.writeUTF(msg + "\n");
            out.flush();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }
}
