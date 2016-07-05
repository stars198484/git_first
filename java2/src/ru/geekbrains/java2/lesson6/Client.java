package ru.geekbrains.java2.lesson6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created by Home-pc on 23.06.2016.
 */
public class Client extends JFrame {
    private static final String HOST = "Stars";
    private final JTextArea jta;
    private PrintWriter out;
    private Socket socket;
    Scanner in;


    public Client() {
        setTitle("Client");
        setLocation(100, 300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(400, 500);
        jta = new JTextArea();
        JScrollPane jsp = new JScrollPane(jta);
        jsp.setAutoscrolls(true);
        add(jsp);
        JButton jbSend = new JButton("SEND");
        JPanel jp = new JPanel(new BorderLayout());
        jp.add(jbSend, BorderLayout.EAST);
        JTextField jtf = new JTextField();
        jp.add(jtf, BorderLayout.SOUTH);
        add(jp, BorderLayout.SOUTH);

        jbSend.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sendMessage(jtf.getText());
                jtf.setText("");
            }
        });

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                super.windowClosed(e);
                try {
                    out.println(Server.EXIT);
                    out.close();
                    in.close();
                    socket.close();
                } catch (IOException e1) {
                    e1.printStackTrace();
                    System.out.println("error");
                }
            }
        });
        System.out.println("start");
        startClient();
        System.out.println("end");
        setVisible(true);
    }

    private void sendMessage(String text) {
        out.println(text);
        out.flush();
        jta.append("client: "+text + '\n');
    }

    public void startClient() {
        try {
            socket = new Socket(HOST, Server.PORT);
            out = new PrintWriter(socket.getOutputStream());
            in = new Scanner(socket.getInputStream());
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        while (true) {
                            if (in.hasNextLine()) {
                                String line = in.nextLine();
                                jta.append(line + '\n');
                            }
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                        System.out.println("connect error");
                    }
                }
            }).start();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
