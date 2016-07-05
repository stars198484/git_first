package ru.geekbrains.java1.dz.dz7.ВадимПрилепишев;

import java.util.Random;

/**
 * Created by Prilepishev Vadim on 28.05.2016.
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
        while(gameField.strike(x, y) != "MISS"){
            x = rand.nextInt(10);
            y = rand.nextInt(10);
        }
    }
}
