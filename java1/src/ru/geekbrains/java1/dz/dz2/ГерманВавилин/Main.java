package ru.geekbrains.java1.dz.dz2.ГерманВавилин;

import java.util.Scanner;

/**
 * Created by I_V_Zhukov on 10.05.2016.
 */
public class Main {

    public static void main(String[] args) {

        //Р—Р°РґР°РЅРёРµ 1
        int[] arr = {0,1,0,0,1,1,1,0,1,0,0,0,1,0,1,0,1,0,0,1,0,1,0};
        //Р—Р°РґР°РЅРёРµ 2
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == 0){
                arr[i] = 1;
                continue;
            }
            if(arr[i] == 1) {
                arr[i] = 0;
            }
        }
        //Р—Р°РґР°РЅРёРµ 3
        int[] arr2 = new int[8];
        for (int i = 0; i < arr2.length; i++) {
            switch (i) {
                case 0:
                    arr2[i] = 1;
                    break;
                case 1:
                    arr2[i] = 4;
                    break;
                case 2:
                    arr2[i] = 7;
                    break;
                case 3:
                    arr2[i] = 10;
                    break;
                case 4:
                    arr2[i] = 13;
                    break;
                case 5:
                    arr2[i] = 16;
                    break;
                case 6:
                    arr2[i] = 19;
                    break;
                case 7:
                    arr2[i] = 22;
                    break;
            }
            System.out.print(arr2[i] + ", ");
        }
        //Р—Р°РґР°РЅРёРµ 4
        int[] mas = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        for (int i = 0; i < mas.length; i++) {
            if( mas[i] < 6) mas[i] = 2 * mas[i];
        }
        //Р—Р°РґР°РЅРёРµ *
        minMaxFinder(arrayInit());
        //Р—Р°РґР°РЅРёРµ **
        calc();
    }

    private static int[] arrayInit() {
        Scanner sc = new Scanner(System.in);
        int length = 0;
        while(length <= 0){
            System.out.println("\nР’РІРµРґРёС‚Рµ СЂР°Р·РјРµСЂ РјР°СЃСЃРёРІР°: ");
            length = sc.nextInt();
            if (length <= 0) {
                System.out.println("Р Р°Р·РјРµСЂ РјР°СЃСЃРёРІР° РЅРµ РјРѕР¶РµС‚ Р±С‹С‚СЊ РѕС‚СЂРёС†Р°С‚РµР»СЊРЅС‹Рј РёР»Рё РЅСѓР»РµРІС‹Рј. РџРѕРІС‚РѕСЂРёС‚Рµ РІРІРѕРґ");
            }
        }
        int[] array = new int[length];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Р’РІРµРґРёС‚Рµ Р·РЅР°С‡РµРЅРёРµ СЌР»РµРјРµРЅС‚Р° " + (i+1) + ": ");
            array[i] = sc.nextInt();
        }
        return array;
    }

    private static void minMaxFinder(int[] arrayOfInt){
        int minimal = arrayOfInt[0];
        int maximal = arrayOfInt[0];
        for(int item : arrayOfInt) {
            if(minimal > item) minimal = item;
            if(maximal < item) maximal = item;
        }
        System.out.println("РќР°РёРјРµРЅСЊС€РёР№ СЌР»РµРјРµРЅС‚ РјР°СЃСЃРёРІР°: " + minimal);
        System.out.println("РќР°РёР±РѕР»СЊС€РёР№ СЌР»РµРјРµРЅС‚ РјР°СЃСЃРёРІР°: " + maximal);
    }

    public static void calc () {
        Scanner sc = new Scanner(System.in);
        System.out.println("Р’РІРµРґРёС‚Рµ 1Р№ РѕРїРµСЂР°РЅРґ: ");
        int a = sc.nextInt();
        System.out.println("Р’РІРµРґРёС‚Рµ 2Р№ РѕРїРµСЂР°РЅРґ: ");
        int b = sc.nextInt();
        System.out.println("Р’РІРµРґРёС‚Рµ РґРµР№СЃС‚РІРёРµ (+, -, *, /): ");
        String act = sc.next();
        switch (act){
            case "+" :
                System.out.println("Р РµР·СѓР»СЊС‚Р°С‚: " + (a + b));
                break;
            case "-" :
                System.out.println("Р РµР·СѓР»СЊС‚Р°С‚: " + (a - b));
                break;
            case "*" :
                System.out.println("Р РµР·СѓР»СЊС‚Р°С‚: " + (a * b));
                break;
            case "/" : {
                if(b == 0) {
                    System.out.println("Р”РµР»РµРЅРёРµ РЅР° 0 Р·Р°РїСЂРµС‰РµРЅРѕ");
                }
                else {
                    System.out.println("СЂРµР·СѓР»СЊС‚Р°С‚ :" + ((float)a / (float)b));
                }
            }
            break;
            default:
                System.out.println("РќРµ СЃРѕРѕС‚РІРµС‚РІСѓРµС‚ СЃР»РѕР¶РµРЅРёСЋ, РІС‹С‡РёС‚Р°РЅРёСЋ, СѓРјРЅРѕР¶РµРЅРёСЋ РёР»Рё РґРµР»РµРЅРёСЋ");
        }
    }
}
