package ru.geekbrains.java1.dz.dz7.УльянаЧерникова;
import java.util.Random;

/**
 * Created by Uliana on 27.05.2016.
 */
public class AIPlayer extends Player {
    private Random rand = new Random();

    public AIPlayer() {
        super();
    }

    @Override
    public void turn(Game f1) {
        System.out.println("Computer's turn");
        int x = rand.nextInt(10);
        int y = rand.nextInt(10);
        // f1.strike(x, y);
        while (f1.strike(x, y) == true) {
            System.out.println("Computer has another turn");
            x = rand.nextInt(10);
            y = rand.nextInt(10);
        }




    }
}
