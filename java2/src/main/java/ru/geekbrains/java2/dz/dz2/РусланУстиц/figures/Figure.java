package ru.geekbrains.java2.dz.dz2.РусланУстиц.figures;

import ru.geekbrains.java2.dz.dz2.РусланУстиц.ChessField;
import ru.geekbrains.java2.dz.dz2.РусланУстиц.exceptions.InvalidCoordinateException;
import ru.geekbrains.java2.dz.dz2.РусланУстиц.exceptions.InvalidFigureException;
import ru.geekbrains.java2.dz.dz2.РусланУстиц.helpers.CoordinatesParser;

import java.util.ArrayList;

/**
 * Created by darky_000 on 07.06.2016.
 */
public abstract class Figure implements Movable {
    private int x;
    private int y;
    protected String name;

    public String getName() {
        return name;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    private static ArrayList<Figure> figures = new ArrayList<>();

    public static ArrayList<Figure> getFigures() {
        return figures;
    }

    public Figure() {
        figures.add(this);
    }

    public void createFigure(final String name, int figureCount, final int maxFigures) {
        this.name = name + (figureCount + 1);
        if (figureCount < maxFigures) {
            setY(ChessField.getFieldSize() - 1);
            if (figureCount == 0) {
                if (this.getClass() == Rook.class) setX(0);
                if (this.getClass() == Knight.class) setX(1);
                if (this.getClass() == Bishop.class) setX(2);
                if (this.getClass() == Queen.class) setX(3);
                if (this.getClass() == King.class) setX(ChessField.getFieldSize() - 4);
            } else {
                if (this.getClass() == Rook.class) setX(ChessField.getFieldSize() - 1);
                if (this.getClass() == Knight.class) setX(ChessField.getFieldSize() - 2);
                if (this.getClass() == Bishop.class) setX(ChessField.getFieldSize() - 3);
            }
        } else {
            System.out.printf("Warning: No more %s can be added\n", name);
            getFigures().remove(this);
        }
    }

    public static Figure getFigure(final String line) throws InvalidCoordinateException, InvalidFigureException {
        final int x = CoordinatesParser.convertXtoInt(line);
        final int y = CoordinatesParser.convertYtoInt(line);

        return getFigure(x, y);
    }

    @Override
    public abstract boolean isRightMove(final String from, final String to) throws InvalidCoordinateException;

    private static Figure getFigure(final int x, final int y) throws InvalidFigureException {
        Figure figure = null;
        for (Figure obj : figures) {
            if (obj.getX() == x && obj.getY() == y) {
                figure = obj;
                break;
            }
        }
        if (figure == null)
            throw new InvalidFigureException();
        return figure;
    }
}
