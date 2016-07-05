package ru.geekbrains.java1.dz.dz7.ЮрийНиконоров;

import java.util.Scanner;

/**
 * Created by YurokVRS on 28.05.2016.
 */
public class HumanPlayer extends Player {
    private Scanner sc = new Scanner(System.in);
    public HumanPlayer() {
        super();
    }

    @Override
    public boolean turn(GameField fl, String namePl) {
        int x;
        int y;
        int shot;
        System.out.println("Ходит " + namePl + "\nВведите координаты стрельбы в формате X, Y:");
        do {
            y = sc.nextInt() - 1;
            x = sc.nextInt() - 1;
            shot = fl.Strike(x,y);
            if (shot == 2) return true;
            if (shot == 0) System.out.println("Нельзя туда стрелять, " + namePl + ", введите координаты стрельбы в формате X, Y:");
        }while(shot == 0);
        return false;
    }
}
