package ru.geekbrains.java1.dz.dz1.АлександрВасиленко;

/**
 * Created by I_V_Zhukov on 10.05.2016.
 */
public class HomeWork {
    public static void main(String[] args) {
        //Объявление пройденных переменных и их инициализация
        byte vByte = 2;
        short vSort = 3;
        int vInt = 4;
        long vLong = 5;
        float vFloat = 6.2f;
        double vDouble = 7.123;
        boolean vBool = false;
        char vChar = 's';

        //проверка работы метода getRez
        int a=1;
        int b=2;
        int c=3;
        int d=4;
        System.out.println("Результат вычисления "+a+"*("+b+"+("+c+"/"+d+")) = "+getRez(a,b,c,d));

        //Проверка работы метода isSumBetween10And20
        int e=10;
        int f=2;
        System.out.println("сумма чисел "+e+" + "+ f+" между 10 и 20? - "+isSumBetween10And20(e,f));

        //Проверка работы метода вычисления високостный ли год
        int year = 2015;
        System.out.println("Год "+year+" "+(isYearLaep(year)?"високосный":"не високосный"));
    }

    /*Этот метод возвращает результат вычисления a * (b + (c / d))
     * т.к. деление целочисленное, один аргуемет в вычислени делаем double*/
    private static double getRez(int a,int b, int c, int d){
        return a*(b+((double)c/d));
    }

    /*Этот метод возвращает true, если сумма чисел a и b в промежутке между 10 и 20,
     * и не равна им*/
    private static boolean isSumBetween10And20(int a, int b){
        int sum = a+b;
        if (sum>10&&sum<20){
            return true;
        }else return false;//!
    }

    /*Метот возвращает true, если год високосный, и false если не високостный*/
    private static boolean isYearLaep(int year){
        if ( ((year%4==0)&&(year%100!=0))||year%400==0)return true;//!
        else return false;//!
    }

}
