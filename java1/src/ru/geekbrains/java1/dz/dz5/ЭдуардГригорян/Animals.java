package ru.geekbrains.java1.dz.dz5.ЭдуардГригорян;

/**
 * Created by Home-pc on 23.05.2016.
 */
public abstract class Animals {
    String name;
    String color;
    int run;
    int swim;
    double jump;

    abstract void run();
    abstract void swim();
    abstract void jump();

    Animals() {
        name = "NoName";
        color = "Nocolor";
    }
}
