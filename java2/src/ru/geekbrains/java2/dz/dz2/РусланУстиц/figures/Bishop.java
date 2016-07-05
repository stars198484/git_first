package ru.geekbrains.java2.dz.dz2.РусланУстиц.figures;

import ru.geekbrains.java2.dz.dz2.РусланУстиц.ChessField;
import ru.geekbrains.java2.dz.dz2.РусланУстиц.exceptions.InvalidCoordinateException;
import ru.geekbrains.java2.dz.dz2.РусланУстиц.helpers.CoordinatesParser;

/**
 * Created by darky_000 on 07.06.2016.
 */
public class Bishop extends Figure {
    private static final int MAX_BISHOPS = 2;
    private static int bishopsCount = 0;

    public Bishop() {
        super();
        createFigure("Bishop", bishopsCount, MAX_BISHOPS);
        bishopsCount++;
    }

    @Override
    public boolean isRightMove(final String from, final String to) throws InvalidCoordinateException {
        return move(from, to);
    }

    protected static boolean move(final String from, final String to) throws InvalidCoordinateException {
        final int fromX = CoordinatesParser.convertXtoInt(from);
        final int fromY = CoordinatesParser.convertYtoInt(from);
        final int toX = CoordinatesParser.convertXtoInt(to);
        final int toY = CoordinatesParser.convertYtoInt(to);

        if (Math.abs(fromX - toX) == Math.abs(fromY - toY)) {
            if (Math.abs(fromX - toX) == 1) return true; // если сдвинулся на одну клетку - нет смысла проверять
            int nextX;
            int nextY;
            for (int i = 1; i < Math.abs(fromX - toX); i++) {
                if (fromX > toX) // пошел налево
                    nextX = fromX - i;
                else // пошел направо
                    nextX = fromX + i;

                if (fromY > toY) // пошел вниз
                    nextY = fromY - i;
                else // пошел наверх
                    nextY = fromY + i;

                if (ChessField.isOccupied(nextX, nextY)) {
                    System.out.println("Warning: There is a figure on the way");
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Bishop{}";
    }
}
