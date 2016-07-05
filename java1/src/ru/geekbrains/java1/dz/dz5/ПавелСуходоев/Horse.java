package ru.geekbrains.java1.dz.dz5.ПавелСуходоев;

/**
 * Created by Home-pc on 23.05.2016.
 */
public class Horse extends Animals {
    float maxJump = 1.5F;

    public Horse(String name) {
        super(name);
    }

    @Override
    void jump(float alt) {
        if (maxJump >= alt) {
            System.out.println("Р›РѕС€Р°РґСЊ РїСЂС‹РіРЅСѓР»Р° РЅР° РІС‹СЃРѕС‚Сѓ " + alt);
        } else {
            System.out.println("Р›РѕС€Р°РґСЊ РЅРµ РјРѕР¶РµС‚ РїСЂС‹РіРЅСѓС‚СЊ С‚Р°Рє РІС‹СЃРѕРєРѕ");
        }
    }

    @Override
    void swim() {
        System.out.println("Р›РѕС€Р°РґСЊ РїРѕРїР»С‹Р»Р°");
    }

    @Override
    void run() {
        System.out.println("Р›РѕС€Р°РґСЊ РїРѕР±РµР¶Р°Р»Р°");
    }
}