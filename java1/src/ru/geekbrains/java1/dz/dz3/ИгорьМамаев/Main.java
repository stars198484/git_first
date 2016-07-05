package ru.geekbrains.java1.dz.dz3.ИгорьМамаев;
import java.util.Random;
import java.util.Scanner;
/**
 * Created by I_V_Zhukov on 10.05.2016.
 */
public class Main {

    private static final int SIZE = 3;
    private static final int TARGET=3; // количество клеток, которое надо занять для победы.
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
        int x;
        int y;
        do {
            System.out.println("Введите координаты в формате X Y (1-" + SIZE + ")");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } while (!isCellEmpty(x, y));
        setX0(x, y, playerDot);
    }

    private static boolean isCellEmpty(int x, int y) {

        if (x < 0 || x > SIZE - 1 || y < 0 || y > SIZE - 1) return false;
        if (field[x][y] == emptyDot) {
            return true;
        }
        return false;
    }

    /*
    метод ищет последовательности dot по строкам, столбцам и диагоналям длиной TARGET-1. Если находит,
    то заполняет aiDot свободное место на этой строке (столбце, диагонали) и возвращает true, иначе false
    Если передан playerDot, то таким образом блокирует ход
    сли передан aiDot, то завершает последовательность.

     */
    private static boolean findGoodMove(char dot) {
        int count;

        for (int i = 0; i < SIZE; i++) {
            count = 0;
            for (int j = 0; j < SIZE; j++) {
                if (field[i][j] == dot) count += 1;
            }

            if (count == TARGET-1) {
                for (int j = 0; j < SIZE; j++) {
                    if (isCellEmpty(i, j)) {
                        setX0(i, j, aiDot);
                        return true;
                    }
                }
            }
        }

        for (int j = 0; j < SIZE; j++) {
            count = 0;
            for (int i = 0; i < SIZE; i++) {
                if (field[i][j] == dot) count += 1;
            }
            if (count == TARGET-1) {
                for (int i = 0; i < SIZE; i++) {
                    if (isCellEmpty(i, j)) {
                        setX0(i, j, aiDot);
                        return true;
                    }
                }
            }
        }

        count = 0;
        for (int i = 0, j = 0; i < SIZE; i++, j++) {
            if (field[i][j] == dot) count += 1;
        }
        if (count == TARGET-1) {
            for (int i = 0, j = 0; i < SIZE; i++, j++) {
                if (isCellEmpty(i, j)) {
                    setX0(i, j, aiDot);
                    return true;
                }
            }
        }

        count = 0;
        for (int i = 0, j = SIZE - 1; i < SIZE; i++, j--) {
            if (field[i][j] == dot) count += 1;
        }
        if (count == TARGET - 1) {
            for (int i = 0, j = SIZE - 1; i < SIZE; i++, j--) {

                if (isCellEmpty(i, j)) {
                    setX0(i, j, aiDot);
                    return true;
                }
            }
        }
        return false;
    }

    private static void aiTurn() {
        int x;
        int y;

        if (findGoodMove(aiDot)) return;
        if (findGoodMove(playerDot)) return;


        do {
            x = random.nextInt(SIZE);
            y = random.nextInt(SIZE);
        } while (!isCellEmpty(x, y));
        setX0(x, y, aiDot);


    }

    private static boolean isCheckWin(char x0) {


        int count;
        for (int i = 0; i < SIZE; i++) {
            count = 0;
            for (int j = 0; j < SIZE; j++) {
                if (field[i][j] == x0) count += 1;
            }
            if (count >= TARGET) return true;
        }

        for (int j = 0; j < SIZE; j++) {
            count = 0;
            for (int i = 0; i < SIZE; i++) {
                if (field[i][j] == x0) count += 1;
            }
            if (count >= TARGET) return true;
        }

        count = 0;
        for (int i = 0, j = 0; i < SIZE; i++, j++) {
            if (field[i][j] == x0) count += 1;
        }
        if (count >= TARGET) return true;

        count = 0;
        for (int i = 0, j = SIZE - 1; i < SIZE; i++, j--) {
            if (field[i][j] == x0) count += 1;
        }
        if (count >= TARGET) return true;
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
                System.out.println("Вы победили");
                break;
            }
            if (isFieldFull()) {
                System.out.println("Ничья");
                break;
            }
            aiTurn();
            printField();
            if (isCheckWin(aiDot)) {
                System.out.println("Победил компьютер");
                break;
            }
            if (isFieldFull()) {
                System.out.println("Ничья");
                break;
            }


        }
    }
}
