package ru.geekbrains.java1.dz.dz8.МаксимСараев;

import javax.swing.*;

/**
 * Created by desarz on 31.05.2016.
 */
public class CalculatorFrame extends JFrame{

    public CalculatorFrame() {
        setTitle("Калькулятор");
        CalculatorPanel panel = new CalculatorPanel();
        add(panel);
        pack();
    }
}
