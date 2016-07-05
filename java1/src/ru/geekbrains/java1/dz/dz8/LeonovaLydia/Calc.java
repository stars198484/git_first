package ru.geekbrains.java1.dz.dz8.LeonovaLydia;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by LiLeo on 01.06.2016.
 */
public class Calc extends JFrame implements ActionListener {

    JTextField textField = new JTextField();
    private JButton jbDelete = new JButton("DEl");
    private JButton jbClear = new JButton("C");
    private JButton jbRoot = new JButton("SQRT");
    private JButton jbZero = new JButton("0");
    private JButton jbOne = new JButton("1");
    private JButton jbTwo = new JButton("2");
    private JButton jbThree = new JButton("3");
    private JButton jbFour = new JButton("4");
    private JButton jbFive = new JButton("5");
    private JButton jbSix = new JButton("6");
    private JButton jbSeven = new JButton("7");
    private JButton jbEight = new JButton("8");
    private JButton jbNine = new JButton("9");
    private JButton jbDot = new JButton(".");
    private JButton jbPlus = new JButton("+");
    private JButton jbMinus = new JButton("-");
    private JButton jbTimes = new JButton("*");
    private JButton jbDivided = new JButton("/");
    private JButton jbPercent = new JButton("%");
    private JButton jbInverse = new JButton("1/x");
    private JButton jbEquals = new JButton("=");

    static double a = 0, b = 0, result = 0;
    static int operator = 0;

    public Calc() {
        setTitle("Calc");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(310, 290);
        setLocation(500, 500);

        textField.setPreferredSize(new Dimension(290, 50));
        textField.setMaximumSize(new Dimension(290, 50));
        textField.setLocation(0, 22);
        setLayout(new BorderLayout());
        add(textField, BorderLayout.NORTH);


        JPanel btnPanel = new JPanel();
        btnPanel.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();

        c.ipadx = 10;
        c.ipady = 10;


        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 0;
        c.gridwidth = 2;
        btnPanel.add(jbClear, c);

        c.gridx = 2;
        btnPanel.add(jbDelete, c);
        c.gridx = 4;
        c.gridwidth = 1;
        btnPanel.add(jbRoot, c);

        c.gridx = 0;
        c.gridy = 1;
        btnPanel.add(jbSeven, c);
        c.gridx = 1;
        btnPanel.add(jbEight, c);
        c.gridx = 2;
        btnPanel.add(jbNine, c);
        c.gridx = 3;
        c.gridwidth = 1;
        btnPanel.add(jbDivided, c);
        c.gridx = 4;
        btnPanel.add(jbPercent, c);

        c.gridx = 0;
        c.gridy = 2;
        btnPanel.add(jbFour, c);
        c.gridx = 1;
        btnPanel.add(jbFive, c);
        c.gridx = 2;
        btnPanel.add(jbSix, c);
        c.gridx = 3;
        btnPanel.add(jbTimes, c);
        c.gridx = 4;
        btnPanel.add(jbInverse, c);

        c.gridx = 0;
        c.gridy = 3;
        c.gridwidth = 1;
        btnPanel.add(jbOne, c);
        c.gridx = 1;
        btnPanel.add(jbTwo, c);
        c.gridx = 2;
        btnPanel.add(jbThree, c);
        c.gridx = 3;
        btnPanel.add(jbMinus, c);
        c.fill = GridBagConstraints.BOTH;
        c.gridx = 4;
        c.gridheight = 2;
        btnPanel.add(jbEquals, c);

        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 4;
        c.gridwidth = 2;
        c.gridheight = 1;
        btnPanel.add(jbZero, c);
        c.gridx = 2;
        c.gridwidth = 1;
        btnPanel.add(jbDot, c);
        c.gridx = 3;
        btnPanel.add(jbPlus, c);

        add(btnPanel, BorderLayout.CENTER);
        setResizable(false);
        setVisible(true);


        jbDelete.addActionListener(this);
        jbClear.addActionListener(this);
        jbRoot.addActionListener(this);
        jbZero.addActionListener(this);
        jbOne.addActionListener(this);
        jbTwo.addActionListener(this);
        jbThree.addActionListener(this);
        jbFour.addActionListener(this);
        jbFive.addActionListener(this);
        jbSix.addActionListener(this);
        jbSeven.addActionListener(this);
        jbEight.addActionListener(this);
        jbNine.addActionListener(this);
        jbDot.addActionListener(this);
        jbPlus.addActionListener(this);
        jbMinus.addActionListener(this);
        jbTimes.addActionListener(this);
        jbDivided.addActionListener(this);
        jbPercent.addActionListener(this);
        jbInverse.addActionListener(this);
        jbEquals.addActionListener(this);
    }


    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == jbOne) {
            textField.setText(textField.getText().concat("1"));
        }
        if (e.getSource() == jbTwo) {
            textField.setText(textField.getText().concat("2"));
        }
        if (e.getSource() == jbThree)
            textField.setText(textField.getText().concat("3"));

        if (e.getSource() == jbFour)
            textField.setText(textField.getText().concat("4"));

        if (e.getSource() == jbFive)
            textField.setText(textField.getText().concat("5"));

        if (e.getSource() == jbSix)
            textField.setText(textField.getText().concat("6"));

        if (e.getSource() == jbSeven)
            textField.setText(textField.getText().concat("7"));

        if (e.getSource() == jbEight)
            textField.setText(textField.getText().concat("8"));

        if (e.getSource() == jbNine)
            textField.setText(textField.getText().concat("9"));

        if (e.getSource() == jbZero)
            textField.setText(textField.getText().concat("0"));

        if (e.getSource() == jbDot)
            textField.setText(textField.getText().concat("."));

        if (e.getSource() == jbPlus) {
            a = Double.parseDouble(textField.getText());
            operator = 1;
            textField.setText("");
        }

        if (e.getSource() == jbMinus) {
            a = Double.parseDouble(textField.getText());
            operator = 2;
            textField.setText("");
        }

        if (e.getSource() == jbTimes) {
            a = Double.parseDouble(textField.getText());
            operator = 3;
            textField.setText("");
        }

        if (e.getSource() == jbDivided) {
            a = Double.parseDouble(textField.getText());
            operator = 4;
            textField.setText("");
        }

        if (e.getSource() == jbPercent) {
            a = Double.parseDouble(textField.getText());
            operator = 5;
            textField.setText("");
        }

        if (e.getSource() == jbInverse) {
            a = Double.parseDouble(textField.getText());
            result = 1 / a;
            textField.setText("" + result);
        }

        if (e.getSource() == jbRoot) {
            a = Double.parseDouble(textField.getText());
            result = Math.sqrt(a);
            textField.setText("" + result);
        }

        if (e.getSource() == jbEquals) {
            b = Double.parseDouble(textField.getText());

            switch (operator) {
                case 1:
                    result = a + b;
                    break;

                case 2:
                    result = a - b;
                    break;

                case 3:
                    result = a * b;
                    break;

                case 4:
                    result = a / b;
                    break;

                case 5:
                    result = b / 100 * a;
                    break;

                default:
                    result = 0;
            }

            textField.setText("" + result);
        }

        if (e.getSource() == jbClear)
            textField.setText("");

        if (e.getSource() == jbDelete) {
            String s = textField.getText();
            textField.setText("");
            for (int i = 0; i < s.length() - 1; i++)
                textField.setText(textField.getText() + s.charAt(i));
        }
    }

}
