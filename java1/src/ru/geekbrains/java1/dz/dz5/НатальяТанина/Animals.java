package ru.geekbrains.java1.dz.dz5.НатальяТанина;

/**
 * Created by Home-pc on 23.05.2016.
 */
public class Animals {

    String name;
    String color;
    String nail;
    int age;

    Animals() {
        name = "Unknown";
        color = "Undefine";
        nail = "none";
    }

    void runAnimal() {
        System.out.println("Р–РёРІРѕС‚РЅРѕРµ Р±РµРіР°РµС‚.");
    }

    void swimAnimal() {
        System.out.println("Р–РёРІРѕС‚РЅРѕРµ РїР»Р°РІР°РµС‚");
    }

    void jumpAnimal(float heightValue) {
        System.out.println("Р–РёРІРѕС‚РЅРѕРµ СѓРјРµРµС‚ РїСЂС‹РіР°С‚СЊ.");
    }

    @Override
    public String toString() {
        return  "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", nail='" + nail + '\'';
    }
}