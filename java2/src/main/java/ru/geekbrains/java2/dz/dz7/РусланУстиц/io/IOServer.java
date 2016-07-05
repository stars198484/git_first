package ru.geekbrains.java2.dz.dz7.РусланУстиц.io;

import ru.geekbrains.java2.dz.dz7.РусланУстиц.io.exceptions.ServerInputStreamException;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

/**
 * Created by darky_000 on 24.06.2016.
 */
public class IOServer {

    private Socket socket;
    private DataOutputStream out;
    private DataInputStream in;

    public IOServer(Socket socket) throws IOException {
        this.socket = socket;
        out = new DataOutputStream(socket.getOutputStream());
        in = new DataInputStream(socket.getInputStream());
    }

    public String read() throws ServerInputStreamException {
        String line = null;
        try {
            line = in.readUTF();
            if (line == null) throw new ServerInputStreamException();
        } catch (IOException e) {
            if (socket.isClosed()) line = "END";
            else e.printStackTrace();
        }
        return line;
    }

    public void write(final String text) {
        try {
            System.out.printf("Sending to server: %s\n", text);
            out.writeUTF(text);
            out.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
