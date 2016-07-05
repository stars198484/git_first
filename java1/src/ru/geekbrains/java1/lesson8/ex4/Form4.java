package ru.geekbrains.java1.lesson8.ex4;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Form4 extends JFrame {
    public Form4() {
        setTitle("Test Window #4 (RGB)");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocation(500, 400);

        JLabel jl = new JLabel(" ");
        jl.setPreferredSize(new Dimension(100, 200));
        jl.setOpaque(true);
        jl.setBackground(Color.white);
        jl.setBorder(new LineBorder(Color.black, 5));
        JPanel jp = new JPanel(new GridLayout(1, 3));
        add(jl, BorderLayout.NORTH);
        add(jp, BorderLayout.CENTER);

        JButton jbRed = new JButton("RED");
        JButton jbGreen = new JButton("GREEN");
        JButton jbBlue = new JButton("BLUE");
        jp.add(jbRed);
        jp.add(jbGreen);
        jp.add(jbBlue);

        jbRed.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jl.setBackground(Color.RED);
            }
        });

        jbGreen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jl.setBackground(Color.GREEN);
            }
        });

        jbBlue.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jl.setBackground(Color.BLUE);
            }
        });

        setVisible(true);
    }
}
