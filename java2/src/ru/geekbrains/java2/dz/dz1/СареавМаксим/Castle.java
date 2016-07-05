package ru.geekbrains.java2.dz.dz1.СареавМаксим;

/**
 * Created by Terminator on 09.06.2016.
 */
public class Castle implements Chessman {

    public Castle() {
    }

    public boolean isRightMove(Coordinate sC, Coordinate eC) {



        int startX = sC.getX();
        int startY = sC.getY();
        int endX = eC.getX();
        int endY = eC.getY();

        // проверяем ход по горизонтали
        if (startY == endY) {
            return true;
        }

        // проверяем ход по вертикали
        if (startX == endX) {
            return true;
        }

        return false;

    }
}
