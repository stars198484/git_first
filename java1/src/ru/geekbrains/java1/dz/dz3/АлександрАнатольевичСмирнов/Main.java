package ru.geekbrains.java1.dz.dz3.АлександрАнатольевичСмирнов;
import java.util.Random;
import java.util.Scanner;
/**
 * Created by I_V_Zhukov on 10.05.2016.
 */
public class Main {
    public static final int SIZE = 5; // размер поля
    public static final int LENGTH = 4; // длина ряда для победы

    public static char[][] field = new char[SIZE][SIZE]; // само поле
    public static final char playerDot = 'X';
    public static final char aiDot = 'O';
    public static final char emptyDot = '.';

    public static Scanner scan = new Scanner(System.in);
    public static Random rnd = new Random();

    public static void main(String[] args) {
        int step = 0;
        initField();
        printField();

        while (true) {

            playerTurn();
            step++;
            System.out.println("Ход " + step + ". Ситуация после Вашего хода:");
            printField();
            if (isFieldFull()) break;
            if (isWin(playerDot)) {
                System.out.println("Вы победили!");
                break;
            } // isWin()
            aiTurn();
            step++;
            System.out.println("Ход " + step + ". Ситуация после хода AI:");
            printField();
            if (isFieldFull()) break;
            if (isWin(aiDot)) {
                System.out.println("Победил компьютер!");
                break;
            } // isWin()
        } // while
    }

    // проверка Победы

    public static boolean isWin(char dot) {
        int count;

        // проверка всех горизонталей
        for (int i = 0; i < SIZE; i++) { // перебор строк
            count = 0;
            for (int j = 0; j < SIZE; j++) { // перебор столбцов
                if (field[j][i] == dot) {
                    count++;
                    if (count >= LENGTH) return true;
                } else {
                    count = 0;
                } // if
            } // for j
        } // for i

        // проверка всех вертикалей
        for (int i = 0; i < SIZE; i++) { // перебор столбцов
            count = 0;
            for (int j = 0; j < SIZE; j++) { // перебор строк
                if (field[i][j] == dot) {
                    count++;
                    if (count >= LENGTH) return true;
                } else {
                    count = 0;
                } // if
            } // for j
        } // for i

        // проверка диагонали \
        count = 0;
        for (int j = 0; j < SIZE; j++) {
            if (field[j][j] == dot) {
                count++;
                if (count >= LENGTH) return true;
            } else {
                count = 0;
            } // if
        } // for j

        // проверка диагонали /
        count = 0;
        for (int j = 0; j < SIZE; j++) {
            if (field[SIZE - j - 1][j] == dot) {
                count++;
                if (count >= LENGTH) return true;
            } else {
                count = 0;
            } // if
        } // for j

        if (SIZE == LENGTH) return false;

        // проверка диагоналей, смежных \
        count = 0;
        for (int j = 0; j < SIZE - 1; j++) {
            if (field[j + 1][j] == dot) {
                count++;
                if (count >= LENGTH) return true;
            } else {
                count = 0;
            } // if
        } // for j

        count = 0;
        for (int j = 0; j < SIZE - 1; j++) {
            if (field[j][j + 1] == dot) {
                count++;
                if (count >= LENGTH) return true;
            } else {
                count = 0;
            } // if
        } // for j

        // проверка диагоналей, смежных /
        count = 0;
        for (int j = 0; j < SIZE - 1; j++) {
            if (field[SIZE - j - 2][j] == dot) {
                count++;
                if (count >= LENGTH) return true;
            } else {
                count = 0;
            } // if
        } // for j

        count = 0;
        for (int j = 0; j < SIZE - 1; j++) {
            if (field[SIZE - j - 1][j + 1] == dot) {
                count++;
                if (count >= LENGTH) return true;
            } else {
                count = 0;
            } // if
        } // for j

        return false;
    } // isWin()

    // провека на ничью
    public static boolean isFieldFull() {
        for (int i = 0; i < SIZE; i++) { // перебор строк
            for (int j = 0; j < SIZE; j++) { // перебор столбцов
                if (field[j][i] == emptyDot) return false;
            } // for j
        } // for i
        System.out.println("Ничья!");
        return true;
    } // isFieldFull()

    // проверка на корректность хода
    public static boolean isCellEmpty(int x, int y) {
        if (x < 0 || y < 0 || x >= SIZE || y >= SIZE) return false;
        if (field[x][y] == emptyDot) return true;
        return false;
    } // isCellEmpty()1

    // ход компьютера
    public static void aiTurn() {
        int x, y;
        do {
            x = rnd.nextInt(SIZE);
            y = rnd.nextInt(SIZE);
        } while (!isCellEmpty(x, y));
        field[x][y] = aiDot;
    } // aiTurn()

    // ход игрока
    public static void playerTurn() {
        int x, y;
        do {
            System.out.print("Введите координаты (от 1 до " + SIZE + "): X = ");
            x = scan.nextInt();
            System.out.print(" Y = ");
            y = scan.nextInt();
        } while (!isCellEmpty(x - 1, y - 1));
        field[x - 1][y - 1] = playerDot;
    } // playerTurn()

    // инициализация поля - запись пустых точек
    public static void initField() {
        for (int i = 0; i < SIZE; i++) { // перебор строк
            for (int j = 0; j < SIZE; j++) { // перебор столбцов
                field[j][i] = emptyDot;
            } // for j
        } // for i
    } // initField()

    // вывод поля на экран
    public static void printField() {
        for (int i = 0; i < SIZE; i++) { // перебор строк
            if (i != 0) {
            }
            for (int j = 0; j < SIZE; j++) { // перебор столбцов
                System.out.print(field[j][i] + " ");
            } // for j
            System.out.println();
        } // for i
    } // initField()
}
