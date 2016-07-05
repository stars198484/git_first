package ru.geekbrains.java2.dz.dz2.СареавМаксим.Exception;

import ru.geekbrains.java2.dz.dz2.СареавМаксим.Exception.ChessException;

/**
 * Created by desarz on 14.06.2016.
 */
public class ChessExceptionWrongFigure extends ChessException {
    public ChessExceptionWrongFigure() {
        super("Нет такой фигуры!");
    }
}
