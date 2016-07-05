package ru.geekbrains.java2.dz.dz6.AlekseyNabor.Server;

import java.io.*;
import java.net.Socket;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/**
 * Created by nabor on 27.06.2016.
 */
public class Connection implements Runnable {

    private Socket socket;
    private InputStream in;
    private OutputStream out;

    Connection(Socket socket) throws IOException {
        this.socket = socket;
        this.in = socket.getInputStream();
        this.out = socket.getOutputStream();
    }

    @Override
    public void run() {

        try (
                BufferedInputStream bufferedInputStream = new BufferedInputStream(in);
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(out);
                GZIPInputStream gzipInputStream = new GZIPInputStream(bufferedInputStream);
                GZIPOutputStream gzipOutputStream = new GZIPOutputStream(bufferedOutputStream);
                ObjectInputStream objIn = new ObjectInputStream(gzipInputStream);
                ObjectOutputStream objOut = new ObjectOutputStream(gzipOutputStream);
                ) {
            while (true) {
                objOut.writeObject(objIn.readObject());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
