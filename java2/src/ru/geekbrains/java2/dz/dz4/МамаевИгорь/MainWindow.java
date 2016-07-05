package ru.geekbrains.java2.dz.dz4.МамаевИгорь;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.text.DateFormat;
import java.util.Date;

public class MainWindow extends JFrame {
    private JTextArea chatTextArea;
    private JTextField inputField;
    private Font mainFont;
    private File chatHistory;

    public MainWindow() {
        super("Chat");
        setSize(600, 400);
        setLocation(100, 100);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        mainFont = new Font("Calibri", Font.PLAIN, 13);
        chatHistory = new File(System.getProperty("user.dir")+"/src/ru/geekbrains/java2/dz/dz4/МамаевИгорь/chatHistory.txt");

        createMenu();
        createChatPane();
        createInputPanel();

        setResizable(false);
        setVisible(true);
    }

    private void createMenu() {

        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("Файл");
        JMenuItem viewAllHistoryItem = new JMenuItem("Показать всю историю");
        JMenuItem clearChatTextAreaItem = new JMenuItem("Очистить окно чата");
        JMenuItem exportHistoryItem = new JMenuItem("Экспорт истории");
        JMenuItem deleteHistoryItem = new JMenuItem("Удалить историю");
        JMenuItem exitItem = new JMenuItem("Выйти");

        fileMenu.add(viewAllHistoryItem);
        fileMenu.add(clearChatTextAreaItem);
        fileMenu.add(exportHistoryItem);
        fileMenu.add(deleteHistoryItem);
        fileMenu.addSeparator();
        fileMenu.add(exitItem);

        menuBar.add(fileMenu);
        setJMenuBar(menuBar);

        viewAllHistoryItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                chatTextArea.setText("");
                try (BufferedReader br = new BufferedReader(new FileReader(chatHistory))) {
                    String s;
                    while ((s = br.readLine()) != null) {
                        chatTextArea.append(s + "\n");
                    }
                } catch (IOException exc) {
                    exc.printStackTrace();
                }
            }
        });

        clearChatTextAreaItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                chatTextArea.setText("");
            }
        });

        exportHistoryItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser fc = new JFileChooser();
                if (fc.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
                    try (BufferedWriter bw = new BufferedWriter(new FileWriter(fc.getSelectedFile())); BufferedReader br = new BufferedReader(new FileReader(chatHistory))) {
                        String s;
                        while ((s = br.readLine()) != null) {
                            bw.write(s + "\r\n");
                        }
                    } catch (IOException exc) {
                        System.out.println("Всё погибло!");
                    }
                }
            }
        });

        deleteHistoryItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (JOptionPane.showConfirmDialog(deleteHistoryItem, "Вы уверены, что хотите удалить всю историю?","Удаление истории",JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                    try (BufferedWriter bw = new BufferedWriter(new FileWriter(chatHistory))) {
                        bw.write("");
                    } catch (IOException exc) {
                        exc.printStackTrace();
                    }
                    chatTextArea.setText("");
                }
            }
        });

        exitItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

    }

    private void createChatPane() {
        chatTextArea = new JTextArea();
        chatTextArea.setLineWrap(true);
        chatTextArea.setFont(mainFont);
        chatTextArea.setEditable(false);

        JScrollPane chatPane = new JScrollPane(chatTextArea);
        chatPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        add(chatPane, BorderLayout.CENTER);
    }

    private void createInputPanel() {
        inputField = new JTextField(48);
        inputField.setFont(mainFont);

        JButton sendButton = new JButton("Отправить");

        JPanel inputPanel = new JPanel(new FlowLayout());
        inputPanel.add(inputField);
        inputPanel.add(sendButton);

        add(inputPanel, BorderLayout.SOUTH);

        ActionListener sendListener = new SendListener();
        sendButton.addActionListener(sendListener);
        inputField.addActionListener(sendListener);
    }

    private class SendListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String message;
            message = "Я(" + DateFormat.getInstance().format(new Date()) + "): " + inputField.getText() + "\n";
            chatTextArea.append(message);
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(chatHistory, true))) {
                bw.write(message);
            } catch (IOException exc) {
                exc.printStackTrace();
            }
            inputField.setText("");
            inputField.requestFocus();
        }


    }

}
