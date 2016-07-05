package ru.geekbrains.java2.dz.dz2.ГерманВавилин;

/**
 * Created by gta5 on 08.06.2016.
 */
//Ладья

public class Rook extends AbstractFigure {
    public Rook(boolean isWhite) {
        super(isWhite);
        this.name += "ая Ладья";
    }

    @Override
    public boolean isRightMove(ChessCoordinate from, ChessCoordinate to) {
        ChessCoordinate deltaCoordinate = getCoordinateDelta(from, to);
        if((deltaCoordinate.x == 0) | (deltaCoordinate.y) == 0) return true;
        else return false;
    }
}
