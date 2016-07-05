package ru.geekbrains.java2.dz.dz2.СареавМаксим;


import ru.geekbrains.java2.dz.dz2.СареавМаксим.Exception.ChessException;
import ru.geekbrains.java2.dz.dz2.СареавМаксим.Exception.ChessExceptionFalseCoord;
import ru.geekbrains.java2.dz.dz2.СареавМаксим.Exception.ChessExceptionWrongFigure;
import ru.geekbrains.java2.dz.dz2.СареавМаксим.Exception.ChessExceptionWrongTurn;

import java.util.Scanner;

/**
 * Created by Terminator on 08.06.2016.
 */
public class Main {

    public static void main(String[] args){

        try {
            nextTurn();
        } catch (ChessException e) {
            e.printStackTrace();
        }
    }


    public static void nextTurn() throws ChessException{

        Scanner sc = new Scanner(System.in);

        System.out.println("введите название фигуры");
        System.out.println("King, Queen, Bishop, Castle, Knight, Pawn");
        String textChessman = sc.nextLine();
        Chessman chessman = null;
        switch (textChessman) {
            case "King":
                chessman = new King();
                break;
            case "Queen":
                chessman = new Queen();
                break;
            case "Bishop":
                chessman = new Bishop();
                break;
            case "Castle":
                chessman = new Castle();
                break;
            case "Knight":
                chessman = new Knight();
                break;
            case "Pawn":
                chessman = new Pawn();
                break;
        }
        if (chessman==null){
            throw new ChessExceptionWrongFigure();
        }


        System.out.println("введите начальную клетку");
        String from = sc.nextLine();

        System.out.println("введите конечную клетку");
        String to = sc.nextLine();


        Coordinate sC = new Coordinate(from);
        Coordinate eC = new Coordinate(to);
        // проверяем корректность координат
        // если координаты выходят за поле или
        // если координаты равны
        if (sC.isCorrectCoordinate() == false || eC.isCorrectCoordinate() == false || Coordinate.checkCoordinateEqaully(sC, eC)) {
            throw new ChessExceptionFalseCoord();
         }

        // Фигура выбрана правильно, координаты корректны, выполняем ход
        if (!chessman.isRightMove(sC, eC)) {
            throw new ChessExceptionWrongTurn();
        } else {
            System.out.println("Ход выполнен!");
        }

    }

}
