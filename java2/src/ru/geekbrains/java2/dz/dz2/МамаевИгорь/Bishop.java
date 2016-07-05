package ru.geekbrains.java2.dz.dz2.МамаевИгорь;

/**
 * Created by Игорь on 07.06.2016.
 */
public class Bishop extends Figure {
    @Override
    boolean isRightMove(Position from, Position to) {
        if (from.equals(to)) return false;
        if (Math.abs(to.row - from.row) == Math.abs(to.column - from.column)) return true;
        return false;
    }
}
