package ru.geekbrains.java1.lesson3;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by Home-pc on 13.05.2016.
 */
public class Main {
    private static final int SIZE = 3;
    private static char[][] field = new char[SIZE][SIZE];
    private static final char playerDot = 'x';
    private static final char aiDot = '0';
    private static final char emptyDot = '*';
    private static Scanner scanner = new Scanner(System.in);
    private static Random random = new Random();

    private static void initField() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                field[i][j] = emptyDot;
            }
        }
    }

    private static void printField() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.print(field[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void setX0(int x, int y, char x0) {
        field[x][y] = x0;
    }

    private static void playerTurn() {
        int x, y;
        do {
            System.out.println("Ввведите координаты в формате X Y (1-3)");
            x = scanner.nextInt();
            y = scanner.nextInt();
        } while (!isCellEmpty(x - 1, y - 1));
        setX0(x - 1, y - 1, playerDot);
    }

    private static void aiTurn() {
        int x, y;
        do {
            x = random.nextInt(SIZE);
            y = random.nextInt(SIZE);
        } while (!isCellEmpty(x, y));
        setX0(x, y, aiDot);
    }


    private static boolean isCellEmpty(int x, int y) {
        if (x < 0 || x > 2 || y < 0 || y > 2) return false;
        if (field[x][y] == emptyDot) return true;
        return false;
    }

    private static boolean isCheckWin(char x0) {
        // по горизонтали
        if (field[0][0] == x0 && field[0][1] == x0 && field[0][2] == x0) return true;
        if (field[1][0] == x0 && field[1][1] == x0 && field[1][2] == x0) return true;
        if (field[2][0] == x0 && field[2][1] == x0 && field[2][2] == x0) return true;
        //по вертикали
        if (field[0][0] == x0 && field[1][0] == x0 && field[2][0] == x0) return true;
        if (field[0][1] == x0 && field[1][1] == x0 && field[2][1] == x0) return true;
        if (field[0][2] == x0 && field[1][2] == x0 && field[2][2] == x0) return true;
        // по диагонали
        if (field[0][0] == x0 && field[1][1] == x0 && field[2][2] == x0) return true;
        if (field[2][0] == x0 && field[1][1] == x0 && field[0][2] == x0) return true;
        return false;
    }

    private static boolean isFieldFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (field[i][j] == emptyDot) return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        initField();
        printField();

        while (true) {
            playerTurn();
            printField();
            if (isCheckWin(playerDot)) {
                System.out.println("победил человек");
                break;
            }
            if (isFieldFull()) {
                System.out.println("ничья");
                break;
            }

            aiTurn();
            printField();
            if (isCheckWin(aiDot)) {
                System.out.println("победил компьютер");
                break;
            }
            if (isFieldFull()) {
                System.out.println("ничья");
                break;
            }

        }

    }
}

