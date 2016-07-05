package ru.geekbrains.java2.dz.dz6.АлександрАнатольевичСмирнов;

import ru.geekbrains.java2.lesson6.Server;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.*;
import java.net.*;
import java.util.*;

/**
 * Created by Alexandr SMIRNOV on 25.06.2016.
 */

public class MyClientSocket extends JFrame implements Runnable {
    private static final String HOST = "localhost";
    private JPanel pMain;
    private JButton bSend;
    private JPanel pEast;
    private JPanel pSouth;
    private JPanel pCenter;
    private JPanel pMenu;
    private JTextPane textChat;
    private JTextField textSend;
    private JList listUsers;
    private PrintWriter out;
    private Socket socket;
    private Scanner in;

    @Override
    public void run() {
        try {
            socket = new Socket(HOST, MyServerMain.IP_PORT_USED);
            out = new PrintWriter(socket.getOutputStream());
            in = new Scanner(socket.getInputStream());
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        while (true) {
                            if (in.hasNextLine()) {
                                String line = in.nextLine();
                                addMessageToJTextPane(line);
//                                textChat.getDocument(). .append(line + '\n');
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

    } // run

    private synchronized void addMessageToJTextPane(String s) {
        String temp = textChat.getText();
        //System.out.println(temp);
        int index = temp.lastIndexOf("</font>");
        temp = temp.substring(0, index) + s + "<br>" + temp.substring(index);
        //System.out.println(temp);
        textChat.setText(temp);
    } // addMessageToJTextPane


    public MyClientSocket() {
        setContentPane(pMain);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setTitle("Общий чат. <>");
        setSize(600, 600);
        setLocationRelativeTo(null);
        Font font = new Font("Arial", Font.PLAIN, 16);
        Font fontChat = new Font("Arial", Font.PLAIN, 20);
        bSend.setFont(font);
        textSend.setFont(font);
        listUsers.setFont(font);
        textChat.setContentType("text/html");
        textChat.setText("<html><head></head><body><font size=5 color face=Arial>&ensp</font></body></html");

        bSend.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sendMessage(textSend.getText());
                textSend.setText("");
            }
        });

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                try {
                    out.close();
                    in.close();
                    socket.close();
                } catch (IOException e1) {
                    e1.printStackTrace();
                    System.out.println("error");
                }
            }
        });

//        textChat.setFont(fontChat);
//        textChat.setForeground(Color.BLACK);
        //System.out.println(textChat.getText());
        //textChat.setFont(font);
        setVisible(true);
    }

    private void sendMessage(String text) {
        out.println(text);
        out.flush();
        addMessageToJTextPane("client: " + text);
    }
}
