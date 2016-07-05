package ru.geekbrains.java1.dz.dz1.АлександрАнатольевичСмирнов;

/**
 * Created by I_V_Zhukov on 10.05.2016.
 */
public class Main {
    public static void main(String[] args) {
        byte byteTemp = 100;
        short shortTemp = -32700;
        int intTemp = 2147483600;
        long longTemp = -9223372036854775800L;
        float floatTemp = 10.0f;
        double doubleTemp = -10.0d;
        boolean booleanTemp = true;
        char charTemp = 'J';
        String stringTemp = "Java";
        System.out.println(Metod1(1.2f, 3.6f, 2.4f, 4.8f));//!
        System.out.println(Metod2(3.5f, 7.4f));//!
        System.out.println(Metod3(2016));
    }
    private static float Metod1(float a, float b, float c, float d){//!
        float Result = 0f;//!
        Result = a * (b + c / d);//!
        return Result;//!
    }
    private static boolean Metod2(float i, float j) {//!
        boolean Result = false;
        float Summa = i + j;
        if(Summa >= 10 & Summa <= 20) Result = true;
        return Result;
    }
    private static boolean Metod3(int y) {
        boolean Result = false;//!
        if(y%400 == 0) {Result = true;}//!
        else if (y%100 == 0) {}
        else if (y%4 == 0) {Result = true;};//!
        return Result;//!
    }
}
