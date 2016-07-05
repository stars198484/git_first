package ru.geekbrains.java2.dz.dz4.СараевМаксим;

import javax.swing.*;
import java.awt.*;

/**
 * Created by desarz on 20.06.2016.
 */
public class ChatPanel extends JPanel{

    private JTextField display;
    JPanel systemPanel;
    private JPanel panel;
    private double result;
    private String lastCommand;
    private boolean start;


    public ChatPanel() {

        // создаем слой на панели, тип задаем BorderLayout
        setLayout(new BorderLayout());

        // список пользователей в чате, справа
        JPanel jpUsers = new JPanel();
        jpUsers.setLayout(new BoxLayout(jpUsers, BoxLayout.Y_AXIS));
        JButton but1 = new JButton("User1");
        jpUsers.add(but1);
        JButton but2 = new JButton("User2");
        jpUsers.add(but2);
        add(jpUsers, BorderLayout.WEST);

        // главное окно чата, центр
        JTextArea jtaChat = new JTextArea();
        JScrollPane jspChat = new JScrollPane(jtaChat);
        add(jspChat, BorderLayout.CENTER);

        // окно сообщений чата, низ
        JPanel jpMessage = new JPanel();
        jpMessage.setLayout(new BoxLayout(jpMessage, BoxLayout.X_AXIS));
        JTextArea jtaMessage = new JTextArea();
        JScrollPane jspMessage = new JScrollPane(jtaMessage);
        jpMessage.add(jspMessage);
        JButton butSend = new JButton("Send message");
        jpMessage.add(butSend);
        add(jpMessage, BorderLayout.SOUTH);

    }
}

