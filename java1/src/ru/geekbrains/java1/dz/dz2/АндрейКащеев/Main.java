package ru.geekbrains.java1.dz.dz2.АндрейКащеев;

import java.util.Scanner;

/**
 * Created by I_V_Zhukov on 10.05.2016.
 */
public class Main {
    public static void main(String[] args) {
        //РЎРѕР·РґР°С‚СЊ РјР°СЃСЃРёРІ СЃРѕСЃС‚РѕСЏС‰РёР№ РёР· СЌР»РµРјРµРЅС‚РѕРІ 0 Рё 1, РЅР°РїСЂРёРјРµСЂ int[] arr = { 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 };
        int[] arr1 = {1,1,0,0,1,0,1,0,0,0};

        for (int a :arr1) System.out.println(a);
        System.out.println("----------");

        //Р’ РјР°СЃСЃРёРІРµ РёР· РїСЂРµРґС‹РґСѓС‰РµРіРѕ РїСѓРЅРєС‚Р°, СЃ РїРѕРјРѕС‰СЊСЋ С†РёРєР»Р° Р·Р°РјРµРЅРёС‚СЊ 0 РЅР° 1, 1 РЅР° 0;
        for (int i = 0; i < arr1.length; i++) arr1[i] ^= 1;
        for (int a :arr1) System.out.println(a);
        System.out.println("----------");

        //РЎРѕР·РґР°С‚СЊ РјР°СЃСЃРёРІ РёР· 8 С†РµР»С‹С… С‡РёСЃРµР». РЎ РїРѕРјРѕС‰СЊСЋ С†РёРєР»Р° Р·Р°РїРѕР»РЅРёС‚СЊ РµРіРѕ Р·РЅР°С‡РµРЅРёСЏРјРё 1 4 7 10 13 16 19 22;
        int[] arr2 = new int[8];
        arr2[0] = 1;
        for (int i = 1; i < arr2.length; i++) arr2[i] = arr2[i-1] + 3;
        for (int a :arr2) System.out.println(a);
        System.out.println("----------");

        //Р—Р°РґР°С‚СЊ РјР°СЃСЃРёРІ int[] mas = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        // РїСЂРѕР№С‚Рё РїРѕ РЅРµРјСѓ С†РёРєР»РѕРј, Рё С‡РёСЃР»Р° РєРѕС‚РѕСЂС‹Рµ РјРµРЅСЊС€Рµ 6 СѓРјРЅРѕР¶РёС‚СЊ РЅР° 2.
        int[] mas = {1,5,3,2,11,4,5,2,4,8,9,1};
        for (int i = 0; i < mas.length; i++)
            if (mas[i] < 6) mas[i] *= 2;
        for (int a :mas) System.out.println(a);
        System.out.println("----------");

        //* Р—Р°РґР°С‚СЊ РѕРґРЅРѕРјРµСЂРЅС‹Р№ РјР°СЃСЃРёРІ Рё РЅР°Р№С‚Рё РІ РЅРµРј РјРёРЅРёРјР°Р»СЊРЅС‹Р№ Рё РјР°РєСЃРёРјР°Р»СЊРЅС‹Р№ СЌР»РµРјРµРЅС‚С‹;
//        System.out.println("Array mas min value is " + Arrays.stream(mas).min().getAsInt());
//        System.out.println("Array mas max value is " + Arrays.stream(mas).max().getAsInt());

        //РќР°РїРёСЃР°С‚СЊ РїСЂРѕСЃС‚РѕР№ РєРѕРЅСЃРѕР»СЊРЅС‹Р№ РєР°Р»СЊРєСѓР»СЏС‚РѕСЂ. РџРѕР»СЊР·РѕРІР°С‚РµР»СЊ РІРІРѕРґРёС‚ РґРІР° С‡РёСЃР»Р° Рё РѕРїРµСЂР°С†РёСЋ РєРѕС‚РѕСЂСѓСЋ С…РѕС‡РµС‚ РІС‹РїРѕР»РЅРёС‚СЊ,
        //РїСЂРѕРіСЂР°РјРјР° РІС‹С‡РёСЃР»СЏРµС‚ СЂРµР·СѓР»СЊС‚Р°С‚ Рё РІС‹РІРѕРґРёС‚ РІ РєРѕРЅСЃРѕР»СЊ;

        Scanner sc = new Scanner(System.in);
        int res=0; //РїРѕС‡РµРјСѓ РµСЃР»Рё РЅРµ СѓРєР°Р·Р°С‚СЊ =0, С‚Рѕ РЅРёР¶Рµ РїРёС€РµС‚ С‡С‚Рѕ РїРµСЂРµРјРµРЅРЅР°СЏ РЅРµ РѕР±СЉСЏРІР»РµРЅР°?
        System.out.println("Р’РІРµРґРёС‚Рµ С‡РёСЃР»Рѕ 1:");
        int n1 = sc.nextInt();
        System.out.println("Р’РІРµРґРёС‚Рµ С‡РёСЃР»Рѕ 2:");
        int n2 = sc.nextInt();
        System.out.println("Р’РІРµРґРёС‚Рµ РґРµР№СЃС‚РІРёРµ: + - * /");

        switch(sc.next()){
            case "+": res = n1 + n2; break;
            case "-": res = n1 - n2; break;
            case "*": res = n1 * n2; break;
            case "/": res = n1 / n2; break;
        }
        System.out.println(res);

    }

}

