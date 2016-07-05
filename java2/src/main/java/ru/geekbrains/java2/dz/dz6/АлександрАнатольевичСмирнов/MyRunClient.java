package ru.geekbrains.java2.dz.dz6.АлександрАнатольевичСмирнов;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Alexandr SMIRNOV on 25.06.2016.
 */

public class MyRunClient extends JFrame {
    private JButton Button1;
    private JButton Button2;
    private JLabel Label1;
    private JPanel MyForm;

    public MyRunClient() {
        setContentPane(MyForm);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setTitle("Вспомогательное окно");
        setSize(400, 200);
        setLocationRelativeTo(null);
        Font font = new Font("Arial", Font.PLAIN, 16);
        Label1.setFont(font);
        Button1.setFont(font);
        Button2.setFont(font);
        setVisible(true);

        Button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Thread thread = new Thread( new MyClientSocket());
                thread.start();
            }
        });

        Button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

    }
}
