package ru.geekbrains.java2.dz.dz2.ПавелСуходоев;

import ru.geekbrains.java2.dz.dz2.ПавелСуходоев.Exceptions.WrongMoveException;

/**
 * Created by xcyxoux on 09.06.16.
 */
public interface Figure {
    boolean isRightMove(Turn turn) throws WrongMoveException;
    String getName();
}
