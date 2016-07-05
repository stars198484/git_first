package ru.geekbrains.java2.lesson4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Home-pc on 16.06.2016.
 */
public class SimpleWindowJOptionPane extends JFrame {

    private JButton button;

    SimpleWindowJOptionPane(){
        super("Предупреждающий диалог");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        button = new JButton("Информация");
        button.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent event) {
                JOptionPane.showMessageDialog(button, "Не надо было нажимать на эту кнопку", "Информация", JOptionPane.WARNING_MESSAGE);
            }

        });
        getContentPane().setLayout(new FlowLayout());
        getContentPane().add(button);
        setSize(200,150);
        setVisible(true);
    }
}