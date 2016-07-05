package ru.geekbrains.java2.level2homework1;

/**
 * Created by Olya on 09.06.2016.
 */
public class Pawn implements Figure {


    @Override
    public void Figure() {

    }

    @Override
    public String toString() {
        return "Pawn";
    }

    @Override
    public boolean isRightMove(int x1, int y1, int x2, int y2) {

        if  ((x1 == x2) && (y2 > y1)) {
            if ((y1 == 1) &&(y2 - y1) == 2) return true;
            else if ((y2 - y1) == 1) return true;
        }

        return false;
    }

}

