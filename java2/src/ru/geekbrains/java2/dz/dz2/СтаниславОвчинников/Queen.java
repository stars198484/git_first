package ru.geekbrains.java2.dz.dz2.СтаниславОвчинников;

/**
 * Created by Stars on 08.06.2016.
 */
public class Queen extends Bishop implements Chessman {
    @Override
    public boolean isRightMove(String from, String to) {
        return super.isRightMove(from, to)||new Rook().isRightMove(from, to);
    }
}
