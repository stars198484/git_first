package ru.geekbrains.java1.dz.dz1.БорисАндреев;

/**
 * Created by I_V_Zhukov on 10.05.2016.
 */
public class Main {
    // метод для расчета
    public static int calc(int a, int b,int c,int d){
        return a*(b+(c/d));
    }
    // метод для проверки суммы
    public static boolean summ (int a, int b){
        boolean c=false;
        if ((a+b)>10&&(a+b<20))  c=true;
        return c;
    }
    // метод для високосного года с целым числом
    public static boolean vis (int a){
        boolean c=false;
        if ((a/4>(a-1)/4)&&(a/100==(a-1)/100))  c=true;//!
        if (a/400>(a-1)/400) c=true;//!
        return c;
    }

    public static void main(String[] args) {
        //инициализация изученных типов переменных
        byte a = 2;
        short b = 3;
        int c=5;
        long d=6;
        float e=12.5f;
        double f=11.3d;
        boolean g=false;
        char h='x';

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);




        System.out.println("calc="+calc(8,4,6,3));
        System.out.println("summ="+summ(4,6));
        System.out.println("god visokosniy="+vis(100));
    }}
