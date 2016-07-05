package ru.geekbrains.java2.dz.dz1.АлександрАнатольевичСмирнов;

/**
 * Created by Alexandr SMIRNOV on 08.06.2016.
 */

public class Bishop implements ChessMan {

    @Override
    public boolean isRightMove(String from, String to) {
        System.out.println("Слон не может сделать такой шаг!");
        return false;
    }

    @Override
    public boolean isRightMove(int X1, int Y1, int X2, int Y2) {
        int dX = Math.abs(X1 - X2), dY = Math.abs(Y1 - Y2);
        if (dX == dY) {
            System.out.println("Слон ходит.");
            return true;
        } // if
        System.out.println("Слон не может сделать такой шаг!");
        return false;
    }
}
