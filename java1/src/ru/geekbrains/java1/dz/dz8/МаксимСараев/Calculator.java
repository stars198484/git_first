package ru.geekbrains.java1.dz.dz8.МаксимСараев;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * Created by desarz on 31.05.2016.
 */
public class Calculator {
    public static void main(String[] args) {
        // для Swing создаем диспетчер событий, далее все выполнение будет в диспетчере
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                CalculatorFrame frame = new CalculatorFrame();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setLocation(800, 400);
                frame.setVisible(true);
            }
        });
    }
}
