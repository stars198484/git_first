package ru.geekbrains.java1.dz.dz1.СергейБрысин;

import java.util.Scanner;

import static java.lang.System.in;

/**
 * Created by I_V_Zhukov on 10.05.2016.
 */
public class Main {
    public static void main(String[] args) {
        byte byte1 = 100;
        short short1 = -32700;
        int int1= 2147483600;
        long long1 = -9223372036854775800L;
        float float1 = 10.0f;
        double double1 = -10.0d;
        boolean boolean1 = true;
        char char1 = 'J';
        float i,j;
        String stringTemp = "Java";
        System.out.println("Результат выражения:" + Metod1(0, 0, 0, 0));
        System.out.println("Результат выражения:" + Metod2(0, 0));
        System.out.println("Результат выражения:" + Metod3(0));
    }



    private static float Metod1(float a, float b, float c, float d){//!
        float Result;

        System.out.println("Метод 1.Вычисляющий выражение a * (b + (c / d)) и возвращающий результат");
        Scanner sc = new Scanner(in);
        System.out.print("Введите число a: ");
        a = sc.nextFloat();
        System.out.print("Введите число b: ");
        b = sc.nextFloat();
        System.out.print("Введите число c: ");
        c = sc.nextFloat();
        System.out.print("Введите число d: ");
        d = sc.nextFloat();
        Result = a * (b + c / d);
        return Result;
    }
    private static boolean Metod2(float i, float j) {//!
        System.out.println(" ");
        System.out.println("Метод 2. Если сумма лежит в пределах 10 до 20: Да = true,Нет = false");
        Scanner sc = new Scanner(in);
        System.out.print("Введите число 1: ");
        i = sc.nextFloat();
        System.out.print("Введите число 2: ");
        j = sc.nextFloat();
        boolean Result = false;
        float Summa = i + j;
        if(Summa >= 10 & Summa <= 20) Result = true;
        return Result;


    }
    private static boolean Metod3(int a) {//!
        System.out.println(" ");
        System.out.println("Метод 3.Определяет является ли год високосным.");
        Scanner sc = new Scanner(in);
        System.out.print("Введите интересующий вас год: ");
        a = sc.nextInt();
        boolean Result = false;
        if(a%400 == 0) {Result = true;}
        else if (a%100 == 0) {}
        else if (a%4 == 0) {Result = true;};
        return Result;
    }


}