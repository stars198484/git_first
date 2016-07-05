package ru.geekbrains.java1.dz.dz7.ЮрийНиконоров;

import java.util.Random;

/**
 * Created by YurokVRS on 28.05.2016.
 */
public class AIPlayer extends Player {
    private Random rnd = new Random();

    public AIPlayer() {
        super();
    }

    @Override
    public boolean turn(GameField gameField, String namePl) {
        int shot;
        System.out.println("Ходит " + namePl);
        do{
            shot = gameField.Strike(rnd.nextInt(10),rnd.nextInt(10));
            if (shot == 2) return true;
        } while(shot != 1);
        return false;
    }

}
