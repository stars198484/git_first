package ru.geekbrains.java1.dz.dz1.АлексейИванов;

/**
 * Created by I_V_Zhukov on 10.05.2016.
 */
public class Main {
    public static void main(String[] args) {
        byte byteTemp = 10;
        short shortTemp = -3020;
        int intTemp = 2147480;
        long longTemp = -922636854775800L;
        float floatTemp = 19.0f;
        double doubleTemp = -15.0d;
        boolean booleanTemp = false;
        char charTemp = 'c';
        String stringTemp = "String";
        System.out.println(funkABCD(1.4f, 8.6f, 2.7f, 4.9f));
        System.out.println(sumAB(3, 7));
        System.out.println(isLeapYear(1988));
    }
    private static float funkABCD(float a, float b, float c, float d){
        float Result;//!
        Result = a * (b + c / d);//!
        return Result;
    }
    private static boolean sumAB(int a, int b) {
        float sum = a + b;
        if(sum >= 10 & sum <= 20) return true;//!
        return false;//!
    }
    private static boolean isLeapYear(int y) {
        if ((y % 4 != 0) || ((y % 4 == 0) && (y % 100 == 0 && y % 400 != 0))) {
            return false;
        }
        else {
            return true;//!
        }
    }
}