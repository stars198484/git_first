package ru.geekbrains.java2.dz.dz2.ЭлеонораОганджанян;

/**
 * Created by М.видео 60 on 12.06.2016.
 */
public class King implements MoveChess {
    @Override
    public boolean isRightMove(int diffX, int diffY) {
        if (diffY <= 1 && diffX <= 1){
            if ((diffY == 0 && diffX != 0) || (diffY != 0 && diffX == 0) || (diffY == 1 && diffX == 1)) {
                System.out.println("Король ходит.");
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Король";
    }
}
