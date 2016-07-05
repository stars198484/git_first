package ru.geekbrains.java2.dz.dz1.МамаевИгорь;

/**
 * Created by Игорь on 07.06.2016.
 */
public class Queen extends Figure {
    @Override
    boolean isRightMove(Position from, Position to) {
        return !from.equals(to);
    }
}
