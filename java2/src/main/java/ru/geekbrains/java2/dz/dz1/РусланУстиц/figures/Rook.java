package ru.geekbrains.java2.dz.dz1.РусланУстиц.figures;

import ru.geekbrains.java2.dz.dz1.РусланУстиц.ChessField;
import ru.geekbrains.java2.dz.dz1.РусланУстиц.helpers.CoordinatesConverter;

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
    public boolean isRightMove(final String from, final String to) {
        int fromX = CoordinatesConverter.convertXtoInt(from);
        int fromY = CoordinatesConverter.convertYtoInt(from);
        int toX = CoordinatesConverter.convertXtoInt(to);
        int toY = CoordinatesConverter.convertYtoInt(to);

        if (fromX == toX) {
            int nextY;
            if (Math.abs(fromY - toY) > 1) {
                for (int i = 1; i < Math.abs(fromY - toY); i++) { // не проверяем первую и последнюю клетки
                    if (fromY > toY)
                        nextY = fromY - i;
                    else nextY = fromY + i;
                    if (ChessField.isOccupied(toX, nextY))
                        return false;
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
                    if (ChessField.isOccupied(nextX, toY))
                        return false;
                }
                return true;
            }
            return true; // если сдвинулся на одну клетку - нет смысла проверять
        }
        return false;
    }
}
