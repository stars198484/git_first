package ru.geekbrains.java1.dz.dz5.ИльяФиалковский;

/**
 * Created by Home-pc on 23.05.2016.
 */
public class Horse extends Animals {
    String name = "Р›РѕС€Р°РґСЊ", voice = "Р-Р“Рѕ-Р“Рѕ";
    int jump = 250, swim = 2;

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
    void Swim(){
        System.out.println(name+" РјРѕР¶РµС‚ РїР»С‹С‚СЊ СЃРѕ СЃРєРѕСЂРѕСЃС‚СЊСЋ "+swim);
    };
}