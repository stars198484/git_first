package ru.geekbrains.java2.dz.dz1.ПавелСуходоев;

/**
 * Created by xcyxoux on 09.06.16.
 */
public class Knight extends Figure {

    Knight() {
        name = "Конь";
    }

    @Override
    public boolean isRightMove(Turn turn) {
        if (Math.abs(turn.from.x - turn.to.x) == 1 & Math.abs(turn.from.y - turn.to.y) == 2) return true;
        if (Math.abs(turn.from.x - turn.to.x) == 2 & Math.abs(turn.from.y - turn.to.y) == 1) return true;
        return false;
    }
}
