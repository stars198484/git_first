package ru.geekbrains.java1.dz.dz5.ЭлеонораОганджанян;

/**
 * Created by Home-pc on 23.05.2016.
 */
public class Horse extends Animals {
    public Horse(String name) {
        super(name);
    }

    @Override
    void run() {
        System.out.println("Лошадь по имени " + super.getName() + " побежала.");
    }

    @Override
    void sail() {
        System.out.println("Лошадь поплыла.");
    }

    @Override
    void jump() {
        System.out.println("Лошадь может прыгнуть до 8 метров.");
    }

    @Override
    public String toString() {
        return super.toString() + "лошадь " + super.getName();
    }
}
