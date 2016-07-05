package ru.geekbrains.java2.dz.dz1.ПавелСуходоев;

/**
 * Created by xcyxoux on 08.06.16.
 */
public class Field {
    private static final int SIZE = 8;

    public boolean checkInBounds(Coordinate position) {
        if (position.x >= 1 & position.x <= SIZE & position.y >= 1 & position.y <= SIZE) {
            return true;
        } else {
            return false;
        }
    }

}
