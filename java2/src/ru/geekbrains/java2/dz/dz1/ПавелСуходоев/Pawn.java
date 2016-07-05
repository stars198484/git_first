package ru.geekbrains.java2.dz.dz1.ПавелСуходоев;

/**
 * Created by xcyxoux on 09.06.16.
 */
public class Pawn extends Figure {

    Pawn() {
        name = "Пешка";
    }

    @Override
    public boolean isRightMove(Turn turn) {
        if (turn.from.x == turn.to.x & turn.from.y == 2 & (turn.to.y - turn.from.y) == 2) return true;
        if (turn.from.x == turn.to.x & turn.from.y == 7 & (turn.from.y - turn.to.y) == 2) return true;
        if (turn.from.x == turn.to.x & Math.abs(turn.from.y - turn.to.y) == 1) return true;
        return false;
    }
}
