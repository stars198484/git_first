package ru.geekbrains.java2.dz.dz2.РусланУстиц.figures;

import ru.geekbrains.java2.dz.dz2.РусланУстиц.ChessField;
import ru.geekbrains.java2.dz.dz2.РусланУстиц.exceptions.InvalidCoordinateException;
import ru.geekbrains.java2.dz.dz2.РусланУстиц.helpers.CoordinatesParser;

/**
 * Created by darky_000 on 07.06.2016.
 */
public class Pawn extends Figure {
    private static final int MAX_PAWNS = 8;
    private static final int START_Y = 1;
    private static final int STEP = 1;
    private static int pawnsCount = 0;

    public Pawn() {
        super();
        createFigure("Pawn", pawnsCount, MAX_PAWNS);
    }

    @Override
    public void createFigure(String name, int figureCount, int maxFigures) {
        this.name = name + (pawnsCount + 1);
        if (pawnsCount < MAX_PAWNS) {
            setX(pawnsCount);
            setY(ChessField.getFieldSize() - START_Y - 1);
            pawnsCount++;
        } else {
            System.out.println("Warning: No more Pawns can be added");
            getFigures().remove(this);
        }
    }

    @Override
    public boolean isRightMove(final String from, final String to) throws InvalidCoordinateException {
        int fromX = CoordinatesParser.convertXtoInt(from);
        int fromY = CoordinatesParser.convertYtoInt(from);
        int toX = CoordinatesParser.convertXtoInt(to);
        int toY = CoordinatesParser.convertYtoInt(to);

        if (fromX == toX) {
            if (fromY == START_Y && toY == START_Y + STEP * 2 && !ChessField.isOccupied(fromX, START_Y + STEP * 2)) { // проверка двойного хода со стартовой позиции
                if (!ChessField.isOccupied(fromX, START_Y + STEP)) // проверяем есть ли на пути фигуры другие фигуры
                    return true;
                System.out.println("Warning: There is a figure on the way");
            }
            if (Math.abs(fromY - toY) == STEP && !ChessField.isOccupied(toX, toY)) // проверка обычного хода
                return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Pawn{}";
    }
}
