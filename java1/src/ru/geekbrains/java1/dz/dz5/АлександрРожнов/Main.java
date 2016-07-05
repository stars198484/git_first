package ru.geekbrains.java1.dz.dz5.АлександрРожнов;

import java.util.Scanner;

/**
 * Created by I_V_Zhukov on 24.05.2016.
 */
public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Animals a1 = new Animals();
        Cat c1 = new Cat();
        Dog d1 = new Dog();
        Horse h1 = new Horse();

        a1.type = "Chordates";

        //РѕР±СЉРµРєС‚ РєРѕС€РєР°
        c1.name = "Filip";
        c1.color = "Black";
        c1.family = "Cats";
        c1.runningspeed = 15;
        c1.jumpheight = 2;
        c1.creepspeed = 1;
        c1.type = "cat";

        //РѕР±СЉРµРєС‚ СЃРѕР±Р°РєР°
        d1.name = "Roony";
        d1.color = "Brown";
        d1.family = "Dogs";
        d1.runningspeed = 20;
        d1.jumpheight = 1.2f;
        d1.swimspeed = 3;
        d1.creepspeed = 1;
        d1.type = "dog";

        //РѕР±СЉРµРєС‚ Р»РѕС€Р°РґСЊ
        h1.name = "Salvatore";
        h1.color = "White";
        h1.family = "Horse";
        h1.runningspeed = 30;
        h1.jumpheight = 1.5f;
        h1.swimspeed = 4;
        h1.type = "horse";

        System.out.println("Choose your animal: 1=Dog Roony, 2=Cat Filip, 3=Horse Salvatore. " + " And pass number to console: ");
        int number = in.nextInt();

        //РІС‹Р±СЂР°РЅРЅРѕРµ Р¶РёРІРѕС‚РЅРѕРµ
        Animals currentAnimal;
        switch (number){
            case 1:
                currentAnimal = d1;
                break;
            case 2:
                currentAnimal = c1;
                break;
            case 3:
                currentAnimal = h1;
                break;
            default:
                currentAnimal = c1;
                break;
        }
        //РІС‹РІРѕРґ РґР°РЅРЅС‹С… РїРѕ РІС‹Р±СЂР°РЅРЅРѕРјСѓ Р¶РёРІРѕС‚РЅРѕРјСѓ
        currentAnimal.showType();

        //РґРµР№СЃС‚РІРёСЏ
        currentAnimal.creep();
        currentAnimal.jump();
        currentAnimal.run();
        currentAnimal.swim();


    }
}