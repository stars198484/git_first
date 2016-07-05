package ru.geekbrains.java1.dz.dz3.СтаниславОвчинников;
import java.util.Random;
import java.util.Scanner;
/**
 * Created by I_V_Zhukov on 10.05.2016.
 */
public class Main {
    private static final int SIZE = 5;
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
        int x, y;
        do {
            System.out.println("Введите координаты в формате Х У (1-"+SIZE+")");
            x = scanner.nextInt();
            y = scanner.nextInt();
        } while (!isCellEmpty(x - 1, y - 1));
        setX0(x - 1, y - 1, playerDot);
    }

    private static boolean isCellEmpty(int x, int y) {
        if (x < 0 || x > SIZE - 1 || y < 0 || y > SIZE - 1) return false;
        if (field[x][y] == '*') return true;
        return false;
    }

    private static void aiTurn() {
        int x = 0, y = 0;
        do {
            x = random.nextInt(SIZE);
            y = random.nextInt(SIZE);//первые ходы ИИ рандомно
            int playerDotNumD1 = 0, playerDotNumD2 = 0, aiDotNumD1 = 0, aiDotNumD2 = 0;//инициализация счетчиков
            for (int i = 0, j = SIZE - 1; i < SIZE; i++, j--) {//проверка диагоналей на ходы ИИ и игрока
                if (field[i][j] == aiDot) {
                    aiDotNumD1++;
                }
                if (field[i][i] == aiDot) {
                    aiDotNumD2++;
                }
                if (field[i][j] == playerDot) {
                    playerDotNumD1++;
                }
                if (field[i][i] == playerDot) {
                    playerDotNumD2++;
                }
            }
            for (int i = 0; i < SIZE; i++) {//условие установки хода ИИ для выигрыша по диагонали 2
                if(aiDotNumD2 == SIZE-1){
                    if(field[i][i]==emptyDot){
                        x=i; y=i;
                    }
                }
                if(playerDotNumD2 == SIZE-1){//условие установки хода ИИ перекрывать победу игрока по диагонали 2
                    if(field[i][i]==emptyDot){
                        x=i; y=i;
                    }
                }
            }
            if (aiDotNumD1 == SIZE-1) {//условие установки хода ИИ для выигрыша по диагонали 1
                for (int i = 0, j = SIZE - 1; i < SIZE; i++, j--) {
                    if (field[i][j] == emptyDot) {
                        x = i;
                        y = j;
                    }
                }
            }
            if (playerDotNumD1 == SIZE-1) {//условие установки хода ИИ перекрывать победу игрока по диагонали 1
                for (int i = 0, j = SIZE - 1; i < SIZE; i++, j--) {
                    if (field[i][j] == emptyDot) {
                        x = i;
                        y = j;
                    }
                }
            }
            for (int i = 0; i < SIZE; i++) {//проверка вертикали и горизонтали на ходы ИИ и игрока
                int playerDotNumG = 0, playerDotNumV = 0, aiDotNumG = 0, aiDotNumV = 0;//инициализация счетчиков ходов по вертикали и горизонтали
                for (int j = 0; j < SIZE; j++) {
                    if (field[i][j] == aiDot) {
                        aiDotNumG++;
                    }
                    if (field[j][i] == aiDot) {
                        aiDotNumV++;
                    }
                    if (field[i][j] == playerDot) {
                        playerDotNumG++;
                    }
                    if (field[j][i] == playerDot) {
                        playerDotNumV++;
                    }
                }
                if (aiDotNumV == SIZE - 1) {//условие для победы ИИ по вертикали
                    for (int k = 0; k < SIZE; k++) {
                        if (field[k][i] == emptyDot) {
                            x = k;
                            y = i;
                            break;
                        }
                    }
                }
                if (playerDotNumV == SIZE - 1) {//условие блокировки игрока по вертикали
                    for (int k = 0; k < SIZE; k++) {
                        if (field[k][i] == emptyDot) {
                            x = k;
                            y = i;
                            break;
                        }
                    }
                }
                if (aiDotNumG == SIZE - 1) {//условие для победы ИИ по горизонтали
                    for (int j = 0; j < SIZE; j++) {
                        if (field[i][j] == emptyDot) {
                            x = i;
                            y = j;
                        }
                    }
                }
                if (playerDotNumG == SIZE - 1) {//условие блокировки игрока по горизонтали
                    for (int j = 0; j < SIZE; j++) {
                        if (field[i][j] == emptyDot) {
                            x = i;
                            y = j;
                        }
                    }
                }

            }
        } while (!isCellEmpty(x, y));
        setX0(x, y, aiDot);

    }

    private static boolean isChekWin(char x0) {
        int numD1 = 0, numD2 = 0;
        for (int i = 0, j = SIZE - 1; i < SIZE; i++, j--) {
            if (field[i][j] == x0) {               //проверка диагонали 2
                numD2++;
            }
            if (field[i][i] == x0) {               //проверка диагонали 1
                numD1++;
            }
            if (numD1 == SIZE || numD2 == SIZE) return true;
        }
        for (int i = 0; i < SIZE; i++) {
            int numV = 0, numG = 0;
            for (int j = 0; j < SIZE; j++) {
                if (field[i][j] == x0) {         //проверка горизонтали
                    numG++;
                }
                if (field[j][i] == x0) {          //проверка вертикали
                    numV++;
                }
            }
            if (numG == SIZE || numV == SIZE) return true;
        }
        return false;                            //ни одно условие не сработало
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
        int counterVictoryPlayer = 0, counterVictoryAi = 0;
        System.out.println("Игра до 4 побед");
        do {
            initField();
            printField();
            while (true) {
                playerTurn();
                printField();
                if (isChekWin(playerDot)) {
                    System.out.println("победил человек");
                    counterVictoryPlayer++;
                    System.out.println("счет"+" "+"человек"+"-"+counterVictoryPlayer+" "+"ИИ"+"-"+counterVictoryAi);
                    break;
                }
                if (isFieldFull()) {
                    System.out.println("ничья");
                    break;
                }
                aiTurn();
                printField();
                if (isChekWin(aiDot)) {
                    System.out.println("победил компьютер");
                    counterVictoryAi++;
                    System.out.println("счет"+" "+"человек"+"-"+counterVictoryPlayer+" "+"ИИ"+"-"+counterVictoryAi);
                    break;
                }
                if (isFieldFull()) {
                    System.out.println("ничья");
                    break;
                }
            }
        } while (counterVictoryAi != 4 && counterVictoryPlayer != 4);
    }
}

