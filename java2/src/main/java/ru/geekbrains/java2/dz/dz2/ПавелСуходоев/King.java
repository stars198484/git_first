package ru.geekbrains.java2.dz.dz2.ПавелСуходоев;

/**
 * Created by xcyxoux on 09.06.16.
 */
public class King implements Figure {

    String name;

    King() {
        name = "Король";
    }

    @Override
    public boolean isRightMove(Turn turn) {
        return (Math.abs(turn.from.getX() - turn.to.getX()) <= 1 & Math.abs(turn.from.getY() - turn.to.getY()) <= 1);
    }

    @Override
    public String getName() {
        return name;
    }
}
