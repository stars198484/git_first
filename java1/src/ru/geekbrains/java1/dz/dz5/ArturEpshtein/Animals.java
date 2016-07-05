package ru.geekbrains.java1.dz.dz5.ArturEpshtein;

/**
 * Created by Home-pc on 23.05.2016.
 */
public class Animals {

    String name = "Животное";
    String color;
    String run;
    String jump;
    String swim;

    void setJump() {
        System.out.println(getName() + " упёрлось в забор.");

    }

    void setSwim(){
        System.out.println(getName() + " дошло до воды.");
    }

    void setRun(){
        System.out.println(getName() + " вышло на открытую местность.");
    }



    void setName(){
        //System.out.println(name);
    }

    public String getSwim() {
        return swim;
    }

    public String getName() {
        return name;
    }

    public String getRun() {
        return run;
    }

    public String getJump() {
        return jump;
    }

    public String getColor() {
        return color;
    }
}