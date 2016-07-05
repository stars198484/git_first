package ru.geekbrains.java1.dz.dz5.ИльяФиалковский;

import java.util.Scanner;

/**
 * Created by I_V_Zhukov on 10.05.2016.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Animals[] animals = new Animals[3];
        animals[0] = new Cat();
        animals[1] = new Horse();
        animals[2] = new Dog();
        do{
            System.out.println("Р’С‹Р±РµСЂРёС‚Рµ Р¶РёРІРѕС‚РЅРѕРµ: 1 - РљРѕС€РєР°, 2 - Р›РѕС€Р°РґСЊ, 3 - Р С‹Р±РєР°, 0 - РІС‹С…РѕРґ.");
            int a = scanner.nextInt();
            System.out.println("Р’С‹Р±РµСЂРёС‚Рµ РґРµР№СЃС‚РІРёРµ: 1 - РїСЂС‹Р¶РѕРє, 2 - РіРѕР»РѕСЃ, 3 - РїР»С‹С‚СЊ, 4 - Р»РµР¶Р°С‚СЊ, 0 - РІС‹С…РѕРґ.");
            int b = scanner.nextInt();
            if(a==0||b==0) {
                System.out.println("Р’С‹С…РѕРґ...");
                break;
            }
            if(a<0||a>3||b<0||b>4) {
                System.out.println("Р’С‹Р±РѕСЂ РЅРµ СЂР°СЃРїРѕР·РЅР°РЅ... РџРѕРїСЂРѕР±СѓР№С‚Рµ Р·Р°РЅРѕРІРѕ\n");
                continue;
            }
            //РїСЂРѕРІРµСЂРєР° РіРёС‚Р° // git test
            a--;
            System.out.println();
            animals[a].Name();
            switch (b){
                case 1:
                    animals[a].Jump();
                    break;
                case 2:
                    animals[a].Voice();
                    break;
                case 3:
                    animals[a].Swim();
                    break;
                case 4:
                    animals[a].Lay();
                    break;
            }
            System.out.println();
        }while (true);

    }
}