package ru.geekbrains.java1.dz.dz8.ВадимПрилепишев;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.FontUIResource;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Prilepishev Vadim on 01.06.2016.
 */
public class CalculatorForm extends JFrame {

    double summ;
    double digiOne;
    char[] expression = new char[1];
    StringBuffer digiString = new StringBuffer();

    public CalculatorForm(){
        setTitle("MyCalculator");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(310,250);
        setLocation(300,300);

        setLayout(new BorderLayout());

        JLabel jLabelNorth = new JLabel("0",SwingConstants.RIGHT);
        FontUIResource f = new FontUIResource("Verdana",0,16);
        Font font = new Font(f.getFontName(), f.getStyle(), f.getSize());
        jLabelNorth.setFont(font);
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4,4,4,4));

        Border margin = new EmptyBorder(10,10,10,10);
        jLabelNorth.setBorder(BorderFactory.createCompoundBorder(margin,BorderFactory.createMatteBorder(1, 1, 1, 1, Color.GRAY)));

        JButton digiOneButton = new JButton("1");
        JButton digiTwoButton = new JButton("2");
        JButton digiThreeButton = new JButton("3");
        JButton digiFourButton = new JButton("4");
        JButton digiFiveButton = new JButton("5");
        JButton digiSixButton = new JButton("6");
        JButton digiSevenButton = new JButton("7");
        JButton digiEightButton = new JButton("8");
        JButton digiNineButton = new JButton("9");
        JButton digiZeroButton = new JButton("0");

        JButton plusButton = new JButton("+");
        JButton minusButton = new JButton("-");
        JButton multiplicationButton = new JButton("*");
        JButton degreeButton = new JButton("/");
        JButton pointSeparatorButton = new JButton(".");
        JButton clearButton = new JButton("C");
        JButton backArrowButton = new JButton("<<<");
        JButton equallyButton = new JButton("=");

        buttonPanel.add(digiOneButton);
        buttonPanel.add(digiTwoButton);
        buttonPanel.add(digiThreeButton);
        buttonPanel.add(digiFourButton);
        buttonPanel.add(digiFiveButton);
        buttonPanel.add(digiSixButton);
        buttonPanel.add(digiSevenButton);
        buttonPanel.add(digiEightButton);
        buttonPanel.add(digiNineButton);
        buttonPanel.add(digiZeroButton);
        buttonPanel.add(plusButton);
        buttonPanel.add(minusButton);
        buttonPanel.add(multiplicationButton);
        buttonPanel.add(degreeButton);
        buttonPanel.add(pointSeparatorButton);
        buttonPanel.add(clearButton);
        buttonPanel.add(backArrowButton);
        buttonPanel.add(equallyButton);

        add(jLabelNorth, BorderLayout.NORTH);
        add(buttonPanel,BorderLayout.CENTER);

        digiOneButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                digiString.append("1");
                jLabelNorth.setText(digiString.toString());
            }
        });

        digiTwoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                digiString.append("2");
                jLabelNorth.setText(digiString.toString());
            }
        });

        digiThreeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                digiString.append("3");
                jLabelNorth.setText(digiString.toString());
            }
        });

        digiFourButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                digiString.append("4");
                jLabelNorth.setText(digiString.toString());
            }
        });

        digiFiveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                digiString.append("5");
                jLabelNorth.setText(digiString.toString());
            }
        });

        digiSixButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                digiString.append("6");
                jLabelNorth.setText(digiString.toString());
            }
        });

        digiSevenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                digiString.append("7");
                jLabelNorth.setText(digiString.toString());
            }
        });

        digiEightButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                digiString.append("8");
                jLabelNorth.setText(digiString.toString());
            }
        });

        digiNineButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                digiString.append("9");
                jLabelNorth.setText(digiString.toString());
            }
        });

        digiZeroButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                digiString.append("0");
                jLabelNorth.setText(digiString.toString());
            }
        });

        backArrowButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                digiString.delete(digiString.length()-1,digiString.length());
                jLabelNorth.setText(digiString.toString());
            }
        });

        pointSeparatorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                digiString.append(".");
                jLabelNorth.setText(digiString.toString());
            }
        });

        plusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                digiOne = Double.valueOf(jLabelNorth.getText());
                expression[0] = '+';
                digiString.setLength(0);
                jLabelNorth.setText("+");
            }
        });

        minusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                digiOne = Double.valueOf(jLabelNorth.getText());
                expression[0] = '-';
                digiString.setLength(0);
                jLabelNorth.setText("-");
            }
        });

        multiplicationButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                digiOne = Double.valueOf(jLabelNorth.getText());
                expression[0] = '*';
                digiString.setLength(0);
                jLabelNorth.setText("*");
            }
        });

        degreeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                digiOne = Double.valueOf(jLabelNorth.getText());
                expression[0] = '/';
                digiString.setLength(0);
                jLabelNorth.setText("/");
            }
        });

        equallyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switch(expression[0]){
                    case '+':
                        double digi = Double.valueOf(jLabelNorth.getText());
                        summ = digiOne + digi;
                        jLabelNorth.setText(String.valueOf(summ));
                        break;
                    case '-':
                        digi = Double.valueOf(jLabelNorth.getText());
                        summ = digiOne - digi;
                        jLabelNorth.setText(String.valueOf(summ));
                        break;
                    case '*':
                        digi = Double.valueOf(jLabelNorth.getText());
                        summ = digiOne * digi;
                        jLabelNorth.setText(String.valueOf(summ));
                        break;
                    case '/':
                        digi = Double.valueOf(jLabelNorth.getText());
                        summ = digiOne / digi;
                        jLabelNorth.setText(String.valueOf(summ));
                        break;
                }
            }
        });

        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                summ = 0;
                digiOne = 0;
                digiString.setLength(0);
                jLabelNorth.setText("0");
            }
        });

        setVisible(true);

    }

}
