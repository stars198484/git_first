package ru.geekbrains.java2.dz.dz1.ГерманВавилин;

import java.util.Scanner;

/**
 * Created by gta5 on 08.06.2016.
 */
//Фабрика шахмат
public class FactoryChess {
    public ChessFigure chessGenerator(String chessFigure, boolean isWhite) {
        switch (chessFigure.toUpperCase()) {
            case "P" : return new Pawn(isWhite);
            case "K" : return new King(isWhite);
            case "Q" : return new Queen(isWhite);
            case "R" : return new Rook(isWhite);
            case "N" : return new Knight(isWhite);
            case "B" : return new Bishop(isWhite);
            default : return new Pawn(isWhite);
        }
    }

    //Задаем цвет фигур
    public static boolean isChessWhite(Scanner scanner) {
        System.out.println("Выберите: Белые(W) (по-умолчанию) или Чёрные(B):");
        switch (scanner.nextLine().toUpperCase()) {
            case "W" : return true;
            case "B" : return false;
            default : return true;
        }
    }
}
