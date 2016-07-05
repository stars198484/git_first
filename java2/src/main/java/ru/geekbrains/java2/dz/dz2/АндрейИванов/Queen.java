package ru.geekbrains.java2.dz.dz2.АндрейИванов;

/**
 * Created by a.ivanov on 07.06.2016.
 */
public class Queen implements Chessmen {

    @Override
    public boolean isRightMove(int[] from, int[] to) {

        if(isGoXposition(from, to)) {
          return true;
        }
        if(isGoYposition(from, to)) {
            return true;
        }
        if(isGoDiagonal(from , to)) {
            return true;
        }
        return false;
    }

    public boolean isGoYposition(int[] from, int[] to){

        if(from[0] == to[0]) {
            return Math.abs(from[1] - to[1]) < 8;
        }
        return false;
    }

    public boolean isGoXposition(int[] from, int[] to){

        if(from[1] == to[1]) {
            return Math.abs(from[0] - to[0]) < 8;
        }
        return false;
    }

    public boolean isGoDiagonal(int[] from, int[] to){

        return (Math.abs(from[0] - to[0]) == Math.abs(from[1] - to[1]));
    }

}
