package ru.geekbrains.java2.dz.dz2.ПавелСуходоев;

/**
 * Created by xcyxoux on 09.06.16.
 */
public class Queen extends Rook {

    String name;

    Queen() {
        name = "Ферзь";
    }

    @Override
    public boolean isRightMove(Turn turn) {
        return super.isRightMove(turn) | new Bishop().isRightMove(turn);
    }

    @Override
    public String getName() {
        return name;
    }
}
