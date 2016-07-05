package ru.geekbrains.java1.lesson7;

import java.util.Scanner;

/**
 * Created by Home-pc on 26.05.2016.
 */
public class HumanPlayer extends Player {
    private Scanner sc = new Scanner(System.in);

    public HumanPlayer() {
        super();
    }

    @Override
    public void turn(GameField fl) {
        System.out.println("Введите координаты стрельбы в формате X и Y");
        int x = sc.nextInt() - 1;
        int y = sc.nextInt() - 1;
        fl.strike(x, y);
    }
}
