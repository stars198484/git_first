package ru.geekbrains.java1.dz.dz8.АлександрАнатольевичСмирнов;

import javax.swing.*;
import java.awt.event.*;

/**
 * Created by Alexandr SMIRNOV on 02.06.2016.
 */

public class Main {
    public static void main(String[] args) {
        MainForm form1 = new MainForm("Калькулятор   ver. 0.1");
        form1.setSize(400, 400);
        //form1.setLocation(100, 100);
        form1.setLocationRelativeTo(null);
        form1.setVisible(true);
    } // psvm
} // class Main
