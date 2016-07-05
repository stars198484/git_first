package ru.geekbrains.java2.dz.dz2.ЭлеонораОганджанян;

/**
 * Created by М.видео 60 on 12.06.2016.
 */
public class Queen implements MoveChess {
    @Override
    public boolean isRightMove(int diffX, int diffY) {
        if ((diffY == 0 && diffX != 0) || (diffY != 0 && diffX == 0) || (diffY == diffX && diffX != 0)){
            System.out.println("Ферзь ходит.");
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Ферзь";
    }
}
