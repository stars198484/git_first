package ru.geekbrains.java1.dz.dz1.ИльяФиалковский;

/**
 * Created by I_V_Zhukov on 10.05.2016.
 */
public class Main {
    byte bt=1;
    short sh=2;
    int it=3;
    long lng=4;
    float fl=5.0f;
    double db=6.1d;
    boolean bl=false;
    char ch='f';

    public static void main(String[] args){
        int z1 = m1(2,2,2,1);
        boolean z2 = m2(2,7);
        String z3 = m3(2000);
        System.out.println(z1+"\n"+z2+"\n"+z3);
    }

    static int m1(int a,int b,int c,int d){
        int x = 0;
        if (d == 0) System.out.println("На 0 делить нельзя!");
        else x = a * (b + (c / d) );
        return x;
        //В данном примере проще вывод делать через метод,
        //а не возвращать значение, т.к. появляется лишний 0
        //static void m1(int a,int b,int c,int d){
        //if (d == 0) System.out.println("На 0 делить нельзя!");
        //else System.out.println(x = a * (b + (c / d) ));
        //}
        //Или делать метот String, тогда возврат будет корректный
    }

    static boolean m2(int a,int b){
        int x = a + b;
        if(x >= 10 && x <= 20) return true;
        return false;
    }

    static String m3(int a){
        boolean b=false;
        if(a%400==0||a%4==0) b=true;
        else if(a%100==0) b=false; //Так короче, 2 условия вместо четырех
        if (b==true) return "Високосный!";
        return "Не високосный!";
    }

}
