package ru.geekbrains.java1.dz.dz5.ПавелМильденбергер;

import java.util.Scanner;

/**
 * где класс Animal ???
 */
public class Main {
    public static void main(String[] args) {

        Animals[] anims = new Animals[4];
        anims[0] = new Cat("РњСѓСЂР·РёРє", 3, 3, 4);
        anims[1] = new Dog("Р‘РѕР±РёРє", 2, 2, 15);
        anims[2] = new Horse("РљРѕРЅСЊ", 2, 5, 20);
        anims[3] = new Dog("Р’Р°СЃСЏ", 1, 3, 200);

//game 1 РїСЂС‹РіР°С‚СЊ
        Scanner sc1 = new Scanner(System.in);
        System.out.println("РџРµСЂРѕРµ Р·Р°РґР°РЅРёРµ - РїСЂС‹Р¶РєРё. Р—Р°РґР°Р№С‚Рµ РІС‹СЃРѕС‚Сѓ РїСЂРµРіСЂР°РґС‹ РІ РјРµС‚СЂР°С…");
        int j = sc1.nextInt();

        for (int i = 0; i < anims.length; ++i) {
//            anims[i].jump(j);
        }


//game 2 Р±РµР¶Р°С‚СЊ
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Р’С‚РѕСЂРѕРµ Р·Р°РґР°РЅРёРµ - Р±РµРі. Р—Р°РґР°Р№С‚Рµ РґРёСЃС‚Р°РЅС†РёСЋ РІ РјРµС‚СЂР°С…");
        int r = sc2.nextInt();

        for (int i = 0; i < anims.length; ++i) {
//            anims[i].run(r);
        }

//game 3 РїСЂРѕРїР»С‹С‚СЊ
        Scanner sc3 = new Scanner(System.in);
        System.out.println("РўСЂРµС‚СЊРµ Р·Р°РґР°РЅРёРµ - РїР»Р°РІР°РЅРёРµ. Р—Р°РґР°Р№С‚Рµ РґРёСЃС‚Р°РЅС†РёСЋ РІ РјРµС‚СЂР°С…");
        int s = sc3.nextInt();

        for (int i = 0; i < anims.length; ++i) {
            if (anims[i] instanceof Cat)
                System.out.println("РљРѕС‚ РЅРµ СѓРјРµРµС‚ РїР»Р°РІР°С‚СЊ");
//            anims[i].swim(s);
        }



    }

}

