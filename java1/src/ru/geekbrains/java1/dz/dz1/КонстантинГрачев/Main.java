package ru.geekbrains.java1.dz.dz1.КонстантинГрачев;

/**
 * Created by I_V_Zhukov on 10.05.2016.
 */
public class Main {
    public static void main(String[] args) {
        /**
         * First part of home work - variable initialization
         */
        byte a = 10;
        short b = 1000;
        int c = 100000;
        long d = 1000000000;
        float e = 10.0f;
        double f = 10.11d;
        boolean g = true;
        char h = 'A';


        /**
         * Second part of home work - calculation
         */
        double a1 = 1d; double b1 = 3d; double c1 = 80d;
        double d1 = 30d; int yea = 2016;

        calculation(a1,b1,c1,d1);

/**
 * 3rd part of home work - calculation
 */

        calcIF(a1,b1);

        /**
         * 4th part of home work - year
         */

        year(yea);
    }

    /**
     * Method to the second part of home work
     */
    private static void calculation ( double a1, double b1, double c1, double d1) {
        System.out.println("Ответ второго задания = " + a1 * (b1 + (c1 / d1)));
    }


    /**
     * Method to the 3rd part of home work
     */
    private static void calcIF ( double a1, double b1) {
        if ((a1+b1)>10 & (a1+b1<20))  { System.out.println("Ответ третьего задания:" + a1 + b1);} else {System.out.println("Ответ третьего задания: Сумма чисел не входит в интервал от 10 до 20!!!");}
    }


    /**
     * Method to the 4th part of home work
     */
    private static void year ( int yea) {
        if ((yea%4)!=0 | (yea%100==0)) { System.out.println("Ответ четвертого задания: ГОД НЕ ВИСОКОСНЫЙ");} else if((yea%4)==0 | (yea%400)==0) {System.out.println("Ответ четвертого задания: ГОД ВИСОКОСНЫЙ!!!");}
    }

}




