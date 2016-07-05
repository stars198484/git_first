package ru.geekbrains.java1.dz.dz1.ЭлеонораОганджанян;

/**
 * Created by I_V_Zhukov on 10.05.2016.
 */
public class Main {
    public static void main(String[] args) {
      /* объявление переменных всех примитивных типов
        byte a = 111;
        short b = 11111;
        int c = 111111;
        long d = 1111L;
        float e = 11.0f;
        double f = 1111.00d;
        boolean g = true;
        char h = 'a'; */

        int k = 9;
        int l = 2;
        int m = 7;
        int n = 2;
        int year = 2016;

        System.out.println("Результат вычисления выражения a * (b + (c / d) равен " + calc(k, l, m, n));

        if(diapason(m, n)){
            System.out.println("Сумма переданных чисел находится между 10 и 20");
        }
        else {
            System.out.println("Сумма переданных чисел не находится между 10 и 20");
        }

        if (leapYear(year)){
            System.out.println("Год високосный.");
        } else {
            System.out.println("Год невисокосный.");
        }

    }
    // Вычислением выражение
    private static double calc(int a, int b, double c, double d) {
        return a * (b + (c / d));//!
    }
    // Проверяем входит ли сумма чисел в заданный диапозон чисел
    private static boolean diapason(int a, int b){
        return (a + b) > 10 & (a + b) < 20;
    }
    // Проверяем явлется ли год високосным
    private static boolean leapYear(int a){
        return ((a %= 400) == 0) | ((a %= 100) != 0 & (a %= 4) == 0);
    }

}