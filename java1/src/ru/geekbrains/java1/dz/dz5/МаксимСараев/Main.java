package ru.geekbrains.java1.dz.dz5.МаксимСараев;

/**
 * Created by I_V_Zhukov on 10.05.2016.
 */
public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog("Р‘Р°СЂР±РѕСЃ", "Р”РІРѕСЂРЅРёРє РґР»СЏ РўРѕР»СЏ", 1);
        System.out.println(dog);
        dog.run(70);
        dog.swim();
        dog.jump(0.5);

        Cat cat = new Cat("Р‘Р°СЃСЏ", "РЎРµСЂРµР¶Р°", 2);
        System.out.println(cat);
        cat.run(60);
        cat.swim();
        cat.jump(1);

        Horse horse = new Horse("РЎРЅРµР¶РѕРє", "РРІР°РЅ РџРµС‚СЂРѕРІРёС‡", 3);
        System.out.println(horse);
        horse.run(30);
        horse.swim();
        horse.jump(2.5);


    }

}
