package ru.geekbrains.java2.dz.dz1.АлександрАнатольевичСмирнов;

/**
 * Created by Alexandr SMIRNOV on 08.06.2016.
 */

public class King implements ChessMan {

    @Override
    public boolean isRightMove(String from, String to) {
        System.out.println("Король не может сделать такой шаг!");
        return false;
    }

    @Override
    public boolean isRightMove(int X1, int Y1, int X2, int Y2) {
        int dX = Math.abs(X1 - X2), dY = Math.abs(Y1 - Y2);
        if (dX < 2 & dY < 2) {
            System.out.println("Его величество соизволил сходить.");
            return true;
        } // if
        System.out.println("Король не может сделать такой шаг!");
        return false;
    }

}
