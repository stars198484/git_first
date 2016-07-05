package ru.geekbrains.java2.dz.dz1.АлександрАнатольевичСмирнов;

/**
 * Created by Alexandr SMIRNOV on 07.06.2016.
 */

public class Pawn implements ChessMan {

    @Override
    public boolean isRightMove(String from, String to) {
        System.out.println("Пешка не может сделать такой шаг!");
        return false;
    }

    @Override
    public boolean isRightMove(int X1, int Y1, int X2, int Y2) {
        int dY = (Y1 - Y2) * (Y1 - Y2);
        if (X1 == X2 & dY == 1) {
            System.out.println("Пешка ходит.");
            return true;
        } // if
        if (X1 == X2 & ((Y1 == 2 & Y2 == 4) || (Y1 == 7 & Y2 == 5))) {
            System.out.println("Пешка ходит.");
            return true;
        } // if
        System.out.println("Пешка не может сделать такой шаг!");
        return false;
    }
}
