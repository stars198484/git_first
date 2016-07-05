package ru.geekbrains.java2.dz.dz4.AlekseyNabor;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Created by AlekseyN on 18.06.2016.
 */
public class BeCommForm extends JFrame {

    private int lastXPosition = 55;
    private int lastYPosition = 55;
    private int lastXSize = 955;
    private int lastYSize = 555;

    Engine engine;
    Message message;
    String input = null;

    JTextField inputMessage;
    JScrollPane jScrollPane;
    JEditorPane messageArea;

    JButton closeBTN;
    JButton sendMessageBTN;

    String messageBuild;

    BeCommForm() {
//ЗАПРОС НИКНЕЙМА
        while ( (input = JOptionPane.showInputDialog("Введите ваш ник")) == null || input.isEmpty() ) { }
        System.out.println("Выбран ник: " + input);

        engine = new Engine(input);

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

        for (Message m : engine.getMessages()
             ) {
            messageBuild = "<b>"+m.getSimpleDate()+" "+m.getNickname()+":</b> "+m.getMessage();
            messageArea.setText(messageBuild+messageArea.getText());
        }

        //ОТЛОВ ОТПРАВКИ СООБЩЕНИЙ

        inputMessage.addActionListener(e -> {
            input = inputMessage.getText();
            engine.addMessage(input);
            messageArea.setText(":<i>"+inputMessage.getText()+messageArea.getText()+"\n"+"</i>");
            inputMessage.setText("");
        });

        sendMessageBTN.addActionListener(e -> {
            input = inputMessage.getText();
            engine.addMessage(input);
            messageArea.setText(":<i>"+inputMessage.getText()+messageArea.getText()+"\n"+"</i>");
            inputMessage.setText("");
        });

        //ОЧИСТКА ОКНА ЧАТА
        fileClearTextArea.addActionListener(e -> messageArea.setText(""));

        //ОЧИСТКА ИСТОРИИ СООБЩЕНИЙ
        fileDeleteHistory.addActionListener(e -> {
            engine.clearHistory();
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
                    engine.saveMessages();
            System.exit(0);
                });
        closeBTN.addActionListener(e -> {
            engine.saveMessages();
            System.exit(0);
        });

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                engine.saveMessages();
            }
        });

        //ПОЕХАЛИ

        setVisible(true);
    }




}
