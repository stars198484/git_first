package ru.geekbrains.java2.dz.dz6.РусланУстиц.io;

import ru.geekbrains.java2.dz.dz6.РусланУстиц.io.exceptions.ServerInputStreamException;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created by darky_000 on 24.06.2016.
 */
public class IOServer {

    private Socket socket;
    private PrintWriter out;
    private Scanner in;

    public IOServer(Socket socket) throws IOException {
        this.socket = socket;
        out = new PrintWriter(this.socket.getOutputStream(), true);
        in = new Scanner(this.socket.getInputStream());
    }

    public String read() throws ServerInputStreamException {
        String line;

        if (in.hasNextLine()) {
            line = in.nextLine();
        } else throw new ServerInputStreamException();

        return line;
    }

    public void write(final String text) {
        System.out.printf("Sending to server: %s\n", text);
        out.println(text);
    }
}
