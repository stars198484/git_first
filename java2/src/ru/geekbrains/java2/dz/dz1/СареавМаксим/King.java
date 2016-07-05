package ru.geekbrains.java2.dz.dz1.СареавМаксим;

/**
 * Created by Terminator on 09.06.2016.
 */
public class King implements Chessman {

    public King() {
    }

    public boolean isRightMove(Coordinate sC, Coordinate eC) {



        int startX = sC.getX();
        int startY = sC.getY();
        int endX = eC.getX();
        int endY = eC.getY();

        // проверяем ход по горизонтали
        if (startY == endY && Coordinate.minusToPlus(startX - endX) == 1) {
            return true;
        }

        // проверяем ход по вертикали
        if (startX == endX && Coordinate.minusToPlus(startY - endY) == 1) {
            return true;
        }
        // проверяем ход по диагонали
        if (Coordinate.minusToPlus(startX - startY) == 1 && Coordinate.minusToPlus(startY - endY) == 1) {
                return true;
        }
        return false;
    }
}
