package ru.geekbrains.java2.dz.dz1.ПавелСуходоев;

/**
 * Created by xcyxoux on 09.06.16.
 */
public class King extends Figure {
    King() {
        name = "Король";
    }

    @Override
    public boolean isRightMove(Turn turn) {
        return (Math.abs(turn.from.x - turn.to.x) <= 1 & Math.abs(turn.from.y - turn.to.y) <= 1);
    }
}
