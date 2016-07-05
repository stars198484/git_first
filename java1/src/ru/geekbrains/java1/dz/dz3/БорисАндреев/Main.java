package ru.geekbrains.java1.dz.dz3.БорисАндреев;
import java.util.Random;
import java.util.Scanner;
/**
 * Created by I_V_Zhukov on 10.05.2016.
 */
public class Main {
    private static final int SIZE = 5; // размер поля

    private static final int LINE = 4; //длина выйгрышной линии

    private static final char playerDot = 'X';

    private static final char aiDot = 'O';

    private static final char emptyDot = '*';

    private static char[][] field = new char[SIZE][SIZE];

    private static Scanner scanner = new Scanner(System.in);

    private static Random random = new Random(SIZE - 1);

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

    private static boolean isEmptyCells() {

        for (int i = 0; i < SIZE; i++) {

            for (int j = 0; j < SIZE; j++) {

                if (field[i][j] == emptyDot) return true;

            }

        }

        return false;

    }

    private static void setX0(int x, int y, char dot) {

        field[x][y] = dot;

    }

    private static void player1Turn() {

        int x, y;

        do {

            System.out.println("vvedite koordinaty krestika v vide X Y");

            x = scanner.nextInt() - 1;

            y = scanner.nextInt() - 1;

        } while (!isCellEmpty(x, y));

        setX0(x, y, playerDot);

    }

// private static void player2Turn() {

// int x, y;

// do {

// System.out.println("vvedite koordinaty krestika v vide X Y");

// x = scanner.nextInt() - 1;

// y = scanner.nextInt() - 1;

// } while (!isCellEmpty(x, y));

// setX0(x, y, aiDot);

//}

    private static void aiRandomTurn() {

        int x, y;

        do {

            x = random.nextInt(SIZE);

            y = random.nextInt(SIZE);

        } while (!isCellEmpty(x, y));

        setX0(x, y, aiDot);

    }

// private static void aiTurnX() {

// int x, y;

// do {

// x = random.nextInt(SIZE);

// y = random.nextInt(SIZE);

// } while (!isCellEmpty(x, y));

// setX0(x, y, playerDot);

// }

    private static boolean isCellEmpty(int x, int y) {

        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) return false;

        if (field[x][y] != emptyDot) return false;

        return true;

    }

    private static boolean isWin(char x) {

//проверяем горизонтали

        for (int i = 0; i < SIZE; i++) {

            for (int j = 0; j < SIZE - LINE + 1; j++) {

                char[] line = new char[LINE];

                int l = 0;

                for (int k = 0; k < LINE; k++) {

                    line[k] = field[i][j + k];

                    if (line[k] == x) l++;

                }

                if (l == LINE) return true;

            }

        }

//проверяем вертикали

        for (int j = 0; j < SIZE; j++) {

            for (int i = 0; i < SIZE - LINE + 1; i++) {

                char[] line = new char[LINE];

                int l = 0;

                for (int k = 0; k < LINE; k++) {

                    line[k] = field[i + k][j];

                    if (line[k] == x) l++;

                }

                if (l == LINE) return true;

            }

        }

//проверяем диагонали \

        for (int i = 0; i < SIZE - LINE + 1; i++) {

            for (int j = 0; j < SIZE - LINE + 1; j++) {

                char[] line = new char[LINE];

                int l = 0;

                for (int k = 0; k < LINE; k++) {

                    line[k] = field[i + k][j + k];

                    if (line[k] == x) l++;

                }

                if (l == LINE) return true;

            }

        }

//проверяем диагонали /

        for (int i = 0; i < SIZE - LINE + 1; i++) {

            for (int j = SIZE - 1; j > LINE - 2; j--) {

                char[] line = new char[LINE];

                int l = 0;

                for (int k = 0; k < LINE; k++) {

                    line[k] = field[i + k][j - k];

                    if (line[k] == x) l++;

                }

                if (l == LINE) return true;

            }

        }

        return false;

    }

    private static boolean aiBlockTurn(int DELTA) {

//проверяем горизонтали
        for (int i = 0; i < SIZE; i++) {

            int x = 0, y = 0;

            for (int j = 0; j < SIZE - LINE + 1; j++) {

                char[] line = new char[LINE];

                int l = 0;

                for (int k = 0; k < LINE; k++) {

                    line[k] = field[i][j + k];

                    if (line[k] == playerDot) {

                        l++;

                    } else {

                        x = i;

                        y = j + k;

                    }

                }

                if (l == LINE - DELTA && field[x][y] != aiDot) {

                    setX0(x, y, aiDot);

                    System.out.println("Blocked!!!");

                    return true;

                }

            }

            System.out.println();

        }

//проверяем вертикали

        for (int j = 0; j < SIZE; j++) {

            int x = 0, y = 0;

            for (int i = 0; i < SIZE - LINE + 1; i++) {

                char[] line = new char[LINE];

                int l = 0;

                for (int k = 0; k < LINE; k++) {

                    line[k] = field[i + k][j];

                    if (line[k] == playerDot) {

                        l++;

                    } else {

                        x = i + k;

                        y = j;

                    }

                }

                if (l == LINE - DELTA && field[x][y] != aiDot) {

                    setX0(x, y, aiDot);

                    System.out.println("Blocked!!!");

                    return true;

                }

            }

        }

//проверяем диагонали \

        for (int i = 0; i < SIZE - LINE + 1; i++) {

            int x = 0, y = 0;

            for (int j = 0; j < SIZE - LINE + 1; j++) {

                char[] line = new char[LINE];

                int l = 0;

                for (int k = 0; k < LINE; k++) {

                    line[k] = field[i + k][j + k];

                    if (line[k] == playerDot) l++;

                    else {

                        x = i + k;

                        y = j + k;

                    }

                }

                if (l == LINE - DELTA && field[x][y] != aiDot) {

                    setX0(x, y, aiDot);

                    System.out.println("Blocked!!!");

                    return true;

                }

            }

        }

//проверяем диагонали /

        for (int i = 0; i < SIZE - LINE + 1; i++) {

            int x = 0, y = 0;

            for (int j = SIZE - 1; j > LINE - 2; j--) {

                char[] line = new char[LINE];

                int l = 0;

                for (int k = 0; k < LINE; k++) {

                    line[k] = field[i + k][j - k];

                    if (line[k] == playerDot) l++;

                    else {

                        x = i + k;

                        y = j - k;

                    }

                }

                if (l == LINE - DELTA && field[x][y] != aiDot) {

                    setX0(x, y, aiDot);

                    System.out.println("Blocked!!!");

                    return true;

                }

            }

        }

        return false;

    }

    public static void main(String[] args) {

        int DELTA=1;

        if (SIZE>LINE) DELTA=2;// требуется блокировка с двух сторон. Иначе достаточно блокировать с одной стороны

        initField();

        printField();

// while (!isWin(playerDot) || !isWin(aiDot)) {

        while (true) {

            player1Turn();

            printField();

            if (isWin(playerDot)) {

                System.out.println("pobeda igroka");

                printField();

                break;

            }

            if (!isEmptyCells()) {

                System.out.println("ni4'ya");

                printField();

                break;

            }

            if (!aiBlockTurn(DELTA)) aiRandomTurn();

            printField();

            if (isWin(aiDot)) {

                System.out.println("pobeda kompa");

                printField();

                break;

            }

        }

    }

}
