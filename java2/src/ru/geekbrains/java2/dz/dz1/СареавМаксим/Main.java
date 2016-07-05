package ru.geekbrains.java2.dz.dz1.СареавМаксим;

import java.util.Scanner;

/**
 * Created by Terminator on 08.06.2016.
 */
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("введите название фигуры");
        System.out.println("King, Queen, Bishop, Castle, Knight, Pawn");
        String textChessman = sc.nextLine();

        System.out.println("введите начальную клетку");
        String from = sc.nextLine();

        System.out.println("введите конечную клетку");
        String to = sc.nextLine();

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
        if (chessman != null) {
            Coordinate sC = new Coordinate(from);
            Coordinate eC = new Coordinate(to);
            // проверяем корректность координат
            // если координаты выходят за поле
            if (sC.isCorrectCoordinate() == false || eC.isCorrectCoordinate() == false) {
                System.out.println(false);
                System.exit(0);
            }
            // если координаты равны
            if (Coordinate.checkCoordinateEqaully(sC, eC)) {
                System.out.println(false);
                System.exit(0);
            }
            chessman.isRightMove(sC, eC);
        }

    }
}
