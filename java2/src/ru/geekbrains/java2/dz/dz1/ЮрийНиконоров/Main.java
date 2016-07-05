package ru.geekbrains.java2.dz.dz1.ЮрийНиконоров;

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
        char[] ch;

        Scanner sc = new Scanner(System.in);
        Chessboard chessboard = new Chessboard();

        chessboard.printToScreen();

        System.out.println("ДЗ успел сделать только для одной фигуры - Пешка.\nВведите координаты фигуры (формат: а2):");
        ch = sc.next().toCharArray();
        X1 = charToNumber(ch[0]);
        Y1 = ch[1] - '1';
        System.out.println("Выбран " + chessboard.getNameFigure(X1,Y1));

        System.out.println("Введите координаты куда хотите совершить ход (формат: а4):");
        ch = sc.next().toCharArray();
        X2 = charToNumber(ch[0]);
        Y2 = ch[1] - '1';

        if(chessboard.getFigure(X1,Y1).isMoveTo(X2,Y2,chessboard)) System.out.println("Так ходить можно.");
        else  System.out.println("Так ходить нельзя!");



    }
    public static int charToNumber(char ch){
        if (ch < 'a' || ch > 'h') return -1;
        switch(ch){
            case 'a': return 0;
            case 'b': return 1;
            case 'c': return 2;
            case 'd': return 3;
            case 'e': return 4;
            case 'f': return 5;
            case 'g': return 6;
            case 'h': return 7;
            default: return -1;
        }
    }
}
