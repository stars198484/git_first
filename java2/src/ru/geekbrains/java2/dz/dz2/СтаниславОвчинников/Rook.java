package ru.geekbrains.java2.dz.dz2.СтаниславОвчинников;

/**
 * Created by Stars on 08.06.2016.
 */
public class Rook extends ChessBoard implements Chessman {
    @Override
    public boolean isRightMove(String from, String to) {
        Coordinate(from, to);
        return (getAttitudeFromI()== getAttitudeToI()||getAttitudeFromJ()==getAttitudeToJ());
    }
}
