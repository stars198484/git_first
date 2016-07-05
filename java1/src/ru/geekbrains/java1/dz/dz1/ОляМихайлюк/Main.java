package ru.geekbrains.java1.dz.dz1.ОляМихайлюк;

/**
 * Created by I_V_Zhukov on 10.05.2016.
 */
public class Main {
// Задание 1

    public static void main(String[] args) {
        byte bt = 127;
        short sht = 32000;
        int intg = 2000000000;
        long lng = 2^15;
        float flt = 0.5f;
        double dbl = 100000.0000001;
        boolean bln = true;
        char chr = '@';
        String str = "Строка";
    }

// Задание 2

    public long result (int a, int b, int c, int d)
    {
        return a * (b + (c / d));//!

    }

// Задание 3

    public boolean check (int first, int second)
    {
        if (first + second < 20 && first + second > 10)
        {
            return true;
        }
        else return false;//!
    }

// Задание 4

    public static boolean isLeap (short year)  {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
        {
            return true;
        }
        else//!
        {
            return false;
        }
    }
}