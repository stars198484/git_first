package ru.geekbrains.java1.dz.dz5.НатальяТанина;

/**
 * Created by I_V_Zhukov on 24.05.2016.
 */
public class Main {
    public static void main(String[] args) {
        Animals itemAnimal = new Animals();
        Cat itemCat = new Cat("Р‘Р°СЂСЃРёРє", "Р±РµР»С‹Р№", "РµСЃС‚СЊ, РґР»РёРЅРЅС‹Р№", 2);
        Dog itemDog = new Dog();
        Horse itemHorse = new Horse();

        System.out.println(itemCat);
        itemCat.voiceAnimal();
        itemCat.runAnimal();
        itemCat.swimAnimal();
        itemCat.jumpAnimal(1.85f);

        System.out.println("\n" + itemDog);
        itemDog.runAnimal();
        itemDog.swimAnimal();
        itemDog.jumpAnimal(1);

        System.out.println("\n" + itemHorse);
        itemHorse.runAnimal();
        itemHorse.swimAnimal();
        itemHorse.jumpAnimal(1);
    }
}
