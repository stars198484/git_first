package ru.geekbrains.java2.dz.dz2.СареавМаксим;

/**
 * Created by Terminator on 09.06.2016.
 */
public class Knight implements Chessman {

    public Knight() {
    }

    public boolean isRightMove(Coordinate sC, Coordinate eC) {


        int starX = sC.getX();
        int startY = sC.getY();
        int endX = eC.getX();
        int endY = eC.getY();

        // проверяем ход по вертикали
        if (Coordinate.minusToPlus(starX - endX) == 1 && Coordinate.minusToPlus(startY - endY) == 2) {
            return true;
        }

        // проверяем ход по горизонтали
        if (Coordinate.minusToPlus(starX - endX) == 2 && Coordinate.minusToPlus(startY - endY) == 1) {
            return true;
        }

        return false;
    }
}
