package ru.geekbrains.java2.dz.dz2.АндрейИванов;

/**
 * Created by a.ivanov on 07.06.2016.
 */
public class Officer extends Queen {

    @Override
    public boolean isRightMove(int[] from, int[] to) {

        return isGoDiagonal(from, to);
    }
}
