package ru.geekbrains.java2.dz.dz6.YuryLukas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created by yurok on 18.06.16.
 */
public class ChatWindow extends JFrame {

    private JPanel bottomPanel;
//    private StringBuffer buffer;
    private JTextArea mainText;
    private JTextArea fieldInput;
    private JButton button;
    private String nickName = "default";
    private String fileName = "buffer.txt";
    private static final String HOST = "localhost";
    private PrintWriter out;
    private Socket socket;
    private Scanner in;


    private PrintWriter currentBufer;

    public ChatWindow() throws HeadlessException {
        super("Главное окно чата");

//        buffer = new StringBuffer();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(100,100,1200, 900);

        bottomPanel = new JPanel();
        button = new JButton();
        button.setText("Послать");

        fieldInput = new JTextArea();
        fieldInput.setRows(4);
        fieldInput.setColumns(90);
        fieldInput.setBackground(Color.LIGHT_GRAY);
        fieldInput.setLineWrap(true);

        JScrollPane scrollPanel = new JScrollPane(fieldInput);
        scrollPanel.setBounds(5,5,750,80);
        bottomPanel.setLayout(new FlowLayout());
        bottomPanel.add(scrollPanel);
        bottomPanel.add(button);
        setLayout(new BorderLayout());
        add(bottomPanel, BorderLayout.SOUTH);

        mainText = new JTextArea();
        mainText.setRows(15);
        mainText.setColumns(90);
        mainText.setBackground(Color.LIGHT_GRAY);
        mainText.setEditable(false);
        mainText.setLineWrap(true);



        JScrollPane scrollMine = new JScrollPane(mainText);
        add(scrollMine);

        button.addActionListener(new ActionAdd());
        startClient();
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    private void addText(){
        try{
            currentBufer = new PrintWriter(new BufferedWriter(new FileWriter(this.fileName, true)));
            mainText.append(nickName + ": "+ fieldInput.getText() + "\n");
            currentBufer.println(nickName + ": " + fieldInput.getText());
            out.println(nickName + ": " + fieldInput.getText());
            out.flush();
            fieldInput.setText("");
        }
        catch (Exception e)
        {

        } finally {
            currentBufer.close();
        }
    }

    public void closeFile(){
        currentBufer.close();
    }

    public PrintWriter getCurrentBuffer() {
        return currentBufer;
    }

    public void setCurrentBuffer(PrintWriter currentBufer) {
        this.currentBufer = currentBufer;
    }

    private class ActionAdd implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            addText();
        }
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
                                mainText.append(line + '\n');
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
