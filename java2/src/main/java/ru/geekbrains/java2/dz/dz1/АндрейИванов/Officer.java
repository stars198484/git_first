package ru.geekbrains.java2.dz.dz1.АндрейИванов;

/**
 * Created by a.ivanov on 07.06.2016.
 */
public class Officer implements Chessmen {

    @Override
    public boolean isRightMove(int[] from, int[] to) {

        return (Math.abs(from[0] - to[0]) == Math.abs(from[1] - to[1]));
    }
}
