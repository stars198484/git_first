package ru.geekbrains.java2.dz.dz2.РусланУстиц;

import ru.geekbrains.java2.dz.dz2.РусланУстиц.exceptions.InvalidCoordinateException;
import ru.geekbrains.java2.dz.dz2.РусланУстиц.figures.FactoryFigure;
import ru.geekbrains.java2.dz.dz2.РусланУстиц.figures.Figure;
import ru.geekbrains.java2.dz.dz2.РусланУстиц.helpers.CoordinatesParser;

/**
 * Created by darky_000 on 07.06.2016.
 */
public class ChessField {

    private static final int SIZE = 8;

    public static int getFieldSize() {
        return SIZE;
    }

    private static int[][] field;

    public void initField() {
        field = new int[SIZE][SIZE];

        FactoryFigure factoryFigure = new FactoryFigure();

        try {
            for (int i = 0; i < 8; i++) {
                Figure pawn = factoryFigure.getFigure("Pawn");
                field[pawn.getY()][pawn.getX()] = 1;
            }
            for (int i = 0; i < 2; i++) {
                Figure rook = factoryFigure.getFigure("Rook");
                Figure knight = factoryFigure.getFigure("Knight");
                Figure bishop = factoryFigure.getFigure("Bishop");
                field[rook.getY()][rook.getX()] = 1;
                field[knight.getY()][knight.getX()] = 1;
                field[bishop.getY()][bishop.getX()] = 1;
            }
            Figure queen = factoryFigure.getFigure("Queen");
            Figure king = factoryFigure.getFigure("King");
            field[queen.getY()][queen.getX()] = 1;
            field[king.getY()][king.getX()] = 1;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Chess Field Error: Failed to initialize chess field");
            System.out.println("Terminating...");
            System.exit(1);
        }
    }

    public void printField() {
        char ch = 'a';
        for (int i = 0; i < SIZE + 1; i++) {
            for (int j = 0; j < SIZE + 1; j++) {
                if (i == 0 && j == 0) System.out.print("- ");
                else if (i == 0) {
                    System.out.print(ch + " ");
                    ch++;
                } else if (j == 0) {
                    System.out.print(ChessField.getFieldSize() - i + 1 + " ");
                } else System.out.print(field[i - 1][j - 1] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static boolean isOccupied(String line) throws InvalidCoordinateException {
        int x = CoordinatesParser.convertXtoInt(line);
        int y = CoordinatesParser.convertYtoInt(line);
        return isOccupied(x, y);
    }

    public static boolean isOccupied(int x, int y) {
        if (field == null) {
            System.out.println("Chess Field Error: field[][] variable was not initialized");
            System.out.println("Initializing field[][] variable...");
            field = new int[SIZE][SIZE];
        } else {
            if (field[y][x] == 1)
                return true;
        }
        return false;
    }
}
