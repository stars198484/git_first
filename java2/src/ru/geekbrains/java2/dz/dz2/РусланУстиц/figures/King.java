package ru.geekbrains.java2.dz.dz2.РусланУстиц.figures;

import ru.geekbrains.java2.dz.dz2.РусланУстиц.exceptions.InvalidCoordinateException;
import ru.geekbrains.java2.dz.dz2.РусланУстиц.helpers.CoordinatesParser;

/**
 * Created by darky_000 on 07.06.2016.
 */
public class King extends Figure {
    private static final int MAX_KINGS = 1;
    private static final int STEP = 1;
    private static int kingsCount = 0;

    public King() {
        super();
        createFigure("King", kingsCount, MAX_KINGS);
        kingsCount++;
    }

    @Override
    public boolean isRightMove(final String from, final String to) throws InvalidCoordinateException {
        int fromX = CoordinatesParser.convertXtoInt(from);
        int fromY = CoordinatesParser.convertYtoInt(from);
        int toX = CoordinatesParser.convertXtoInt(to);
        int toY = CoordinatesParser.convertYtoInt(to);

        if (fromX == toX && Math.abs(fromY - toY) == STEP) // движение по вертикали
            return true;

        if (fromY == toY && Math.abs(fromX - toX) == STEP) // движение по горизонтали
            return true;

        if (Math.abs(fromX - toX) == STEP && Math.abs(fromY - toY) == STEP) // движение по диагоналям
            return true;

        return false;
    }

    @Override
    public String toString() {
        return "King{}";
    }
}
