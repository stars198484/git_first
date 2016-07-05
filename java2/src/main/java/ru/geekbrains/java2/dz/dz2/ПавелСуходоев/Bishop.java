package ru.geekbrains.java2.dz.dz2.ПавелСуходоев;

/**
 * Created by xcyxoux on 09.06.16.
 */
public class Bishop implements Figure {

    String name;

    Bishop() {
        name = "Слон";
    }

    @Override
    public boolean isRightMove(Turn turn) {
        return Math.abs(turn.from.getX() - turn.to.getX()) == Math.abs(turn.from.getY() - turn.to.getY());
    }

    @Override
    public String getName() {
        return name;
    }
}
