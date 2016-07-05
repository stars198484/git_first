package ru.geekbrains.java1.dz.dz8.АндрейКащеев;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.*;

/**
 * Created by kay on 31.05.2016.
 */
public class CalcForm extends JFrame {
    private JTextField display;

    public CalcForm() {
        CalcEng eng = new CalcEng(this);
        setTitle("ACalc");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(600, 400);
        setLocation(300, 300);
        setResizable(false);
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        JButton btn0 = new MyJButton("0",eng);
        JButton btn1 = new MyJButton("1",eng);
        JButton btn2 = new MyJButton("2",eng);
        JButton btn3 = new MyJButton("3",eng);
        JButton btn4 = new MyJButton("4",eng);;
        JButton btn5 = new MyJButton("5",eng);
        JButton btn6 = new MyJButton("6",eng);
        JButton btn7 = new MyJButton("7",eng);
        JButton btn8 = new MyJButton("8",eng);
        JButton btn9 = new MyJButton("9",eng);
        JButton btnComma = new MyJButton(",",eng);
        JButton btnPlus = new MyJButton("+",eng);
        JButton btnMinus = new MyJButton("-",eng);
        JButton btnMul = new MyJButton("*",eng);
        JButton btnDiv = new MyJButton("/",eng);
        JButton btnClean = new MyJButton("CLEAN",eng);
        JButton btnCalc = new MyJButton("=",eng);


        display = new JTextField();
        display.setEditable(false);

        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets.top = 5;
        gbc.insets.bottom = 5;
        gbc.insets.left = 5;
        gbc.insets.right = 5;
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        add(display,gbc);

        gbc.gridwidth = 1;
        gbc.gridx = 0;
        gbc.gridy = 1;
        add(btn7,gbc);
        gbc.gridx = 1;
        gbc.gridy = 1;
        add(btn8,gbc);
        gbc.gridx = 2;
        gbc.gridy = 1;
        add(btn9,gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        add(btn4,gbc);
        gbc.gridx = 1;
        gbc.gridy = 2;
        add(btn5,gbc);
        gbc.gridx = 2;
        gbc.gridy = 2;
        add(btn6,gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        add(btn1,gbc);
        gbc.gridx = 1;
        gbc.gridy = 3;
        add(btn2,gbc);
        gbc.gridx = 2;
        gbc.gridy = 3;
        add(btn3,gbc);

        gbc.gridx = 2;
        gbc.gridy = 4;
        add(btnComma,gbc);

        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.gridwidth =2;
        add(btn0,gbc);

        gbc.gridx = 3;
        gbc.gridy = 1;
        add(btnClean,gbc);

        gbc.gridx = 3;
        gbc.gridy = 4;
        add(btnCalc,gbc);

        gbc.gridx = 3;
        gbc.gridy = 2;
        gbc.gridwidth = 1;
        add(btnPlus,gbc);

        gbc.gridx = 4;
        gbc.gridy = 2;
        add(btnMul,gbc);

        gbc.gridx = 3;
        gbc.gridy = 3;
        add(btnMinus,gbc);

        gbc.gridx = 4;
        gbc.gridy = 3;
        add(btnDiv,gbc);













        pack();
        //JPanel jpTop = new JPanel();
        //jpTop.setBorder(new BevelBorder(BevelBorder.LOWERED));

        //jpTop.add(display);
        //add(jpTop,BorderLayout.NORTH);
        //add(new JButton("WEST"),BorderLayout.WEST);
        //add(new JButton("EAST"),BorderLayout.EAST);
        //add(new JButton("CENTER"),BorderLayout.CENTER);

        //add(btn0,BorderLayout.SOUTH);

        //setVisible(true);
    }

    public String getDisplay() {
        return display.getText();
    }

    public void setDisplay(String text) {
        display.setText(text);
    }

}
