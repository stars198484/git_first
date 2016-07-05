package ru.geekbrains.java1.dz.dz5.ИльяФиалковский;

/**
 * Created by Home-pc on 23.05.2016.
 */
public class Cat extends Animals {

    String name = "РљРѕС€РєР°", voice = "РњСЏСѓ";
    int jump = 150;

    @Override
    void Name(){
        System.out.println("Р­С‚Рѕ Р¶РёРІРѕС‚РЅРѕРµ "+name);
    }

    @Override
    void Jump(){
        System.out.println(name+" РјРѕР¶РµС‚ РїСЂС‹РіР°С‚СЊ РЅР° "+jump);
    }

    @Override
    void Voice(){
        System.out.println(name+" РёР·РґР°РµС‚ Р·РІСѓРє "+voice);
    }

    @Override
    void Lay(){
        System.out.println(name+" РјРѕР¶РµС‚ Р»РµР¶Р°С‚СЊ");
    }

}