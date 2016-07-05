package ru.geekbrains.java2.dz.dz2.СтаниславОвчинников;

/**
 * Created by Stars on 08.06.2016.
 */
public class Knight extends ChessBoard implements Chessman {
    @Override
    public boolean isRightMove(String from, String to) {
        Coordinate(from, to);
        return ((getAttitudeFromI() == getAttitudeToI() + 1 || getAttitudeFromI() == getAttitudeToI() - 1) &
                (getAttitudeToJ() == getAttitudeFromJ() - 2 || getAttitudeToJ() == getAttitudeFromJ() + 2) ||
                (getAttitudeFromJ() == getAttitudeToJ() + 1 || getAttitudeFromJ() == getAttitudeToJ() - 1) &
                        (getAttitudeToI() == getAttitudeFromI() - 2 || getAttitudeToI() == getAttitudeFromI() + 2));
    }

}





















































































































