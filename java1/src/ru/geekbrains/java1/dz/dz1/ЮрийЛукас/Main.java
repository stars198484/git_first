package ru.geekbrains.java1.dz.dz1.ЮрийЛукас;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Created by I_V_Zhukov on 10.05.2016.
 */
public class Main {
    public static void main(String[] args) {
        int i =1;
        float a=2;
        boolean rf = false;
        long h = 22;
        byte b = 12;
        short q =345;
        double w = 122;
        char c = 'a';

        System.out.println(" 2000 РіРѕРґ - " + message(isLeapYear(2000)));
        System.out.println(" 1999 РіРѕРґ - " + message(isLeapYear(1999)));
        System.out.println("----------------------------------------");
        System.out.println(" 2000 РіРѕРґ - " + message(isLeapYear2(2000)));
        System.out.println(" 1999 РіРѕРґ - " + message(isLeapYear2(1999)));
        System.out.println("----------------------------------------");
        System.out.println(" calc(2,"+i+",4,2) = " + calc(2,i,4,2));
        System.out.println("----------------------------------------");
        System.out.println(" РџСЂРѕРІРµСЂРєР° С‡С‚Рѕ СЃСѓРјРјР° РґРІСѓС… С‡РёСЃРµР» (5,7) Р±РѕР»СЊС€Рµ РёР»Рё СЂР°РІРЅР° 10 Рё РјРµРЅСЊС€Рµ РёР»Рё СЂР°РІРЅРѕ 20 " + check( 5,7));
        System.out.println(" РџСЂРѕРІРµСЂРєР° С‡С‚Рѕ СЃСѓРјРјР° РґРІСѓС… С‡РёСЃРµР» (6,17) Р±РѕР»СЊС€Рµ РёР»Рё СЂР°РІРЅР° 10 Рё РјРµРЅСЊС€Рµ РёР»Рё СЂР°РІРЅРѕ 20 " + check( 6,17));
    }

    public static String message(boolean isLeap){
        if(isLeap){
            return "РІС‹СЃРѕРєРѕСЃС‚РЅС‹Р№";
        }
        return "РЅРµ РІС‹СЃРѕРєРѕСЃС‚РЅС‹Р№";
    }

    public static float calc(int a, int b, int c, int d){
        return a*(b + (c/d));
    }

    public static boolean isLeapYear( int year){
        if( year % 400 == 0 || year % 4 == 0){
            return true;
        }
        return false;
    }

    public static boolean isLeapYear2(int year){
        Calendar calendar = new GregorianCalendar(year,11,31);
        if(calendar.get(Calendar.DAY_OF_YEAR) == 366){
            return true;
        }
        return false;
    }

    public static boolean check(int a, int b){
        int c = a+b;
        if(c >= 10 & c <= 20){
            return true;
        }
        return false;
    }
}
