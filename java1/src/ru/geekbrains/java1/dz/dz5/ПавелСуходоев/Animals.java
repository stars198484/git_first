package ru.geekbrains.java1.dz.dz5.ПавелСуходоев;

/**
 * Created by Home-pc on 23.05.2016.
 */
public abstract class Animals {

    float maxJump;
    String name;

    public Animals(String name) {
        this.name = name;
    }

    abstract void run();
    abstract void swim();
    abstract void jump(float alt);
}