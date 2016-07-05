package ru.geekbrains.java1.dz.dz1.АндрейЕгоров;

/**
 * Created by I_V_Zhukov on 10.05.2016.
 */
public class Main {
    public static void main(String[] args){

        byte aa = 9;
        short bb = -32768;
        int cc = 34000;
        long dd= 92340857;
        float ee = 110.6f;
        double ff = 14.43d;
        boolean gg = false;
        char hh = '\u03A9';

        System.out.println(zadanie1(2,2,4,4));
        System.out.println(zadanie2(6,5));
        zadanie3(2015);
    }
    public static int zadanie1(int a,int b,int c,int d){
        return a * ( b + ( c/ d ));
    }
    public static boolean zadanie2(int a, int b){
        boolean result;//!
        int c=a+b;
        if (c >=10 & c <= 20){
            result = true;
        } else{
            result = false;
        }
        return result;
    }
    static void zadanie3(int year){
        if(year%400 == 0){
            System.out.println("Високосный год");
        }
        else if (year%100 == 0){
            System.out.println(" Не Високосный год");
        }
        else if (year%4 == 0){
            System.out.println("Високосный год");
        }
        else{
            System.out.println("Не високосный год");
        }
    }
}