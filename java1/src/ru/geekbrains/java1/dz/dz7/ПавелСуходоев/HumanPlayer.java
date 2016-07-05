package ru.geekbrains.java1.dz.dz7.ПавелСуходоев;

import java.util.Scanner;

/**
 * Created by xcyxoux on 29.05.16.
 */

public class HumanPlayer extends Player {
    private Scanner sc = new Scanner(System.in);
    public HumanPlayer() {
        super();
    }
    @Override
    public void turn(GameField fl) {

        int x, y;
        boolean strikeDone = false;
        do {
            System.out.println("Введите координаты стрельбы в формате X и Y");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
            if (!fl.isHitMiss(x, y)) {
                fl.strike(x, y);
                strikeDone = true;
            } else {
                System.out.println("Сюда уже стреляли");
            }
            if (fl.isHit(x, y)) {
                System.out.println("Раз Вы попали, то можно еще раз стрельнуть");
            }
        } while (!strikeDone | fl.isHit(x, y));
    }
}
