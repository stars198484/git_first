package ru.geekbrains.java2.dz.dz2.ГерманВавилин;

/**
 * Created by gta5 on 08.06.2016.
 */
//Ферзь

public class Queen extends AbstractFigure {
    public Queen(boolean isWhite) {
        super(isWhite);
        this.name += "ый Ферзь";
    }
    Rook testRook = new Rook(true);
    Bishop testBishop = new Bishop(true);

    @Override
    public boolean isRightMove(ChessCoordinate from, ChessCoordinate to) {
        //ChessCoordinate deltaCoordinate = getCoordinateDelta(from, to);
        //if(((Math.abs(deltaCoordinate.x) - Math.abs(deltaCoordinate.y)) == 0) || (deltaCoordinate.x == 0) | (deltaCoordinate.y) == 0) return true;
        if(testRook.isRightMove(from, to)||testBishop.isRightMove(from, to)) return true;
        else return false;
    }
}
