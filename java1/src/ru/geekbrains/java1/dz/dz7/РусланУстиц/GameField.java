package ru.geekbrains.java1.dz.dz7.РусланУстиц;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by darky_000 on 27.05.2016.
 */
public class GameField {
    private static final int FIELD_SIZE = 10;
    private static final int[] SHIP_LENGTH = {4, 3, 3, 2, 2, 2, 1, 1, 1, 1};
    private static final char WATER = '~';
    private static final char SHIP = 'O';
    private static final char MISS = '*';
    private static final char HITTED = 'x';
    private static final char DESTROYED = 'Ж';

    private char[][] field;

    private ArrayList<Ship> ships = new ArrayList<>();

    public ArrayList<Ship> getShips() {
        return ships;
    }

    private Random rand = new Random();

    public GameField() {
        initField();
        setAllShips();
    }

    public int getFieldSize() {
        return FIELD_SIZE;
    }

    private void initField() {
        field = new char[FIELD_SIZE][FIELD_SIZE];
        for (int i = 0; i < FIELD_SIZE; i++) {
            for (int j = 0; j < FIELD_SIZE; j++)
                field[i][j] = WATER;
        }
    }

    private void setAllShips() {
        char shipDirection;

        for (int i = 0; i < SHIP_LENGTH.length; i++) {
            if (rand.nextInt(2) == 0) shipDirection = 'H';
            else shipDirection = 'V';
            while (!isSettable(rand.nextInt(FIELD_SIZE), rand.nextInt(FIELD_SIZE), SHIP_LENGTH[i], shipDirection));
        }
    }

    private boolean isSettable(int x, int y, int length, char direction) {
        int vx = 0;
        int vy = 0;
        if (direction == 'H') vx = 1;
        if (direction == 'V') vy = 1;
        if (x + length * vx > FIELD_SIZE - 1) return false;
        if (y + length * vy > FIELD_SIZE - 1) return false;

        for (int i = 0; i < length; i++)
            if (!checkAround(x + vx * i, y + vy * i)) return false;

        ships.add(new Ship(direction, x, y, length));

        for (int i = 0; i < length; i++)
            field[y + vy * i][x + vx * i] = SHIP;
        return true;
    }

    private boolean checkAround(int x, int y) {
        for (int i = y - 1; i <= y + 1; i++) {
            for (int j = x - 1; j <= x + 1; j++) {
                if (i > -1 && j > - 1 && i < FIELD_SIZE && j < FIELD_SIZE)
                    if (field[i][j] != WATER) return false;
            }
        }
        return true;
    }

    public void strike(int x, int y) {
        String result = "";
        if (field[y][x] == WATER) {
            field[y][x] = MISS;
            result = "\t Промах";
        }
        if (field[y][x] == SHIP) {
            field[y][x] = HITTED;
            for (Ship ship : ships) {
                if (ship.checkShip(x, y)) {
                    ship.gotHit();
                    result = "\t Попал";
                    if (ship.isDestroyed()) {
                        coverDestroyedShip(ship);
                        result = "\t Убит";
                    }
                    break;
                }
            }
        }
        System.out.println(result);
    }

    /*
    Покрываем поля вокруг уничтоженного корабля MISS`ами
     */
    private void coverDestroyedShip(Ship ship) {
        int[][] coordinates = ship.getCoordinates();
        int x;
        int y;
        for (int i = 0; i < coordinates.length; i++) {
            x = coordinates[i][1];
            y = coordinates[i][0];
            field[y][x] = DESTROYED;
            for (int cy = y - 1; cy <= y + 1; cy++) {
                for (int cx = x - 1; cx <= x + 1; cx++) {
                    if (cy > -1 && cx > -1 && cy < FIELD_SIZE && cx < FIELD_SIZE)
                        if (field[cy][cx] == WATER) field[cy][cx] = MISS;
                }
            }
        }
    }

    public boolean isDefeated() {
        for (Ship ship : ships) {
            if (!ship.isDestroyed())
                return false;
        }
        return true;
//        for (int i = 0; i < FIELD_SIZE; i++) {
//            for (int j = 0; j < FIELD_SIZE; j++)
//                if (field[i][j] == SHIP) return false;
//        }
//        return true;
    }

    public boolean isHitted(int x, int y) {
        if (field[y][x] == HITTED || field[y][x] == DESTROYED || field[y][x] == MISS) return true;
        else return false;
    }

    public boolean isSuccessfulStrike(int x, int y) {
        if (field[y][x] == HITTED || field[y][x] == DESTROYED) return true;
        return false;
    }

    public void printField(boolean visible) {
        for (int i = 0; i <= FIELD_SIZE; i++)
            System.out.printf("%2d", i);
        System.out.println();

        for (int i = 0; i < FIELD_SIZE; i++) {
            System.out.printf("%2d", (i + 1));
            for (int j = 0; j < FIELD_SIZE; j++) {
                if (visible) {
                    System.out.printf("%2c", field[i][j]);
                } else {
                    if (field[i][j] == SHIP)
                        System.out.printf("%2c", WATER);
                    else
                        System.out.printf("%2c", field[i][j]);
                }
            }
            System.out.print('\n');
        }
        System.out.print('\n');
    }

    public void printShips() {
        for (int i = 0; i < ships.size(); i++) {
            System.out.printf(ships.get(i).toString());
            System.out.println();
            ships.get(i).printCoordinates();
        }
    }

}
