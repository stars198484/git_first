package ru.geekbrains.java2.dz.dz2.ГерманВавилин;

/**
 * Created by gta5 on 08.06.2016.
 */
//Слон

public class Bishop extends AbstractFigure {
    public Bishop(boolean isWhite) {
        super(isWhite);
        this.name += "ый Слон";
    }

    @Override
    public boolean isRightMove(ChessCoordinate from, ChessCoordinate to) {
        ChessCoordinate deltaCoordinate = getCoordinateDelta(from, to);
        if ((Math.abs(deltaCoordinate.x) - Math.abs(deltaCoordinate.y)) == 0) return  true;
        else return false;
    }
}
