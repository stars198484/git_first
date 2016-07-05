package ru.geekbrains.java1.dz.dz3.АндрейСуслов;
import java.util.Random;
import java.util.Scanner;
/**
 * Created by I_V_Zhukov on 10.05.2016.
 */
public class Main {
    private static final int feildSize = 5;
    private static final int winstring = 4;
    private static char[][] feild = new char[feildSize][feildSize];
    private static final char emptyDot = '*';
    private static char playerDot = 'X';
    private static char aiDot = 'O';
    private static Scanner sc = new Scanner(System.in);
    private static Random random = new Random();

    private static void createFeild() {
        for (int i = 0; i < feildSize; i++) {
            for (int j = 0; j < feildSize; j++) {
                feild[i][j] = emptyDot;
            }
        }
    }

    public static void playerTurn() {
        while (true) {
            System.out.println("Введи каординаты клетки в формате X,Y (1-" + feildSize + ")");
            int i = sc.nextInt() - 1;
            int j = sc.nextInt() - 1;
            if (i < feildSize && i >= 0 && j < feildSize && j >= 0) {
                if (isEmptyDot(i, j)) {
                    feild[i][j] = playerDot;
                    return;
                } else {
                    System.out.println("Данное поле уже занято введите другое");
                }
            } else {
                System.out.println("Вы ввели не верные каординаты повторите ввод");
            }

        }

    }

    private static boolean checkWin() {
        if (checWinHorizont(playerDot)) {
            System.out.println("Победил игрок");
            return true;
        }
        if (checWinHorizont(aiDot)) {
            System.out.println("Победил компьютер");
            return true;
        }
        if (checWinVertical(playerDot)) {
            System.out.println("Победил игрок");
            return true;
        }
        if (checWinVertical(aiDot)) {
            System.out.println("Победил компьютер");
            return true;
        }
        if (checWinCross(playerDot,1)) {
            System.out.println("Победил игрок");
            return true;
        }
        if (checWinCross(aiDot,1)) {
            System.out.println("Победил компьютер");
            return true;
        }
        if (checWinCross(playerDot,-1)) {
            System.out.println("Победил игрок");
            return true;
        }
        if (checWinCross(aiDot,-1)) {
            System.out.println("Победил компьютер");
            return true;
        }
        return false;
    }

    public static void aiTurn() {
// Искуственный инетелект реализовать не удалось
        int x, y;
        do {
            x = random.nextInt(feildSize);
            y = random.nextInt(feildSize);
        } while (!isEmptyDot(x, y));
        feild[x][y]= aiDot;
    }

    public static boolean isEmptyDot(int i, int j) {
        if (feild[i][j] == emptyDot) {
            return true;
        }
        return false;
    }

    public static boolean checWinHorizont(char dot) {

        for (int i = 0; i < feildSize; i++) {
            for (int j = 0; j < feildSize; j++) {
                int dotseq = 0;
                for (int k = 0; k < winstring; k++) {
                    if (i + k < feildSize) {
                        if (feild[i + k][j] == dot) {
                            dotseq += 1;
                        }
                        if (dotseq == winstring) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;

    }

    public static boolean checWinVertical(char dot) {

        for (int i = 0; i < feildSize; i++) {
            for (int j = 0; j < feildSize; j++) {
                int dotseq = 0;
                for (int k = 0; k < winstring; k++) {
                    if (j + k < feildSize) {
                        if (feild[i][j + k] == dot) {
                            dotseq += 1;
                        }
                        if (dotseq == winstring) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;

    }

    public static boolean checWinCross(char dot,int mod) {

        for (int i = 0; i < feildSize; i++) {
            for (int j = 0; j < feildSize; j++) {
                int dotseq = 0;
                for (int k = 0; k < winstring; k++) {
                    int mod1 = k *mod;
                    if (j + mod1 >=0 && j + mod1 < feildSize && i+k <feildSize) {
                        if (feild[i+k][j + mod1] == dot) {
                            dotseq += 1;
                        }
                        if (dotseq == winstring) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;

    }

    public static boolean isFeildFull() {

        for (int i = 0; i < feildSize; i++) {
            for (int j = 0; j < feildSize; j++) {
                if (feild[i][j] == emptyDot) {
                    return false;
                }
            }
        }
        System.out.println("Ничья");
        return true;
    }

    private static void showFeild() {
        for (int i = 0; i < feildSize; i++) {
            for (int j = 0; j < feildSize; j++) {
                System.out.print(feild[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        createFeild();
        while (!isFeildFull())  {
            showFeild();
            playerTurn();
            if (checkWin()) {
                showFeild();  return;
            }
            aiTurn();
            if (checkWin()) {
                showFeild();  return;
            }
        }
    }
}
