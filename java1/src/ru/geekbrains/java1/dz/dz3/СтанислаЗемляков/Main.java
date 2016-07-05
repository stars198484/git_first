package ru.geekbrains.java1.dz.dz3.СтанислаЗемляков;
import java.util.Random;
import java.util.Scanner;
/**
 * Created by I_V_Zhukov on 16.05.2016.
 */
public class Main {
    private static final int SIZE = 3;
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
            System.out.println("Р’РІРІРµРґРёС‚Рµ РєРѕРѕСЂРґРёРЅР°С‚С‹ РІ С„РѕСЂРјР°С‚Рµ X Y (1-3)");
            x = scanner.nextInt();
            y = scanner.nextInt();
        } while (!isCellEmpty(x - 1, y - 1));
        setX0(x - 1, y - 1, playerDot);
    }

    private static void aiTurn() {
        int x, y;
        do {
            x = random.nextInt(SIZE);
            y = random.nextInt(SIZE);
        } while (!isCellEmpty(x, y));
        setX0(x, y, aiDot);
    }


    private static boolean isCellEmpty(int x, int y) {
        if (x < 0 || x > 2 || y < 0 || y > 2) return false;
        if (field[x][y] == emptyDot) return true;
        return false;
    }


    private static boolean isCheckWin(char x0) {
        //        в—Џ * РЈСЃРѕРІРµСЂС€РµРЅСЃС‚РІРѕРІР°С‚СЊ РјРµС‚РѕРґ РїСЂРѕРІРµСЂРєРё РїРѕР±РµРґС‹ (РЅР°РїСЂРёРјРµСЂ, РїРѕРїСЂРѕР±РѕРІР°С‚СЊ РѕСЂРіР°РЅРёР·РѕРІР°С‚СЊ РїСЂРѕРІРµСЂРєСѓ
        //        РїРѕР±РµРґС‹ С‡РµСЂРµР· С†РёРєР»С‹);


        // РїРѕ x
        int x, y;
//        String j = StringUtils.join((String)field[0][0], field[0][1] , field [0][2], ","); // not for char
//        for (x=0, y=0; y<SIZE; y++){
//            if (field[x][y] == x0)return true;// any match in raw x=0
//        }
//        for (x = 0; x < SIZE; x++) {          // doesn't work
//            for (y = x + 1; y < SIZE; y++) {
//                if (y != x && field[y] == field[x])
//                    return true;
//            }
//        }
//        for(x = 0; x<SIZE ; x++){
//            for (y=0; y<SIZE; y++){
//                if(field[x][y] == x0) {
//                    System.out.println("field[x][y] == x0"); //any token cell
//                }
//            }
//        }
//            if(Arrays.asList(field[0][0]).contains(x0))return true; // cell [0][0] contains x0

//            if (field[0][0] + field[0][1] +field[0][2] == x0 + x0 + x0){
//            System.out.println("Line x = 0 :" + field[0][0] + field[0][1] + field[0][2]);   // x=0 y++
//            return true;}
        if (field[1][0] == x0 && field[1][1] == x0 && field[1][2] == x0) return true;   // x=1 y++
        if (field[2][0] == x0 && field[2][1] == x0 && field[2][2] == x0) return true;   // x=2 y++

        //РїРѕ y
        if (field[0][0] == x0 && field[1][0] == x0 && field[2][0] == x0) return true;   // y=0 x++
        if (field[0][1] == x0 && field[1][1] == x0 && field[2][1] == x0) return true;   // y=1 x++
        if (field[0][2] == x0 && field[1][2] == x0 && field[2][2] == x0) return true;   // y=2 x++
        // РїРѕ РґРёР°РіРѕРЅР°Р»Рё
        if (field[0][0] == x0 && field[1][1] == x0 && field[2][2] == x0) return true;   // x++ y++
        if (field[2][0] == x0 && field[1][1] == x0 && field[0][2] == x0) return true;   // x-- y--
        return false;
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
        initField();
        printField();

        while (true) {
            playerTurn();
            printField();
            if (isCheckWin(playerDot)) {
                System.out.println("human wins");
                break;
            }
            if (isFieldFull()) {
                System.out.println("draw");
                break;
            }

            aiTurn();
            printField();
            if (isCheckWin(aiDot)) {
                System.out.println("machine wins");
                break;
            }
            if (isFieldFull()) {
                System.out.println("РЅРёС‡СЊСЏ");
                break;
            }

        }

    }
}

