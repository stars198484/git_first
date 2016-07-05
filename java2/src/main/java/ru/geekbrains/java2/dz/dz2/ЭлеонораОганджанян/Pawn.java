package ru.geekbrains.java2.dz.dz2.ЭлеонораОганджанян;

/**
 * Created by М.видео 60 on 11.06.2016.
 */
public class Pawn implements MoveChess {
    @Override
    public boolean isRightMove(int diffX, int diffY) {
        if (diffY == 0 && diffX == 1){
            System.out.println("Пешка ходит");
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Пешка";
    }
}
