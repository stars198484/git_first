package ru.geekbrains.java1.dz.dz7.OlyaMikhailyuk;



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
        int x, y;
        do {
        System.out.println("Ходит компьютер");
            x = rand.nextInt(10);
            y = rand.nextInt(10);
        }
        while (getGameField().isAlreadyHit(x, y));
        gameField.strike(x, y);
    }
}
