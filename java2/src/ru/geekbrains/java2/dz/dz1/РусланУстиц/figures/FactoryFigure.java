package ru.geekbrains.java2.dz.dz1.РусланУстиц.figures;

/**
 * Created by darky_000 on 07.06.2016.
 */
public class FactoryFigure {
    public Figure getFigure(String figureType) {
        Figure figure = null;
        switch (figureType) {
            case "Pawn": figure = new Pawn(); break;
            case "Rook": figure = new Rook(); break;
            case "Knight": figure = new Knight(); break;
            case "Bishop": figure = new Bishop(); break;
            case "Queen": figure = new Queen(); break;
            case "King": figure = new King(); break;
        }
        return figure;

    }
}
