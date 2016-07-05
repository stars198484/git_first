package ru.geekbrains.java2.dz.dz1.ПавелСуходоев;

/**
 * Created by xcyxoux on 09.06.16.
 */
public class Bishop extends Figure {

    Bishop() {
        name = "Слон";
    }

    @Override
    public boolean isRightMove(Turn turn) {
        return Math.abs(turn.from.x - turn.to.x) == Math.abs(turn.from.y - turn.to.y);
    }
}
