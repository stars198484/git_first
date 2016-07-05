package ru.geekbrains.java2.dz.dz1.ЮрийНиконоров;

/**
 * Created by YurokVRS on 07.06.2016.
 */
public class CellChessboard {
    private int X;
    private int Y;
    private boolean isWhiteCell;
    private Figure figureInCell;

    public CellChessboard() {
    }

    public CellChessboard(int x, int y, boolean isWhiteCell) {
        X = x;
        Y = y;
        this.isWhiteCell = isWhiteCell;
    }


    public boolean IsWhiteFigure() {
        return isWhiteCell;
    }

    public int getX() {
        return X;
    }

    public int getY() {
        return Y;
    }

    public boolean isWhiteCell() {
        return isWhiteCell;
    }

    public Figure getFigureInCell() {
        return figureInCell;
    }

    public void setFigureInCell(Figure figureInCell) {
        this.figureInCell = figureInCell;
    }
}
