package ru.geekbrains.java1.dz.dz8.ПавелСуходоев;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

/**
 * Created by xcyxoux on 01.06.16.
 */
public class CalcForm extends JFrame {

    char operation;
    StringBuilder buffer = new StringBuilder();
    String tmp;

    public CalcForm() {
        setTitle("Калькулятор");
        setSize(400, 400);
        setLocation(300, 300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JPanel topPanel = new JPanel();
        topPanel.setPreferredSize(new Dimension(400, 100));
        BoxLayout labelLayout = new BoxLayout(topPanel, BoxLayout.LINE_AXIS);

        topPanel.setLayout(labelLayout);

        JLabel calcLabel = new JLabel();
        calcLabel.setPreferredSize(new Dimension(400, 100));
        calcLabel.setHorizontalAlignment(JLabel.CENTER);
        calcLabel.setFont(new Font("Courier New", Font.PLAIN, 15));

        topPanel.add(calcLabel);


        char[] padSymbols = {'1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '.', '+', '-', '*', '/', '=', 'C', 'S'};

        JButton[] numPad = new JButton[padSymbols.length];
        for (int i = 0; i < numPad.length; i++) {
            numPad[i] = new JButton(String.valueOf(padSymbols[i]));
        }

        JPanel jPanel = new JPanel();
        GridLayout numbers = new GridLayout(3, 4);
        jPanel.setLayout(numbers);

        Maths maths = new Maths();

        ActionListener padListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton curBtn = (JButton) e.getSource();
                if (curBtn.getText().equals("+") | curBtn.getText().equals("-") | curBtn.getText().equals("/")
                | curBtn.getText().equals("*")) {
                    //на случай повторного нажатия операции
                    if (buffer.length() != 0) {
                        maths.setFirstNumber(Float.valueOf(buffer.toString()));
                        //сброс буфера
                        buffer.setLength(0);
                    }
                }
                switch (curBtn.getText()) {
                    case "+":
                        operation = '+';
                        break;
                    case "-":
                        operation = '-';
                        break;
                    case "/":
                        operation = '/';
                        break;
                    case "*":
                        operation = '*';
                        break;
                    case "C":
                        maths.clearFields();
                        calcLabel.setText("");
                        buffer.setLength(0);
                        break;
                    //Знак +/-
                    case "S":
                        buffer.setLength(0);
                        buffer.append(Float.valueOf(calcLabel.getText()) * -1);
                        calcLabel.setText(buffer.toString());
                        break;
                    case "=":
                        if (buffer.length() != 0 & !Objects.equals(calcLabel.getText(), "Ошибка")) {
                            maths.setSecondNumber(Float.valueOf(buffer.toString()));
                            buffer.setLength(0);
                            calcLabel.setText(maths.calculate(operation));
                        } else {
                            calcLabel.setText(maths.calculate(operation));
                        }
                        break;
                    default:
                        if (buffer.length() == 0) {
                            calcLabel.setText("");
                        }
                            buffer.append(curBtn.getText());
                            calcLabel.setText(calcLabel.getText() + curBtn.getText());
                        break;
                }
            }
        };

        for (JButton jButton : numPad) {
            jPanel.add(jButton);
            jButton.addActionListener(padListener);
        }
        setLayout(new BorderLayout());
        add(topPanel, BorderLayout.NORTH);
        add(jPanel, BorderLayout.CENTER);
        setVisible(true);

    }
}
