package ru.geekbrains.java1.dz.dz1.ЛидияЛеонова;

/**
 * Created by I_V_Zhukov on 10.05.2016.
 */
public class Main {
    public static void main(String[] args) {

        // Переменные примитивных типов данных с инициализацией
        byte byteVar = 125;
        short shortVar = 32760;
        int intVar = 214748364;
        long longVar = 13130L;
        float floatVar = 13.0f;
        double doubleVar = 13.13d;
        boolean booleanVar = true;
        char charVar = 'L';

        System.out.println(method1(11, 14, 15, 16));
        System.out.println(method2(11.25, 8.74));
        System.out.println(method3(1900));
    }

    /**
     * Вычисляет выражение a * (b + (c / d)) и возвращает результат,
     * где a,b,c,d – входные параметры этого метода
     */
    private static double method1(double a, double b, double c, double d) {
        return a * (b + (c / d));//!
    }

    /**
     * Принимает на вход два числа и проверяет, что их сумма
     * лежит в пределах 10 до 20. Если да – вернуть true,
     * в противном случае – false
     */
    private static boolean method2(double a, double b) {
        return (a + b >= 10 && a + b <= 20);
    }

    /**
     * Определяет, является ли год високосным.
     * Каждый 4-й год является високосным, кроме каждого 100-го,
     * при этом каждый 400-й – високосный
     */
    private static String method3(long year) {
        String not = " не";
        if (year % 4 == 0) {
            if (year % 100 != 0) {
                not = "";
            } else if (year % 400 == 0) {
                not = "";
            }
        }
        return ("Год " + year + not + " является високосным");
    }
}