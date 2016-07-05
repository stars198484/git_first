package ru.geekbrains.java2.dz.dz6.АндрейИванов;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.*;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * Created by a.ivanov on 20.06.2016.
 */
public class ChatForm extends JFrame {

    private static final String HOST = "localhost";
    private JTextField writeTextField;
    private JButton sendButton;
    private JPanel mainPanel;
    private JTextArea mainTextArea;
    private Date date = new Date();
    private  SimpleDateFormat dateFormat = new SimpleDateFormat("hh:mm:ss");
    FileOutputStream fout = null;

    private Scanner in;
    private PrintWriter out;
    private Socket socket;



    public ChatForm() {

        setContentPane(mainPanel);
        setTitle("Chat 1.0");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocation(300, 300);
        setVisible(true);
        mainTextArea.setEditable(false);
        Font font = new Font("Serif", Font.PLAIN, 14);
        mainTextArea.setFont(font);
        String filePathWrite = "C:/geekbrains";
        System.out.println("start");
        startClient();
        System.out.println("end");


        sendButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String str = dateFormat.format(date);
                mainTextArea.setText(mainTextArea.getText() + "\n" + writeTextField.getText() + " " + dateFormat.format(date));
                sendMessage(writeTextField.getText());
                writeTextField.setText("");
                try {
                    PrintWriter fout = null;
                    fout = new PrintWriter(new FileWriter(filePathWrite, true));
                    fout.write(writeTextField.getText());
                    if(fout != null)
                        fout.close();
                }
                catch (IOException ex) {
                    System.out.println("Не удалось записать историю в файл. Произошла следующая ошибка - " + ex);
                }
            }
        });
        writeTextField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainTextArea.setText(mainTextArea.getText() + "\n" + writeTextField.getText() + " " + dateFormat.format(date) );
                sendMessage(writeTextField.getText());
                writeTextField.setText("");
                try {
                    PrintWriter fout = null;
                    fout = new PrintWriter(new FileWriter(filePathWrite, true));
                    fout.write(writeTextField.getText());
                    if(fout != null)
                        fout.close();
                }
                catch (IOException ex) {
                    System.out.println("Не удалось записать историю в файл. Произошла следующая ошибка - " + ex);
                }
            }
        });

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                super.windowClosed(e);
                try {
                    out.println(Server.PORT);
                    out.close();
                    in.close();
                    socket.close();
                } catch (IOException e1) {
                    e1.printStackTrace();
                    System.out.println("error");
                }
            }
        });
    }

    private void sendMessage(String text) {
        out.println(text);
        out.flush();
        mainTextArea.append("client: "+text + '\n');
    }

    public void startClient() {
        try {
            socket = new Socket(HOST, Server.PORT);
            in = new Scanner(socket.getInputStream());
            out = new PrintWriter(socket.getOutputStream());
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        while (true) {
                            if (in.hasNextLine()) {
                                String line = in.nextLine();
                                mainTextArea.setText(mainTextArea.getText() + "\n" + line + " " + dateFormat.format(date) );
                            }
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                        System.out.println("connect error");
                    }
                }
            }).start();
        }
        catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}