package ru.geekbrains.java2.dz.dz1.МамаевИгорь;

/**
 * Created by Игорь on 07.06.2016.
 */
public class Pawn extends Figure {
    @Override
    boolean isRightMove(Position from, Position to) {
        if (from.equals(to)) return false;
        if (from.row == 2 && to.column == from.column && to.row - from.row <= 2) return true;
        else if (to.column == from.column && to.row - from.row == 1) return true;
        return false;
    }
}
