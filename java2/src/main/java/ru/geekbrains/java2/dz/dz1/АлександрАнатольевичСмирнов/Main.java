package ru.geekbrains.java2.dz.dz1.АлександрАнатольевичСмирнов;

import java.util.Scanner;

/**
 * Created by Alexandr SMIRNOV on 07.06.2016.
 */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] shot = new String[3];
        ChessMan chessMan = null;
        int X1 = 0, Y1 = 0, X2 = 0, Y2 = 0;
        boolean verification = false;
        do {
            System.out.println("Введите название фигуры, начальную и конечную клетки (в формате: Pawn e2 e4)");
            for (int i = 0; i < 3; i++) {
                shot[i] = sc.next();
            } // for i
            switch (shot[0]) {
                case "Pawn":
                    chessMan = new Pawn(); // Пешка
                    verification = true;
                    break;
                case "Rook":
                    chessMan = new Rook(); // Ладья
                    verification = true;
                    break;
                case "Knight":
                    chessMan = new Knight(); // Конь
                    verification = true;
                    break;
                case "Bishop":
                    chessMan = new Bishop(); // Слон
                    verification = true;
                    break;
                case "Queen":
                    chessMan = new Queen(); // Ферзь
                    verification = true;
                    break;
                case "King":
                    chessMan = new King(); // Король
                    verification = true;
                    break;
                default:
                    System.out.println("Название фигуры указано неправильно!");
                    verification = false;
                    continue;
            } // switch
            if (shot[1].length() < 2 || shot[2].length() < 2) {
                System.out.println("Координаты указаны неправильно!");
                verification = false;
                continue;
            } // if
            X1 = (int) shot[1].charAt(0) - 96;
            Y1 = (int) shot[1].charAt(1) - 48;
            X2 = (int) shot[2].charAt(0) - 96;
            Y2 = (int) shot[2].charAt(1) - 48;
            if (X1 < 1 || X1 > 8 || Y1 < 1 || Y1 > 8 || X2 < 1 || X2 > 8 || Y2 < 1 || Y2 > 8 || (X1 == X2 & Y1 == Y2)) {
                System.out.println("Координаты указаны неправильно!");
                verification = false;
            } // if
        } while (!verification);
        System.out.println("Проверка хода: " + shot[0] + " " + shot[1].substring(0, 2) + " " + shot[2].substring(0, 2));
        System.out.println(chessMan.isRightMove(X1, Y1, X2, Y2));
    } // psvm
}
