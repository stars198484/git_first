package ru.geekbrains.java2.lesson4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Home-pc on 16.06.2016.
 */
public class ShowMessageDialog extends JFrame {

    JButton button;

    ShowMessageDialog(){
        super("Предупреждающий диалог");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        button = new JButton("Выход");
        button.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent event) {
                if (JOptionPane.showConfirmDialog(button,
                        "Вы уверены, что хотите выйти?")
                        == JOptionPane.YES_OPTION) System.exit(0);
            }

        });
        getContentPane().setLayout(new FlowLayout());
        getContentPane().add(button);
        setSize(200,150);
        setVisible(true);
    }
}