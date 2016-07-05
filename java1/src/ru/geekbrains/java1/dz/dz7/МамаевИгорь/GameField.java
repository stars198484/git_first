package ru.geekbrains.java1.dz.dz7.МамаевИгорь;

import java.util.Random;

/**
 * Created by Игорь on 29.05.2016.
 */
public class GameField {
    private char[][] fl; // Основной массив
    private final char WATER = '~'; // Вода
    private final char SHIP = 'O'; // Корабль
    private final char MISS = '*'; // Промах
    private final char HIT = 'X'; // Подбитый корабль
    Random rand= new Random();

    public GameField() {
        fl = new char[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                fl[i][j] = WATER;
            }
        }
        setAllShips();
    }

    public void setAllShips() {
        int[] shipLens = {4, 3, 3, 2, 2, 2, 1, 1, 1, 1};
        char dir;
        for (int i = 0; i < shipLens.length; i++) {
            if (rand.nextInt(2) == 0) dir = 'H';
            else dir = 'V';
            while (!setShip(rand.nextInt(10), rand.nextInt(10), shipLens[i],
                    dir)) ;
        }
    }

    public boolean setShip(int cx, int cy, int l, char dir) {
        int vx = 0;
        int vy = 0;
        if (dir == 'V') vy = 1;
        if (dir == 'H') vx = 1;
        if (cx + vx * l-1 > 9) return false;
        if (cy + vy * l-1 > 9) return false;
        for (int i = 0; i < l; i++) {
            if (!checkAround(cx + vx * i, cy + vy * i)) return false;
        }
        for (int i = 0; i < l; i++) {
            fl[cy + vy * i][cx + vx * i] = SHIP;
        }
        return true;
    }

    public boolean checkAround(int cx, int cy) {
        for (int i = cy - 1; i <= cy + 1; i++) {
            for (int j = cx - 1; j <= cx + 1; j++) {
                if (i > -1 && j > -1 && i < 10 && j < 10)
                    if (fl[i][j] != WATER) return false;
            }
        }
        return true;
    }

    public void printField(boolean visible) {
        for (int i = 0; i < 11; i++) {
            System.out.printf("%2d ", i);
        }
        System.out.println();
        for (int i = 0; i < 10; i++) {
            System.out.printf("%2d ", (i + 1));
            for (int j = 0; j < 10; j++) {
                if (visible) {
                    System.out.printf("%2c ", fl[i][j]);
                } else {
                    if (fl[i][j] == SHIP)
                        System.out.printf("%2c ", '~');
                    else
                        System.out.printf("%2c ", fl[i][j]);
                }
            }
            System.out.print('\n');
        }
        System.out.print('\n');
    }

    public boolean strike(int cx, int cy) {
        if (fl[cy][cx] == WATER) {
            fl[cy][cx] = MISS;
            System.out.println("Промах");
            return true;
        }
        if (fl[cy][cx] == SHIP) {
            fl[cy][cx] = HIT;
            System.out.println("Попадание. Стреляете еще раз");

            return false;
        }

        if (fl[cy][cx] == MISS || fl[cy][cx] == HIT) {
            System.out.println("Вы уже стреляли сюда, еще 1 выстрел!");
            return false;
        }
        return false;
    }

    public boolean isDefeated() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (fl[i][j] == SHIP) return false;
            }
        }
        return true;
    }



}
