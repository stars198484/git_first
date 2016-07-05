package ru.geekbrains.java2.dz.dz2.ПавелСуходоев;

/**
 * Created by xcyxoux on 09.06.16.
 */
public class Pawn implements Figure {

    String name;

    Pawn() {
        name = "Пешка";
    }

    @Override
    public boolean isRightMove(Turn turn) {
        if (turn.from.getX() == turn.to.getX() & turn.from.getY() == 2 & (turn.to.getY() - turn.from.getY()) == 2) return true;
        if (turn.from.getX() == turn.to.getX() & turn.from.getY() == 7 & (turn.from.getY() - turn.to.getY()) == 2) return true;
        if (turn.from.getX() == turn.to.getX() & Math.abs(turn.from.getY() - turn.to.getY()) == 1) return true;
        return false;
    }

    @Override
    public String getName() {
        return name;
    }
}
