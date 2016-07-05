package ru.geekbrains.java2.dz.dz1.ГерманВавилин;

/**
 * Created by gta5 on 08.06.2016.
 */
//Король
public class King extends AbstractFigure {
    public King(boolean isWhite) {
        super(isWhite);
        this.name += "ый Король";
    }

    @Override
    public boolean isRightMove(ChessCoordinate from, ChessCoordinate to) {
        ChessCoordinate deltaCoordinate = getCoordinateDelta(from, to);
        if((Math.abs(deltaCoordinate.x) > 1)||(Math.abs(deltaCoordinate.y) > 1)) return false;
        else return true;
    }
}
