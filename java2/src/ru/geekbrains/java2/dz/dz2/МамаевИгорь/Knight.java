package ru.geekbrains.java2.dz.dz2.МамаевИгорь;

/**
 * Created by Игорь on 07.06.2016.
 */
public class Knight extends Figure {
    @Override
    boolean isRightMove(Position from, Position to) {
        if (from.equals(to)) return false;
        if ((Math.abs(to.column - from.column) == 2 && Math.abs(to.row - from.row) == 1) || (Math.abs(to.column - from.column) == 1 && Math.abs(to.row - from.row) == 2))
            return true;

        return false;
    }
}
