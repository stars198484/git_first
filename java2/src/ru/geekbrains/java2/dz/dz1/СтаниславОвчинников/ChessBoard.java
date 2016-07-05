package ru.geekbrains.java2.dz.dz1.СтаниславОвчинников;

/**
 * Created by Stars on 08.06.2016.
 */
public class ChessBoard {
    public String[][] thecells;
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

    public void PrintBoard() {
        for (int i = 0; i < thecells.length; i++) {
            for (int j = 0; j < thecells.length; j++) {
                System.out.print(thecells[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

}
