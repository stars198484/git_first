package ru.geekbrains.java2.dz.dz2.РусланУстиц.figures;

import ru.geekbrains.java2.dz.dz2.РусланУстиц.exceptions.InvalidCoordinateException;

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
    public boolean isRightMove(final String from, final String to) throws InvalidCoordinateException {
        return (Bishop.move(from, to) || Rook.move(from, to));
    }

    @Override
    public String toString() {
        return "Queen{}";
    }
}
