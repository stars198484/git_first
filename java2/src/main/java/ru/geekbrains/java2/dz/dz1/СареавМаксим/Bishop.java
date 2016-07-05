package ru.geekbrains.java2.dz.dz1.СареавМаксим;

/**
 * Created by Terminator on 09.06.2016.
 */
public class Bishop implements Chessman {

    public Bishop() {
    }

     public boolean isRightMove(Coordinate sC, Coordinate eC) {



         int startX = sC.getX();
         int startY = sC.getY();
         int endX = eC.getX();
         int endY = eC.getY();

         // проверяем ход по диагонали
         if (Coordinate.minusToPlus(startX - endX) == Coordinate.minusToPlus(startY - endY)) {
             return true;
         }
         return false;
     }
}
