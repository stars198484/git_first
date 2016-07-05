package ru.geekbrains.java2.dz.dz2.СареавМаксим;

/**
 * Created by Terminator on 09.06.2016.
 */
public class Queen extends Bishop implements Chessman {
//private Castle castle = new Castle();
    public boolean isRightMove(Coordinate sC, Coordinate eC) {
//        Castle castle = new Castle();
        return super.isRightMove(sC,eC) || new Castle().isRightMove(sC,eC);
    }
}
