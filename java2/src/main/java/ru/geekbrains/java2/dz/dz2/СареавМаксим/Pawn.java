package ru.geekbrains.java2.dz.dz2.СареавМаксим;

/**
 * Created by Terminator on 09.06.2016.
 */
public class Pawn implements Chessman {

    public Pawn() {
    }

    public boolean isRightMove(Coordinate sC, Coordinate eC) {


        int startX = sC.getX();
        int startY = sC.getY();
        int endX = eC.getX();
        int endY = eC.getY();



        // проверяем ход по вертикали
        if (startX == 2)
        {
            if (startX == endX && (endY - startY) == 2 && endY > startY) {
                return true;
            }
            if (Coordinate.minusToPlus(startX - endX) <= 1 && (endY - startY) == 1 && endY > startY) {
                return true;
            }

        } else
        {
            if (Coordinate.minusToPlus(startX - endX) <= 1 && (endY - startY) == 1 && endY > startY) {
                return true;
            }
        }

        return false;
    }
}
