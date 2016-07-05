package ru.geekbrains.java1.dz.dz3.АлександрРублевский;
import java.util.Scanner;
/**
 * Created by I_V_Zhukov on 10.05.2016.
 */
public class Main {

    public static void main(String[] args) {
        printField();
        while (check() == ' ' && isMove()) {
            hmMove();
            aiMove();
            printField();
        }
        if (check() == 'X') {
            System.out.println("You win.");
        }
        if (check() == '0') {
            System.out.println("You lose.");
        }
        if (check() == ' ' && !isMove()) {
            System.out.println("Standoff.");
        }
    }

    public static char[][] field = { { '*', '*', '*' }, { '*', '*', '*' },
            { '*', '*', '*' } };

    public static void hmMove() {
        int x, y;
        do{
            System.out.println("Input number form 1 to 3:");
            @SuppressWarnings("resource")
            Scanner sc = new Scanner(System.in);
            x = sc.nextInt() - 1;
            System.out.println("Input number from 1 to 3:");
            y = sc.nextInt() - 1;

        } while (field[x][y] == '0' || field[x][y] == 'X' || x < 0 || x > 2 || y < 0 || y > 2);

        field[x][y] = 'X';

    }

    public static void aiMove() {

        int x = (int) (Math.random() * 3), y = (int) (Math.random() * 3);
        while (field[x][y] == '0' || field[x][y] == 'X') {
            x = (int) (Math.random() * 3);
            y = (int) (Math.random() * 3);
        }
        field[x][y] = '0';
    }

    public static boolean isMove() {
        boolean play = false;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (field[i][j] == '*') {
                    play = true;
                    break;
                }
            }
            if (play = true) {
                break;
            }
        }
        return play;
    }

    public static void printField() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(field[i][j]);
            }
            System.out.println();
        }
    }

    public static char check() {
        char win = ' ';
        for (int i = 0; i < 3; i++) {
            if (field[i][0] == field[i][1] && field[i][1] == field[i][2]
                    && field[i][0] != '*') {
                win = field[i][0];
                break;
            }
        }

        if (win == ' ') {
            for (int i = 0; i < 3; i++) {
                if (field[0][i] == field[1][i] && field[1][i] == field[2][i]
                        && field[0][i] != '*') {
                    win = field[0][i];
                    break;
                }
            }
        }

        if (win == ' ') {
            if (field[0][0] == field[1][1] && field[1][1] == field[2][2]
                    && field[0][0] != '*') {
                win = field[0][0];
            }
        }

        if (win == ' ') {
            if (field[0][2] == field[1][1] && field[1][1] == field[2][0]
                    && field[0][2] != '*') {
                win = field[0][2];
            }
        }
        return win;
    }

}
