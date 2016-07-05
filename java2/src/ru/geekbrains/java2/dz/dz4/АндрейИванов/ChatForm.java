package ru.geekbrains.java2.dz.dz4.АндрейИванов;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
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
    private Date date = new Date();
    private  SimpleDateFormat dateFormat = new SimpleDateFormat("hh:mm:ss");
    FileOutputStream fout = null;



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



        sendButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String str = dateFormat.format(date);
                mainTextArea.setText(mainTextArea.getText() + "\n" + writeTextField.getText() + " " + dateFormat.format(date));
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
    }
}