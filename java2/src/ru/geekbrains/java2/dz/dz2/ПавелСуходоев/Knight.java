package ru.geekbrains.java2.dz.dz2.ПавелСуходоев;

/**
 * Created by xcyxoux on 09.06.16.
 */
public class Knight implements Figure {

    String name;

    Knight() {
        name = "Конь";
    }

    @Override
    public boolean isRightMove(Turn turn) {
        if (Math.abs(turn.from.getX() - turn.to.getX()) == 1 & Math.abs(turn.from.getY() - turn.to.getY()) == 2) return true;
        if (Math.abs(turn.from.getX() - turn.to.getX()) == 2 & Math.abs(turn.from.getY() - turn.to.getY()) == 1) return true;
        return false;
    }

    @Override
    public String getName() {
        return name;
    }
}
