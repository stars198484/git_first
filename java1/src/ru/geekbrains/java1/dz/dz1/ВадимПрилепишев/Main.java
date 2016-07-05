package ru.geekbrains.java1.dz.dz1.ВадимПрилепишев;

/**
 * Created by I_V_Zhukov on 10.05.2016.
 */
public class Main {
    public static void main(String[] args){

        byte byteVal;
        short shortVal;
        int intVal;
        long longVal;
        float floatVal;
        double doubleVal;
        boolean booleanVal;
        char charVal;

        byteVal = 127;
        shortVal = 32767;
        intVal = 2147483647;
        longVal = 15000L;
        floatVal = 120.9f;
        doubleVal = 15.767668;
        booleanVal = false;
        charVal = 'a';

        System.out.println(evalExpr(2, 3, 4, 5)); // Р’С‹Р·РѕРІ РјРµС‚РѕРґР° РІРѕР·РІСЂР°С‰Р°СЋС‰РµРіРѕ Р·РЅР°С‡РµРЅРёРµ РІС‹СЂР°Р¶РµРЅРёСЏ a * (b + (c / d))
        System.out.println(intervalCheck(9, 2)); // РџСЂРѕРІРµСЂРєР° РёРЅС‚РµСЂРІР°Р»Р° СЃСѓРјРјС‹ РґРІСѓС… С‡РёСЃРµР», РѕС‚ 10 РґРѕ 20. true
        System.out.println(intervalCheck(8,13)); // РџСЂРѕРІРµСЂРєР° РёРЅС‚РµСЂРІР°Р»Р° СЃСѓРјРјС‹ РґРІСѓС… С‡РёСЃРµР», РѕС‚ 10 РґРѕ 20. false
        leapYear(2016); // 2016 РІС‹СЃРѕРєРѕСЃРЅС‹Р№ РіРѕРґ
        leapYear(2014); // 2014 РЅРµ РІС‹СЃРѕРєРѕСЃРЅС‹Р№ РіРѕРґ
        leapYear(1900); // 1900 РЅРµ РІС‹СЃРѕРєРѕСЃРЅС‹Р№ РіРѕРґs

    }

    public static double evalExpr(double a, double b, double c, double d){
        double result = a * (b + (c / d));//!
        return result;
    }

    public static boolean intervalCheck(int a,int b){
        boolean result;
        int summ = a + b;

        if(summ > 10 && summ < 20) result = true;
        else result = false;

        return result;//!
    }

    public static void leapYear(int year){

        if((year % 4) == 0 && (year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + "Leap Year");
        }
        else System.out.println(year + "Not Leap Year");
    }

}
