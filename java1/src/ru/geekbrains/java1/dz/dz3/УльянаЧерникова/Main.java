package ru.geekbrains.java1.dz.dz3.УльянаЧерникова;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by I_V_Zhukov on 10.05.2016.
 */
public class Main {
    //public static void main(String[] args) {
    private static final int SIZE = 5;
    static char[][] field = new char[SIZE][SIZE];
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
            System.out.println("Введите координаты в формате X Y (1 - 5)");
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
        if (x < 0 || x > 4 || y < 0 || y > 4) return false;
        if (field[x][y] == emptyDot) return true;
        return false;
    }

    // Опредление победителя  через циклы.
    private static boolean isCheckWin(char x0) {
        int sum1, sum2;
        sum1 = sum2 = 0;

      /* if (field[0][0] == x0 && field[0][1] == x0 && field[0][2] == x0) return true;
        if (field[1][0] == x0 && field[1][1] == x0 && field[1][2] == x0) return true;
        if (field[2][0] == x0 && field[2][1] == x0 && field[2][2] == x0) return true;
        if (field[0][0] == x0 && field[1][0] == x0 && field[2][0] == x0) return true;
        if (field[0][1] == x0 && field[1][1] == x0 && field[2][1] == x0) return true;
        if (field[0][2] == x0 && field[1][2] == x0 && field[2][2] == x0) return true;
        if (field[0][0] == x0 && field[1][1] == x0 && field[2][2] == x0) return true;
        if (field[2][0] == x0 && field[1][1] == x0 && field[0][2] == x0) return true;
        return false;*/
        for (int i = 0; i < SIZE - 1; i++) {

            for (int j = 0; j < SIZE - 1; j++) {
                if (field[i][j] == x0) {
                    sum1 = sum1 + 1;
                } else sum1 = 0;
            }
            if (sum1 > 3) return true;
            sum1 = 0;

        }
        for (int j = 0; j < SIZE - 1; j++) {

            for (int i = 0; i < SIZE - 1; i++) {
                if (field[i][j] == x0) {
                    sum2 = sum2 + 1;
                } else sum2 = 0;
            }
            if (sum2 > 3) return true;
            sum2 = 0;
        }
        int sum3 = 0;
        for (int i = 0; i < SIZE - 1; i++) {
            if (field[i][i] == x0) {
                sum3 = sum3 + 1;
            } else sum3 = 0;
        }
        if (sum3 > 3) return true;
        int sum4 = 0;
        int size = SIZE - 1;
        for (int i = 0; i < size; i++) {
            if (field[i][size - i] == x0) {
                sum4 = sum4 + 1;
            } else sum4 = 0;
        }
        if (sum4 > 3) return true;

        return false;
    }
// Интеллектуальный ход, к сожалению, не получилось сделать.
   /* private static void isIntelegentMove( char x0) {
        int sum1, sum2, ii, jj;
        sum1=sum2=ii=jj=0;
        for (int i = 0; i < SIZE - 1; i++) {

            for (int j = 0; j < SIZE - 1; j++) {
                while (sum1 <= 2) {
                    if (field[i][j] == x0) {
                        sum1 = sum1 + 1;
                    } else sum1 = 0;
                }

                    switch (j) {
                        case (1):
                            aiTurn(i, j + 1);
                            break;
                        case (2):
                            aiTurn(i, j + 2);
                            break;
                        case (3):
                            aiTurn(i, j - 2);
                            break;
                        case (4):
                            aiTurn(i, j - 2);
                            break;

                    }

                break;
            }


            sum1 = 0;

        }
        for (int j = 0; j < SIZE - 1; j++) {

            for (int i = 0; i < SIZE - 1; i++) {
                while (sum2 <= 2)
                    if (field[i][j] == x0) {
                        sum2 = sum2 + 1;
                    } else sum2 = 0;

                    switch (i) {
                        case (1):
                            aiTurn(i + 1, j);
                            break;
                        case (2):
                            aiTurn(i + 1, j);
                            break;
                        case (3):
                            aiTurn(i - 2, j);
                            break;
                        case (4):
                            aiTurn(i - 2, j);
                            break;

                    }

                break;
            }
            sum2 = 0;
        }
        int sum3 = 0;
        for (int i = 0; i < SIZE - 1; i++) {
            while (sum3 <= 2) {
                if (field[i][i] == x0) {
                    sum3 = sum3 + 1;
                } else sum3 = 0;
            }

                switch (i) {
                    case (1):
                        aiTurn(i + 1, i + 1);
                        break;
                    case (2):
                        aiTurn(i + 1, i + 1);
                        break;
                    case (3):
                        aiTurn(i - 2, i - 2);
                        break;
                    case (4):
                        aiTurn(i - 2, i - 2);
                        break;
                }

            break;

        }


        int sum4 = 0;
        int size = SIZE - 1;
        for (int i = 0; i < size; i++) {
            while (sum4 <= 2) {
                if (field[i][size - i] == x0) {
                    sum4 = sum4 + 1;
                } else sum4 = 0;

            }

                switch (i) {
                    case (1):
                        aiTurn(i + 1, size - i - 1);
                        break;
                    case (2):
                        aiTurn(i + 1, size - i - 1);
                        break;
                    case (3):
                        aiTurn(i - 2, size - i + 2);
                        break;
                    case (4):
                        aiTurn(i - 2, size - i + 2);
                        break;

                }

            break;


        } if (ii>0 & jj>0 & ii<SIZE & jj<SIZE){
        aiTurn(ii, jj);
            ii++;
            jj++;}


    }*/

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
                System.out.println("победил комп");
                break;
            }
            if (isFieldFull()) {
                System.out.println("ничья");
                break;
            }
        }

        // }
    }
}