package ru.geekbrains.java2.dz.dz2.МамаевИгорь;

/**
 * Created by Игорь on 07.06.2016.
 */
public class Rook extends Figure {
    @Override
    boolean isRightMove(Position from, Position to) {
        if (from.equals(to)) return false;
        if ((from.column==to.column)||(from.row==to.row)) return true;
        return false;
    }
}
