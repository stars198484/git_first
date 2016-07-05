//package UlianaChernikova;
package ru.geekbrains.java2.dz.dz6.UlianaChernikova;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created by Uliana on 26.06.2016.
 */
public class Server {
    public static final String EXIT="exit";
public static final int PORT=8189;

    public static void main(String[] args) {
try(    ServerSocket server=new ServerSocket(PORT)) {
            try(Socket s=server.accept()){
                InputStream inputStream=s.getInputStream();
                OutputStream outputStream=s.getOutputStream();
                try (Scanner in =new Scanner(inputStream)) {
                    PrintWriter out=new PrintWriter(outputStream, true);
out.println("Connect to server");
while(true){
    String line=in.nextLine();
if(EXIT.contains(line)) break;
    out.println("Server: " + line);

}

                }
            }
}catch (IOException e) {System.err.println (e);}
    }
}
