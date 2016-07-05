package ru.geekbrains.java2.dz.dz2.ЭлеонораОганджанян;

/**
 * Created by М.видео 60 on 12.06.2016.
 */
public class Bishop implements MoveChess {
    @Override
    public boolean isRightMove(int diffX, int diffY) {
        if (diffY == diffX && diffX != 0){
            System.out.println("Слон ходит.");
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Слон";
    }
}
