package ru.geekbrains.java2.dz.dz1.YuryLukas;

import ru.geekbrains.java2.dz.dz1.YuryLukas.interfaces.Field;
import ru.geekbrains.java2.dz.dz1.YuryLukas.interfaces.Figure;

/**
 * Created by yurok on 9.06.16.
 */
public class ChessBoard {
    private ChessField[][] board;
    private final String horizontal = "abcdefgh";
    public final int MAX_LENGTH = 8;


    public ChessBoard() {
        board = new ChessField[8][8];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (i % 2 > 0) {
                    if (j % 2 == 0) {
                        board[i][j] = new ChessField(Field.BLACK);
                        board[i][j].setVerticalCoord(i);
                        board[i][j].setHorizontalCoord(this.horizontal.charAt(j));
                    } else {
                        board[i][j] = new ChessField(Field.WHITE);
                        board[i][j].setVerticalCoord(i);
                        board[i][j].setHorizontalCoord(this.horizontal.charAt(j));
                    }
                } else {
                    if (j % 2 == 0) {
                        board[i][j] = new ChessField(Field.WHITE);
                        board[i][j].setVerticalCoord(i);
                        board[i][j].setHorizontalCoord(this.horizontal.charAt(j));
                    } else {
                        board[i][j] = new ChessField(Field.BLACK);
                        board[i][j].setVerticalCoord(i);
                        board[i][j].setHorizontalCoord(this.horizontal.charAt(j));
                    }
                }
            }
        }
    }

    public boolean setFigure(Figure figure, String address) {

        return false;
    }

    private int getHorisontal(String name) {
        return this.horizontal.indexOf(name.charAt(0));
    }

    private int getVertical(String name) {
        return Integer.parseInt(String.valueOf(name.charAt(1)));
    }

    public void print() {
        System.out.print("   ");
        for (int z = 0; z < MAX_LENGTH; z++) {
            System.out.print(horizontal.charAt(z) + " ");
        }

        System.out.println();

        for (int i = 7; i >= 0; i--) {
            System.out.print((i + 1) + "| ");
            for (int j = 0; j < MAX_LENGTH; j++) {
                System.out.print(board[7 - i][j].getColor() + " ");
            }
            System.out.println();
        }
    }

    public boolean isOut(int x, int y) {
        try{
            ChessField field = board[y][x];
            return false;
        } catch (Exception e){
            return true;
        }
    }

    private ChessField getField(String coord){
        if(isOut(getHorisontal(coord),getVertical(coord))){
            return null;
        }
        return board[getVertical(coord)][getHorisontal(coord)];
    }

}
