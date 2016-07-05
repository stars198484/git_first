package ru.geekbrains.java1.dz.dz5.НатальяТанина;

/**
 * Created by Home-pc on 23.05.2016.
 */
public class Cat extends Animals {

    public Cat(String _name, String _color, String _nail, int _age) {
        name = _name;
        color = _color;
        nail = _nail;
        age = _age;
    }

    void showNameAndColor() {
        System.out.println("Cat color is " + color + ", name: " + name);
    }

    void voiceAnimal() {
        System.out.println("РљРѕС‚ РјСЏСѓРєРЅСѓР».");
    }

    @Override
    void swimAnimal() {
        System.out.println("РљРѕС‚С‹ РЅРµ СѓРјРµСЋС‚ РїР»Р°РІР°С‚СЊ");
    }

    @Override
    void jumpAnimal(float heightValue) {
        super.jumpAnimal(heightValue);
        if (heightValue < 0) {
            System.out.println("РќРѕ СѓРєР°Р·Р°РЅРѕ РЅРµРєРѕСЂСЂРµРєС‚РЅРѕРµ Р·РЅР°С‡РµРЅРёРµ РґР»РёРЅС‹ РїСЂС‹Р¶РєР°");
        }
        else if (heightValue <= 2) {
            System.out.println("РљРѕС‚ РїРµСЂРµРїСЂС‹РіРЅРµС‚ С‡РµСЂРµР· РїСЂРµРїСЏС‚СЃС‚РІРёРµ");
        }
        else {
            System.out.println("Рљ СЃРѕР¶Р°Р»РµРЅРёСЋ, РЅР°СЃС‚РѕР»СЊРєРѕ РєРѕС‚С‹ РЅРµ РїСЂС‹РіР°СЋС‚.");
        };

    }

    @Override
    public String toString() {
        return "РљРѕС‚Р°/РєРѕС€РєСѓ Р·РѕРІСѓС‚ " + name + ", РѕРєСЂР°СЃ - " + color + ", РІРѕР·СЂР°СЃС‚: " + age;
    }
}