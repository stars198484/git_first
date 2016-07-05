package ru.geekbrains.java1.lesson8.ex3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Form3 extends JFrame {
    public Form3() {
        setTitle("Test Window #3");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(400, 400);
        setLocation(300, 300);
        JButton[] jbs = new JButton[5];
        for (int i = 0; i < 5; i++) {
            jbs[i] = new JButton("#" + i);
        }

        JPanel[] jps = new JPanel[4];
        for (int i = 0; i < 4; i++) {
            jps[i] = new JPanel();
        }

        setLayout(new GridLayout(2, 2));
        add(jps[0]);
        add(jps[1]);
        add(jps[2]);
        add(jps[3]);
        jps[0].setBackground(Color.gray);
        jps[1].setBackground(Color.lightGray);
        jps[2].setBackground(Color.lightGray);
        jps[3].setBackground(Color.gray);

        jps[0].setLayout(new FlowLayout());
        JButton jb1 = new JButton("#1");
        JButton jb2 = new JButton("#2");
        jps[0].add(jb1);
        jps[0].add(jb2);

        jb1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        jb1.addActionListener(e -> System.out.println("B #1 Clicked"));

        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {



            }
        };
        ActionListener listener2 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                System.out.println("B #7 Clicked");
            }
        };

        jb2.addActionListener(listener);
        jb2.addActionListener(listener2);
        jb1.addActionListener(listener);

        jps[1].setLayout(new BoxLayout(jps[1], BoxLayout.PAGE_AXIS));
        jps[1].add(new JButton("BoxLayoutButton1"));
        jps[1].add(new JButton("BoxLayoutButton2"));
        jps[1].add(new JButton("BoxLayoutButton3"));
        jps[1].add(new JButton("BoxLayoutButton4"));


        setVisible(true);
    }
}
