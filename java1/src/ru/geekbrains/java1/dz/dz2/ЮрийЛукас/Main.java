package ru.geekbrains.java1.dz.dz2.ЮрийЛукас;

import java.util.Arrays;

/**
 * Created by I_V_Zhukov on 10.05.2016.
 */
public class Main {
    private static Calculator myCalculator;

    public static void main(String[] args) {

        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        int[] listInt = new int[8];
        int[] mas = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        int itemVal = 1;

        for (int i = 0; i < 8; i++) {
            listInt[i] = itemVal;
            itemVal += 3;
        }

        System.out.println("РРЅРёС†РёР°Р»РёР·Р°С†РёСЏ РјР°СЃСЃРёРІР° С‡РµСЂРµР· С†РёРєР»: ");
        System.out.println(Arrays.toString(listInt));

        System.out.println("----------------------------------------------------");
        System.out.println("РСЃС…РѕРґРЅС‹Р№ РјР°СЃСЃРёРІ:       " + Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (arr[i] == 1) ? 0 : 1;
        }
        System.out.println("Р РµР·СѓР»СЊС‚РёСЂСѓСЋС‰РёР№ РјР°СЃСЃРёРІ: " + Arrays.toString(arr));
        System.out.println("----------------------------------------------------");
        System.out.println("РЈРјРЅРѕР¶РµРЅРёРµ СЌР»РµРјРµРЅС‚РѕРІ РјР°СЃСЃРёРІР° РјРµРЅСЊС€Рµ 6 РЅР° 2");
        System.out.println("РСЃС…РѕРґРЅС‹Р№ РјР°СЃСЃРёРІ:       " + Arrays.toString(mas));
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] < 6) {
                mas[i] *= 2;
            }
        }
        System.out.println("Р РµР·СѓР»СЊС‚РёСЂСѓСЋС‰РёР№ РјР°СЃСЃРёРІ: " + Arrays.toString(mas));

        System.out.println("----------------------------------------------------");

        float[] randomArr = new float[10];

        for (int i = 0; i < randomArr.length; i++) {
            randomArr[i] = (float) (Math.random() * 10);
        }

        System.out.println("РЎРѕРґРµСЂР¶Р°РЅРёРµ РјР°СЃСЃРёРІР° " + Arrays.toString(randomArr));
        Arrays.sort(randomArr);
        System.out.println("Р­Р»РµРјРµРЅС‚ СЃ РјРёРЅРёРјР°Р»СЊРЅС‹Рј Р·РЅР°С‡РµРЅРёРµРј РјР°СЃСЃРёРІР°  - " + randomArr[0]);
        System.out.println("Р­Р»РµРјРµРЅС‚ СЃ РјР°РєСЃРёСЃР°Р»СЊРЅС‹Рј Р·РЅР°С‡РµРЅРёРµРј РјР°СЃСЃРёРІР° - " + randomArr[randomArr.length - 1]);

        System.out.println("----------------------------------------------------");

        myCalculator = new Calculator();
        myCalculator.input();
        System.out.println(" Р РµР·СѓР»СЊС‚Р°С‚ " + myCalculator.calc());
    }

}
