package ru.geekbrains.java2.dz.dz1.СтаниславОвчинников;

/**
 * Created by Stars on 07.06.2016.
 */
public interface Chessman {
    ChessBoard cb = new ChessBoard();
    boolean isRightMove(String from, String to);
}
