package ru.geekbrains.java2.dz.dz1.МамаевИгорь;

/**
 * Created by Игорь on 07.06.2016.
 */
public class King extends Figure {
    @Override
    boolean isRightMove(Position from, Position to) {
        if (from.equals(to)) return false;
        if (Math.abs(to.column - from.column) <= 1 && Math.abs(to.row - from.row) <= 1) return true;
        return false;
    }
}
