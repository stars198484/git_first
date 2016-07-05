package ru.geekbrains.java1.dz.dz7.ОвчинниковСтанислав;
import java.util.Random;

/**
 * Created by Stars on 28.05.2016.
 */
public class AiPlayer extends Player {
    private Random rand = new Random();
    public AiPlayer(){
        super();
    }

    @Override
    public void turn(GameField fl) {
        int x, y;
        do {
            do {
                System.out.println("Ходит компьютер");
                x = rand.nextInt(10);
                y = rand.nextInt(10);
            } while (!fl.isShotNeverRepeat(x, y));
            fl.strike(x, y);
        }while (fl.isTwoShots(x, y));
        fl.strike(x, y);
    }


}
