package ru.geekbrains.java1.dz.dz8.АндрейКащеев;

import javax.swing.*;
import java.awt.event.ActionListener;

/**
 * Created by kay on 01.06.2016.
 */
//Уменьшаем кол-во кода, чтобы не забывать добавлять ActionListener
public class MyJButton extends JButton {
    MyJButton(String text, ActionListener aL){
        super(text);
        addActionListener(aL);
    }
}
