package ru.geekbrains.java1.dz.dz7.ВадимПрилепишев;

import java.util.Scanner;

/**
 * Created by Prilepishev Vadim on 28.05.2016.
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
        while(fl.strike(x, y) != "MISS"){
                System.out.println("Введите координаты стрельбы в формате X и Y");
                x = sc.nextInt() - 1;
                y = sc.nextInt() - 1;
        }
    }
}
