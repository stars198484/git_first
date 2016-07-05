package ru.geekbrains.java1.dz.dz7.ВавилинГерман;

import java.util.Random;

/**
 * Created by gta5 on 26.05.2016.
 */
public class GameField {
    private char[][] field;
    private final char WATER = '~';
    private final char SHIP = 'O';
    private final char HIT = 'X';
    private final char MISS = '*';
    private Random rand = new Random();


    public GameField() {
        field = new char[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                field[i][j] = WATER;
            }
        }
        setAllShips();
    }

    private void setAllShips() {
        int[] shipLens = {4,3,3,2,2,2,1,1,1,1};
        char dir;
        for (int i = 0; i < shipLens.length; i++) {
            if(rand.nextInt(2) == 0) dir = 'H';
            else dir = 'V';
            while (!setShip(rand.nextInt(10), rand.nextInt(10), shipLens[i], dir));
        }
    }

    private boolean setShip(int x, int y, int len, char dir) {
        int vx = 0;
        int vy = 0;
        if(dir == 'V') vy = 1;
        if(dir == 'H') vx = 1;
        if(x + vx * len > 9) return false;
        if(y + vy * len > 9) return false;
        for (int i = 0; i < len; i++) {
            if (!checkAround(x + vx * i, y + vy * i)) return false;
        }
        for (int i = 0; i < len; i++) {
            field[y + vy * i][x + vx * i] = SHIP;
        }
        return true;
    }

    private boolean checkAround(int cx, int cy) {
        for (int i = cy - 1; i <= cy + 1; i++) {
            for (int j = cx - 1; j <= cx + 1; j++) {
                if (i > -1 && j > -1 && i < 10 && j < 10)
                    if (field[i][j] != WATER) return false;
            }
        }
        return true;
    }

    public boolean isDefeated() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (field[i][j] == SHIP) return false;
            }
        }
        return true;
    }

    public void strike(int cx, int cy) {
        if (field[cy][cx] == WATER) {
            field[cy][cx] = MISS;
            System.out.println("Промах");
            return;
        }
        if (field[cy][cx] == SHIP) {
            field[cy][cx] = HIT;
            System.out.println("Попадание");
        }
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
                    System.out.printf("%2c ", field[i][j]);
                } else {
                    if (field[i][j] == SHIP)
                        System.out.printf("%2c ", WATER);
                    else
                        System.out.printf("%2c ", field[i][j]);
                }

            }
            System.out.print('\n');
        }
        System.out.print('\n');
    }
    public char getPoint (int x, int y) {
        return field[y][x];
    }
}
