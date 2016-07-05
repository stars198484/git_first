package ru.geekbrains.java2.level2homework1;

/**
 * Created by Olya on 08.06.2016.
 */
public class Rook implements Figure {


    @Override
    public void Figure() {

    }

    @Override
    public String toString() {
        return "Rook";
    }

    @Override
    public boolean isRightMove(int x1, int y1, int x2, int y2) {
        if ((x1 == x2 && y1 != y2) || (x1 != x2 && y1 == y2))
            return true;
        else
        return false;
    }

}
