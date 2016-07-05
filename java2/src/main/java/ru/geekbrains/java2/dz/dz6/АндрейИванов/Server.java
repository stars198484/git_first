package ru.geekbrains.java2.dz.dz6.АндрейИванов;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created by a.ivanov on 27.06.2016.
 */
public class Server {

    public static final String EXIT = "exit";
    public static final int PORT = 8186;

    public static void main(String[] args) {

        try(ServerSocket server = new ServerSocket(PORT)) {

            try(Socket socket = server.accept()) {

                InputStream inputStream = socket.getInputStream();
                OutputStream outputStream = socket.getOutputStream();

                try(Scanner in = new Scanner(inputStream)){

                    PrintWriter out = new PrintWriter(outputStream, true);
                    out.println("Connect to server");

                    while(true) {
                        String line = in.nextLine();
                        if(EXIT.contains(line)) break;
                        out.println("server: " +  line);
                    }
                }
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
