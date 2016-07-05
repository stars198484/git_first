package ru.geekbrains.java1.dz.dz8.СтаниславОвчинников.Calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Stars on 01.06.2016.
 */
public class CalcSwing extends JFrame {
    CalcCod CC = new CalcCod();

    public CalcSwing() {
        CC.textLabel.append("0");
        setTitle("Калькулятор");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(315, 525);
        setLocation(500, 200);
        Font font1 = new Font("Time New Roman", Font.BOLD, 15);
        JPanel jp = new JPanel(new GridLayout(5, 4));
        add(CC.jl, BorderLayout.NORTH);
        add(jp, BorderLayout.CENTER);
        JButton jbCE = new JButton("CE");
        jbCE.setFont(font1);
        JButton jbC = new JButton("C");
        jbC.setFont(font1);
        JButton jbBS = new JButton("<-");
        jbBS.setFont(font1);
        JButton jbDegree = new JButton("/");
        jbDegree.setFont(font1);
        JButton jb7 = new JButton("7");
        jb7.setFont(font1);
        JButton jb8 = new JButton("8");
        jb8.setFont(font1);
        JButton jb9 = new JButton("9");
        jb9.setFont(font1);
        JButton jbX = new JButton("X");
        jbX.setFont(font1);
        JButton jb4 = new JButton("4");
        jb4.setFont(font1);
        JButton jb5 = new JButton("5");
        jb5.setFont(font1);
        JButton jb6 = new JButton("6");
        jb6.setFont(font1);
        JButton jbMinus = new JButton("-");
        jbMinus.setFont(font1);
        JButton jb1 = new JButton("1");
        jb1.setFont(font1);
        JButton jb2 = new JButton("2");
        jb2.setFont(font1);
        JButton jb3 = new JButton("3");
        jb3.setFont(font1);
        JButton jbPlus = new JButton("+");
        jbPlus.setFont(font1);
        JButton jbPusMinus = new JButton("+-");
        jbPusMinus.setFont(font1);
        JButton jbZero = new JButton("0");
        jbZero.setFont(font1);
        JButton jbFraction = new JButton(".");
        jbFraction.setFont(font1);
        JButton jbEqually = new JButton("=");
        jbEqually.setFont(font1);
        jp.add(jbCE);
        jp.add(jbC);
        jp.add(jbBS);
        jp.add(jbDegree);
        jp.add(jb7);
        jp.add(jb8);
        jp.add(jb9);
        jp.add(jbX);
        jp.add(jb4);
        jp.add(jb5);
        jp.add(jb6);
        jp.add(jbMinus);
        jp.add(jb1);
        jp.add(jb2);
        jp.add(jb3);
        jp.add(jbPlus);
        jp.add(jbPusMinus);
        jp.add(jbZero);
        jp.add(jbFraction);
        jp.add(jbEqually);
        CC.jl.setText(CC.textLabel.toString());
        jbEqually.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CC.Equally();
            }
        });

        jbDegree.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CC.Degree();
            }
        });
        jbPlus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CC.Plus();
            }
        });
        jbMinus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CC.Minus();

            }
        });
        jbX.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CC.Multi();

            }
        });
        jbBS.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CC.Backspace();
            }
        });
        jbPusMinus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CC.PlusMinus();
            }
        });
        jbCE.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CC.CE();
            }
        });
        jbC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CC.CE();
            }
        });
        jbZero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CC.ButtonNum("0");
            }
        });
        jb1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CC.ButtonNum("1");
            }
        });
        jbFraction.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CC.Fraction();
            }
        });
        jb2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CC.ButtonNum("2");
            }
        });
        jb3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CC.ButtonNum("3");
            }
        });
        jb4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CC.ButtonNum("4");
            }
        });
        jb5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CC.ButtonNum("5");
            }
        });
        jb6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CC.ButtonNum("6");
            }
        });
        jb7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CC.ButtonNum("7");
            }
        });
        jb8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CC.ButtonNum("8");
            }
        });
        jb9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CC.ButtonNum("9");
            }
        });
        setVisible(true);
    }
}
