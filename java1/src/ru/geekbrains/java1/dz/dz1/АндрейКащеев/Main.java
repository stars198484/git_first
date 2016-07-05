package ru.geekbrains.java1.dz.dz1.АндрейКащеев;

/**
 * Created by I_V_Zhukov on 10.05.2016.
 */
public class Main {
    public static void main(String[] args){
        byte    my_byte = 0;
        short   my_short =0;
        int     my_int = 0;
        long    my_long = 0;
        float   my_float = 0;
        double  my_double = 0;
        boolean my_boolean = false;
        char    my_char = 'X';

        System.out.println(compute(2,2,2,10));
        System.out.println(isInInterval(12,-2));
        System.out.println(isYearV(2016));
    }
    public static float compute(float a,float b,float c,float d){
        return a * (b + (c / d));
    }
    public static boolean isInInterval(int a,int b){
        if ((a+b) >=10 && (a+b) <=20)
            return true;
        else return false;//!
    }
    /*	РќР°РїРёСЃР°С‚СЊ РјРµС‚РѕРґ, РєРѕС‚РѕСЂС‹Р№ РѕРїСЂРµРґРµР»СЏРµС‚ СЏРІР»СЏРµС‚СЃСЏ Р»Рё РіРѕРґ РІРёСЃРѕРєРѕСЃРЅС‹Рј.
    РљР°Р¶РґС‹Р№ 4-Р№ РіРѕРґ СЏРІР»СЏРµС‚СЃСЏ РІРёСЃРѕРєРѕСЃРЅС‹Рј, РєСЂРѕРјРµ РєР°Р¶РґРѕРіРѕ 100-РіРѕ, РїСЂРё СЌС‚РѕРј РєР°Р¶РґС‹Р№ 400-Р№ вЂ“ РІРёСЃРѕРєРѕСЃРЅС‹Р№.
     */
    public static boolean isYearV(int a){
        if (a % 400 == 0) return true;
        if (a % 100 == 0) return false;
        if (a % 4 == 0) return true;
        return false;
    }
}
