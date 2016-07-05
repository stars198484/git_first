package ru.geekbrains.java2.dz.dz4.ЮрийНиконоров.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

/**
 * Created by Acer on 19.06.2016.
 */
public class ChatWindow extends JFrame {
    private JTextField textField;
    private JTextArea chatText;
    private JScrollPane chatScroll;
    private PrintWriter pw;
    private JButton button;


    public ChatWindow(){

        super("Чат");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        chatText = new JTextArea();
        chatScroll = new JScrollPane(chatText);
        chatText.setEnabled(false);

        button = new JButton("Отправить");

        textField = new JTextField();
        textField.setColumns(40);

        setLayout(new BorderLayout());
        add(chatScroll, BorderLayout.CENTER);
        JPanel panel = new JPanel();
        add(panel, BorderLayout.SOUTH);

        panel.setLayout(new FlowLayout());
        panel.add(textField);
        panel.add(button);

        setBounds(400,200,600,400);
        setResizable(false);
        setVisible(true);

        button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
            sendText();
            }
        });
        textField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                if (e.getKeyCode() == e.VK_ENTER) sendText();
            }
        });
    }

    private void sendText() {
        PrintWriter file = null;
        if (!textField.getText().isEmpty()) {
            chatText.append("Вы: " + textField.getText() + "\n");

            try {
                file = new PrintWriter(new FileWriter("chat.txt"));

                file.append("Вы: " + textField.getText() + "\n");
            } catch (IOException e) {
                e.printStackTrace();
            }
            finally {
                file.close();
            }
            textField.setText("");
        }
    }

}
