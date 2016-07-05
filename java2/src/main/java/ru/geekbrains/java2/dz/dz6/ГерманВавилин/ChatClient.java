package ru.geekbrains.java2.dz.dz6.ГерманВавилин;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.util.Scanner;


/**
 * Created by gta5 on 27.06.2016.
 */
public class ChatClient extends JFrame {
    private static final String HOST = "localhost";
    private String user;
    private PrintWriter out;
    private Socket socket;
    Scanner in;
    //Берем размер экрана, для того, чтобы при генерации поместить оно программы по центру.
    private Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    private int width = (int)screenSize.getWidth();
    private int height = (int)screenSize.getHeight();
    private int xSize = 400;
    private int ySize = 400;
    //Переменная для хранения сообщения вместе с датой, временем и маркером отправки/получения
    private String bufferMessage;
    //Ведем запись сообщений или нет
    private boolean isLogging = true;
    private JTextArea messageArea;
    private JTextField messageText;
    public ChatClient() {
        super("Чатик");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(xSize, ySize);
        setLocation((width - xSize)/2, (height - ySize)/2);
        setResizable(false);
        ChatLogin loginDialog = new ChatLogin((JFrame) SwingUtilities.getWindowAncestor(this),"Логин",true);
        setUser(loginDialog.getUser());
        JPanel chatTextPanel = new JPanel();
        messageArea = new JTextArea(20,33);
        JScrollPane scrollPane = new JScrollPane(messageArea);
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        messageArea.setEnabled(false);
        messageArea.setDisabledTextColor(Color.BLUE);
        chatTextPanel.add(scrollPane);
        JPanel chatInputPanel = new JPanel();
        chatInputPanel.setLayout(new FlowLayout());
        JButton sendMessageButton = new JButton("Отправить");
        messageText = new JTextField(25);
        //Реакция на ENTER
        messageText.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER){
                    super.keyPressed(e);
                    Operate();
                }
            }
        });
        chatInputPanel.add(messageText);
        //Реакция на отпускание кнопки мыши (если она в этот момент на объекте - будет срабаывание, иначе - нет.
        sendMessageButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                super.mouseReleased(e);
                Operate();
            }
        });
        chatInputPanel.add(sendMessageButton);
        this.add(chatTextPanel, BorderLayout.CENTER);
        this.add(chatInputPanel, BorderLayout.SOUTH);
        startClient();
        //Показываем собранную форму
        setVisible(true);
        //Подключаемся к серверу
        //connect();
    }

    //Записывает сообщение в окно чата
    private void sendMessage(String message) {
        messageArea.append(message);
    }

    //Сохраняет сообщение в файл, создавая его или дописывая.
    private void saveMessage(String message) {
        try (FileWriter logFile = new FileWriter(new SimpleDateFormat("dd-MM-yyyy").format(Calendar.getInstance().getTime()) + "_message.log", true)) {
            logFile.append(messageCreator(message, false));
            logFile.flush();
        }catch (IOException e) {
            JOptionPane.showMessageDialog(null, "При сохранении произошла ошибка:\n" + e.getMessage());
        }
    }

    //Добавляет к сообщению дату/время и маркер отправки
    private String messageCreator(String messageText, boolean isIncoming) {
        if(!isIncoming) return new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(Calendar.getInstance().getTime()) + " >> " + user + ": " + messageText+"\n";
        else {
            return new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(Calendar.getInstance().getTime()) + " << " + messageText+"\n";
        }
    }

    //Общая процедура реакции на нажатие ENTER или клику по кнопе "ОТПРАВИТЬ"
    private void Operate() {
        bufferMessage = messageCreator(messageText.getText(), false);
        sendMessage(bufferMessage);
        out.println(messageText.getText());
        out.flush();
        if(isLogging) saveMessage(messageText.getText());
        messageText.setText("");
        messageText.requestFocus();
    }

    public void startClient() {
        try {
            socket = new Socket(HOST, ChatServer.port);
            out = new PrintWriter(socket.getOutputStream());
            in = new Scanner(socket.getInputStream());
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        while (true) {
                            if (in.hasNextLine()) {
                                String line = in.nextLine();
                                messageArea.append(messageCreator(line, true));
                            }
                        }
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Ошибка:\n" + e.getMessage());
                    }
                }
            }).start();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Ошибка ввода/вывода:\n" + e.getMessage());
        }
    }

    public void setUser(String user) {
        this.user = user;
    }
}
