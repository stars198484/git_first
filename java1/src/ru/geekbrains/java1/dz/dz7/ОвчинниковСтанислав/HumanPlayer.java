package ru.geekbrains.java1.dz.dz7.ОвчинниковСтанислав;

import java.util.Scanner;


/**
 * Created by Stars on 28.05.2016.
 */
public class HumanPlayer extends Player {
    private Scanner sc = new Scanner(System.in);

    public HumanPlayer() {
        super();
    }

    @Override
    public void turn(GameField fl) {
        int x, y;
        do {
            do {
                System.out.println("Введите координаты стрельбы в формате X Y");
                x = sc.nextInt() - 1;
                y = sc.nextInt() - 1;
            } while (!fl.isShotNeverRepeat(x, y));
            fl.strike(x, y);
        } while (fl.isTwoShots(x, y));
        fl.strike(x, y);
    }


}
