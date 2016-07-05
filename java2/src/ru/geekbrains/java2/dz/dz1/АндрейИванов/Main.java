package ru.geekbrains.java2.dz.dz1.АндрейИванов;

import java.util.Scanner;

/**
 * Created by a.ivanov on 07.06.2016.
 */
public class Main {

    public static void main(String[] args) {

        int[] from;
        int[] to;
        int figure;
        FactoryChessmen fc = new FactoryChessmen();
        GiveStartInfo giveStartInfo = new GiveStartInfo();
        Chessmen chessmen;

        figure = giveStartInfo.readFigure();

        System.out.println("Введите начальные координаты фигуры в формате шахматной доски: (a-h)(1-8) пример - c5.");
        from = giveStartInfo.readPosition();

        System.out.println("Введите конечные координаты фигуры в формате шахматной доски: (a-h)(1-8) пример - c5.");
        to = giveStartInfo.readPosition();

        chessmen = fc.giveChessman(figure);
        System.out.println(chessmen.isRightMove(from, to));
    }
}
