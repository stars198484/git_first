package ru.geekbrains.java2.level2homework1;

/**
 * Created by Olya on 09.06.2016.
 */
public class defineFigure {
    public Figure defineMethod(String gotFigure) {

        Figure figure = null;
        switch (gotFigure.toLowerCase()) {
                case "rook":
                    figure = new Rook();
                    break;
                case "bishop":
                    figure = new Bishop();
                    break;
                case "knight":
                    figure = new Knight();
                    break;
                case "queen":
                    figure = new Queen();
                    break;
                case "king":
                    figure = new King();
                    break;
                case "pawn":
                    figure = new Pawn();
                    break;
                default:
                    System.out.println("Incorrect figure, try again");

            }
        return figure;
    }
}
