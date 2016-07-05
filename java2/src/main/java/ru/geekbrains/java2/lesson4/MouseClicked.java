package ru.geekbrains.java2.lesson4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Created by Home-pc on 16.06.2016.
 */
public class MouseClicked  extends JFrame {

    MouseClicked(){
        super("Окно с кнопкой");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JButton ok = new JButton("OK");
        TextField loginField = new TextField();
        add(loginField);
        add(ok);

        ok.addMouseListener(new MouseAdapter() {

            public void mouseClicked(MouseEvent event) {

                if (loginField.getText().equals("Иван"))
                    JOptionPane.showMessageDialog(null, "Вход выполнен");
                else JOptionPane.showMessageDialog(null, "Вход НЕ выполнен");
            }

        });

        ok.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
               if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                   e.isAltDown();
                   e.isControlDown();
                   e.isShiftDown();
                   JOptionPane.showMessageDialog(null, "кнопка");
               }
            }
        });
        setSize(250,150);
        setVisible(true);
    }
}
