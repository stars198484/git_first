package ru.geekbrains.java2.dz.dz1.ЮрийНиконоров;

import java.util.Arrays;

/**
 * Created by YurokVRS on 07.06.2016.
 */
public class Chessboard {
    static int maxSizeBoard = 8;
    private CellChessboard[][] chessboard = new CellChessboard[maxSizeBoard][maxSizeBoard];
    private Pawn[] pawns = new Pawn[maxSizeBoard*2];
    private Rook[] rooks = new Rook[4];
    private Queen[] queens = new Queen[2];
    private King[] kings = new King[2];
    private Bishop[] bishops = new Bishop[4];
    private Knight[] knights = new Knight[4];


    public Chessboard() {
        // Определяем клетки на чёрные и белые, n - это счётчик для чередования чёрных и белых клеток
        int n = 0;
        for (int y = 0; y < maxSizeBoard; y++, n++) {
            for (int x = 0; x < maxSizeBoard; x++, n++) {
                chessboard[y][x] = new CellChessboard(x , y, n % 2 == 0);
            }
        }

        // Создаём и раставляем фигуры
        // Пешки черные и белые
        for (int i = 0; i < maxSizeBoard; i++) {
            pawns[i] = new Pawn(i,1,true);
            chessboard[1][i].setFigureInCell(pawns[i]);

            pawns[i+maxSizeBoard] = new Pawn(i,maxSizeBoard-2,false);
            chessboard[maxSizeBoard-2][i].setFigureInCell(pawns[i+maxSizeBoard]);
        }

        //Ставим ладью
        rooks[0] = new Rook(0,0,true);  chessboard[0][0].setFigureInCell(rooks[0]);
        rooks[1] = new Rook(7,0,true);  chessboard[0][7].setFigureInCell(rooks[1]);
        rooks[2] = new Rook(0,7,false); chessboard[7][0].setFigureInCell(rooks[2]);
        rooks[3] = new Rook(7,7,false); chessboard[7][7].setFigureInCell(rooks[3]);

        //Ставим Ферзей
        queens[0] = new Queen(3,0,true);  chessboard[0][3].setFigureInCell(queens[0]);
        queens[1] = new Queen(4,7,false); chessboard[7][4].setFigureInCell(queens[1]);

        //Ставим Королей
        kings[0] = new King(4,0,true);  chessboard[0][4].setFigureInCell(kings[0]);
        kings[1] = new King(3,7,false); chessboard[7][3].setFigureInCell(kings[1]);

        //Ставим Слонов
        bishops[0] = new Bishop(2,0,true);  chessboard[0][2].setFigureInCell(bishops[0]);
        bishops[1] = new Bishop(5,0,true);  chessboard[0][5].setFigureInCell(bishops[1]);
        bishops[2] = new Bishop(2,7,false); chessboard[7][2].setFigureInCell(bishops[2]);
        bishops[3] = new Bishop(5,7,false); chessboard[7][5].setFigureInCell(bishops[3]);

        //Ставим Коней
        knights[0] = new Knight(1,0,true);  chessboard[0][1].setFigureInCell(knights[0]);
        knights[1] = new Knight(6,0,true);  chessboard[0][6].setFigureInCell(knights[1]);
        knights[2] = new Knight(1,7,false); chessboard[7][1].setFigureInCell(knights[2]);
        knights[3] = new Knight(6,7,false); chessboard[7][6].setFigureInCell(knights[3]);

    }

    public String getNameFigure(int x, int y){
    return chessboard[y][x].getFigureInCell().getName();
    }

    public void printToScreen() {
        char ch;
        for (int y = maxSizeBoard-1; y > -1; y--) {
            System.out.printf("%2d ", y + 1);
            for (int x = 0; x < maxSizeBoard; x++) {
                if(chessboard[y][x].getFigureInCell()!=null)
                    ch = chessboard[y][x].getFigureInCell().getImage();
                else
                    if(chessboard[y][x].isWhiteCell()) ch = '□';
                    else ch = '■';
                System.out.printf("%2c ", ch);
            }
            System.out.print('\n');
        }
        System.out.printf("%2c ", ' ');
        for (int i = 'a'; i < 'i'; i++) {
            System.out.printf("%2c ", i);
        }
        System.out.println();

    }

    public Figure getFigure(int x, int y) {
        return chessboard[y][x].getFigureInCell();
    }
}
