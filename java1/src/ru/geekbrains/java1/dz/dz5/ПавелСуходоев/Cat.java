package ru.geekbrains.java1.dz.dz5.ПавелСуходоев;

/**
 * Created by Home-pc on 23.05.2016.
 */
public class Cat extends Animals {

    float maxJump = 2;

    public Cat(String name) {
        super(name);
    }

    @Override
    void swim() {
        System.out.println("РљРѕС€РєРё РЅРµ СѓРјРµСЋС‚ РїР»Р°РІР°С‚СЊ");
    }

    @Override
    void jump(float alt) {
        if (alt <= maxJump) {
            System.out.println("РљРѕС€РєР° РїСЂС‹РіРЅСѓР»Р° РЅР° РІС‹СЃРѕС‚Сѓ " + alt);
        } else {
            System.out.println("РљРѕС€РєР° РЅРµ РјРѕР¶РµС‚ С‚Р°Рє РІС‹СЃРѕРєРѕ РїСЂС‹РіР°С‚СЊ");
        }
    }

    @Override
    void run() {
        System.out.println("РљРѕС€РєР° РїРѕР±РµР¶Р°Р»Р°");
    }
}