package ru.geekbrains.java2.dz.dz2.ПавелСуходоев;

/**
 * Created by xcyxoux on 09.06.16.
 */
public class Rook implements Figure {

    String name;

    Rook() {
        name = "Ладья";
    }

    @Override
    public boolean isRightMove(Turn turn) {
        return (turn.from.getX() == turn.to.getX() || turn.from.getY() == turn.to.getY());
    }

    @Override
    public String getName() {
        return name;
    }
}
