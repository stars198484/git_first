package ru.geekbrains.java1.dz.dz3.ПавелМатвеев;
import java.util.Random;
import java.util.Scanner;
/**
 * Created by I_V_Zhukov on 10.05.2016.
 */
public class Main {

    private static final int SIZE = 3;
    private static final int OTHER_OPTION = 4;
    private static char[][] field = new char[SIZE][SIZE];
    private static final char emptyDot = '*';
    private static final char playerDot = 'X';
    private static final char aiDot = 'O';
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        init();
        printField();


        while (true) {
            playerGo();

            if (isCheckWin(playerDot, OTHER_OPTION)) {
                System.out.println("Победил человек!");
                break;
            }
            if (!isFieldFull()) {
                System.out.println("Ничья");
                init();
                printField();
                playerGo();
            }
            aiGo();
            if (isCheckWin(aiDot, OTHER_OPTION)) {
                System.out.println("Победил компьютер!");
                break;
            }
        }

    }

    private static boolean isCheckWin(char dot, int otherOption) {
        int counterX = 0;
        int counterY = 0;
        int counterXY = 0;
        int counterYX = 0;


        //Горизонталь
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (field[i][j] == dot) {
                    if (counterX == 0) {
                        counterX++;
                    } else if (field[i][j - 1] == dot) {
                        counterX++;
                    } else {
                        counterX = 0;
                    }
                }
                if (counterX == SIZE || counterX == otherOption) return true;
            }
            counterX = 0;
        }

        //Вертикаль
        for (int j = 0; j < SIZE; j++) {
            for (int i = 0; i < SIZE; i++) {
                if (field[i][j] == dot) {
                    if (counterY == 0) {
                        counterY++;
                    } else if (field[i - 1][j] == dot) {
                        counterY++;
                    } else {
                        counterY = 0;
                    }
                }
                if (counterY == SIZE || counterY == otherOption) return true;
            }
            counterY = 0;
        }

        //Диагональ
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE - i; j++) {
                if (field[i + j][j] == dot) {
                    if (counterXY == 0) {
                        counterXY++;
                    } else if (field[i + j - 1][j - 1] == dot) {
                        counterXY++;
                    } else {
                        counterXY = 0;
                    }
                }
                if (counterXY == SIZE || counterXY == otherOption) return true;
            }
            counterXY = 0;
        }
        //Диагональ
        for (int j = 0; j < SIZE; j++) {
            for (int i = 0; i < SIZE - j; i++) {
                if (field[i][i + j] == dot) {
                    if (counterXY == 0) {
                        counterXY++;
                    } else if (field[i - 1][i + j - 1] == dot) {
                        counterXY++;
                    } else {
                        counterXY = 0;
                    }
                }
                if (counterXY == SIZE || counterXY == otherOption) return true;
            }
            counterXY = 0;
        }


        //Обратная диагональ
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j <= i; j++) {
                if (field[i - j][j] == dot) {
                    if (counterYX == 0) {
                        counterYX++;
                    } else if (field[i - j + 1][j - 1] == dot) {
                        counterYX++;
                    } else {
                        counterYX = 0;
                    }
                }
                if (counterYX == SIZE || counterYX == otherOption) return true;
            }
            counterYX = 0;
        }


        //Обратная диагональ
        for (int j = 0; j < SIZE; j++) {
            for (int i = 0; i < SIZE - j; i++) {
                if (field[SIZE - 1 - i][i + j] == dot) {
                    if (counterYX == 0) {
                        counterYX++;
                    } else if (field[SIZE - 1 - i + 1][i + j - 1] == dot) {
                        counterYX++;
                    } else {
                        counterYX = 0;
                    }
                }
                if (counterYX == SIZE || counterYX == otherOption) return true;
            }
            counterYX = 0;
        }
        return false;
    }

    private static boolean isFieldFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (field[i][j] == emptyDot) return true;
            }
        }
        return false;
    }

    private static void aiGo() {
        int x, y;
        Random rand = new Random();
        do {
            x = rand.nextInt(SIZE);
            y = rand.nextInt(SIZE);
        } while (!isEmptyDot(x, y));
        setDot(x, y, aiDot);
        printField();
    }

    private static void playerGo() {
        int x, y;
        do {
            System.out.println("Введите координаты в формате X Y (1-" + SIZE + ")");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (!isEmptyDot(x, y));
        setDot(x, y, playerDot);
    }

    private static boolean isEmptyDot(int x, int y) {
        if (x < 0 || y < 0 || x >= SIZE || y >= SIZE) return false;
        if (field[y][x] == emptyDot) return true;
        return false;

    }

    private static void setDot(int x, int y, char dot) {
        field[y][x] = dot;
    }

    private static void printField() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.print(field[i][j] + "   ");
            }
            System.out.println(" ");
        }
    }

    private static void init() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                field[i][j] = emptyDot;
            }
        }
    }
}