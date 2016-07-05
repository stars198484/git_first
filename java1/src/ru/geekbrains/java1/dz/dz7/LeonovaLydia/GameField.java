package ru.geekbrains.java1.dz.dz7.LeonovaLydia;

import java.util.Random;

/**
 * Created by LiLeo on 28.05.2016.
 */
public class GameField {
    private char[][] gameField; // Основной массив
    private final char WATER = '~'; // Вода
    private final char SHIP = 'H'; // Корабль
    private final char MISS = '*'; // Промах
    private final char HIT = 'X'; // Подбитый корабль
    private Random rand = new Random();

    public GameField() {
        gameField = new char[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                gameField[i][j] = WATER;
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
            while (!setShip(rand.nextInt(10), rand.nextInt(10), shipLens[i], dir)) ;
        }
    }

    public boolean setShip(int cx, int cy, int l, char dir) {
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
            gameField[cy + vy * i][cx + vx * i] = SHIP;
        }
        return true;
    }

    public boolean checkAround(int cx, int cy) {
        for (int i = cy - 1; i <= cy + 1; i++) {
            for (int j = cx - 1; j <= cx + 1; j++) {
                if (i > -1 && j > -1 && i < 10 && j < 10)
                    if (gameField[i][j] != WATER) return false;
            }
        }
        return true;
    }

    public void printField(boolean visible, String playerName) {
        System.out.println("Поле игрока " + playerName);

        for (int i = 0; i < 11; i++) {
            System.out.printf("%2d ", i);
        }
        System.out.println();
        for (int i = 0; i < 10; i++) {
            System.out.printf("%2d ", (i + 1));
            for (int j = 0; j < 10; j++) {
                if (visible) {
                    System.out.printf("%2s ", gameField[i][j]);
                } else {
                    if (gameField[i][j] == SHIP)
                        System.out.printf("%2s ", '~');
                    else
                        System.out.printf("%2s ", gameField[i][j]);
                }
            }
            System.out.print('\n');
        }
        System.out.print('\n');
    }

    public boolean isRepeat(int cx, int cy, boolean echo) {
        if (gameField[cy][cx] == HIT || gameField[cy][cx] == MISS) {
            if (echo) {
                System.out.println("Сюда уже стреляли, сделайте другой ход.");
            }
            return true;
        }
        return false;
    }

    public boolean isStrike(int cx, int cy, Player otherPlayer) {
        if (gameField[cy][cx] == SHIP) {
            gameField[cy][cx] = HIT;
            String hitStatus = isDeath(cy, cx) ? "Убит" : "Ранен";
            if (!otherPlayer.getField().isDefeated()) {
                System.out.println(hitStatus);
            } else {
                System.out.println("Все корабли игрока "+ otherPlayer.getName() + " уничтожены");
                return false;
            }
            return true;
        } else if (gameField[cy][cx] == WATER) {
            gameField[cy][cx] = MISS;
            System.out.println("Промах и переход хода");
        }
        return false;
    }

    public boolean isDefeated() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (gameField[i][j] == SHIP) return false;
            }
        }
        return true;
    }

    public boolean isDeath(int cy, int cx) {
        StringBuilder sb = new StringBuilder();
        for (int i = cy - 1; i <= cy + 1; i++) {
            for (int j = cx - 1; j <= cx + 1; j++) {
                if (i > -1 && j > -1 && i < 10 && j < 10) {
                    if (gameField[i][j] == SHIP) sb.append("1");
                    else sb.append("0");
                }
            }
        }
        return (!sb.toString().contains("1"));
    }


}
