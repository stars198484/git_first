package ru.geekbrains.java1.dz.dz3.РусланУстиц;
import java.util.Random;
import java.util.Scanner;
/**
 * Created by I_V_Zhukov on 10.05.2016.
 */
public class Main {
    private static final int SIZE = 5;
    private static final int WIN_SIZE = 4;
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

    private static void setField(int x, int y, char symbol) {
        field[x][y] = symbol;
    }

    private static Boolean isEmpty(int x, int y) {
        if (field[x][y] == emptyDot) return true;
        return false;
    }

    private static Boolean isFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (field[i][j] == emptyDot) return false;
            }
        }
        return true;
    }

    private static Boolean isWin(char symbol) {
        int horizWin = 0;
        int vertWin = 0;
        int diagWin = 0; // главная диагональ + выше
        int diagWin2 = 0; // обратная диагональ + выше
        int diagWin3 = 0; // главная диагональ + ниже
        int diagWin4 = 0; // обратная диагональ + ниже

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                // Случай с горизонталью
                if (field[i][j] == symbol)
                    horizWin++;
                else if (field[i][j] != symbol)
                    horizWin = 0;
                // Случай для вертикали
                if (field[j][i] == symbol)
                    vertWin++;
                else if (field[j][i] != symbol)
                    vertWin = 0;
                // Случай для диагоналей
                if (j + i < SIZE && field[j][j + i] == symbol)
                    diagWin++;
                else if (j + i < SIZE && field[j][j + i] != symbol)
                    diagWin = 0;

                if (j + i < SIZE && field[j + i][j] == symbol)
                    diagWin3++;
                else if (j + i < SIZE && field[j + i][j] != symbol)
                    diagWin3 = 0;

                if (SIZE - i - j > 0 && field[j][SIZE - 1 - j - i] == symbol)
                    diagWin2++;
                else if (SIZE - i - j > 0 && field[j][SIZE - 1 - j - i] != symbol)
                    diagWin2 = 0;

                if (SIZE - i - j > 0 && field[j + i][SIZE - 1 - j] == symbol)
                    diagWin4++;
                else if (SIZE - i - j > 0 && field[j + i][SIZE - 1 - j] != symbol)
                    diagWin4 = 0;

                if (vertWin == WIN_SIZE || horizWin == WIN_SIZE || diagWin == WIN_SIZE || diagWin2 == WIN_SIZE || diagWin3 == WIN_SIZE || diagWin4 == WIN_SIZE)
                    return true;
            }
            horizWin = 0;
            vertWin = 0;
            diagWin = 0;
            diagWin2 = 0;
            diagWin3 = 0;
            diagWin4 = 0;
        }

        return false;
    }

    private static void playerTurn() {
        int x;
        int y;
        do {
            System.out.println("Введите x и y:");
            x = scanner.nextInt();
            y = scanner.nextInt();
        } while (!isEmpty(x - 1, y - 1));
        setField(x - 1, y - 1, playerDot);
    }

    private static void aiTurn() {
        int x;
        int y;
        int[] xy;
        do {
            xy = aiDecision();
            x = xy[0];
            y = xy[1];

        } while (!isEmpty(x, y));
        setField(x, y, aiDot);
    }

    private static int[] aiDecision() {
        int[] xy = new int[2];
        // Привносим в интеллект компьютера элемент рандома
        // Если значение < 2 - выставляются произвольные значения на поле
        // В иных случаях рассчитываем ситуацию игрока на поле
        int decision = random.nextInt(10);
        if (decision < 2) {
            xy[0] = random.nextInt(SIZE);
            xy[1] = random.nextInt(SIZE);
        } else {
            int[] rowsSumPlayer = getRowsSum(playerDot);
            int[] columnsSumPlayer = getColumnsSum(playerDot);

            int maxIndexXPlayer = getMaxSumIndex(rowsSumPlayer);
            int maxIndexYPlayer = getMaxSumIndex(columnsSumPlayer);
            int maxRowSumPlayer = rowsSumPlayer[maxIndexXPlayer];
            int maxColumnSumPlayer = columnsSumPlayer[maxIndexYPlayer];

            if (maxRowSumPlayer > maxColumnSumPlayer) {
                int[] rowsSumAI = getRowsSum(aiDot);
                // Если в строке может быть достигнута победа игроком
                if (rowsSumAI[maxIndexXPlayer] <= SIZE - WIN_SIZE) {
                    xy[0] = maxIndexXPlayer;
                    xy[1] = random.nextInt(SIZE);
                } else { // если уже не может то переходим к другим действиям
                    xy[0] = getMaxSumIndex(rowsSumAI);
                    xy[1] = random.nextInt(SIZE);
                }
            } else if (maxRowSumPlayer < maxColumnSumPlayer) {
                int[] columnsSumAI = getColumnsSum(aiDot);
                // Если в столбце может быть достигнута победа игроком
                if (columnsSumAI[maxIndexYPlayer] <= SIZE - WIN_SIZE) {
                    xy[0] = random.nextInt(SIZE);
                    xy[1] = maxIndexYPlayer;
                } else { // если уже не может то переходим к другим действиям
                    xy[0] = random.nextInt(SIZE);
                    xy[1] = getMaxSumIndex(columnsSumAI);
                }
            } else {
                if (decision <= 5) {
                    xy[0] = maxIndexXPlayer;
                    xy[1] = random.nextInt(SIZE);
                } else {
                    xy[0] = random.nextInt(SIZE);
                    xy[1] = maxIndexYPlayer;
                }
            }
        }

        return xy;
    }

    private static int getMaxSumIndex(int[] array) {
        int max = 0;
        int maxIndex = 0;
        for (int i = 0; i < SIZE; i++) {
            if (array[i] > max) {
                max = array[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    private static int[] getRowsSum(char symbol) {
        int[] rowsSum = new int[SIZE];
        for (int i = 0; i < SIZE; i++) {
            rowsSum[i] = getRowSum(i, symbol);
        }
        return rowsSum;
    }

    private static int getRowSum(int rowIndex, char symbol) {
        int rowSum = 0;
        for (int i = 0; i < SIZE; i++) {
            if (field[rowIndex][i] == symbol)
                rowSum++;
        }
        return rowSum;
    }

    private static int[] getColumnsSum(char symbol) {
        int[] columnsSum = new int[SIZE];
        for (int i = 0; i < SIZE; i++) {
            columnsSum[i] = getColumnSum(i, symbol);
        }
        return columnsSum;
    }

    private static int getColumnSum(int columnIndex, char symbol) {
        int columnSum = 0;
        for (int i = 0; i < SIZE; i++) {
            if (field[i][columnIndex] == symbol)
                columnSum++;
        }
        return columnSum;
    }

    public static void main(String[] args) {
        initField();
        printField();

        while (true) {
            playerTurn();
            printField();

            if (isWin(playerDot)) {
                System.out.println("Human");
                break;
            }

            if (isFull()) {
                System.out.println("Ничья");
                break;
            }

            aiTurn();
            printField();

            if (isWin(aiDot)) {
                System.out.println("AI");
                break;
            }

            if (isFull()) {
                System.out.println("Ничья");
                break;
            }
        }
    }
}
