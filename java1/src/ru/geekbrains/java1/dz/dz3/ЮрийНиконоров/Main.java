package ru.geekbrains.java1.dz.dz3.ЮрийНиконоров;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by I_V_Zhukov on 10.05.2016.
 */
public class Main {
    // Игра X и 0
    private static final int SIZE = 5; // размер поля 5х5
    private static final int sWin = 4; // серия клеток для победы = 4
    private static char[][] field = new char[SIZE][SIZE]; // массив для хранения состояния ячейки игрового поля
    private static char fieldEmpty = '·';
    private static char fieldAI;
    private static char fieldHuman;
    private static Random random = new Random();
    private static Scanner sc = new Scanner(System.in);
    private static boolean isFirstHuman;

    // Опрделяем чей первый ход и кто играет за "Х"
    public static void rndFirstHuman() {
        isFirstHuman = random.nextBoolean();
        if (isFirstHuman) {
            System.out.println("Первым ходит человек");
            fieldHuman = 'X';
            fieldAI = 'O';
        } else {
            System.out.println("Первым ходит компьютер");
            fieldHuman = 'O';
            fieldAI = 'X';
        }
    }

    public static void printField() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.print(field[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void initField() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                field[i][j] = fieldEmpty;
            }

        }
    }

    public static boolean isDrawGame() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (field[i][j] == fieldEmpty) return false;
            }
        }
        return true;
    }

    public static boolean isCellFull(int x, int y) {
        if (field[x][y] == fieldEmpty) return false;
        return true;
    }

    public static void turnHuman() {
        int x, y;
        do {
            System.out.print("Человек ходит, введите номер строки:");
            x = sc.nextInt();
            System.out.print("Введите номер столбца:");
            y = sc.nextInt();

        } while (x > SIZE || y > SIZE || x < 1 || y < 1 || isCellFull(x-1, y-1));
        field[x-1][y-1] = fieldHuman;
    }

    public static boolean isWinGame(char f) {
        for (int k = 0; k <= SIZE-sWin; k++) {
            for (int j = 0; j < SIZE; j++) {

                for (int i = 0, z = 0; i < sWin; i++) {
                    if (field[i+k][j] == f) z++;
                    if (z == sWin) return true;
                }

                for (int i = 0, z = 0; i < sWin; i++) {
                    if (field[j][i+k] == f) z++;
                    if (z == sWin) return true;
                }
            }

            for (int p = 0; p <= (SIZE - sWin); p++) {

                for (int i = 0, z = 0; i < sWin; i++) {
                    if (field[i+p][sWin-i-1+k] == f) z++;
                    if (z == sWin) return true;
                }
                for (int i = 0, z = 0; i < sWin; i++) {
                    if (field[i+p][i+k]  == f) z++;
                    if (z == sWin) return true;
                }
            }
        }
        return false;
    }

    public static void turnAI(){
        int x, y;
        System.out.print("Компьютер ходит:");
        do {
            x = random.nextInt(SIZE);
            y = random.nextInt(SIZE);
        } while (isCellFull(x, y));
        field[x][y] = fieldAI;
        x++;
        y++;
        System.out.println(x + ", " + y);
    }

    public static void main(String[] args) {
        initField();
        printField();
        rndFirstHuman();
        while (true) {
            if (isFirstHuman) {
                turnHuman();
                printField();
                if (isWinGame(fieldHuman)) {
                    System.out.println(">> Человек выйграл!");
                    break;
                }
                if (isDrawGame()) {
                    System.out.println(">> Ничья!");
                    break;
                }
                turnAI();
                printField();
                if (isWinGame(fieldAI)) {
                    System.out.println(">> Компьютер выйграл!");
                    break;
                }
                if (isDrawGame()) {
                    System.out.println(">> Ничья!");
                    break;
                }
            }
            else {
                turnAI();
                printField();
                if (isWinGame(fieldAI)) {
                    System.out.println(">> Компьютер выйграл!");
                    break;
                }
                if (isDrawGame()) {
                    System.out.println(">> Ничья!");
                    break;
                }
                turnHuman();
                printField();
                if (isWinGame(fieldHuman)) {
                    System.out.println(">> Человек выйграл!");
                    break;
                }
                if (isDrawGame()) {
                    System.out.println(">> Ничья!");
                    break;
                }

            }

        }


    }
}