package ru.geekbrains.java2.dz.dz1.YuryLukas.interfaces;

import ru.geekbrains.java2.dz.dz1.YuryLukas.ChessBoard;

import java.awt.*;

/**
 * Created by yurok on 8.06.16.
 */
public interface Figure {
    int WHITE = 0;
    int BLACK = 1;

    boolean move(String coord);
    boolean isRightMove(String from, String to, ChessBoard board);
    String getFigureName();
}
