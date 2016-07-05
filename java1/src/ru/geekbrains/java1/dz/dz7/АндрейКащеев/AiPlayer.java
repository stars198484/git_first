package ru.geekbrains.java1.dz.dz7.АндрейКащеев;

import java.util.Random;

/**
 * Created by Home-pc on 26.05.2016.
 */
public class AiPlayer extends Player {
    private Random rand = new Random();

    public AiPlayer() {
        super();
    }

    @Override
    public boolean turn(GameField gameField) {
        System.out.println("Ходит компьютер");
        int x,y;
        do {
        x = rand.nextInt(10);
        y = rand.nextInt(10);}
        while (gameField.isStriked(x,y));

        return gameField.strike(x, y);
    }

}
