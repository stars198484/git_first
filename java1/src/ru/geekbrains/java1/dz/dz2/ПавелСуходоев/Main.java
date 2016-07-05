package ru.geekbrains.java1.dz.dz2.ПавелСуходоев;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by I_V_Zhukov on 10.05.2016.
 */
public class Main {
    public static void main(String[] args) {

        /*
            1 Р·Р°РґР°РЅРёРµ
            РЎРѕР·РґР°С‚СЊ РјР°СЃСЃРёРІ СЃРѕСЃС‚РѕСЏС‰РёР№ РёР· СЌР»РµРјРµРЅС‚РѕРІ 0 Рё 1, РЅР°РїСЂРёРјРµСЂ int[] arr = { 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 };
         */
        int[] binArray = {1, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0};

        /*
            2 Р·Р°РґР°РЅРёРµ
            Р’ РјР°СЃСЃРёРІРµ РёР· РїСЂРµРґС‹РґСѓС‰РµРіРѕ РїСѓРЅРєС‚Р°, СЃ РїРѕРјРѕС‰СЊСЋ С†РёРєР»Р° Р·Р°РјРµРЅРёС‚СЊ 0 РЅР° 1, 1 РЅР° 0;
         */
        for (int i = 0; i < binArray.length; i++) {
            binArray[i] = binArray[i] == 0 ? 1 : 0;
        }
        System.out.println(Arrays.toString(binArray));

        /*
            3 Р·Р°РґР°РЅРёРµ
            РЎРѕР·РґР°С‚СЊ РјР°СЃСЃРёРІ РёР· 8 С†РµР»С‹С… С‡РёСЃРµР». РЎ РїРѕРјРѕС‰СЊСЋ С†РёРєР»Р° Р·Р°РїРѕР»РЅРёС‚СЊ РµРіРѕ Р·РЅР°С‡РµРЅРёСЏРјРё 1 4 7 10 13 16 19 22;
         */

        int[] mas = new int[8];
        for (int k = 0, d = 1; k < mas.length; k++, d += 3) {
            mas[k] = d;
        }
        System.out.println(Arrays.toString(mas));

        /*
            4 Р·Р°РґР°РЅРёРµ
           Р—Р°РґР°С‚СЊ РјР°СЃСЃРёРІ int[] mas = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 }; РїСЂРѕР№С‚Рё РїРѕ РЅРµРјСѓ С†РёРєР»РѕРј, Рё С‡РёСЃР»Р°
            РєРѕС‚РѕСЂС‹Рµ РјРµРЅСЊС€Рµ 6 СѓРјРЅРѕР¶РёС‚СЊ РЅР° 2.
         */
        int[] mas1 = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        for (int i = 0; i < mas1.length; i++) {
            mas1[i] = mas1[i] <= 6 ? mas1[i] * 2 : mas1[i];
        }
        System.out.println(Arrays.toString(mas1));

        /*
            5 Р·Р°РґР°РЅРёРµ *
           * Р—Р°РґР°С‚СЊ РѕРґРЅРѕРјРµСЂРЅС‹Р№ РјР°СЃСЃРёРІ Рё РЅР°Р№С‚Рё РІ РЅРµРј РјРёРЅРёРјР°Р»СЊРЅС‹Р№ Рё РјР°РєСЃРёРјР°Р»СЊРЅС‹Р№ СЌР»РµРјРµРЅС‚С‹;
         */
        int[] inputArray = { 4, 6, 7, 2, 34, 76, 11, 38, 74, 83, 15, 28};
        int min = inputArray[0];
        int max = inputArray[0];

        for (int i = 1; i < inputArray.length; i++) {
            min = inputArray[i] < min ? inputArray[i] : min;
            max = inputArray[i] > max ? inputArray[i] : max;
        }
        System.out.println("min = " + min + ", max = " + max);

        /*
            6 Р·Р°РґР°РЅРёРµ
            ** РќР°РїРёСЃР°С‚СЊ РїСЂРѕСЃС‚РѕР№ РєРѕРЅСЃРѕР»СЊРЅС‹Р№ РєР°Р»СЊРєСѓР»СЏС‚РѕСЂ. РџРѕР»СЊР·РѕРІР°С‚РµР»СЊ РІРІРѕРґРёС‚ РґРІР° С‡РёСЃР»Р° Рё РѕРїРµСЂР°С†РёСЋ
            РєРѕС‚РѕСЂСѓСЋ С…РѕС‡РµС‚ РІС‹РїРѕР»РЅРёС‚СЊ, РїСЂРѕРіСЂР°РјРјР° РІС‹С‡РёСЃР»СЏРµС‚ СЂРµР·СѓР»СЊС‚Р°С‚ Рё РІС‹РІРѕРґРёС‚ РІ РєРѕРЅСЃРѕР»СЊ;
         */
        //Р’ РѕС‚РґРµР»СЊРЅРѕРј РјРµС‚РѕРґРµ РґР»СЏ РЅР°РіР»СЏРґРЅРѕСЃС‚Рё
        consoleCalc();
    }

    private static void consoleCalc() {
        int a, b;
        String oper;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Р’РІРµРґРёС‚Рµ РїРµСЂРІС‹Р№ РѕРїРµСЂР°РЅРґ: ");
        a = scanner.nextInt();
        System.out.println("Р’РІРµРґРёС‚Рµ РІС‚РѕСЂРѕР№ РѕРїРµСЂР°РЅРґ: ");
        b = scanner.nextInt();

        System.out.print("Р’РІРµРґРёС‚Рµ РѕРїРµСЂР°С†РёСЋ: ");
        //РЅРµ РґР°РµС‚ Р·Р°РІРµСЂС€РёС‚СЊ РїСЂРѕРіСЂР°РјРјСѓ РЅР°С‚С‹РєР°СЏСЃСЊ РЅР° РєРѕРЅРµС† СЃС‚СЂРѕРєРё
        scanner.nextLine();
        //Р§С‚РµРЅРёРµ РѕРїРµСЂР°С†РёРё
        oper = scanner.nextLine();

        System.out.print("РџС‹С‚Р°РµРјСЃСЏ РїРѕСЃС‡РёС‚Р°С‚СЊ РІС‹СЂР°Р¶РµРЅРёРµ: " + a + oper + b + " = ");
        switch (oper) {
            case "*":
                System.out.print(a * b);
                break;
            case "+":
                System.out.print(a + b);
                break;
            case "-":
                System.out.print(a - b);
                break;
            case "/":
                if (b != 0) {
                    System.out.print(a / b);
                } else {
                    System.out.print("РќР° РЅРѕР»СЊ РґРµР»РёС‚СЊ РЅРµР»СЊР·СЏ");
                }
                break;
            default:
                System.out.println("РћРїРµСЂР°С†РёСЏ РЅРµ СЂР°СЃРїРѕР·РЅР°РЅР°!");
        }
    }

}
