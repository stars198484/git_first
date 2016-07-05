package ru.geekbrains.java1.dz.dz7.OlyaMikhailyuk;



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
        int x, y;
        do {
            System.out.println("Введите координаты стрельбы в формате X и Y");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        }
        while (getGameField().isAlreadyHit(x, y));
        fl.strike(x, y);
    }


}
