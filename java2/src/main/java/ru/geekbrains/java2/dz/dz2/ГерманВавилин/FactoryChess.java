package ru.geekbrains.java2.dz.dz2.ГерманВавилин;

import java.util.Scanner;

/**
 * Created by gta5 on 08.06.2016.
 */
//Фабрика шахмат
public class FactoryChess {
    public ChessFigure chessGenerator(String chessFigure, boolean isWhite) throws FigureTypeException{
        switch (chessFigure.toUpperCase()) {
            case "P" : return new Pawn(isWhite);
            case "K" : return new King(isWhite);
            case "Q" : return new Queen(isWhite);
            case "R" : return new Rook(isWhite);
            case "N" : return new Knight(isWhite);
            case "B" : return new Bishop(isWhite);
            default : throw new FigureTypeException("Неверный тип фигуры");
        }
    }

    //Задаем цвет фигур
    public boolean isChessWhite(Scanner scanner) throws FigureTypeException {
        System.out.println("Выберите: Белые(W) или Чёрные(B):");
        switch (scanner.nextLine().toUpperCase()) {
            case "W" : return true;
            case "B" : return false;
            default : throw new FigureTypeException("Невеный цвет");
        }
    }
}
