package ru.geekbrains.java1.lesson7;

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
    public void turn(GameField gameField) {
        System.out.println("Ходит компьютер");
        int x = rand.nextInt(10);
        int y = rand.nextInt(10);
        gameField.strike(x, y);
    }
}
