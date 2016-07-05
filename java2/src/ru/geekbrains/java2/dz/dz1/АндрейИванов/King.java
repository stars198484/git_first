package ru.geekbrains.java2.dz.dz1.АндрейИванов;

/**
 * Created by a.ivanov on 08.06.2016.
 */
public class King implements Chessmen {

    @Override
    public boolean isRightMove(int[] from, int[] to) {

        if(from[0] == to[0]) {
            return Math.abs(from[1] - to[1]) == 1;
        }
        if(from[1] == to[1])
        {
            return Math.abs(from[0] - to[0]) == 1;
        }

        return (Math.abs(from[0] - to[0]) == 1 && Math.abs(from[1] - to[1]) == 1);
    }
}
