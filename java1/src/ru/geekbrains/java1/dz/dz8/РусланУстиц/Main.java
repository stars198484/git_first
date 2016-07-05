package ru.geekbrains.java1.dz.dz8.РусланУстиц;

import javax.swing.*;

/**
 * Created by darky on 31.05.2016.
 */
public class Main {
    public static void main(String[] args) throws ClassNotFoundException, UnsupportedLookAndFeelException, InstantiationException, IllegalAccessException {
        // Задаем стиль нативный для системы стиль контролов
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        Form form = new Form();
    }
}
