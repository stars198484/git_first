package ru.geekbrains.java1.dz.dz8.СтаниславОвчинников.ex;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Stars on 01.06.2016.
 */
public class Form2 extends JFrame {
    public Form2() {
        setTitle("Test Window");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(400, 400);
        setLocation(300, 300);
        JButton[] jbs = new JButton[5];
        for (int i = 0; i < 5; i++) {
            jbs[i] = new JButton("#" + " " + i);
        }
        setLayout(new BorderLayout());
        add(jbs[0], BorderLayout.EAST);
        add(jbs[1], BorderLayout.WEST);
        add(jbs[2], BorderLayout.NORTH);
        add(jbs[3], BorderLayout.SOUTH);
        add(jbs[4], BorderLayout.CENTER);
        jbs[4].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button pressed...");
            }
        });
        setVisible(true);
    }
}
