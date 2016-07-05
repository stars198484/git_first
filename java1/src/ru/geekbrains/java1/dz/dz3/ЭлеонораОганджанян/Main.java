package ru.geekbrains.java1.dz.dz3.ЭлеонораОганджанян;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by I_V_Zhukov on 10.05.2016.
 */
public class Main {
    // Первые 3 задания выполнены

    private static final int SIZE = 5;
    private static final int SERIES = 4;
    private static char[][] field = new char[SIZE][SIZE];
    private static final char playerDot = 'x';
    private static final char aiDot = '0';
    private static final char emptyDot = '*';
    private static Scanner scanner = new Scanner(System.in);
    private static Random random = new Random();

    private static void initField() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++ ){
                field[i][j] = emptyDot;
            }
        }
    }

    private static void printField() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++ ){
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
            System.out.println("Введите координаты в формате X Y (1-3)");
            x = scanner.nextInt();
            y = scanner.nextInt();
        } while (!isCellEmpty(x-1, y-1));
        setX0(x-1, y-1, playerDot);
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
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) return false;
        if (field[x][y] == emptyDot) return true;
        return false;
    }

    private static boolean isCheckWin(char x0){
        int n;
        // по горизонтали
        for (int i = 0; i < SIZE; i++) {
            n = 0;
            for (int j = 0; j < SIZE; j++) {
                if (field[i][j] == x0) n++;
                if (n == SIZE) return true;
            }
        }

        // по вертикали
        for (int j = 0; j < SIZE; j++) {
            n = 0;
            for (int i = 0; i < SIZE; i++) {
                if (field[i][j] == x0) n++;
                if (n == SIZE) return true;
            }
        }

        // по диагонали
        n = 0;
        for (int i = 0, j = 0; i < SIZE; i++, j++) {
            if (field[i][j] == x0) n++;
            if (n == SIZE) return true;
        }

        n = 0;
        for (int i = SIZE - 1, j = 0; j < SIZE; i--, j++) {
            if (field[i][j] == x0) n++;
            if (n == SIZE) return true;
        }

        return false;
    }

    private static boolean isFielFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++ ){
                if (field[i][j] == emptyDot) return false;
            }
        }
        return true;
    }

    private static boolean isGameContinue(){
        System.out.println("Желаете продолжить игру? Да - 1, нет - 2.");
        int answer = scanner.nextInt();
        if (answer == 2) {
            System.out.println("Игра окончена!");
            return false;
        }
        if (answer == 1){
            System.out.println("Игра продолжается.");
            initField();
        }
        return true;
    }

    public static void main(String[] args) {
        int playerCount = 0;
        int aiCount = 0;

        initField();
        printField();

        while (true){
            playerTurn();
            printField();
            if (isCheckWin(playerDot)) {
                System.out.println("Вы выиграли!");
                playerCount++;
                if (playerCount == SERIES) System.out.println("Вы победили!!!");
                if (isGameContinue()) continue;
                break;
            }

            if (isFielFull()) {
                System.out.println("Ничья.");
                if (isGameContinue()) continue;
                break;
            }

            aiTurn();
            printField();
            if (isCheckWin(aiDot)) {
                System.out.println("Выиграл компьютер!");
                aiCount++;
                if (aiCount == SERIES) System.out.println("Победил компьютер.");
                if (isGameContinue()) continue;
                break;
            }

            if (isFielFull()) {
                System.out.println("Ничья.");
                if (isGameContinue()) continue;
                break;
            }
        }
    }
}