package ru.geekbrains.java1.dz.dz5.ЭлеонораОганджанян;

/**
 * Created by Home-pc on 23.05.2016.
 */
public class Dog extends Animals {
    public Dog(String name) {
        super(name);
    }

    @Override
    void run() {
        System.out.println("Собака по кличке " + super.getName() + " побежала.");
    }

    @Override
    void sail() {
        System.out.println("Собака поплыла.");
    }

    @Override
    void jump() {
        System.out.println("Собаки могут перепрыгнуть только 0,5 метра.");
    }

    @Override
    public String toString() {
        return super.toString() + "собака " + super.getName();
    }
}