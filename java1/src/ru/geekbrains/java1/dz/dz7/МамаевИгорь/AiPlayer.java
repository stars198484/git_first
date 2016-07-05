package ru.geekbrains.java1.dz.dz7.МамаевИгорь;

import java.util.Random;

public class AiPlayer extends Player {
    private Random rand = new Random();

    public AiPlayer() {
        super();
    }

    @Override
    public void turn(GameField fl) {
        System.out.println("Ходит компьютер");
        int x, y;

        do {
            x = rand.nextInt(10);
            y = rand.nextInt(10);
        }
        while (!fl.strike(x, y));
    }
}

