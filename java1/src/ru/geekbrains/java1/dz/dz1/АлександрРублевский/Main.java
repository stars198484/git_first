package ru.geekbrains.java1.dz.dz1.АлександрРублевский;

/**
 * Created by I_V_Zhukov on 10.05.2016.
 */
public class Main {
    public static void main(String[] args) {

        byte num1 = 127;
        short num2 = 32767;
        int num3 = 2147483647;
        long num4 = 9223372036854775807l;
        float num5 = 120.0f;
        double num6 = 15.72;
        char symbol = 'J';
        String line = "ava";

        System.out.println(Met1(num1, num2, num3, num4));
        System.out.println(Met2(num5, num6));
        System.out.println(symbol + line);
    }

    public static double Met1(double a, double b, double c, double d) {//!
        double sum;
        sum = a * (b + (c / d));//!
        return sum;

    }

    public static boolean Met2(double a, double b) {//!
        boolean res = false;
        double sum = a + b;
        if (sum >= 10 & sum <= 20)
            res = true;
        return res;

    }
}
