package ru.geekbrains.java2.dz.dz2.АндрейИванов;

/**
 * Created by a.ivanov on 07.06.2016.
 */
public class Pawn extends King {

    @Override
    public boolean isRightMove(int[] from, int[] to) {

        if(isGoYposition(from, to)) {
            return true;
        }
        return false;
    }
}
