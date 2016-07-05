package ru.geekbrains.java2.dz.dz1.ГерманВавилин;

/**
 * Created by gta5 on 08.06.2016.
 */
public interface ChessFigure {
    boolean isRightMove(ChessCoordinate from, ChessCoordinate to);
    String getName();
}
