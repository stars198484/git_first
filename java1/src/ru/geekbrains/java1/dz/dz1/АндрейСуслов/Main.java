package ru.geekbrains.java1.dz.dz1.АндрейСуслов;

/**
 * Created by I_V_Zhukov on 10.05.2016.
 */
public class Main {
    public static void main(String[] args) {
        java.util.Scanner scan = new java.util.Scanner(System.in);

        byte a1 = 1;
        short a2 = 1;
        int a3 = 1;
        long a4 = 1;
        double a5 = 1.1;
        float a6 = 1.1f;
        boolean a7 = true;
        char a8 = 'a';

        int a =1;
        int b =2;
        int c =3;
        int d =4;
        System.out.println("Результат функции 1 = " + method_one(a,b,c,d) );
        System.out.println("Введите первое число");
        a = Integer.parseInt(scan.nextLine());
        System.out.println("Введите второе число");
        b = Integer.parseInt(scan.nextLine());
        System.out.println("Результат " + method_two(a,b));
        System.out.println("Введите год");
        a = Integer.parseInt(scan.nextLine());
        System.out.println( god(a));
    }

    public static int method_one ( int a,int b,int c,int d)//!
    { int result;
        result =(a * (b + (c / d)));
        return result;
    }

    public static boolean method_two(int a, int b)//!
    {
        int sum = a+b;
        if (sum >= 10 && sum <= 20 )
        {  return true; }
        else {return false; }//!


    }

    public static String god (int a)
    {   int ostatok4 = a%4;
        int ostatok100 = a%100;
        int ostatok400 = a%400;
        if((ostatok4 == 0 & ostatok100 != 0) || ( ostatok400 == 0) ) { return "Високосный";}
        else {return "Не високосный";}//!

    }
}
