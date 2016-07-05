package ru.geekbrains.java1.dz.dz5.НатальяТанина;

/**
 * Created by Home-pc on 23.05.2016.
 */
public class Dog extends Animals {
    int b;

    void voiceAnimal() {
        System.out.println("РЎРѕР±Р°РєР° РіР°РІРєРЅСѓР»Р°");
    }

    @Override
    void jumpAnimal(float heightValue) {
        super.jumpAnimal(heightValue);
        if (heightValue > 0 && heightValue <= 0.5) {
            System.out.println("РЎРѕР±Р°РєР° РїРµСЂРµРїСЂС‹РіРЅРµС‚ С‡РµСЂРµР· С‚Р°РєРѕРµ РїСЂРµРїСЏС‚СЃС‚РІРёРµ");
        }
        else {
            System.out.println("РЈРїСЃ... СЃРѕР±Р°РєР° РЅРµ СЃРјРѕР¶РµС‚ РїРµСЂРµРїСЂС‹РіРЅСѓС‚СЊ.");
        }
    }
}
