package ru.geekbrains.java2.dz.dz6.СараевМаксим;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 Created by Сараев Максим on 27.06.2016.
 */
public class Server {
    public static final String EXIT = "exit";
    public static final int PORT = 8189;

    public static void main(String[] args) {
        try (ServerSocket server = new ServerSocket(PORT)) {
            try (Socket s = server.accept()) {
                InputStream inputStream = s.getInputStream();
                OutputStream outputStream = s.getOutputStream();
                try (Scanner in = new Scanner(inputStream)){
                    PrintWriter out = new PrintWriter(outputStream, true);
                    out.println("Connect to server"+ "<br>");
                    while (true) {
                        String line = in.nextLine();
                        if (EXIT.contains(line)) break;

                        GregorianCalendar calendar = new GregorianCalendar();
                        StringBuilder currentDate = new StringBuilder();
                        currentDate
                                //день месяца
                                .append((calendar.get(Calendar.DAY_OF_MONTH) < 10 ? 0 + "" + calendar.get(Calendar.DAY_OF_MONTH) : calendar.get(Calendar.DAY_OF_MONTH)) + ".")
                                //месяц
                                .append((calendar.get(Calendar.MONTH) < 9 ? 0 + "" + (calendar.get(Calendar.MONTH) + 1) : (calendar.get(Calendar.MONTH) + 1)) + ".")
                                //год
                                .append(calendar.get(Calendar.YEAR) + " ")
                                //час
                                .append((calendar.get(Calendar.HOUR_OF_DAY) < 10 ? 0 + "" + calendar.get(Calendar.HOUR_OF_DAY) : calendar.get(Calendar.HOUR_OF_DAY)) + ":")
                                //минуты
                                .append((calendar.get(Calendar.MINUTE) < 10 ? 0 + "" + calendar.get(Calendar.MINUTE) : calendar.get(Calendar.MINUTE)) + ":")
                                //секунды
                                .append((calendar.get(Calendar.SECOND) < 10 ? 0 + "" + calendar.get(Calendar.SECOND) : calendar.get(Calendar.SECOND)));

                        StringBuilder sbInput = new StringBuilder("[" + currentDate.toString() + "] <b>" + "echo server" + "</b> " + line + "<br>");
                        out.println(sbInput);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

