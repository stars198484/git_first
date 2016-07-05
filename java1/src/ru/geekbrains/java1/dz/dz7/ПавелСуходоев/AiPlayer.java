package ru.geekbrains.java1.dz.dz7.ПавелСуходоев;

import java.util.Random;

/**
 * Created by xcyxoux on 29.05.16.
 */

public class AiPlayer extends Player {
    private Random rand = new Random();
    public AiPlayer() {
        super();
    }
    @Override
    public void turn(GameField fl) {

        int x, y;
        boolean strikeDone = false;
        do {
            System.out.println("Ходит компьютер");
            x = rand.nextInt(10);
            y = rand.nextInt(10);
            if (!fl.isHitMiss(x, y)) {
                fl.strike(x, y);
                strikeDone = true;
            } else {
                System.out.println("Сюда уже стреляли");
            }
            if (fl.isHit(x, y)) {
                System.out.println("Компьютер попал, ему можно еще раз стрельнуть");
            }
        } while (!strikeDone | fl.isHit(x, y));
    }
}
