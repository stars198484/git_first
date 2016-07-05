package ru.geekbrains.java1.dz.dz8.АндрейИванов;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.lang.Math.abs;
import static java.lang.Math.sqrt;

public class FormWindow extends JFrame {

    private  double num1;
    private  double num2;
    private int operation = 0;              // переменная для проверки какая операция была выбрана пользователем
    private  String strNum1 = "";
    private String strNum2 = "";
    private  boolean isCalculation = false;  // переменная используется для определения была нажата кнопка '='
    private  boolean isPoint1 = false;       // переменная используется для определения есть ли в первом числе точка
    private  boolean isPoint2 = false;       // переменная используется для определения есть ли во втором числе точка
    private  boolean sqrt_press = false;         // переменная для проверки была ли нажата при последней операции кнопка  "√" или кнопка "x²"
    private  JLabel label = new JLabel();
    private  JPanel[] panel = new JPanel[4];
    private  JButton[] button = new JButton[21];


    public FormWindow() {

        setTitle("Калькулятор 1.0");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(250, 350);
        setLocation(300, 300);

        setElements();
        ListenElements();
    }

    private void setElements() {

        for (int i = 0; i < 4; i++) {
            panel[i] = new JPanel();
        }
        label.setText("0");
        label.setSize(250, 50);

        setLayout(new BorderLayout());
        //add(panel[1], BorderLayout.WEST);
        //add(panel[2], BorderLayout.EAST);
        //add(panel[3], BorderLayout.SOUTH);
        add(panel[0], BorderLayout.CENTER);
        add(label, BorderLayout.NORTH);

        label.setLayout((new GridLayout(1,1)));

        panel[0].setLayout(new GridLayout(5, 3, 5, 5));

        button[0] = new JButton("1");
        panel[0].add(button[0]);

        button[1] = new JButton("2");
        panel[0].add(button[1]);

        button[2] = new JButton("3");
        panel[0].add(button[2]);

        button[3] = new JButton("+");
        panel[0].add(button[3]);

        button[4] = new JButton("4");
        panel[0].add(button[4]);

        button[5] = new JButton("5");
        panel[0].add(button[5]);

        button[6] = new JButton("6");
        panel[0].add(button[6]);

        button[7] = new JButton("-");
        panel[0].add(button[7]);

        button[8] = new JButton("7");
        panel[0].add(button[8]);

        button[9] = new JButton("8");
        panel[0].add(button[9]);

        button[10] = new JButton("9");
        panel[0].add(button[10]);

        button[11] = new JButton("*");
        panel[0].add(button[11]);

        button[12] = new JButton("0");
        panel[0].add(button[12]);

        button[13] = new JButton("←");
        panel[0].add(button[13]);

        button[14] = new JButton("C");
        panel[0].add(button[14]);

        button[15] = new JButton("/");
        panel[0].add(button[15]);

        button[16] = new JButton("x²");
        panel[0].add(button[16]);

        button[17] = new JButton("√");
        panel[0].add(button[17]);

        button[18] = new JButton(".");
        panel[0].add(button[18]);

        button[19] = new JButton("=");
        panel[0].add(button[19]);

        setVisible(true);
    }

    private void isCalculation() {

        if(isCalculation) {                                                            //проверяется была ли нажата кнопка равно
            label.setText("0");                                                        //если да, то нужно начать запись с новой пустой строки.
            isCalculation = false;                                                     //и пустых значений
            if(!sqrt_press) {
                strNum1 = "";
                sqrt_press = false;
            }
            strNum2 = "";
            isPoint2 = false;
        }
    }

    private void isZero() {

        if(strNum2.equals("0")) {                                                      // Проверяем второе число на равенство 0
            strNum2 = "";                                                              // для того чтобы убрать ноль и записать на его место цифру, которая будет введена
            label.setText(label.getText().substring(0, label.getText().length() - 1)); // из отображаемого значения label убираем крайнюю цифру 0
        }
    }

    private void setLabelAndNum(String str){

        if(label.getText().equals("0")) label.setText(str);
        else label.setText(label.getText() + str);
        if(operation == 0) strNum1 += str;                                             // в strNum1 прибавляется цифра до определенной операции(+, -, *, /).
        else  strNum2 += str;                                                          // в strNum2 прибавляется цифра после определенной операции(+, -, *, /).
    }

    private void ListenElements() {


        button[17].addActionListener(new ActionListener() { // обработка кнопки "√"
            @Override
            public void actionPerformed(ActionEvent e) {

                isCalculation();
                isCalculation = true;
                sqrt_press = true;
                double num;
                num1 = Double.parseDouble(strNum1);
                num = sqrt(num1);
                if (abs(num - (int)(num + 0.5) ) < 0.0001) {
                    label.setText("" + (long)num);
                }
                else label.setText("" + num);
                strNum1 = label.getText();
            }
        });


        button[16].addActionListener(new ActionListener() { // обработка кнопки "x²"
            @Override
            public void actionPerformed(ActionEvent e) {
                isCalculation();
                isCalculation = true;
                sqrt_press = true;
                double num;
                num1 = Double.parseDouble(strNum1);
                num = num1 * num1;
                if (abs(num - (int)(num + 0.5) ) < 0.0001) {
                    label.setText("" + (long)num);
                }
                else label.setText("" + num);
                strNum1 = label.getText();
            }
        });

        button[18].addActionListener(new ActionListener() {  // обработка кнопки '.';
            @Override
            public void actionPerformed(ActionEvent e) {

                isCalculation();

                if(operation == 0) {
                    if(!isPoint1) {
                        label.setText(label.getText() + ".");
                        strNum1 += ".";
                        isPoint1 = true;
                    }
                }
                else if(!isPoint2) {
                    if(strNum2.equals("")) {
                        label.setText(label.getText() + "0.");
                        strNum2 = "0.";
                        isPoint2 = true;
                    }
                    else {
                        label.setText(label.getText() + ".");
                        strNum2 += ".";
                        isPoint2 = true;
                    }
                }

            }
        });

        button[12].addActionListener(new ActionListener() { // обработка кнопки '0';
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!label.getText().equals("0")) {

                    isCalculation();
                    isZero();

                    if(operation == 0) {
                        label.setText(label.getText() + "0");
                        strNum1 += "0";
                    }
                    else if(!strNum2.equals("0")) {
                        label.setText(label.getText() + "0");
                        strNum2 += "0";
                    }
                }
            }
        });

        for (int i = 0; i < 3; i++) {   // обработка кнопок 1, 2, 3
            String str = "" + (i + 1);
            button[i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    isCalculation();
                    isZero();
                    setLabelAndNum(str);
                }
            });
        }
        for (int i = 4; i < 7; i++) {  // обработка кнопок 4, 5, 6
            String str = "" + i;
            button[i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    isCalculation();
                    isZero();
                    setLabelAndNum(str);
                }
            });
        }
        for (int i = 8; i < 11; i++) { // обработка кнопок 7, 8, 9
            String str = "" + (i - 1);
            button[i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    isCalculation();
                    isZero();
                    setLabelAndNum(str);
                }
            });
        }
        button[14].addActionListener(new ActionListener() { // обработка кнопки 'C'
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("0");
                strNum1 = "";
                strNum2 = "";
                num1 = 0;
                num2 = 0;
                operation = 0;
                isPoint1 = false;
                isPoint2 = false;
            }
        });

        button[13].addActionListener(new ActionListener() { // обработка кнопки '←'
            @Override
            public void actionPerformed(ActionEvent e) {
                if(operation == 0) {
                    if(!label.getText().equals("0")) {
                        if(strNum1.length() != 1) {
                            strNum1 = strNum1.substring(0, (strNum1.length() - 1));
                            label.setText(strNum1);
                        }
                        else {
                            label.setText("0");
                            strNum1 = "";
                            isPoint1 = false;
                        }
                    }
                }
                else if(strNum2.length() == 1) {
                    strNum2 = "0";
                    label.setText(label.getText().substring(0, (label.getText().length()-1))+strNum2);
                    isPoint2 = false;
                }
                else if(strNum2.length() > 1) {
                    strNum2 = strNum2.substring(0, (strNum2.length() - 1));
                    label.setText(label.getText().substring(0, (label.getText().length()-1)));
                }
            }
        });
        button[3].addActionListener(new ActionListener() { // обработка кнопки '+'
            @Override
            public void actionPerformed(ActionEvent e) {
                isCalculation = false;
                if(operation == 0) {
                    strNum1 = label.getText();
                    operation = 1;
                    label.setText(label.getText() + " + ");
                }
            }
        });
        button[7].addActionListener(new ActionListener() {  // обработка кнопки '-'
            @Override
            public void actionPerformed(ActionEvent e) {
                isCalculation = false;
                if(operation == 0) {
                    strNum1 = label.getText();
                    operation = 2;
                    label.setText(label.getText() + " - ");
                }
            }
        });
        button[11].addActionListener(new ActionListener() { // обработка кнопки '*'
            @Override
            public void actionPerformed(ActionEvent e) {
                isCalculation = false;
                if(operation == 0) {
                    strNum1 = label.getText();
                    operation = 3;
                    label.setText(label.getText() + " * ");
                }
            }
        });
        button[15].addActionListener(new ActionListener() {  // обработка кнопки '/'
            @Override
            public void actionPerformed(ActionEvent e) {
                isCalculation = false;
                if(operation == 0) {
                    strNum1 = label.getText();
                    operation = 4;
                    label.setText(label.getText() + " / ");
                }
            }
        });
        button[19].addActionListener(new ActionListener() { // обработка кнопки '='
            @Override
            public void actionPerformed(ActionEvent e) {
                if(strNum1.equals("")) strNum1 = "0";
                if(!strNum2.equals("")) {
                    num1 = Double.parseDouble(strNum1);
                    num2 = Double.parseDouble(strNum2);
                    strNum2 = "";
                    isPoint2 = false;
                    isCalculation = true;
                    double num = 0;
                    switch (operation) {
                        case 1: {
                            num = num1 + num2;
                            if (abs((num) - (int)((num) + 0.5) ) < 0.0001) {         // проверка есть ли дробная часть числа
                                label.setText("" + (long)(num));                     // если нет, то выводим число без точки
                            }
                            else label.setText("" + num);
                            break;
                        }
                        case 2: {
                            num = num1 - num2;
                            if (abs((num) - (int)((num) + 0.5) ) < 0.0001) {
                                label.setText("" + (long)num);
                            }
                            else label.setText("" + num);
                            break;
                        }
                        case 3: {
                            num = num1 * num2;
                            if (abs(num - (int)(num + 0.5) ) < 0.0001) {
                                label.setText("" + (long)num);
                            }
                            else label.setText("" + num);
                            break;
                        }
                        case 4: {
                            num = num1 / num2;
                            if (num2 != 0) {
                                if (num1 % num2 == 0) label.setText("" + (long)num);
                                else label.setText("" + num);
                            }
                            else {
                                label.setText("Деление на 0 невозможно");
                            }
                            break;
                        }
                    }
                    operation = 0;
                    if(abs(num - (int)(num + 0.5) ) > 0.0001) isPoint1 = true;
                    strNum1 = label.getText();
                }
            }
        });
    }
}
