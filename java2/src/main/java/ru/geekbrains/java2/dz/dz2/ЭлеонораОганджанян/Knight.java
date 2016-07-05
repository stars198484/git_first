package ru.geekbrains.java2.dz.dz2.ЭлеонораОганджанян;

/**
 * Created by М.видео 60 on 12.06.2016.
 */
public class Knight implements MoveChess {
    @Override
    public boolean isRightMove(int diffX, int diffY) {
        if ((diffY == 1 && diffX == 2) || (diffY == 2 && diffX == 1)) {
            System.out.println("Конь ходит.");
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Конь";
    }
}
