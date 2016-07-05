package ru.geekbrains.java1.dz.dz3.АндрейЕгоров;
import java.util.Random;
import java.util.Scanner;
/**
 * Created by I_V_Zhukov on 16.05.2016.
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

    //Метод печати на экран

    private static void printField() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.print(field[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    // метод передачи координаты поставленного х или нолика
    private static void setX0(int x, int y, char x0) {
        field[x][y] = x0;
    }

    // метод чтения с консоли игрока
    private static void playerTurn() {
        //do делают для того, чтобы дать возможность игроку вводить координату до тех пор пока не введедет верно
        int x, y;
        do {
            System.out.println("Введите координаты в формате X Y (1-5)");
            x = scanner.nextInt();
            y = scanner.nextInt();
        } while (!isCellEmpty(x - 1, y - 1));
        setX0(x - 1, y - 1, playerDot);
    }

    // метод хода компьютера
    private static void aiTurn() {
        //do делают для того, чтобы дать возможность игроку вводить координату до тех пор пока не введедет верно
        int x, y;
        do {
            x = random.nextInt(SIZE);
            y = random.nextInt(SIZE);
        } while (!isCellEmpty(x - 1, y - 1));
        setX0(x - 1, y - 1, aiDot);
    }

    // проверка на правильность ввода с клавиатуры
    private static boolean isCellEmpty(int x, int y) {
        if (x < 0 || x > 4 || y < 0 || y > 4) return false;
        if (field[x][y] == emptyDot) return true;
        return false;
    }

    // проверка на то кто победил
    private static boolean isCheckWin(char x0) {
        // проверка на выигрыш с помощью цикла
        for(int i=0; i<1;i++ ){
            for(int j=0;j<1;j++){
                if( field[i][j]== x0 && field[i][j+1]== x0 && field[i][j+2]== x0 && field[i][j+3]== x0 && field[i][j+4]== x0) return true;
                if( field[i][j]== x0 && field[i+1][j]== x0 && field[i+2][j]== x0&& field[i+3][j]== x0 && field[i+4][j]== x0) return true;
                if( field[i][j]== x0 && field[i+1][j+1]== x0 && field[i+2][j+2]== x0 && field[i+3][j+3]== x0 && field[i+4][j+4]== x0) return true;
                if( field[i+4][j]== x0 && field[i+3][j+1]== x0 && field[i+2][j+2]== x0 && field[i+1][j+3]== x0 && field[i][j+4]== x0 ) return true;
            }
        }
        return false;
    }
    // метод проверки на ничью
    private static boolean isFieldFull(){
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if(field[i][j] == emptyDot) return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        initField();
        printField();

        while(true){
            playerTurn();
            printField();
            if (isCheckWin(playerDot)){
                System.out.println("Player Win");
                break;
            }
            if (isFieldFull()){
                System.out.println("Ничья");
                break;
            }
            aiTurn();
            printField();
            if (isCheckWin(aiDot)){
                System.out.println("Computer Win");
                break;
            }
            if (isFieldFull()){
                System.out.println("Ничья");
                break;
            }
        }
    }
}
