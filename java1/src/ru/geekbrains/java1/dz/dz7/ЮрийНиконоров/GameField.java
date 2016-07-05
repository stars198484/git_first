package ru.geekbrains.java1.dz.dz7.ЮрийНиконоров;

import java.util.Random;

/**
 * Created by YurokVRS on 28.05.2016.
 */
public class GameField {
    private char[][] fl;
    private final char WATER = '~'; // вода
    private final char SHIP = 'O'; // корабль
    private final char HIT = 'X'; // подбитый корабль
    private final char MISS = '*'; // промах
    private Random rnd = new Random();

    public GameField() {
        fl = new char[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                fl[i][j] = WATER;
            }
        }
        setAllShips();
    }
    
    public boolean isDefeated(){
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (fl[i][j] == SHIP) return false;
            }
        }
        return true;
    }

    public void strike(int cx, int cy) {
        if (fl[cx][cy] == WATER) {
            fl[cx][cy] = MISS;
            System.out.println("Промах");
            return;
        }
        if (fl[cx][cy] == SHIP) {
            fl[cx][cy] = HIT;
            System.out.println("Попадание");
        }
    }
    public void setAllShips() {
        int[] shipLens = {4,3,3,2,2,2,1,1,1,1};
        char dir;
        for (int i = 0; i < shipLens.length; i++) {
            if(rnd.nextInt(2) == 0) dir = 'H';
            else dir = 'V';
            while (!setShip(rnd.nextInt(10), rnd.nextInt(10), shipLens[i], dir));
        }
    }
    public void printField(boolean visible){
        for (int i = 0; i < 11; i++) {
            System.out.printf("%2d ", i);
        }
        System.out.print('\n');

        for (int i = 0; i < 10; i++) {
            System.out.printf("%2d ", (i + 1));
            for (int j = 0; j < 10; j++) {
                if (visible){
                    System.out.printf("%2c ", fl[i][j]);
                }
                else {
                    if(fl[i][j] == SHIP)
                        System.out.printf("%2c ", WATER);
                    else
                        System.out.printf("%2c ", fl[i][j]);
                }
            }
            System.out.print('\n');
        }
        System.out.print('\n');
    }

    public boolean setShip(int x, int y, int sLen, char dr) {
        int vx = 0;
        int vy = 0;
        if (dr == 'V') vy = 1;
        if (dr == 'H') vx = 1;

        // Выходит ли корабль за пределы игрового поля
        if (x + vx * sLen > 9) return false;
        if (y + vy * sLen > 9) return false;

        // Проверяем вокруг коробля есть ли другие коробли
        for (int i = 0; i < sLen; i++) {
            if(!checkAround(x + vx * i, y + vy * i)) return false; 
        }
        for (int i = 0; i < sLen; i++) {
            fl[x + vx * i][y + vy * i] = SHIP;
        }
        return true;
    }

    public boolean checkAround(int cx, int cy) {
        for (int i = cx - 1; i <= cx + 2 ; i++) {
            for (int j = cy - 1; j < cy + 2; j++) {
                if (i > -1 && i < 10 && j > -1 && j < 10)
                    if (fl[i][j] != WATER) return false;
            }
        }
        return true;
    }

    public int Strike(int sx, int sy) {
        if (sx > -1 && sx < 10 && sy > -1 && sy < 10) {
            if (fl[sx][sy] == WATER || fl[sx][sy] == HIT){
                strike(sx, sy);
                return 1;
            }
            if (fl[sx][sy] == SHIP) {
                strike(sx, sy);
                return 2;
            }
        }
        return 0;
    }
}



