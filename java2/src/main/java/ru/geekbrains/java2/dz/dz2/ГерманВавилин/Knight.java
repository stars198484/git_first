package ru.geekbrains.java2.dz.dz2.ГерманВавилин;

/**
 * Created by gta5 on 08.06.2016.
 */
//Конь
public class Knight extends AbstractFigure {
    public Knight(boolean isWhite) {
        super(isWhite);
        this.name += "ый Конь";
    }

    @Override
    public boolean isRightMove(ChessCoordinate from, ChessCoordinate to) {
        ChessCoordinate deltaCoordinate = getCoordinateDelta(from, to);
        if(((Math.abs(deltaCoordinate.x) == 1)&(Math.abs(deltaCoordinate.y) == 2))||((Math.abs(deltaCoordinate.x) == 2)&(Math.abs(deltaCoordinate.y) == 1))) return true;
        else return false;
    }
}
