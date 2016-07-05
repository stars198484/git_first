package ru.geekbrains.java1.dz.dz1.УльянаЧерникова;

/**
 * Created by I_V_Zhukov on 10.05.2016.
 */
public class Main {
    //Задание №1
    public static void main (String arg[]) {
        //Задание №2
        byte b=127;
        int i=2147483647;
        short s= -32768;
        long l=16000L;
        float f=1.2f;
        double d=14d;
        boolean t=true;
        char c='c';
//Задание № 3
        int m1=met1(5, 7, 8, 2);
        System.out.println("Метод met1 возвращает значение " + m1);
        boolean m2=met2(5,5);
        System.out.println("Метод met2 возвращает значение " +m2);
        year (20);
    }
    private static int met1(int a, int b, int c, int d) {
        return (a* (b+ (c/d)));
    }
    //Задание №4
    private static boolean met2(int a, int b){
        if ((a+b)>=10 & (a+b)<=20) {
            return true;
        }
        else return false;//!
    }
    //Задание №5
    private static void year(long y){
        if (y%4 == 0 & (y%100!=0 | y%400==0 )){

            System.out.println("Год " + y + " високосный");
            return;
        }
        else System.out.println("Год " + y + " невисокосный");
        return;
    }
}