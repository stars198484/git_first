package ru.geekbrains.java2.dz.dz1.АлександрАнатольевичСмирнов;

/**
 * Created by Alexandr SMIRNOV on 07.06.2016.
 */

public interface ChessMan {
    boolean isRightMove(String from, String to);
    boolean isRightMove(int X1, int Y1, int X2, int Y2);
}
