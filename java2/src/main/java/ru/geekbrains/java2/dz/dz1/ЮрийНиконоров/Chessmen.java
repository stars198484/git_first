package ru.geekbrains.java2.dz.dz1.ЮрийНиконоров;

/**
 * Created by YurokVRS on 07.06.2016.
 */
public interface Chessmen {
    boolean isMoveTo(int xMove, int yMove, Chessboard ch);
    char getImage();
    String getName();

}
