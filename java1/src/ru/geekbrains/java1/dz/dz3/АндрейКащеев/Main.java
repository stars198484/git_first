package ru.geekbrains.java1.dz.dz3.АндрейКащеев;
import java.util.Random;
import java.util.Scanner;
/**
 * Created by I_V_Zhukov on 10.05.2016.
 */
public class Main {
    static final char playerDot = 'X';
    static final char aiDot = 'O';
    static final char emptyDot = '*';
    static final int boardSize = 3;
    static final int winline = boardSize; //РЅРµ СЂРµР°Р»РёР·РѕРІР°РЅР° РїСЂРѕРІРµСЂРєР° РјР°Р»С‹С… РґРёР°РіРѕРЅР°Р»РµР№
    static char[][] board = new char[boardSize][boardSize];
    static Scanner sc = new Scanner(System.in);
    static Random rand = new Random();
    static int x1, y1;

    static void initBoard() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = emptyDot;
            }
        }
    }

    static void printBoard() {
        System.out.print("  ");
        for (int i = 0; i < board.length; i++) {
            System.out.print(" y");
        }
        System.out.println();

        System.out.print("  ");
        for (int i = 1; i < board.length + 1; i++) {
            System.out.print(" " + i);
        }
        System.out.println();
        for (int i = 0; i < board.length; i++) {
            System.out.print("x" + (i + 1) + " ");
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < board.length * 2 + 2; i++) System.out.print('-');
        System.out.println();
    }

    static boolean isBoardFull() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == emptyDot) return false;
            }
        }
        return true;
    }

    static boolean isCellEmpty(int x, int y) {
        if (x < 0 || y < 0 || x > boardSize - 1 || y > boardSize - 1) return false;
        return board[x][y] == emptyDot;
    }

    static void setDot(int x, int y, char dot) {
        board[x][y] = dot;
    }

    static void playerTurn() {
        int x, y;
        do {
            printBoard();
            System.out.print("Р’РІРµРґРёС‚Рµ x y:");
            x = sc.nextInt();
            y = sc.nextInt();
        } while (!isCellEmpty(x - 1, y - 1));
        setDot(x - 1, y - 1, playerDot);

    }

    static void aiTurn() {
        int x, y;
        do {
            //x = winRow(playerDot);
            //if (x == -1) x = rand.nextInt(boardSize);
            //РїРѕРєР° С‚Р°Рє, РЅРµ СѓСЃРїРµРІР°СЋ СЃРґРµР»Р°С‚СЊ СЂР°Р·СѓРј
            x = rand.nextInt(boardSize);
            y = rand.nextInt(boardSize);
        } while (!isCellEmpty(x, y));
        setDot(x, y, aiDot);
    }

    static boolean isWinner(char dot) {
        //check rows
        int cnt = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == dot) cnt += 1;
                else cnt = 0;
            }
            if (cnt > winline - 1) return true;
        }
        //check cols
        cnt = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[j][i] == dot) cnt += 1;
                else cnt = 0;
            }
            if (cnt > winline - 1) return true;
        }
        //check diag1
        cnt = 0;
        for (int i = 0; i < board.length; i++) {
            if (board[i][i] == dot) cnt += 1;
            else cnt = 0;
        }
        if (cnt > winline - 1) return true;

        //check diag2
        cnt = 0;
        for (int i = 0, j = board.length - 1; i < board.length; i++, j--) {
            if (board[i][j] == dot) cnt += 1;
            else cnt = 0;
        }
        if (cnt > winline - 1) return true;


        return false;
    }

    static int winRow(char dot) {
        //check rows
        int cnt = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == dot) cnt += 1;

            }
            if (cnt > winline - 2) return i;
        }
        return -1;
    }




    public static void main(String[] args) {

        initBoard();
        printBoard();
        do {
            playerTurn();
            printBoard();
            if (isWinner(playerDot)) {
                System.out.println("player Win!!!");
                break;
            }
            aiTurn();
            printBoard();
            if (isWinner(aiDot)) {
                System.out.println("computer Win!!!");
                break;
            }
        } while (!isBoardFull());
        if (isBoardFull()) System.out.printf("No Winner :(");

    }

}
