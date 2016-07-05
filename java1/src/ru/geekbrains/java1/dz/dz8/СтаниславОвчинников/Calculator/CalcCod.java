package ru.geekbrains.java1.dz.dz8.СтаниславОвчинников.Calculator;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

/**
 * Created by Stars on 01.06.2016.
 */
public class CalcCod extends JFrame {
    private String[] s = new String[2];
    private int i = 0;
    private double a, b, res;
    protected StringBuilder textLabel = new StringBuilder();
    private char run;
    JLabel jl = new JLabel(" ", SwingConstants.RIGHT);

    public CalcCod() {
        Font font = new Font("Time New Roman", Font.BOLD, 40);
        jl.setFont(font);
        jl.setPreferredSize(new Dimension(50, 100));
        jl.setOpaque(true);
        jl.setBackground(Color.white);
        jl.setBorder(new LineBorder(Color.black, 1));
    }

    public void Backspace() {
        textLabel.delete(textLabel.length() - 1, textLabel.length());
        jl.setText(textLabel.toString());
        System.out.println(textLabel.length());
        if (textLabel.length() == 0) {
            textLabel.append("0");
            jl.setText(textLabel.toString());
        }
    }

    public void PlusMinus() {
        if (textLabel.indexOf("-") < 0) {
            textLabel.insert(0, "-");
            jl.setText(textLabel.toString());
        } else {
            textLabel.deleteCharAt(0);
            jl.setText(textLabel.toString());
        }
    }

    public void CE() {
        s[0] = "0";
        s[1] = "0";
        res = 0;
        run = ' ';
        textLabel.delete(0, textLabel.length());
        textLabel.append("0");
        jl.setText(textLabel.toString());
    }

    public void Fraction() {
        if (textLabel.indexOf(".") < 0) {
            textLabel.append(".");
            jl.setText(textLabel.toString());
        } else {
            jl.setText(textLabel.toString());
        }
    }

    public void CalcRun() {
        switch (run) {
            case '/':
                s[1] = textLabel.toString();
                System.out.println(s[1]);
                a = Double.parseDouble(s[0]);
                b = Double.parseDouble(s[1]);
                if (b == 0) {
                    jl.setText("ERROR");
                    break;
                }
                res = (a / b);
                textLabel.replace(0, textLabel.length(), String.valueOf(res));
                jl.setText(textLabel.toString());

                break;
            case '*':
                s[1] = textLabel.toString();
                a = Double.parseDouble(s[0]);
                b = Double.parseDouble(s[1]);
                res = (a * b);
                textLabel.replace(0, textLabel.length(), String.valueOf(res));
                jl.setText(textLabel.toString());

                break;
            case '+':
                s[1] = textLabel.toString();
                a = Double.parseDouble(s[0]);
                b = Double.parseDouble(s[1]);
                res = (a + b);
                textLabel.replace(0, textLabel.length(), String.valueOf(res));
                jl.setText(textLabel.toString());

                break;
            case '-':
                s[1] = textLabel.toString();
                a = Double.parseDouble(s[0]);
                b = Double.parseDouble(s[1]);
                res = (a - b);
                textLabel.replace(0, textLabel.length(), String.valueOf(res));
                jl.setText(textLabel.toString());

                break;
        }
    }

    public void Equally() {
        CalcRun();
        run = ' ';
    }
    public void Run(char sign){
        s[0] = textLabel.toString();
        textLabel.delete(0, textLabel.length());
        textLabel.append("0");
        run = sign;
    }

    public void Degree() {
        CalcRun();
        Run('/');
    }

    public void Plus() {
        CalcRun();
        Run('+');
    }

    public void Minus() {
        CalcRun();
        Run('-');
    }

    public void Multi() {
        CalcRun();
        Run('*');
    }

    public void ButtonNum(String num) {
        jl.setText(textLabel.toString());
        if (textLabel.toString().equals("0")) {
            textLabel.replace(0, 1, num);
            jl.setText(textLabel.toString());
        } else {
            textLabel.append(num);
            jl.setText(textLabel.toString());
        }
    }
}
