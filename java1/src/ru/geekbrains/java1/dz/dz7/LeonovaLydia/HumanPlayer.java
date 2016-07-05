package ru.geekbrains.java1.dz.dz7.LeonovaLydia;

import java.util.Scanner;

/**
 * Created by LiLeo on 28.05.2016.
 */
public class HumanPlayer extends Player {
    private Scanner sc = new Scanner(System.in);

    public HumanPlayer() {
        super();
    }

    @Override
    public void turn(GameField gameField, String name, Player otherPlayer) {
        int x, y;
        do {
            do {
                do {
                    System.out.println("Ходит " + name + ". Введите координаты стрельбы от 1 до 10 в формате X и Y");
                    x = sc.nextInt() - 1;
                    y = sc.nextInt() - 1;
                } while (x < 0 || x > 9 || y < 0 || y > 9);
            } while (gameField.isRepeat(x, y, true));
        } while (gameField.isStrike(x, y, otherPlayer));
    }

}
