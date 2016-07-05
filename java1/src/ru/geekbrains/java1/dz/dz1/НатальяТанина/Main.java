package ru.geekbrains.java1.dz.dz1.НатальяТанина;

/**
 * Created by I_V_Zhukov on 10.05.2016.
 */
public class Main {
    public static void main(String[] args) {

        // Р—Р°РґР°РЅРёРµ в„–2. РћР±СЉСЏРІР»РµРЅРёРµ Рё РёРЅРёС†РёР°Р»РёР·Р°С†РёСЏ РїРµСЂРµРјРµРЅРЅС‹С… РїСЂРёРјРёС‚РёРІРЅС‹С… С‚РёРїРѕРІ РґР°РЅРЅС‹С…
        byte a=15;
        short b = 30124;
        int c = 1000000;
        long d = 37000L;
        float e = 123.0f;
        double f = 452.75d;

        boolean g = true;

        char h  = 'A';

        System.out.println("a = " + a + ", b = " + b + ", c = " + c + ", d = " +  d + ", e = " + e + ", f = " + f + ", h = " + h);

        takeFormule(4, 7, 15, 1);

        isLeapYear(1804);
        isLeapYear(1900);
        isLeapYear(2013);
        isLeapYear(2000);

        System.out.println(takeFormule(4, 7, 15, 1));
        System.out.println(takeFormule(4, 17, 15, 0));
        System.out.println(takeFormule(4, 7, 15, 6));

        System.out.println(checkSum(8,4));
        System.out.println(checkSum(25,4));
    }

    // Р—Р°РґР°РЅРёРµ в„–3. РќР°РїРёСЃР°С‚СЊ РјРµС‚РѕРґ РІС‹С‡РёСЃР»СЏСЋС‰РёР№ РІС‹СЂР°Р¶РµРЅРёРµ a * (b + (c / d)) Рё РІРѕР·РІСЂР°С‰Р°СЋС‰РёР№ СЂРµР·СѓР»СЊС‚Р°С‚,
    // РіРґРµ a,b,c,d вЂ“ РІС…РѕРґРЅС‹Рµ РїР°СЂР°РјРµС‚СЂС‹ СЌС‚РѕРіРѕ РјРµС‚РѕРґР°.
    public static float takeFormule(int a, int b, int c, int d) {
        if (d == 0)
        {
            return 0;
        }
        else
        {
            return a * (b + ((float)c/d));
        }
    }

    // Р—Р°РґР°РЅРёРµ в„–4. РќР°РїРёСЃР°С‚СЊ РјРµС‚РѕРґ, РїСЂРёРЅРёРјР°СЋС‰РёР№ РЅР° РІС…РѕРґ РґРІР° С‡РёСЃР»Р°, Рё РїСЂРѕРІРµСЂСЏСЋС‰РёР№ С‡С‚Рѕ РёС… СЃСѓРјРјР° Р»РµР¶РёС‚ РІ РїСЂРµРґРµР»Р°С… 10 РґРѕ 20,
    // РµСЃР»Рё РґР° вЂ“ РІРµСЂРЅСѓС‚СЊ true, РІ РїСЂРѕС‚РёРІРЅРѕРј СЃР»СѓС‡Р°Рµ вЂ“ false.
    public static boolean checkSum (int a, int b) {
        int summ = a + b;

        if ((summ > 10) & (summ < 20))
            return true;
        else//!
            return false;
    }

    // Р—Р°РґР°РЅРёРµ в„–5. * РќР°РїРёСЃР°С‚СЊ РјРµС‚РѕРґ, РєРѕС‚РѕСЂС‹Р№ РѕРїСЂРµРґРµР»СЏРµС‚ СЏРІР»СЏРµС‚СЃСЏ Р»Рё РіРѕРґ РІРёСЃРѕРєРѕСЃРЅС‹Рј.
    // РљР°Р¶РґС‹Р№ 4-Р№ РіРѕРґ СЏРІР»СЏРµС‚СЃСЏ РІРёСЃРѕРєРѕСЃРЅС‹Рј, РєСЂРѕРјРµ РєР°Р¶РґРѕРіРѕ 100-РіРѕ, РїСЂРё СЌС‚РѕРј РєР°Р¶РґС‹Р№ 400-Р№ вЂ“ РІРёСЃРѕРєРѕСЃРЅС‹Р№.
    public static void isLeapYear(int dataYear) {
        if (((dataYear % 4 == 0) && (dataYear % 100 != 0)) || ((dataYear % 4 == 0) && (dataYear % 100 == 0) && (dataYear % 400 == 0)))
        {
            System.out.println(dataYear + " РіРѕРґ - РІРёСЃРѕРєРѕСЃРЅС‹Р№.");
        }
        else
        {
            System.out.println(dataYear + " РіРѕРґ РЅРµ СЏРІР»СЏРµС‚СЃСЏ РІРёСЃРєРѕРєРѕСЃРЅС‹Рј.");
        }
    }
}
