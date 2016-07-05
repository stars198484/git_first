package ru.geekbrains.java1.dz.dz5.АлександрРублевский;

/**
 * Created by Home-pc on 23.05.2016.
 */
public class Animals {

    String color;
    String name;
    int Height = 2;
    int MaxSpeed = 6;
    int MinSpeed = 2;
    int MaxSpeedofSwim = 6;
    int MinSpeedofSwim = 2;

    void voice() {
        System.out.println("Animals make sounds: ");
    }

    void jump() {
        System.out.println("Animal jumped: ");
    }

    void swim() {
        System.out.println("Animal swim: ");
    }

    void ran() {
        System.out.println("Animal run: ");
    }
}