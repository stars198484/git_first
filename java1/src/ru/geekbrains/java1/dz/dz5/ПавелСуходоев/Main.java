package ru.geekbrains.java1.dz.dz5.ПавелСуходоев;

import java.util.Scanner;

/**
 * Created by I_V_Zhukov on 10.05.2016.
 */
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Animals[] animals = new Animals[3];
        animals[0] = new Cat("Р’Р°СЃСЏ");
        animals[1] = new Dog("Р‘Р°РєСЃ");
        animals[2] = new Horse("РўР°Р»РєР°");

        int index;
        do {
            System.out.println("Р’С‹Р±РµСЂРёС‚Рµ Р¶РёРІРѕС‚РЅРѕРµ: 0 - РєРѕС‚, 1 - РїРµСЃ, 2 - Р»РѕС€Р°РґСЊ: ");
            index = scanner.nextInt();
        } while (index > 2 || index < 0);

        int action;

        do {
            System.out.println("Р’С‹Р±РµСЂРёС‚Рµ РґРµР№СЃС‚РІРёРµ: 0 - РїСЂС‹РіРЅСѓС‚СЊ, 1 - РїР»Р°РІР°С‚СЊ, 2 - Р±РµР¶Р°С‚СЊ");
            action = scanner.nextInt();
        } while (action > 2 || action < 0);

        switch (action) {
            case 0:
                System.out.println("Р’РІРµРґРёС‚Рµ РІС‹СЃРѕС‚Сѓ РїСЂС‹Р¶РєР°:");
                float alt = scanner.nextFloat();
                animals[index].jump(alt);
                break;
            case 1:
                animals[index].swim();
                break;
            case 2:
                animals[index].run();
                break;
        }
    }
}
