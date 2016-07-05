package ru.geekbrains.java1.lesson8.ex2;

import javax.swing.*;
import java.awt.*;


public class Form2 extends JFrame {
    public Form2() {
        setTitle("Test Window #2");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(400, 400);
        setLocation(300, 300);
        JButton[] jbs = new JButton[5];
        for (int i = 0; i < 5; i++) {
            jbs[i] = new JButton("#" + i);
        }
        setLayout(new BorderLayout());
        add(jbs[0], BorderLayout.EAST);
        add(jbs[1], BorderLayout.WEST);
        add(jbs[2], BorderLayout.SOUTH);
        add(jbs[3], BorderLayout.NORTH);
        add(jbs[4], BorderLayout.CENTER);
        setVisible(true);
    }
}
