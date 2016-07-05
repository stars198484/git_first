package ru.geekbrains.java2.dz.dz7.AndreyIvanov.client;

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

/**
 * Created by a.ivanov on 20.06.2016.
 */
public class ChatForm extends JFrame {

    private JTextField writeTextField;
    private JButton sendButton;
    private JPanel mainPanel;
    private JTextArea mainTextArea;
    private JTextField loginTextField;
    private JTextField passTextField;
    private JButton logInButton;

    private Date date = new Date();
    private  SimpleDateFormat dateFormat = new SimpleDateFormat("hh:mm:ss");
    FileOutputStream fout = null;

    final String SERVER_ADDRES = "10.200.1.151";
    final int SERVER_PORT = 7777;
    Socket socket;
    DataInputStream in;
    DataOutputStream out;


    public ChatForm() {

        setContentPane(mainPanel);
        setTitle("Chat 1.0");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(400, 500);
        setLocation(300, 300);
        setVisible(true);
        mainTextArea.setEditable(false);
        Font font = new Font("Serif", Font.PLAIN, 14);
        mainTextArea.setFont(font);
        final String filePathWrite = "C:/geekbrains";
        System.out.println("start");
     //   startClient();
        System.out.println("end");


        logInButton.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                connect("auth\t" + loginTextField.getText() + "\t" + passTextField.getText());
            }
        });

        sendButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //String str = dateFormat.format(date);
               // mainTextArea.setText(mainTextArea.getText() + "\n" + writeTextField.getText() + " " + dateFormat.format(date));
                if (!writeTextField.getText().trim().equals("")) {
                    sendMsg();
                    writeTextField.grabFocus();
                }
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
            public void actionPerformed(ActionEvent e) {
               // mainTextArea.setText(mainTextArea.getText() + "\n" + writeTextField.getText() + " " + dateFormat.format(date) );
                sendMsg();
                writeTextField.setText("");
              //  writeTextField.grabFocus();
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
            public void windowClosed(WindowEvent e) {
                super.windowClosed(e);
                try {
                    out.writeUTF("end");
                    out.flush();
                    out.close();
                    in.close();
                } catch (IOException exc) {
                } finally {
                    try {
                        socket.close();
                    } catch (IOException ex) {
                    }
                }
            }
        });
    }

    public void sendMsg() {
        try {
            String a = writeTextField.getText();
            out.writeUTF(a);
            out.flush();
            writeTextField.setText("");
        } catch (IOException e) {
            System.out.println("Send msg error");
        }
    }

//    public void startClient() {
//        try {
//            socket = new Socket(HOST, Server.PORT);
//            in = new Scanner(socket.getInputStream());
//            out = new PrintWriter(socket.getOutputStream());
//            new Thread(new Runnable() {
//                public void run() {
//                    try {
//                        while (true) {
//                            if (in.hasNextLine()) {
//                                String line = in.nextLine();
//                                mainTextArea.setText(mainTextArea.getText() + "\n" + line + " " + dateFormat.format(date) );
//                            }
//                        }
//                    } catch (Exception e) {
//                        e.printStackTrace();
//                        System.out.println("connect error");
//                    }
//                }
//            }).start();
//        }
//        catch (IOException ex) {
//            ex.printStackTrace();
//        }
//    }

    public void connect(String cmd) {
        try {
            socket = new Socket(SERVER_ADDRES, SERVER_PORT);
            System.out.println("Connected to Server");
            in = new DataInputStream(socket.getInputStream());
            out = new DataOutputStream(socket.getOutputStream());
            out.writeUTF(cmd);
            out.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

        new Thread(new Runnable() {
            public void run() {
                try {
                    while (true) {
                        String w = in.readUTF();
                        if (w != null) {
                            if (w.equalsIgnoreCase("end session")) break;
                            mainTextArea.append(w);
                            mainTextArea.append("\n");
                            mainTextArea.setCaretPosition(mainTextArea.getDocument().getLength());
                        }
                        Thread.sleep(100);
                    }
                } catch (Exception e) {
                }
            }
        }).start();
    }

}