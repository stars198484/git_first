package ru.geekbrains.java2.dz.dz1.РусланУстиц;

import ru.geekbrains.java2.dz.dz1.РусланУстиц.figures.Figure;
import ru.geekbrains.java2.dz.dz1.РусланУстиц.helpers.CoordinatesParser;

import java.util.Scanner;

/**
 * Created by darky_000 on 07.06.2016.
 */
public class ChessGame {

    public static void main(String[] args) {
        ChessField chessField = new ChessField();
        chessField.initField();
        chessField.printField();

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Print from and to coordinates:");
            String line = sc.nextLine();
            System.out.println(line);
            String sFrom = CoordinatesParser.parseFromCoordinate(line);
            String sTo = CoordinatesParser.parseToCoordinate(line);

            if (!ChessField.isOccupied(sFrom)) {
                System.out.println("Warning: Cell is empty");
                continue;
            }

            Figure figure = Figure.getFigure(sFrom);

            if (figure.isRightMove(sFrom, sTo))
                System.out.printf("Figure: %s; Coordinates: %s; Correct way: TRUE\n", figure.getName(), sTo);
            else System.out.printf("Figure: %s; Coordinates: %s; Correct way: FALSE\n", figure.getName(), sTo);
        }
    }


}
