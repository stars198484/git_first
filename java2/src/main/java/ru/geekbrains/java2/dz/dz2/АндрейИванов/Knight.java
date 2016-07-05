package ru.geekbrains.java2.dz.dz2.АндрейИванов;

/**
 * Created by a.ivanov on 07.06.2016.
 */
public class Knight implements Chessmen {

    @Override
    public boolean isRightMove(int[] from, int[] to) {

        if(Math.abs(from[0] - to[0]) == 1) {
            return Math.abs(from[1] - to[1]) == 2;
        }
        else if(Math.abs(from[0] - to[0]) == 2) {
            return Math.abs(from[1] - to[1]) == 1;
        }
        return false;
    }
}
