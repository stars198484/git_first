package ru.geekbrains.java2.dz.dz1.АндрейИванов;

/**
 * Created by a.ivanov on 07.06.2016.
 */
public class Pawn implements Chessmen {

    @Override
    public boolean isRightMove(int[] from, int[] to) {

        if(from[0] == to[0] && ((to[1] - from[1]) == 1))
        return true;

        return false;
    }
}
