package ru.geekbrains.java2.dz.dz6.AlekseyNabor;

import java.io.*;
import java.net.Socket;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/**
 * Created by nabor on 27.06.2016.
 */
public class Client implements Runnable {

    private Socket socket;
    private InputStream in;
    private OutputStream out;

    Client() throws IOException {
        this.socket = new Socket("127.0.0.1",5010);
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
                ){

            while (true) {
                if (objIn.available()!=0) {
                    System.out.println(objIn.readObject());
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void sendMessage(Message message) {
        try (
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(out);
                GZIPOutputStream gzipOutputStream = new GZIPOutputStream(bufferedOutputStream);
                ObjectOutputStream objOut = new ObjectOutputStream(gzipOutputStream);
        ){

            objOut.writeObject(message);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
