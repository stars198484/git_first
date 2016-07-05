package ru.geekbrains.java1.dz.dz1.ПавелМатвеев;

/**
 * Created by I_V_Zhukov on 10.05.2016.
 */
public class Main {
    public static void main(String[] args){
        byte vByte = 127;
        short vShort = 32767;
        int vInt = 2147483647;
        long vLong = 9223372036854775807L;
        float vFloat = 30.24f;
        double vDouble = 4530.34d;
        boolean vBool = true;
        char vChar = 'r';


        //РљР°РєРёРµ-С‚Рѕ РІС‹С‡РёСЃР»РµРЅРёСЏ
        System.out.println(calculate(2, 2, 12, 4));

        //РџСЂРѕРІРµСЂРєР° РЅР° РґРёР°РїР°Р·РѕРЅ С‡РёСЃР»Р° 10 - 20
        System.out.println(checkSumm(10,20));
        System.out.println(checkSumm2(10,10));

        //РџСЂРѕРІРµСЂРєР° РЅР° РІРёСЃРѕРєРѕСЃРЅС‹Р№ РіРѕРґ
        System.out.println("4: "+leap(4));
        System.out.println("5: "+leap(5));
        System.out.println("900: "+leap(900));
        System.out.println("1200: "+leap(1200));
    }

    private static int calculate(int a, int b, int c, int d){
        return a * (b + (c / d));//!
    }

    private static boolean checkSumm(int a, int b){
        int c = a + b;

        if(c > 10 && c < 20){
            return true;
        }

        return false;
    }

    /*
    * IDEA РїРѕРґСЃРєР°Р·Р°Р»Р°, С‡С‚Рѕ РјРѕР¶РЅРѕ РЅРµ РёСЃРїРѕР»СЊР·РѕРІР°С‚СЊ СѓСЃР»РѕРІРёРµ, РµСЃР»Рё С‚РёРї РјРµС‚РѕРґР° boolean.
    * РџРѕ СЌС‚РѕРјСѓ СЂРµС€РёР» РЅР°РїРёСЃР°С‚СЊ РµС‰Рµ РѕРґРёРЅ РјРµС‚РѕРґ Р°РЅР°Р»РѕРі.
    * */
    private static boolean checkSumm2(int a, int b){
        int c = a + b;

        return (c >= 10 && c <= 20);
    }

    private static boolean leap(int year){
        if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            return true;
        }

        //Р›РёР±Рѕ С‚Р°Рє
        /*else if(year %400 == 0){
            return true;
        }*/

        return false;
    }
}
