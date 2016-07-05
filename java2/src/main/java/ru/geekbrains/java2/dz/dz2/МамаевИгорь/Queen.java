package ru.geekbrains.java2.dz.dz2.МамаевИгорь;

/**
 * Created by Игорь on 07.06.2016.
 */
public class Queen extends Figure {
    @Override
    boolean isRightMove(Position from, Position to) {
        if (new Bishop().isRightMove(from,to)) return true;
        else if (new Rook().isRightMove(from,to)) return true;
        return false;
    }
}
