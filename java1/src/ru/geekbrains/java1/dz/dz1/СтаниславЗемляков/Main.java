package ru.geekbrains.java1.dz.dz1.СтаниславЗемляков;

import java.util.Scanner;

/**
 * Created by I_V_Zhukov on 10.05.2016.
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = 1;
        boolean b = true;
        double d = 1.33d;
        float f = 123.23f;
        byte bt = -27;
        short shrt = -1000;
        long lng = 506545151;
        char chr = '\u2668';
        System.out.println("Integer = " + i);
        System.out.println("Boolean = " + b);
        System.out.println("Double = " + d);
        System.out.println("Float = " + f);
        System.out.println("Byte = " + bt);
        System.out.println("Short = " + shrt);
        System.out.println("Long = " + lng);
        System.out.println("Char = " + chr);
        System.out.println();
        System.out.println("Р©РёС‰Р°СЃ Р±СѓРґРµРј С‰РёС‚Р°С‚СЊ РІРёСЂР°С€РµРЅРёР№ a * (b + (c / d))...");
        System.out.print("Р¤С„РёРґРёС‚Рµ СЃРЅР°С‡РµРЅРёР№ РїРёСЂРёРµРЅРЅС‹Р№ a:");
        float q = in.nextFloat();
        System.out.print("РўРёРїРµСЂСЊ С„С„РµРґРёС‚Рµ РїРёСЂРёРјРµРЅРЅС‹Р№ b: ");
        float w = in.nextFloat();
        System.out.print("РџРёСЂРёРјРµРЅРЅС‹Р№ c:                ");
        float e = in.nextFloat();
        System.out.print("d:                           ");
        float r = in.nextFloat();
        System.out.println("РўРёРїРµСЂСЊ С„СЃС‘ С‰РёС‚Р°РёРјР°РЅР°:        " + calc(q, w, e, r));
        System.out.println();
        System.out.println("Р”Р°С„Р°Р№ СЃСЂР°С„РЅРёС„Р°С‚СЊ С‚С‡РёСЃР»Р°!..");
        System.out.print("Р¤С„РµРґРё РїРµСЂС„С‹Р№ С‡РёСЃР»Рѕ:          ");
        int z = in.nextInt();
        System.out.print("Р¤С‚РѕСЂРѕР№:                      ");
        int x = in.nextInt();
        System.out.println("10 < a + b < 20:             " + compare( z , x ));
        System.out.println();
        System.out.println("РљР°РєРѕР№ РіРѕРґ РїСЂРѕРІРµСЂСЏРµРј?");
        int year = in.nextInt();
        System.out.println("РџСЂРѕРІРµСЂСЏРµРј " + year + " РіРѕРґ...");
//        System.out.println("Р­С‚РѕС‚ РіРѕРґ РєСЂР°С‚РµРЅ С‡РµС‚С‹СЂС‘Рј / С‡РµС‚С‹СЂС‘РјСЃС‚Р°Рј Рё РЅРµ РєСЂР°С‚РµРЅ СЃРѕС‚РЅРµ - " + yearCheck4and400not100(year));
//        System.out.println("Р­С‚РѕС‚ РіРѕРґ РќР• РєСЂР°С‚РµРЅ СЃРѕС‚РЅРµ - " + yearCheck100not400(year));
        if (/*yearCheck100not400(year) == true */ yearCheck4and400not100(year)) {
            System.out.println("Р­С‚Рѕ РІРёСЃРѕРєРѕСЃРЅС‹Р№ РіРѕРґ.");
        } else {
            System.out.println("РќРµРІРёСЃРѕРєРѕСЃРЅС‹Р№ РіРѕРґ.");
        }
    }

    //в—Џ	РќР°РїРёСЃР°С‚СЊ РјРµС‚РѕРґ РІС‹С‡РёСЃР»СЏСЋС‰РёР№ РІС‹СЂР°Р¶РµРЅРёРµ a * (b + (c / d)) Рё РІРѕР·РІСЂР°С‰Р°СЋС‰РёР№ СЂРµР·СѓР»СЊС‚Р°С‚, РіРґРµ a,b,c,d вЂ“ РІС…РѕРґРЅС‹Рµ РїР°СЂР°РјРµС‚СЂС‹ СЌС‚РѕРіРѕ РјРµС‚РѕРґР°.
    private static float calc(float a, float b, float c, float d) {
        return (a * (b + (c / d)));
    }

    //в—Џ	РќР°РїРёСЃР°С‚СЊ РјРµС‚РѕРґ, РїСЂРёРЅРёРјР°СЋС‰РёР№ РЅР° РІС…РѕРґ РґРІР° С‡РёСЃР»Р°, Рё РїСЂРѕРІРµСЂСЏСЋС‰РёР№ С‡С‚Рѕ РёС… СЃСѓРјРјР° Р»РµР¶РёС‚ РІ РїСЂРµРґРµР»Р°С… 10 РґРѕ 20, РµСЃР»Рё РґР° вЂ“ РІРµСЂРЅСѓС‚СЊ true, РІ РїСЂРѕС‚РёРІРЅРѕРј СЃР»СѓС‡Р°Рµ вЂ“ false.
    private static boolean compare(int a, int b) {
//        a = 4;
//        b = 4;
        if (10 < (a + b) && (a + b) < 20) {
//            System.out.println("РўСЂСѓ, РЅР°С‰СЏР»СЊРЅРёРєРµ!");
            return true;
        } else {//!
//            System.out.println("Р¤РѕР»СЃ,РЅР°С‰Р°Р»СЊРЅРёРєРµ!");
            return false;
        }
    }

    //    в—Џ	* РќР°РїРёСЃР°С‚СЊ РјРµС‚РѕРґ, РєРѕС‚РѕСЂС‹Р№ РѕРїСЂРµРґРµР»СЏРµС‚ СЏРІР»СЏРµС‚СЃСЏ Р»Рё РіРѕРґ РІРёСЃРѕРєРѕСЃРЅС‹Рј. РљР°Р¶РґС‹Р№ 4-Р№ РіРѕРґ СЏРІР»СЏРµС‚СЃСЏ РІРёСЃРѕРєРѕСЃРЅС‹Рј, РєСЂРѕРјРµ РєР°Р¶РґРѕРіРѕ 100-РіРѕ, РїСЂРё СЌС‚РѕРј РєР°Р¶РґС‹Р№ 400-Р№ вЂ“ РІРёСЃРѕРєРѕСЃРЅС‹Р№
    private static boolean yearCheck4and400not100(int year) {
        /*if*/ return (year % 4 == 0 && year != 100 && year != 200 && year !=300 && year !=500 && year !=600 && year !=700 && year !=900 && year != 1000 && year!=1100 && year !=1300 &&
                year != 1400 && year !=1500 && year !=1700 && year !=1800 && year !=1900);
            /*return true;
        else return false;*/
    }
}
