package ru.geekbrains.java1.dz.dz1.АнтонСухов;

/**
 * Created by I_V_Zhukov on 10.05.2016.
 */
public class Main {
    public static void main(String[] args) {

        byte varOne = 127;
        short varTwo = 32767;
        int varThree = 2147483647;
        long varFour = 999999999;
        float varFive = 100.0f;
        double varSix = 100.10d;
        boolean varSeven = true;
        char varEight = 'V';
    }
    public static int formula(int a, int b, int c, int d) {
        return a * (b + (c/d));
    }
    public static boolean sravnenie2(int a, int b) {
        a = 2;
        b = 2;
        int c = a + b;
        if (c > 10 && c < 20) {
            System.out.print("true");
            return true;
        } else {
            System.out.print("false");
            return false;
        }
    }
    public static boolean vesokos(int a) {

        a = 1993;//!

        for (int x = 0; x == a; x = x + 4) {
            System.out.print("Visokosen");
        }
        for (int x = 0; x == a; x = x + 400) {
            System.out.print("Visokosen");
        }


        return true;//!

    }

    }
