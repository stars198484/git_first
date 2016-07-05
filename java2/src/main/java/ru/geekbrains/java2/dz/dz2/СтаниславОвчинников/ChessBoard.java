package ru.geekbrains.java2.dz.dz2.СтаниславОвчинников;

/**
 * Created by Stars on 08.06.2016.
 */
public class ChessBoard {
    private String[][] thecells;
    private int attitudeFromI, attitudeFromJ, attitudeToI, attitudeToJ;

    String[][] getThecells() {
        return thecells;
    }

    int getAttitudeFromI() {
        return attitudeFromI;
    }

    int getAttitudeFromJ() {
        return attitudeFromJ;
    }

    int getAttitudeToI() {
        return attitudeToI;
    }

    int getAttitudeToJ() {
        return attitudeToJ;
    }

    public ChessBoard() {
        String[] letters = {"a", "b", "c", "d", "e", "f", "g", "h"};
        String[] numbers = {"1", "2", "3", "4", "5", "6", "7", "8"};
        thecells = new String[8][8];
        for (int i = 7, k = 0; i > -1; i--, k++) {
            for (int j = 0; j < thecells.length; j++) {
                thecells[k][j] = letters[j] + numbers[i];
            }
        }
    }

    void PrintBoard() {
        for (String[] thecell : thecells) {
            for (int j = 0; j < thecells.length; j++) {
                System.out.print(thecell[j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public void Coordinate(String from, String to) {
        for (int i = 0; i < thecells.length; i++) {
            for (int j = 0; j < thecells.length; j++) {
                if (thecells[i][j].equals(from)) {
                    attitudeFromI = i;
                    attitudeFromJ = j;
                }
                if (thecells[i][j].equals(to)) {
                    attitudeToI = i;
                    attitudeToJ = j;
                }
            }
        }
    }

    boolean checkCount(int chessmanNumber) {
        return chessmanNumber < 0 || chessmanNumber > 7;
    }

    void errorCoordinate(String coordinate) throws MyChessException {
        for (String[] thecell : thecells) {
            for (int j = 0; j < thecells.length; j++) {
                if (thecell[j].equals(coordinate)) {
                    System.out.println("совпадение есть");
                    return;
                }
            }
        }
        throw new MyChessException();
    }
}
