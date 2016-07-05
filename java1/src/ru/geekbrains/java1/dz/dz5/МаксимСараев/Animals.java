package ru.geekbrains.java1.dz.dz5.МаксимСараев;

/**
 * Created by Home-pc on 23.05.2016.
 */
public class Animals {
    private String name;
    private String owner;
    private int id;

    private int totalSpeed = 100;
    private boolean isSwim = true;
    private double totalAlt = 10;

    public Animals(String name, String owner, int id, int totalSpeed, boolean isSwim, double totalAlt) {
        this.name = name;
        this.owner = owner;
        this.id = id;
        this.totalSpeed = totalSpeed;
        this.isSwim = isSwim;
        this.totalAlt = totalAlt;
    }

    public void run(int speed) {
        if (!checkValue((double) speed)) {
            return;
        }

        if (speed <= totalSpeed)
            System.out.println("Р‘РµР¶РёС‚ СЃРѕ СЃРєРѕСЂРѕСЃС‚СЊСЋ "+speed+" РєРј.С‡");
        else
            System.out.println("РќРµ Р±РµР¶РёС‚. РЎРєРѕСЂРѕСЃС‚СЊ Р±РµРіР° "+speed+" Р±РѕР»СЊС€Рµ РІРѕР·РјРѕР¶РЅРѕР№ "+totalSpeed+" РєРј.С‡");
    }

    public void swim() {
        if (isSwim)
            System.out.println("РџР»С‹РІРµС‚");
        else
            System.out.println("РќРµ РїР»С‹РІРµС‚. РќРµ СѓРјРµРµС‚ РїР»Р°РІР°С‚СЊ");
    }

    public void jump(double alt) {
        if (!checkValue(alt)) {
            return;
        }

        if (alt <= totalAlt)
            System.out.println("РџСЂС‹РіРЅСѓР»Рѕ РЅР° "+alt+" Рј.");
        else
            System.out.println("РќРµ РїСЂС‹РіРЅСѓР»Рѕ. Р’С‹СЃРѕС‚Р° РїСЂС‹Р¶РєР° "+alt+" Р±РѕР»СЊС€Рµ РІРѕР·РјРѕР¶РЅРѕР№ "+totalAlt+" Рј.");
    }

    public boolean checkValue(double inValue) {
        if (inValue <=0) {
            System.out.println("РќРµ РєРѕСЂСЂРµРєС‚РЅС‹Р№ РїР°СЂР°РјРµС‚СЂ РјРµС‚РѕРґР°, РІС‹РїРѕР»РЅРµРЅРёРµ РѕСЃС‚Р°РЅРѕРІР»РµРЅРѕ.");
            return false;}
        return true;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getOwner() {
        return owner;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Animals{" +
                "name='" + name + '\'' +
                ", owner='" + owner + '\'' +
                ", id=" + id +
                ", totalSpeed=" + totalSpeed +
                ", isSwim=" + isSwim +
                ", totalAlt=" + totalAlt +
                '}';
    }
}