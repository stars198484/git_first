package ru.geekbrains.java1.dz.dz7.ОвчинниковСтанислав;

import java.util.Random;

/**
 * Created by Stars on 28.05.2016.
 */
public class GameField {
    public char[][] fl;//основной массив
    private final char WATER = '~';
    private final char SHIP = 'O';
    private final char MISS = '*';
    private final char HIT = 'X';
    private Random rand = new Random();


    public GameField() {
        fl = new char[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                fl[i][j] = WATER;
            }
        }
        SetAllShips();
    }

    private void SetAllShips() {
        int[] shipLens = {4, 3, 3, 2, 2, 2, 1, 1, 1, 1};
        char dir;
        for (int i = 0; i < shipLens.length; i++) {
            if (rand.nextInt(2) == 0) dir = 'H';
            else dir = 'V';
            while (!setShip(rand.nextInt(10), rand.nextInt(10), shipLens[i], dir));
        }
    }

    private boolean setShip(int cx, int cy, int l, char dir) {
     int vx = 0;
        int vy = 0;
        if (dir == 'V') vy = 1;
        if (dir == 'H') vx = 1;
        if (cx + vx * l > 9) return false;
        if (cy + vy * l > 9) return false;
        for (int i = 0; i < l; i++) {
            if (!checkAround(cx + vx * i, cy + vy * i)) return false;
        }
        for (int i = 0; i < l; i++) {
            fl[cy + vy * i][cx + vx * i] = SHIP;
        }
        return true;
    }

    public boolean checkAround(int cx, int cy) {
        for (int i = cy - 1; i <= cy + 1 ; i++) {
            for (int j = cx - 1; j <= cx + 1 ; j++) {
                if (i > -1 && j > -1 && i < 10 && j < 10)
                    if (fl[i][j] != WATER) return false;
            }
        }
        return true;
    }
    public void printField(boolean visible){
        for (int i = 0; i < 11; i++) {
            System.out.printf("%2d ",i);
        }
        System.out.println();
        for (int i = 0; i < 10; i++) {
            System.out.printf("%2d ", (i+1));
            for (int j = 0; j < 10; j++) {
                if (visible){
                    System.out.printf("%2c ", fl[i][j]);
                }else {
                    if(fl[i][j] == SHIP)
                        System.out.printf("%2c ", '~');
                    else
                        System.out.printf("%2c ", fl[i][j]);
                }
                
            }
            System.out.print('\n');
        }
        System.out.print('\n');
    }
    public void strike (int cx, int cy){

        if (fl[cy][cx] == WATER){
            fl[cy][cx] = MISS;
            System.out.println("Промах");
        }
        if (fl[cy][cx] == SHIP){
            fl[cy][cx] = HIT;
            System.out.println("Попал");
        }
    }
    public boolean isDefeated(){
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
               if (fl[i][j] == SHIP) return false;
            }
        }
        return true;
    }

    public boolean isShotNeverRepeat(int x, int y) {
        if (x < 0 || x > 10 || y < 0 || y > 10) {
            System.out.println("Неверные координаты X Y");
            return false;
        }
        if ((fl[y][x] == WATER) || (fl[y][x] == SHIP)) return true;

        System.out.println("Такой ход уже был"); return false;
    }

    public boolean isTwoShots(int x, int y) {
        if (fl[y][x] == HIT) {
            printField(false);
            return true;
        }
        return false;
    }
}
