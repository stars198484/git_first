package ru.geekbrains.java2.dz.dz1.ГерманВавилин;

/**
 * Created by gta5 on 08.06.2016.
 */

//Пешка
public class Pawn extends AbstractFigure {

    public Pawn(boolean isWhite) {
        super(isWhite);
        this.name += "ая Пешка";
    }

    @Override
    public boolean isRightMove(ChessCoordinate from, ChessCoordinate to) {
        ChessCoordinate deltaCoordinate = getCoordinateDelta(from, to);
        if (isWhite) {
            if((deltaCoordinate.y == 1) & (Math.abs(deltaCoordinate.x) < 2)) return true;
        }
        else if((deltaCoordinate.y == -1) & (Math.abs(deltaCoordinate.x) < 2)) return true;
        return false;
    }
}
