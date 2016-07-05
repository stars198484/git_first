package ru.geekbrains.java2.dz.dz1.СтаниславОвчинников;

import java.util.Scanner;

/**
 * Created by Stars on 07.06.2016.
 */
public class Main {
    public static void main(String[] args) {
        boolean exit = false;
        ChessBoard cb = new ChessBoard();
        Chessman[] chessmans = new Chessman[6];
        String from;
        String to;
        cb.PrintBoard();
        Scanner sc = new Scanner(System.in);
        int chessman = 0;
        do {
            System.out.println("Введите название фигуры:\n1.Король\n2.Слон\n3.Ферзь\n4.Ладья\n5.Конь\n6.Пешка");
            chessman = sc.nextInt();
                System.out.println("Введите начальную координату");
                from = sc.next();
                System.out.println("Введите конечную координату");
                to = sc.next();
                exit = false;
        } while (exit);
        switch (chessman) {
            case 1:
                chessmans[0] = new King();
                if (chessmans[0].isRightMove(from, to) == true) {
                    System.out.println("Верный ход");
                } else {
                    System.out.println("Ход не верен");
                }
                break;
            case 2:
                chessmans[1] = new Bishop();
                if (chessmans[1].isRightMove(from, to) == true) {
                    System.out.println("Верный ход");
                } else {
                    System.out.println("Ход не верен");
                }
                break;
            case 3:
                chessmans[2] = new Queen();
                if (chessmans[2].isRightMove(from, to) == true) {
                    System.out.println("Верный ход");
                } else {
                    System.out.println("Ход не верен");
                }
                break;
            case 4:
                chessmans[3] = new Rook();
                if (chessmans[3].isRightMove(from, to) == true) {
                    System.out.println("Верный ход");
                } else {
                    System.out.println("Ход не верен");
                }
                break;
            case 5:
                chessmans[4] = new Knight();
                if (chessmans[4].isRightMove(from, to) == true) {
                    System.out.println("Верный ход");
                } else {
                    System.out.println("Ход не верен");
                }
                break;
            case 6:
                chessmans[5] = new Pawn();
                if (chessmans[5].isRightMove(from, to) == true) {
                    System.out.println("Верный ход");
                } else {
                    System.out.println("Ход не верен");
                }
                break;
            default:
        }
    }
}
