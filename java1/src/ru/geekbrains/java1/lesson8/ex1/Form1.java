package ru.geekbrains.java1.lesson8.ex1;

import javax.swing.*;

public class Form1 extends JFrame {
    public Form1() {
        setTitle("Test Window #1");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(400, 400);
        setLocation(300, 300);
        setVisible(true);
        JButton button = new JButton();
    }
}
