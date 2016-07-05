package ru.geekbrains.java1.dz.dz8.АлександрАнатольевичСмирнов;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Created by Alexandr SMIRNOV on 02.06.2016.
 */

public class MainForm extends JFrame {

    private String[] bufer = new String[3]; // 0 - операция; 1 - первое число; 2 - второе число
    private int number = 1; // номер текущей переменной 1 или 2
    private int SIZE = 8; // разрядность


    public MainForm() {

// почему-то не работает
//        for (String buf: bufer){buf = "A";}
//        for (String buf: bufer){System.out.println(buf);}
// а так - работает
        for (int i = 0; i < 3; i++) {
            bufer[i] = "";
        } // if
        number = 1;
        bufer[1] = "0";
        bufer[2] = "0";

//        for (int i = 0; i < 3; i++) {
//            System.out.println(bufer[i]);
//        }
        JLabel label1 = new JLabel();
        label1.setText("0");
        label1.setOpaque(true); // сделать метку не прозрачной
        label1.setBackground(Color.WHITE); // установить цвет фона
        label1.setFont(new Font("Courier New", Font.BOLD, 36));
        label1.setHorizontalAlignment(SwingConstants.RIGHT);
        //label1.setPreferredSize(new Dimension(10, 40)); // Только высота 40, ширина - по всему фрейму
        label1.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createLineBorder(Color.BLACK, 2),
                BorderFactory.createEmptyBorder(1, 1, 1, 2))); // граница метки сверху, слева, снизу, справа

        ActionListener actionListener1 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String buttonName = ((JButton) e.getSource()).getName();
                switch (buttonName) {
                    case "N0": // Очистка
                        number = 1;
                        bufer[1] = "0";
                        bufer[2] = "0";
                        break;
                    case "N1": // Удаление последнего символа
                        int length = bufer[number].length();
                        if (length < 2) {
                            bufer[number] = "0";
                            break;
                        }
                        bufer[number] = bufer[number].substring(0, length - 1);
                        break;
                    case "N2": // квадрат не реализован
                        break;
                    case "N3": // делить
                        if (number == 1) {
                            bufer[0] = "/";
                            number = 2;
                        } // if
                        break;
                    case "N4":
                        addDigit("7");
                        break;
                    case "N5":
                        addDigit("8");
                        break;
                    case "N6":
                        addDigit("9");
                        break;
                    case "N7": // умножить
                        if (number == 1) {
                            bufer[0] = "*";
                            number = 2;
                        } // if
                        break;
                    case "N8":
                        addDigit("4");
                        break;
                    case "N9":
                        addDigit("5");
                        break;
                    case "N10":
                        addDigit("6");
                        break;
                    case "N11": // отнять
                        if (number == 1) {
                            bufer[0] = "-";
                            number = 2;
                        } // if
                        break;
                    case "N12":
                        addDigit("1");
                        break;
                    case "N13":
                        addDigit("2");
                        break;
                    case "N14":
                        addDigit("3");
                        break;
                    case "N15": // прибавить
                        if (number == 1) {
                            bufer[0] = "+";
                            number = 2;
                        } // if
                        break;
                    case "N16":
                        if (!bufer[number].equals("0")){
                            if (bufer[number].startsWith("-")){
                                //System.out.println(bufer[number]);
                                bufer[number] = bufer[number].replace("-", "");
                                //System.out.println(bufer[number]);
                            } else {
                                bufer[number] = "-" + bufer[number];
                            } // отрицательное
                        } // не = 0
                        break;
                    case "N17":
                        if (!bufer[number].equals("0")) addDigit("0");
                        break;
                    case "N18": // дробная часть не реализована
                        break;
                    case "N19": // вычислить
                        if (number == 2) {
                            int a = Integer.parseInt(bufer[1]);
                            int b = Integer.parseInt(bufer[2]);
                            switch (bufer[0]) {
                                case "+":
                                    bufer[1] = "" + (a + b);
                                    break;
                                case "-":
                                    bufer[1] = "" + (a - b);
                                    break;
                                case "*":
                                    bufer[1] = "" + (a * b);
                                    break;
                                case "/":
                                    if (b != 0) bufer[1] = "" + (a / b);
                                    break;
                            } // switch
                            bufer[0] = "";
                            bufer[2] = "0";
                            number = 1;
                        } // if
                        break;
                } // switch
                label1.setText(bufer[number]);
                //System.out.println(bufer[number]);
            } // actionPerformed(
        };


        JButton[] jButtons = new JButton[20];
        for (int i = 0; i < 20; i++) {
            jButtons[i] = new JButton();
            jButtons[i].setName("N" + i);
//            jButtons[i].setText("_" + i);
            jButtons[i].setFont(new Font("Courier New", Font.BOLD, 24));
            jButtons[i].addActionListener(actionListener1);
        } // for i

        jButtons[0].setText("C");
        jButtons[1].setText("«");
        jButtons[2].setText("x²");
        jButtons[3].setText("÷");
        jButtons[4].setText("7");
        jButtons[5].setText("8");
        jButtons[6].setText("9");
        jButtons[7].setText("X");
        jButtons[8].setText("4");
        jButtons[9].setText("5");
        jButtons[10].setText("6");
        jButtons[11].setText("-");
        jButtons[12].setText("1");
        jButtons[13].setText("2");
        jButtons[14].setText("3");
        jButtons[15].setText("+");
        jButtons[16].setText("±");
        jButtons[17].setText("0");
        jButtons[18].setText(",");
        jButtons[19].setText("=");

        // Добавляем панель в центр
        JPanel panel1 = new JPanel();
        panel1.setLayout(new GridLayout(5, 4)); // таблица 4 х 5


        for (int i = 0; i < 20; i++) {
            panel1.add(jButtons[i]);
        } // for i


        setTitle("Калькулятор");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        add(label1, BorderLayout.NORTH);
        add(panel1, BorderLayout.CENTER);

        //setLocationRelativeTo(null);
        //setSize(400, 400);
        //setLocation(100, 100);
        //setVisible(true);

    } // MainForm()

    public MainForm(String title) {
        this();
        this.setTitle(title);
    } // MainForm(String title)

    private void addDigit(String digit) {
        if (bufer[number].equals("0")) bufer[number] = "";
        if (bufer[number].length() < SIZE) bufer[number] += digit;
    }

} // class MainForm
