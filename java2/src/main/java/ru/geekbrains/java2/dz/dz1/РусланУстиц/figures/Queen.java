package ru.geekbrains.java2.dz.dz1.РусланУстиц.figures;

import ru.geekbrains.java2.dz.dz1.РусланУстиц.ChessField;
import ru.geekbrains.java2.dz.dz1.РусланУстиц.helpers.CoordinatesConverter;

/**
 * Created by darky_000 on 07.06.2016.
 */
public class Queen extends Figure {
    private static final int MAX_QUEENS = 1;
    private static int queensCount = 0;

    public Queen() {
        super();
        createFigure("Queen", queensCount, MAX_QUEENS);
        queensCount++;
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

        if (Math.abs(fromX - toX) == Math.abs(fromY - toY)) { // движение по диагоналям
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

                if (ChessField.isOccupied(nextX, nextY))
                    return false;
                return true;
            }
        }

        return false;
    }
}
