package ru.geekbrains.java2.dz.dz2.РусланУстиц.figures;

import ru.geekbrains.java2.dz.dz2.РусланУстиц.ChessField;
import ru.geekbrains.java2.dz.dz2.РусланУстиц.exceptions.InvalidCoordinateException;
import ru.geekbrains.java2.dz.dz2.РусланУстиц.helpers.CoordinatesParser;

/**
 * Created by darky_000 on 07.06.2016.
 */
public class Rook extends Figure {
    private static final int MAX_ROOKS = 2;
    private static int rooksCount = 0;

    public Rook() {
        super();
        createFigure("Rook", rooksCount, MAX_ROOKS);
        rooksCount++;
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
        if (fromX == toX) {
            int nextY;
            if (Math.abs(fromY - toY) > 1) {
                for (int i = 1; i < Math.abs(fromY - toY); i++) { // не проверяем первую и последнюю клетки
                    if (fromY > toY)
                        nextY = fromY - i;
                    else nextY = fromY + i;
                    if (ChessField.isOccupied(toX, nextY)) {
                        System.out.println("Warning: There is a figure on the way");
                        return false;
                    }
                }
                return true;
            }
            return true; // если сдвинулся на одну клетку - нет смысла проверять
        }
        if (fromY == toY) {
            int nextX;
            if (Math.abs(fromX - toX) > 1) {
                for (int i = 1; i < Math.abs(fromX - toX); i++) { // не проверяем первую и последнюю клетки
                    if (fromX > toX)
                        nextX = fromX - i;
                    else nextX = fromX + i;
                    if (ChessField.isOccupied(nextX, toY)) {
                        System.out.println("Warning: There is a figure on the way");
                        return false;
                    }
                }
                return true;
            }
            return true; // если сдвинулся на одну клетку - нет смысла проверять
        }
        return false;
    }

    @Override
    public String toString() {
        return "Rook{}";
    }
}
