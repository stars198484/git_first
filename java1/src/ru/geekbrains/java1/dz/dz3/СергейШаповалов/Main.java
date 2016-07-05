package ru.geekbrains.java1.dz.dz3.СергейШаповалов;
import java.util.Random;
import java.util.Scanner;
/**
 * Created by I_V_Zhukov on 10.05.2016.
 */
public class Main {
    static char[][] field = new char[5][5];
    static final char playerDot = 'X';
    static final char aiDot = 'O';
    static final char emptyDot = '*';
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        initField();
        printField();

        while (true) {
            playerTurn();
            printField();
            if (isFieldFull()) {
                System.out.println("Ничья");
                break;
            }
            if(checkWin(playerDot)) {
                System.out.println("Победил человек");
                break;
            }
            aiTurn();
            printField();
            if (isFieldFull()) {
                System.out.println("Ничья");
                break;
            }
            if(checkWin(aiDot)) {
                System.out.println("Победил компьютер");
                break;
            }
        }
    }

    public static boolean checkWin(char _xo) {
// Проверка всех горизонталей
        if (field[0][0] == _xo && field[0][1] == _xo && field[0][2] == _xo && field[0][3] == _xo && field[0][4] == _xo) return true;
        if (field[1][0] == _xo && field[1][1] == _xo && field[1][2] == _xo && field[0][3] == _xo && field[0][4] == _xo) return true;
        if (field[2][0] == _xo && field[2][1] == _xo && field[2][2] == _xo && field[0][3] == _xo && field[0][4] == _xo) return true;
        if (field[3][0] == _xo && field[3][1] == _xo && field[3][2] == _xo && field[0][3] == _xo && field[0][4] == _xo) return true;
        if (field[4][0] == _xo && field[4][1] == _xo && field[4][2] == _xo && field[0][3] == _xo && field[0][4] == _xo) return true;
// Проверка всех вертикалей
        if(field[0][0] == _xo && field[1][0] == _xo && field[2][0] == _xo && field[3][0] == _xo && field[4][0] == _xo) return true;
        if(field[0][1] == _xo && field[1][1] == _xo && field[2][1] == _xo && field[3][1] == _xo && field[4][1] == _xo) return true;
        if(field[0][2] == _xo && field[1][2] == _xo && field[2][2] == _xo && field[3][2] == _xo && field[4][2] == _xo) return true;
        if(field[0][3] == _xo && field[1][3] == _xo && field[2][3] == _xo && field[3][3] == _xo && field[4][3] == _xo) return true;
        if(field[0][4] == _xo && field[1][4] == _xo && field[2][4] == _xo && field[3][4] == _xo && field[4][4] == _xo) return true;
// Проверка двух диагоналей
        if(field[0][0] == _xo && field[1][1] == _xo && field[2][2] == _xo && field[3][3] == _xo && field[4][4] == _xo) return true;
        if(field[4][0] == _xo && field[3][1] == _xo && field[2][2] == _xo && field[1][3] == _xo && field[0][4] == _xo) return true;

        return false;

    }

    public static boolean isFieldFull() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (field[i][j] == '*') return false;

            }

        }
        return true;

    }

    public static void initField() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                field[i][j] = '*';

            }

        }

    }

    public static void printField() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(field[i][j] + " ");

            }
            System.out.println();

        }
        System.out.println();

    }

    public static void setXO(int _x, int _y, char _xo) {
        field[_y][_x] = _xo;

    }

    public static boolean isCellEmpty
            (int _x, int _y) {
        if(_x<0 || _y<0 || _x > 2 || _y > 2) return false;
        if(field[_y][_x] == '*') return true;
        return false;

    }

    public static void playerTurn() {
        int x, y;

        do {
            System.out.println("Введите координаты в формате X Y (1-5)");

            x = sc.nextInt();

            y = sc.nextInt();

        }

        while (!isCellEmpty(x- 1,y- 1));
        setXO(x- 1,y- 1, playerDot);

    }
    static Random rand = new Random();
    public static void aiTurn() {
        int x, y;

        do {
            x = rand.nextInt(5);

            y = rand.nextInt(5);
        } while (!isCellEmpty(x,y));
        setXO(x,y, aiDot);

    }
}
