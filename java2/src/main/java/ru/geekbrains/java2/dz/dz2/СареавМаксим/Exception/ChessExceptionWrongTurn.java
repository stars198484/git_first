package ru.geekbrains.java2.dz.dz2.СареавМаксим.Exception;

/**
 * Created by desarz on 14.06.2016.
 */
public class ChessExceptionWrongTurn extends ChessException {
    public ChessExceptionWrongTurn() {
        super("Выбранная фигура, не может походить по заданным координатам");
    }
}
