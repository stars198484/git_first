package ru.geekbrains.java2.dz.dz6.ИльяФиалковский;
import javax.swing.*;
import java.awt.*;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * Created by Natali on 27.06.2016.
 */
public class Server extends JFrame implements Runnable {
    private JScrollPane pane1, pane2;
    private JTextArea area1;
    private JTextField field;
    private JButton button;
    private PrintWriter pw;
    String nameServer = "Server: ";
    String nameClient = "Client: ";
    PrintWriter out;

    public void run() {
        try {
            SimpleDateFormat dateFormatX = new SimpleDateFormat("ddMMyyHHmmss");
            String x = dateFormatX.format(new Date()) + ".txt";
            pw = new PrintWriter(new FileWriter(x), true);
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy >> HH:mm:ss");
            pw.write(dateFormat.format(new Date()) + "\n");
            setBounds(500, 200, 800, 600);
            setTitle("GUI Demo");
            setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            setLayout(new GridLayout(2, 1));
            JPanel[] jp = new JPanel[2];
            for (int i = 0; i < 2; i++) {
                jp[i] = new JPanel();
                add(jp[i]);
            }
            jp[0].setLayout(new BorderLayout());
            area1 = new JTextArea();
            pane1 = new JScrollPane(area1);
            jp[0].add(pane1);
            jp[1].setLayout(new BorderLayout());
            field = new JTextField();
            pane2 = new JScrollPane(field);
            jp[1].add(pane2);
            button = new JButton("ОТПРАВИТЬ");
            jp[1].add(button, BorderLayout.SOUTH);
            button.addActionListener(e -> sendM());
            field.addActionListener(e -> sendM());
            setVisible(true);

            ServerSocket server = new ServerSocket(2002);
            Socket s = server.accept();
            InputStream inputStream = s.getInputStream();
            OutputStream outputStream = s.getOutputStream();
            Scanner in = new Scanner(inputStream);
            out = new PrintWriter(outputStream, true);
            while (true) {
                incomeM(in.nextLine());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void sendM() {
        if (!field.getText().equals("")) {
            out.println(field.getText());
            area1.setText(area1.getText() + nameServer + field.getText() + " \n");
            pw.write("###" + nameServer + field.getText() + " \n");
            pw.flush();
            field.setText("");
        }
    }

    public void incomeM(String line) {
        if (!line.equals("")) {
            area1.setText(area1.getText() + nameClient + line + " \n");
            pw.write("###" + nameClient + line + " \n");
            pw.flush();
        }
    }
}
