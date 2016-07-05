package ru.geekbrains.java1.dz.dz1.РусланУстиц;

/**
 * Created by I_V_Zhukov on 10.05.2016.
 */
public class Main {
    // task 1
    public static void main(String[] args) {
        // task 2
        byte vByte = 1;
        short vShort = 1;
        int vInt = 1;
        long vLong = 1;
        float vFloat = 1.0f;
        double vDouble = 1.0d;
        boolean vBoolean = true;
        char vChar = 'a';

        int task3result = calculate(1, 2, 3, 4); // пример динамической инициализаци
        System.out.println(task3result);

        boolean task4result = checkSum(10, 11);
        System.out.println(task4result);

        printLeapYear(5);
    }

    // task 3
    public static int calculate(int a, int b, int c, int d) {
        return a * (b + (c / d));
    }

    // task 4
    public static boolean checkSum(int a, int b) {
        if (a + b > 20 || a + b < 10)
            return false;
        else return true;//!
    }

    // task 5
    public static boolean checkLeapYear(int year)
    {
        if (year % 4 == 0)
        {
            if (year % 100 == 0)
            {
                if (year % 400 == 0)
                    return true;
                else return false;//!
            }
            return true;
        }
        return false;
    }

    public static void printLeapYear(int year)
    {
        boolean isLeapYear = checkLeapYear(year);
        if (isLeapYear)
            System.out.println(year+" is a leap year");
        else
            System.out.println(year+" is not a leap year");
    }
}
