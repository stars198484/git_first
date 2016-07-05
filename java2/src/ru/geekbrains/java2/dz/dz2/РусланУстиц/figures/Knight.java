package ru.geekbrains.java2.dz.dz2.РусланУстиц.figures;

import ru.geekbrains.java2.dz.dz2.РусланУстиц.exceptions.InvalidCoordinateException;
import ru.geekbrains.java2.dz.dz2.РусланУстиц.helpers.CoordinatesParser;

/**
 * Created by darky_000 on 07.06.2016.
 */
public class Knight extends Figure {
    private static final int MAX_KNIGHTS = 2;
    private static final int X_STEP = 1;
    private static final int Y_STEP = 2;
    private static int knightsCount = 0;

    public Knight() {
        super();
        createFigure("Knight", knightsCount, MAX_KNIGHTS);
        knightsCount++;
    }

    @Override
    public boolean isRightMove(final String from, final String to) throws InvalidCoordinateException {
        int fromX = CoordinatesParser.convertXtoInt(from);
        int fromY = CoordinatesParser.convertYtoInt(from);
        int toX = CoordinatesParser.convertXtoInt(to);
        int toY = CoordinatesParser.convertYtoInt(to);

        if (toX == fromX + X_STEP || toX == fromX - X_STEP) {
            if (toY == fromY + Y_STEP || toY == fromY - Y_STEP)
                return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Knight{}";
    }
}
