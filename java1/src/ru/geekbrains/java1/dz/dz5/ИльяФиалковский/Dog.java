package ru.geekbrains.java1.dz.dz5.ИльяФиалковский;

/**
 * Created by Home-pc on 23.05.2016.
 */
public class Dog extends Animals {
    String name = "Р С‹Р±РєР°";
    int swim = 10;

    @Override
    void Name(){
        System.out.println("Р­С‚Рѕ Р¶РёРІРѕС‚РЅРѕРµ "+name);
    }

    @Override
    void Swim(){
        System.out.println(name+" РјРѕР¶РµС‚ РїР»С‹С‚СЊ СЃРѕ СЃРєРѕСЂРѕСЃС‚СЊСЋ "+swim);
    }
}