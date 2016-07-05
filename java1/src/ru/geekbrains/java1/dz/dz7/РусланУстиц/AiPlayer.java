package ru.geekbrains.java1.dz.dz7.РусланУстиц;

import java.util.Random;

/**
 * Created by darky_000 on 27.05.2016.
 */
public class AiPlayer extends Player {
    private Random rand = new Random();
    private static int ID = 0;

    public AiPlayer() {
        super();
        ID++;
        this.setPlayerName("AI " + String.valueOf(ID));
    }

    @Override
    public void turn(GameField gameField) {
        int x;
        int y;
        do {
            do {
                x = rand.nextInt(gameField.getFieldSize());
                y = rand.nextInt(gameField.getFieldSize());
            } while (gameField.isHitted(x, y));

            System.out.printf("Ход %s: %d %d ->", this.getPlayerName(), x + 1, y + 1);
            gameField.strike(x, y);
            if (gameField.isDefeated())
                break;
        } while (gameField.isSuccessfulStrike(x, y));

    }
}
