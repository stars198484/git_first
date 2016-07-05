package ru.geekbrains.java1.dz.dz7.РусланУстиц;

/**
 * Created by darky_000 on 27.05.2016.
 */
public class Ship {
    private char direction;
    private int x;
    private int y;
    private int[][] coordinates;
    private int length;
    private STATUS status;
    private Player master;
    public int shieldCapacity;

    private enum STATUS {SAFE, HITTED, DESTROYED}

    public Ship(char direction, int x, int y, int length) {
        this.direction = direction;
        this.x = x;
        this.y = y;
        this.length = length;
        coordinates = new int[length][2];
        setCoordinates();
        shieldCapacity = length;
        status = STATUS.SAFE;
    }

    public void setMaster(Player master) {
        this.master = master;
    }

    private void setCoordinates() {
        int vx = 0;
        int vy = 0;
        if (direction == 'H') vx = 1;
        if (direction == 'V') vy = 1;
        for (int i = 0; i < length; i++) {
            coordinates[i][0] = y + vy * i;
            coordinates[i][1] = x + vx * i;
        }
    }

    public int[][] getCoordinates() {
        return coordinates;
    }

    public void gotHit() {
        shieldCapacity--;
        if (shieldCapacity == 0)
            status = STATUS.DESTROYED;
        else
            status = STATUS.HITTED;
    }

    public void printCoordinates() {
        for (int i = 0; i < length; i++) {
            System.out.printf("%d %d", coordinates[i][0], coordinates[i][1]);
            System.out.println();
        }
    }

    public boolean checkShip(int x, int y) {
        for (int i = 0; i < coordinates.length; i++) {
            if (x == coordinates[i][1] && y == coordinates[i][0]) {
                return true;
            }
        }
        return false;
    }

    public boolean isDestroyed() {
        if (status == STATUS.DESTROYED)
            return true;
        return false;
    }

    @Override
    public String toString() {
        return "Ship{" +
                "direction=" + direction +
                ", x=" + x +
                ", y=" + y +
                ", length=" + length +
                ", status=" + status +
                ", master=" + master.getPlayerName() +
                '}';
    }
}
