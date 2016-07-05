package ru.geekbrains.java1.dz.dz3.ПавелСуходоев;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
/**
 * Created by I_V_Zhukov on 10.05.2016.
 */
public class Main {
    private static final int SIZE = 5;
    private static final char PLAYERDOT = 'X';
    private static final char AIDOT = 'O';
    private static final char FREECELL = '*';
    private static char[][] field = new char[SIZE][SIZE];
    private static char[][] aiField = new char[SIZE][SIZE];
    private static Scanner scanner = new Scanner(System.in);
    private static Random random = new Random(SIZE);
    private static int seriya;

    public static void main(String[] args) {
        do {
            System.out.println("РРіСЂР°РµРј РЅР° РїРѕР»Рµ " + SIZE + " x " + SIZE);
            System.out.println("Р’РІРµРґРёС‚Рµ СЃРµСЂРёСЋ РґР»СЏ РїРѕР±РµРґРЅРѕР№ РєРѕРјР±РёРЅР°С†РёРё РЅРµ Р±РѕР»РµРµ " + SIZE);
            seriya = scanner.nextInt();
        } while (seriya > SIZE);

        initField();
        drawField();
        do {
            playerMove();
            drawField();
            //РљРѕРїРёСЂРѕРІР°РЅРёРµ РїРѕР»СЏ РґР»СЏ Р°РЅР°Р»РёР·Р°
            aiField = field;
            if (checkWin(PLAYERDOT, seriya, field)) {
                System.out.println("PLAYER WINS!");
                break;
            }

            //РџСЂРѕРІРµСЂРєР° РІРѕР·РјРѕР¶РЅС‹С… С…РѕРґРѕРІ РёРіСЂРѕРєР°, РІС‹СЏСЃРЅРµРЅРёРµ РІР°СЂРёР°РЅС‚Р° РєРѕРіРґР° РёРіСЂРѕРє РјРѕР¶РµС‚ РїРѕР±РµРґРёС‚СЊ
            int[] bestMove = analyzePlayer();
            if (!Arrays.equals(bestMove, new int[]{-1, -1})) {
                setDot(bestMove[0], bestMove[1], AIDOT, field);
            } else {
                //Р Р°РЅРґРѕРјРЅС‹Р№ С…РѕРґ РР
                aiMove();
            }
            drawField();
            if (checkWin(AIDOT, seriya, field)) {
                System.out.println("AI WINS");
                break;
            }
        } while (canMove());
    }

    /**
     * РРЅРёС†РёР°Р»РёР·Р°С†РёСЏ РїРѕР»СЏ
     */
    private static void initField() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                field[i][j] = FREECELL;
            }
        }
    }

    /**
     * РЈСЃС‚Р°РЅРѕРІРєР° С‚РѕС‡РєРё
     * @param x
     * @param y
     * @param dot
     */
    private static void setDot(int x, int y, char dot, char[][] field) {
        field[x][y] = dot;
        field[x][y] = dot;
    }

    /**
     * РҐРѕРґ РёРіСЂРѕРєР°
     */
    private static void playerMove() {
        int x, y;
        do {
            System.out.println("Р’РІРµРґРёС‚Рµ РєРѕРѕСЂРґРёРЅР°С‚С‹ С‚РѕС‡РєРё: ");
            x = scanner.nextInt();
            y = scanner.nextInt();
        } while (!canSetDot(x, y));
        setDot(x, y, PLAYERDOT, field);
    }

    /**
     * РџСЂРѕРІРµСЂРєР° РІРѕР·РјРѕР¶РЅРѕСЃС‚Рё СѓСЃС‚Р°РЅРѕРІРєРё С‚РѕС‡РєРё
     * @param x
     * @param y
     * @return
     */
    private static boolean canSetDot(int x, int y) {
        return (field[x][y] == FREECELL & x <= SIZE-1 & y <= SIZE-1);
    }


    /**
     * Р Р°РЅРґРѕРјРЅС‹Р№ С…РѕРґ РџРљ
     */
    private static void aiMove() {
        int x, y;
        do {
            x = random.nextInt(3);
            y = random.nextInt(3);
        } while (!canSetDot(x, y));
        setDot(x, y, AIDOT, field);
    }

    /**
     * РњРѕР¶РЅРѕ Р»Рё СЃРґРµР»Р°С‚СЊ РµС‰Рµ С…РѕРґ?
     * @return
     */
    private static boolean canMove() {
        boolean checker = false;
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (field[i][j] == FREECELL) {
                    checker = true;
                }
            }
        }
        return checker;
    }

    /**
     * РџСЂРѕРІРµСЂРєР° РїРѕР±РµРґС‹
     * @param dot
     * @param seriya
     * @param field
     * @return
     */
    private static boolean checkWin(char dot, int seriya, char[][] field) {

        boolean checker = true;
        //РџСЂРѕРІРµСЂРєР° РіР»Р°РІРЅРѕР№ РґРёР°РіРѕРЅР°Р»Рё
        for (int i = 0; i < seriya; i++) {
            if (field[i][i] != dot) {
                checker = false;
            }
        }
        if (checker) return true;
        //РџР РѕРІРµСЂРєР° РїРѕР±РѕС‡РЅРѕР№ РґРёР°РіРѕРЅР°Р»Рё
        checker = true;
        for (int i = seriya - 1, j = 0; i >= 0; i--, j++) {
            if (field[j][i] != dot) {
                checker = false;
            }
        }
        if (checker) return true;

        //РџСЂРѕРІРµСЂРєР° РіРѕСЂРёР·РѕРЅС‚Р°Р»РµР№
        for (int i = 0; i < seriya; i++) {
            checker = true;
            for (int j = 0; j < seriya; j++) {
                if (field[i][j] != dot) {
                    checker = false;
                }
            }
            if (checker) return true;
        }

        //РџСЂРѕРІРµСЂРєР° РІРµСЂС‚РёРєР°Р»РµР№
        for (int i = 0; i < seriya; i++) {
            checker = true;
            for (int j = 0; j < seriya; j++) {
                if (field[j][i] != dot) {
                    checker = false;
                }
            }
            if (checker) return true;
        }
        return false;
    }

    private static int[] analyzePlayer() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (aiField[i][j] == FREECELL) {
                    setDot(i, j, PLAYERDOT, aiField);
                    //Р•СЃР»Рё С‡РµР»РѕРІРµРє РјРѕР¶РµС‚ РІС‹РёРіСЂР°С‚СЊ, СЂРµРєРѕРјРµРЅРґСѓРµРј РР СЃС…РѕРґРёС‚СЊ РІ СЌС‚Рѕ РїРѕР»Рµ
                    if (checkWin(PLAYERDOT, seriya, aiField)) return new int[]{i, j};
                    else aiField[i][j] = FREECELL;
                }
            }
        }
        return new int[]{-1, -1};
    }
    /**
     * РћС‚СЂРёСЃРѕРІРєР° РїРѕР»СЏ
     */
    private static void drawField() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.print(field[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}

