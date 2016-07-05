package ru.geekbrains.java2.dz.dz1.ПавелСуходоев;

/**
 * Created by xcyxoux on 09.06.16.
 */
public class Queen extends Figure {

    Queen() {
        name = "Ферзь";
    }

    @Override
    public boolean isRightMove(Turn turn) {
        return turn.from.x == turn.to.x || turn.from.y == turn.to.y || Math.abs(turn.from.x - turn.to.x) == Math.abs(turn.from.y - turn.to.y);
    }
}
