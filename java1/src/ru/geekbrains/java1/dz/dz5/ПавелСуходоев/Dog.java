package ru.geekbrains.java1.dz.dz5.ПавелСуходоев;

/**
 * Created by Home-pc on 23.05.2016.
 */
public class Dog extends Animals {
    float maxJump = 0.5F;

    public Dog(String name) {
        super(name);
    }

    @Override
    void jump(float alt) {
        if (maxJump >= alt) {
            System.out.println("РЎРѕР±Р°РєР° РїСЂС‹РіРЅСѓР»Р° РЅР° РІС‹СЃРѕС‚Сѓ " + alt);
        } else {
            System.out.println("РЎРѕР±Р°РєР° С‚Р°Рє РІС‹СЃРѕРєРѕ РЅРµ РїСЂС‹РіР°РµС‚");
        }
    }

    @Override
    void swim() {
        System.out.println("РЎРѕР±Р°РєР° РїР»С‹РІРµС‚");
    }

    @Override
    void run() {
        System.out.println("РЎРѕР±Р°РєР° РїРѕР±РµР¶Р°Р»Р°");
    }
}
