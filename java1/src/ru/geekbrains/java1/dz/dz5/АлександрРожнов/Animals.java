package ru.geekbrains.java1.dz.dz5.АлександрРожнов;

/**
 * Created by Home-pc on 23.05.2016.
 */
public class Animals {
    String type;
    String run;
    String jump;
    String swim;
    String creep;

    int runningspeed; // СЃРєРѕСЂРѕСЃС‚СЊ Р±РµРіР°
    float jumpheight;   // РІС‹СЃРѕС‚Р° РїСЂС‹Р¶РєР°
    int swimspeed;    // СЃРєРѕСЂРѕСЃС‚СЊ РїР»Р°РІР°РЅРёСЏ
    int creepspeed;   // СЃРєРѕСЂРѕСЃС‚СЊ, СЃ РєРѕС‚РѕСЂРѕР№ Р¶РёРІРѕС‚РЅРѕРµ РїРѕР»Р·РµС‚

    void showType(){

        System.out.println("Animal Type: " + type);
    }

    void run(){

        System.out.println("Animal run: " + run);
    }

    void jump(){
        System.out.println("Animal jump: " + jump);
    }

    void swim(){
        System.out.println("Animal swim: " + swim);
    }

    void creep(){
        System.out.println("Animal swim: " + creep);
    }


}


