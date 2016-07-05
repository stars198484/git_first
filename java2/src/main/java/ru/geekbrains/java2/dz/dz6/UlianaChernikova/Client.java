//package UlianaChernikova;
package ru.geekbrains.java2.dz.dz6.UlianaChernikova;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;


/**
 * Created by Uliana on 26.06.2016.
 */
public class Client extends JFrame {
    private static final String HOST = "localhost";
    private final JTextArea myTextArea;
    private PrintWriter out;
    private Socket socket;
    Scanner in;
    public Client(){
        setTitle("CHAT");
        setLocation(100, 300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(400, 500);
        setLayout(new GridLayout(2,1));
        //Созданеи основной панели
        JPanel myPanel =new JPanel();
        myPanel.setLayout(new BorderLayout());

        add(myPanel);
// Создание области чата
         myTextArea =new JTextArea();
        JScrollPane myScroll=new JScrollPane(myTextArea);
        myPanel.add(myScroll);
        JPanel textPanel=new JPanel();
        textPanel.setLayout(new BorderLayout());

        add(textPanel, BorderLayout.PAGE_END);
// Создание области ввода текста
        JTextField myText=new JTextField(30);
        // Области ввода логина и пароля
        final TextField loginField=new TextField();
        final JPasswordField passField =new JPasswordField();

        textPanel.add(new JLabel("User name", SwingConstants.LEFT));
        loginField.setColumns(10);
        textPanel.add(loginField);
        textPanel.add(new JLabel("Password", SwingConstants.LEFT));

        passField.setColumns(10);

        textPanel.add(passField);

        textPanel.setLayout(new FlowLayout());
        textPanel.add(myText);
        //Кнопки ввода и удаления
        JButton inputButton=new JButton("Input");
        JButton clearButton=new JButton("Clear");
        inputButton.setLayout(new FlowLayout());
        clearButton.setLayout(new FlowLayout());

        textPanel.add(inputButton);
        textPanel.add(clearButton);
        myTextArea.setLineWrap(true);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                super.windowClosed(e);
                try {
                    out.print(Server.EXIT);
                    out.close();
                    in.close();
                    socket.close();
                }catch (IOException e1){
                    e1.printStackTrace();
                    System.out.println("error");
                }
            }
        });
// События при нажатии кномпки или  нажатии Enter.
        myText.addActionListener(new ActionListener() {
       // inputButton.addActionListener(new ActionListener() {

        @Override
            public void actionPerformed(ActionEvent e) {

                   sendMessage(myText.getText());
                    myText.setText("");

                }
        });
        inputButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                sendMessage(myText.getText());
                myText.setText("");
            }
        });
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                myText.setText("");
            }
        });

        JMenuBar mainMenu = new JMenuBar();
        JMenu mFile = new JMenu("File");
        JMenu mEdit = new JMenu("Edit");
        JMenuItem mFileNew = new JMenuItem("New");
        JMenuItem mFileExit = new JMenuItem("Exit");
        setJMenuBar(mainMenu);
        mainMenu.add(mFile);
        mainMenu.add(mEdit);
        mFile.add(mFileNew);
        mFile.addSeparator();
        mFile.add(mFileExit);
        mFileExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);

            }
        });
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.out.println("Bye");
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
    private void sendMessage(String text){
out.println(text);
        myTextArea.append("Client: " + text + "\n");
    }

public  void startClient(){
try {
    socket=new Socket(HOST, Server.PORT);
out=new PrintWriter(socket.getOutputStream(), true);
in=new Scanner(socket.getInputStream());
    new Thread(new Runnable() {
        @Override
        public void run() {
            try {
                while (true) {
                    if (in.hasNextLine()) {
                        String line = in.nextLine();
                        myTextArea.append(line + "\n");
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("Connection error");
            }
        }
    }).start();
} catch (IOException e) { e.printStackTrace(); System.out.println("file error");
}
}
}
