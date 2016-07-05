package ru.geekbrains.java2.dz.dz2.СтаниславОвчинников;

/**
 * Created by Stars on 08.06.2016.
 */
public class Bishop extends ChessBoard implements Chessman {
     @Override
    public boolean isRightMove(String from, String to) {
        Coordinate(from, to);
        for (int i = getAttitudeFromI(), j = getAttitudeFromJ(); i < getThecells().length; i++, j++) {
            if (!(j < getThecells().length)) break;
            if (getThecells()[i][j].equals(to)) {
                return true;
            }
        }
        for (int i = getAttitudeFromI(), j = getAttitudeFromJ(); i > -1; i--, j--) {
            if (!(j > -1)) break;
            if (getThecells()[i][j].equals(to)) {
                return true;
            }
        }
        for (int i = getAttitudeFromI(), j = getAttitudeFromJ(); i < getThecells().length; i++, j--) {
            if (!(j > -1)) break;
            if (getThecells()[i][j].equals(to)) {
                return true;
            }
        }
        for (int i = getAttitudeFromI(), j = getAttitudeFromJ(); i > -1; i--, j++) {
            if (!(j <getThecells().length)) break;
            if (getThecells()[i][j].equals(to)) {
                return true;
            }
        }
        return false;
    }
}
