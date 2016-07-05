package ru.geekbrains.java1.dz.dz7.РусланУстиц;

import java.util.Scanner;

/**
 * Created by darky_000 on 27.05.2016.
 */
public class HumanPlayer extends Player {
    private Scanner sc = new Scanner(System.in);

    public HumanPlayer() {
        super();
    }

    public HumanPlayer(String name) {
        super(name);
    }

    @Override
    public void turn(GameField gameField) {
        int x;
        int y;
        do {
            do {
                System.out.println("Введите координаты поле (x y):");
                x = sc.nextInt() - 1;
                y = sc.nextInt() - 1;
            } while (gameField.isHitted(x, y));

            gameField.strike(x, y);

        } while (gameField.isSuccessfulStrike(x, y));


    }
}
