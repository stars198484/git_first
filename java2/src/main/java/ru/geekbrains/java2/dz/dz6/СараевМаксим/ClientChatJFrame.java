package ru.geekbrains.java2.dz.dz6.СараевМаксим;

import ru.geekbrains.java2.lesson6.*;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.net.Socket;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 * Created by Сараев Максим on 27.06.2016.
 */

public class ClientChatJFrame extends JFrame {

    private static final String HOST = "localhost";

    private JTextPane chatTextArea;
    private JTextField chatInputField;
    private JButton sendButton;
    private static DefaultListModel loginList = new DefaultListModel<String>();
    private String toLogin = "";
    private String login;
    private File chatHistory;
    private PrintWriter out;
    private Socket socket;
    private Scanner in;

    public ClientChatJFrame(String login) {
        this.login = login;
        loginList.addElement(login);
        chatHistory = new File(System.getProperty("user.dir")+"/src/ru/geekbrains/java2/dz/dz6/СараевМаксим/chatHistory.html");
        setTitle("Client chat ...");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(100, 100, 600, 500);
        setResizable(false);
        addMenu();
        addChatWindow();
        startClient();
        setVisible(true);
    }

    private void addMenu() {

        JMenuBar menuBar = new JMenuBar();
        Font menuFont = new Font("Veranda", Font.PLAIN, 12);

        //меню
        // 1 раздел файл
        createFileMenu(menuBar, menuFont);

        // 2 раздел история
        createHistoryMenu(menuBar, menuFont);

        // 3 раздел о программе
        createAboutMenu(menuBar, menuFont);

        setJMenuBar(menuBar);
    }

    private void createFileMenu(JMenuBar menuBar, Font menuFont) {

        JMenu fileMenu = new JMenu("Файл");
        fileMenu.setFont(menuFont);

        //новый
        JMenuItem reTry = new JMenuItem("Выбор логина");
        reTry.setFont(menuFont);
        reTry.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new LoginJFrame(true);
            }
        });
        fileMenu.add(reTry);

        //очистить чат
        JMenuItem clearChat = new JMenuItem("Очистить окно чата");
        clearChat.setFont(menuFont);
        clearChat.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                chatTextArea.setText("<html><head></head><body></body></html");
            }
        });
        fileMenu.add(clearChat);

        // разделительная полоса
        fileMenu.addSeparator();

        //выход
        JMenuItem exit = new JMenuItem("Exit");
        exit.setFont(menuFont);
        fileMenu.add(exit);
        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        menuBar.add(fileMenu);

      }

    private void createHistoryMenu(JMenuBar menuBar, Font menuFont) {

        JMenu historyMenu = new JMenu("История");
        historyMenu.setFont(menuFont);

        JMenuItem viewAllHistoryItem = new JMenuItem("Показать всю историю");
        viewAllHistoryItem.setFont(menuFont);
        viewAllHistoryItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try (BufferedReader br = new BufferedReader(new FileReader(chatHistory))) {
                    String s;
                    while ((s = br.readLine()) != null) {
                        String temp = chatTextArea.getText();
                        int index = temp.lastIndexOf("</body>");
                        temp = temp.substring(0,index)+" "+s+" "+ temp.substring(index);
                        chatTextArea.setText(temp);
                    }
                } catch (IOException exc) {
                    exc.printStackTrace();
                }
            }
        });
        historyMenu.add(viewAllHistoryItem);

        JMenuItem exportHistoryItem = new JMenuItem("Экспорт истории");
        exportHistoryItem.setFont(menuFont);
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
                        System.out.println("...");
                    }
                }
            }
        });
        historyMenu.add(exportHistoryItem);

        JMenuItem deleteHistoryItem = new JMenuItem("Удалить историю");
        deleteHistoryItem.setFont(menuFont);
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
        historyMenu.add(deleteHistoryItem);

        historyMenu.addSeparator();

        menuBar.add(historyMenu);

    }

    private void createAboutMenu(JMenuBar menuBar, Font menuFont) {

        //о программе
        JMenu about = new JMenu("О программе");
        about.setFont(menuFont);
        JMenuItem aboutItem = new JMenuItem("О программе");
        aboutItem.setFont(menuFont);
        aboutItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(getContentPane(), "Custom chat plagiat :)", "О программе", JOptionPane.INFORMATION_MESSAGE);
            }
        });
        about.add(aboutItem);

        menuBar.add(about);

    }

    private void addChatWindow() {

        JPanel panel = new JPanel();
        GridBagLayout layout = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();
        panel.setLayout(layout);

        //поле чата со скролом
        chatTextArea = new JTextPane();
        chatTextArea.setMargin(new Insets(5, 2, 5, 2));
        chatTextArea.setEditable(false);
        chatTextArea.setContentType("text/html");
        chatTextArea.setText("<html><head></head><body></body></html");

        JScrollPane jScrollPane = new JScrollPane(chatTextArea);
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 1;
        gbc.gridheight = 8;
        gbc.ipadx = 475;
        gbc.ipady = 400;
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.fill = GridBagConstraints.BOTH;
        panel.add(jScrollPane, gbc);

        //логины пользователей
        JList loginJList = new JList(loginList);
        loginJList.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (!login.equals(loginJList.getSelectedValue())) {
                    toLogin = "to <b>[" + (String) loginJList.getSelectedValue() + "]</b>";
                }
            }
        });

        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.gridwidth = 1;
        gbc.gridheight = 8;
        gbc.ipady = 0;
        gbc.ipadx = 0;
        loginJList.setBorder(new TitledBorder("Собеседники"));
        panel.add(loginJList, gbc);

        //Панель с полем ввода сообщения и кнопкой отправки сообщения
        chatInputField = new JTextField();
        chatInputField.setEnabled(true);
        chatInputField.addActionListener(sendMessageListener());
        gbc.gridx = 0;
        gbc.gridy = 8;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;

        panel.add(chatInputField, gbc);

        sendButton = new JButton("Отправить");
        sendButton.setEnabled(true);
        sendButton.addActionListener(sendMessageListener());
        gbc.gridx = 1;
        gbc.gridy = 8;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        panel.add(sendButton, gbc);

        add(panel);
    }

    private ActionListener sendMessageListener() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GregorianCalendar calendar = new GregorianCalendar();
                StringBuilder currentDate = new StringBuilder();
                currentDate
                        //день месяца
                        .append((calendar.get(Calendar.DAY_OF_MONTH) < 10 ? 0 + "" + calendar.get(Calendar.DAY_OF_MONTH) : calendar.get(Calendar.DAY_OF_MONTH)) + ".")
                        //месяц
                        .append((calendar.get(Calendar.MONTH) < 9 ? 0 + "" + (calendar.get(Calendar.MONTH) + 1) : (calendar.get(Calendar.MONTH) + 1)) + ".")
                        //год
                        .append(calendar.get(Calendar.YEAR) + " ")
                        //час
                        .append((calendar.get(Calendar.HOUR_OF_DAY) < 10 ? 0 + "" + calendar.get(Calendar.HOUR_OF_DAY) : calendar.get(Calendar.HOUR_OF_DAY)) + ":")
                        //минуты
                        .append((calendar.get(Calendar.MINUTE) < 10 ? 0 + "" + calendar.get(Calendar.MINUTE) : calendar.get(Calendar.MINUTE)) + ":")
                        //секунды
                        .append((calendar.get(Calendar.SECOND) < 10 ? 0 + "" + calendar.get(Calendar.SECOND) : calendar.get(Calendar.SECOND)));

                StringBuilder sbInput = new StringBuilder("[" + currentDate.toString() + "] <b>" + login + "</b> "
                        + (!toLogin.equals("") ? toLogin + " " : "") + ": " + chatInputField.getText() + "<br>");
                addMessageToJTextPane(sbInput.toString());
                writeInFile(sbInput.toString()+'\n');
                out.println(chatInputField.getText());
                out.flush();
                chatInputField.setText("");
                toLogin = "";

            }
        };
    }

    private void addMessageToJTextPane(String s) {
        String temp = chatTextArea.getText();
        int index = temp.lastIndexOf("</body>");
        temp = temp.substring(0,index)+" "+s+" "+ temp.substring(index);
        chatTextArea.setText(temp);
    }

    private void writeInFile(String addText) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(chatHistory, true))) {
            bw.write(addText);
        } catch (IOException exc) {
            exc.printStackTrace();
        }
    }

    public void startClient() {
        try {
            socket = new Socket(HOST, 8189);
            out = new PrintWriter(socket.getOutputStream());
            in = new Scanner(socket.getInputStream());
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        while (true) {
                            if (in.hasNextLine()) {
                                String line = in.nextLine();
                                addMessageToJTextPane(line);
                                writeInFile(line);
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
