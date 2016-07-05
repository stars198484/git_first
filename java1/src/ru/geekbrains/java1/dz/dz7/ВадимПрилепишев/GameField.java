package ru.geekbrains.java1.dz.dz7.ВадимПрилепишев;

import java.util.Random;

/**
 * Created by Prilepishev Vadim on 28.05.2016.
 */
public class GameField {
    private char[][] fl;
    private final char WATER = '~'; //вода
    private final char SHIP = 'O'; //корабль
    private final char HIT = 'X'; //корабль подбит
    private final char MISS = '*'; //промах
    private Random rand = new Random();

    public GameField() {
        fl = new char[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                fl[i][j]= WATER;
            }
        }
        setAllShips();
    }

    private void setAllShips() {
        int[] shipLens = {4,3,3,2,2,2,1,1,1,1};
        char dir;
        for (int i = 0; i < shipLens.length; i++) {
            if (rand.nextInt(2) == 0) dir = 'H';
            else dir = 'V';
            while (!setShip(rand.nextInt(10), rand.nextInt(10), shipLens[i], dir));
        }
    }

    private boolean setShip(int x, int y, int len, char dir) {
        int vx = 0;
        int vy = 0;
        if (dir == 'V') vy = 1;
        if (dir == 'H') vx = 1;
        if (x + vx * len > 9) return false;
        if (y + vy * len > 9) return false;
        for (int i = 0; i < len; i++) {
            if (!checkAround(x + vx * i, y + vy * i)) return false;
        }
        for (int i = 0; i < len; i++) {
            fl[y + vy * i][x + vx * i] = SHIP;
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

    public boolean isDefeated() { //проверка на поражение, если есть хоть один корабль, возвращает false
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (fl[i][j] == SHIP) return false;
            }
        }
        return true;
    }

    public String strike(int cx, int cy) {
        if (fl[cy][cx] == MISS || fl[cy][cx] == HIT) {
            System.out.println("Выстрел в данную ячейку уже производился");
            return "HASBEEN";
        }
        if (fl[cy][cx] == WATER) {
            fl[cy][cx] = MISS;
            System.out.println("Промах");
            return "MISS";
        }
        if (fl[cy][cx] == SHIP) {
            fl[cy][cx] = HIT;
            System.out.println("Попадание. Стреляйте еще раз.");
            return "HIT";
        }
        return "";
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
                        System.out.printf("%2c ", WATER);
                    else
                        System.out.printf("%2c ", fl[i][j]);
                }

            }
            System.out.print('\n');
        }
        System.out.print('\n');
    }
}
