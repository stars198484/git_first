package ru.geekbrains.java2.dz.dz7.AlekseyNabor.Client;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Created by AlekseyN on 18.06.2016.
 */
public class BeCommForm extends JFrame {

    private int lastXPosition = 55;
    private int lastYPosition = 55;
    private int lastXSize = 655;
    private int lastYSize = 375;

    Engine engine;
    Message message;
    String input = null;

    JTextField inputMessage;
    JScrollPane jScrollPane;
    JEditorPane messageArea;

    JButton closeBTN;
    JButton sendMessageBTN;

    String messageBuild;

    BeCommForm(Engine engine) {
        this.engine = engine;
            //ЗАПРОС НИКНЕЙМА
        while ( (input = JOptionPane.showInputDialog("Введите ваш ник")) == null || input.isEmpty() ) { }
        System.out.println("Выбран ник: " + input);

        this.engine.setMyName(input);

        inputMessage = new JTextField();
        messageArea = new JEditorPane();
        JScrollPane scrollTextArea = new JScrollPane(messageArea);
        messageArea.setEditable(false);
        messageArea.setContentType("text/html");

        closeBTN = new JButton("Выход");
        sendMessageBTN = new JButton("Send");

        setTitle("BeComm Chat");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(lastXPosition,lastYPosition,lastXSize,lastYSize);
        setLayout(new BorderLayout());

        JMenuBar menuBar = new JMenuBar();
        JMenu menuFile = new JMenu("Файл");
        JMenuItem fileClearTextArea = new JMenuItem("Очистить окно");
        JMenuItem fileDeleteHistory = new JMenuItem("Удалить историю сообщений");
        JMenuItem fileExit = new JMenuItem("Выход");
        setJMenuBar(menuBar);
        menuBar.add(menuFile);
        menuFile.add(fileClearTextArea);
        menuFile.add(fileDeleteHistory);
        menuFile.add(fileExit);

        add(scrollTextArea, BorderLayout.CENTER);
        add(inputMessage,BorderLayout.SOUTH);
        add(sendMessageBTN,BorderLayout.EAST);
        //add(closeBTN,BorderLayout.WEST); НЕКРАСИВО

        //ЗАПОЛНЕНИЕ ДАННЫМИ ИЗ ФАЙЛА
        for (Message m : this.engine.getMessages()
             ) {
            messageBuild = "<b>"+m.getSimpleDate()+" "+m.getNickname()+":</b> "+m.getMessage();
            messageArea.setText(messageBuild+messageArea.getText());
        }

        //ОТЛОВ ОТПРАВКИ СООБЩЕНИЙ

        inputMessage.addActionListener(e -> {
            addMessage();
            inputMessage.requestFocus();
        });

        sendMessageBTN.addActionListener(e -> {
            addMessage();
            inputMessage.requestFocus();
        });

        //ОЧИСТКА ОКНА ЧАТА
        fileClearTextArea.addActionListener(e -> messageArea.setText(""));

        //ОЧИСТКА ИСТОРИИ СООБЩЕНИЙ
        fileDeleteHistory.addActionListener(e -> {
            this.engine.clearHistory();
            messageArea.setText("");
        });

        //ОТЛОВ ОТКРЫТИЯ ОКНА
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowOpened(WindowEvent e) {
                System.out.println("Started");
            }
        });

        //ОТЛОВ ВЫХОДА / ЗАКРЫТИЯ

        fileExit.addActionListener(e -> {
                    this.engine.saveMessages();
            System.exit(0);
                });
        closeBTN.addActionListener(e -> {
            this.engine.saveMessages();
            System.exit(0);
        });

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                BeCommForm.this.engine.saveMessages();
            }
        });

        //ПОЕХАЛИ

        setVisible(true);
    }

    //ДОБАВИТЬ ИСХОДЯЩЕЕ СООБЩЕНИЕ И ОТПРАВИТЬ
    private void addMessage() {
        input = inputMessage.getText();
        if (input.trim().length()>0) { engine.sendMessage(input,engine.getMyName()); }
        inputMessage.setText("");
    }
        //ДОБАВИТЬ ВХОДЯЩЕЕ СООБЩЕНИЕ
    void addMessage(Message m) {
        messageBuild = "<b>"+m.getSimpleDate()+" "+m.getNickname()+":</b> "+m.getMessage();
        messageArea.setText(messageBuild+messageArea.getText());
    }

}
