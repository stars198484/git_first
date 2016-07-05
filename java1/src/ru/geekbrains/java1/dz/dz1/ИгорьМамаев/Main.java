package ru.geekbrains.java1.dz.dz1.ИгорьМамаев;

/**
 * Created by I_V_Zhukov on 10.05.2016.
 */
public class Main {
    public static void main(String[] args) {
        byte byteVar = 1;
        short shortVar = 2;
        int intVar = 3;
        long longVar = 4L;
        float floatVar = 5.5f;
        double doubleVar = 6.6d;
        boolean booleanVar = true;
        char charVar = 'z';
    }

    /* метод возвращает результат математического выражения, в случае если знаменатель не равен 0
    если знаменатель равен 0, возвращает 0
     */
    double mathExpression(double a, double b, double c, double d) {
        if (d!=0) {
            return (a * (b + (c / d)));
        } else return 0;
    }

    boolean isSumBetweenTenAndTwenty(int firstVar, int secondVar) {
        return firstVar + secondVar > 10 & firstVar + secondVar < 20;
    }

    boolean isLeapYear(int year) {
        return  (year % 4 == 0 & year % 100 != 0)|(year % 400 == 0);
    }
}
