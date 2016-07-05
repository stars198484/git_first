package ru.geekbrains.java1.dz.dz5.ЭлеонораОганджанян;

/**
 * Created by Home-pc on 23.05.2016.
 */
public abstract class Animals {

    private String name;

    public Animals(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    abstract void run();

    abstract void sail();

    abstract void jump();

    @Override
    public String toString() {
        return "Животное: ";
    }
}