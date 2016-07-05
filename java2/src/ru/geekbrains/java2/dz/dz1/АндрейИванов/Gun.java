package ru.geekbrains.java2.dz.dz1.АндрейИванов;

/**
 * Created by a.ivanov on 07.06.2016.
 */
public class Gun implements Chessmen {

    @Override
    public boolean isRightMove(int[] from, int[] to) {

        if(Math.abs(from[0] - to[0]) == 0)
            return (Math.abs(from[1] - to[1]) < 8);
        else if(Math.abs(from[1] - to[1]) == 0)
            return (Math.abs(from[0] - to[0]) < 8);

        return false;
    }
}
