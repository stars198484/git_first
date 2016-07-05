package ru.geekbrains.java2.dz.dz2.РусланУстиц.figures;

import ru.geekbrains.java2.dz.dz2.РусланУстиц.exceptions.InvalidCoordinateException;

/**
 * Created by darky_000 on 07.06.2016.
 */
public interface Movable {
    boolean isRightMove(final String from, final String to) throws InvalidCoordinateException;
}
