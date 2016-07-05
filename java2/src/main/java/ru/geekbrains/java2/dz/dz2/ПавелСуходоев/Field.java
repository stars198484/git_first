package ru.geekbrains.java2.dz.dz2.ПавелСуходоев;

/**
 * Created by xcyxoux on 08.06.16.
 */
public class Field {
    private static final int SIZE = 8;

    public boolean checkInBounds(Coordinate position) {
        if (position.getX() >= 1 & position.getX() <= SIZE & position.getY() >= 1 & position.getY() <= SIZE) {
            return true;
        } else {
            return false;
        }
    }

}
