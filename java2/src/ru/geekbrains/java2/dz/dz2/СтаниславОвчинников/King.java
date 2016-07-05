package ru.geekbrains.java2.dz.dz2.СтаниславОвчинников;

/**
 * Created by Stars on 08.06.2016.
 */
public class King extends ChessBoard implements Chessman {
    @Override
    public boolean isRightMove(String from, String to) {
        Coordinate(from, to);

        for (int i = getAttitudeFromI() - 1; i <= getAttitudeFromI() + 1; i++) {
            for (int j = getAttitudeFromJ() - 1; j <= getAttitudeFromJ() + 1; j++) {
                if (i > -1 && j > -1 && i < 10 && j < 10)
                    if (getThecells()[i][j].equals(to)) return true;
            }
        }
        return false;
    }
}
