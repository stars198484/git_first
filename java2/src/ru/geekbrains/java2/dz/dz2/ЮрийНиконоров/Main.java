package ru.geekbrains.java2.dz.dz2.ЮрийНиконоров;

import java.util.Scanner;

/**
 * Created by YurokVRS on 07.06.2016.
 */
public class Main {
    public static void main(String[] args) {
        int X1;
        int Y1;
        int X2;
        int Y2;
        char[] chLocation = new char[2];

        Chessboard chessboard = new Chessboard();

        chessboard.printToScreen();
        System.out.println("Ходить можно только пешками и ладьёй.");

        while (true) {
            System.out.println("Укажите фигуру.");
            try {
                chLocation = inputLocation();
                X1 = chLocation[0] - 'a';
                Y1 = chLocation[1] - '1';

                System.out.println("Выбрана фигура " + chessboard.getNameFigure(X1, Y1));
                break;
            } catch (UnspecifiedFigure|IncorrectLocation e) {
                System.out.println(e);
            }
        }

        while (true) {
            System.out.println("Куда хотить?");
            try {
                chLocation = inputLocation();
                X2 = chLocation[0] - 'a';
                Y2 = chLocation[1] - '1';
                break;
            } catch (IncorrectLocation e) {
                System.out.println(e);
            }
        }
        if (chessboard.getFigure(X1, Y1).isMoveTo(X2, Y2, chessboard)) System.out.println("Так ходить можно.");
        else System.out.println("Так ходить нельзя!");

    }


    public static char[] inputLocation() throws IncorrectLocation {
        char[] ch = new char[2];
        char a;
        char b;
        System.out.println("Введите координаты (формат: а4):");
        Scanner sc = new Scanner(System.in);
        ch = sc.next().toCharArray();
        a = ch[0];
        b = ch[1];
        if (a < 'a' | a > 'h') throw new IncorrectLocation();
        if (b < '1' | b > '8') throw new IncorrectLocation();
        return ch;
    }
}
