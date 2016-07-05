package ru.geekbrains.java1.dz.dz1.ВладимирПутянис;

/**
 * Created by I_V_Zhukov on 10.05.2016.
 */
public class Main {
    public static void main(String[] args)
    {
        byte    b = 1;
        short   sh = 2;
        int     i = 3;
        long    l = 4L;

        float   f = 1.1f;
        double  d = 1.2d;

        boolean bool = true;

        char    c = 'a';

        System.out.println("Calc: " + calc(1, 2, 3, 4) + "\n");

        System.out.println("Compare: " + (compare(7, 8) ? "true" : "false"));
        System.out.println("Compare: " + (compare(17, 18) ? "true" : "false") + "\n");

        System.out.println("300 is leap year: " + (isLeapYear(300) ? "true" : "false"));
        System.out.println("800 is leap year: " + (isLeapYear(800) ? "true" : "false"));
        System.out.println("924 is leap year: " + (isLeapYear(924) ? "true" : "false"));
    }

    /**
     * @param a first int param
     * @param b second int param
     * @param c third int param
     * @param d fourth in param
     * @return result of calculation a * (b + (c / d)
     */
    public static float calc(int a, int b, int c, int d)
    {
        return a * ( b + ( (float)c / d) );//!   if d==0
    }

    /**
     * a + b sum checker
     * @param a fisrt int param
     * @param b second int param
     * @return true or false
     */
    public static boolean compare(int a, int b)
    {
        int nSum = a + b;
        if (nSum > 10 && nSum < 20)
        {
            return true;
        }
        return false;
    }

    /**
     * leap year checker
     * @param nYear int year to check
     * @return true or false
     */
    public static boolean isLeapYear(int nYear)
    {
        return ((nYear % 4 == 0 && nYear % 100 != 0) || nYear % 400 == 0);
    }
}