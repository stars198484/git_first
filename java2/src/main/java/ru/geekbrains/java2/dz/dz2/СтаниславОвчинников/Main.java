package ru.geekbrains.java2.dz.dz2.СтаниславОвчинников;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Stars on 07.06.2016.
 */
public class Main {
    public static void main(String[] args) {
        ChessBoard cb = new ChessBoard();
        Chessman chessman = null;
        String from;
        String to;
        Scanner sc = new Scanner(System.in);
        int chessmanNumber = 0;
        try {
            do {
                System.out.println("Введите номер фигуры:\n1.Король\n2.Слон\n3.Ферзь\n4.Ладья\n5.Конь\n6.Пешка");
                chessmanNumber = sc.nextInt();
            } while (cb.checkCount(chessmanNumber));
        } catch (InputMismatchException e) {
            System.out.println("Ошибка ввода");
            return;
        }
        try {
            cb.PrintBoard();
            System.out.println("Введите начальную координату");
            from = sc.next();
            cb.errorCoordinate(from);
            System.out.println("Введите конечную координату");
            to = sc.next();
            cb.errorCoordinate(to);
        } catch (MyChessException e) {
            System.out.println(e);
            return;
        }

        switch (chessmanNumber) {
            case 1:
                chessman = new King();
                break;
            case 2:
                chessman = new Bishop();
                break;
            case 3:
                chessman = new Queen();
                break;
            case 4:
                chessman = new Rook();
                break;
            case 5:
                chessman = new Knight();
                break;
            case 6:
                chessman = new Pawn();
                break;
        }
        if (chessman != null) {
            if (chessman.isRightMove(from, to)) {
                System.out.println("Верный ход");
            } else {
                System.out.println("Ход не верен");
            }
        }
    }
}
