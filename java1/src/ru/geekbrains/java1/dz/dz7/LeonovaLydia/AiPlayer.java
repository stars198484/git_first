package ru.geekbrains.java1.dz.dz7.LeonovaLydia;

import java.util.Random;

/**
 * Created by LiLeo on 28.05.2016.
 */
public class AiPlayer extends Player {
    private Random rand = new Random();

    public AiPlayer() {
        super();
    }

    @Override
    public void turn(GameField gameField, String name, Player otherPlayer) {
        int x, y;
        System.out.println("Ходит " + name);
            do {
                do {
                    x = rand.nextInt(10);
                    y = rand.nextInt(10);
                } while (gameField.isRepeat(x, y, false));
                System.out.println("Ход игрока " + name + ": " + (x + 1) + " " + (y + 1));
            } while (gameField.isStrike(x, y, otherPlayer));
    }
}
