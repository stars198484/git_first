package ru.geekbrains.java1.dz.dz5.ЭлеонораОганджанян;

/**
 * Created by Home-pc on 23.05.2016.
 */
public class Cat extends Animals {

    public Cat(String name) {
        super(name);
    }

    @Override
    void run() {
        System.out.println("Кот по кличке " + super.getName() + " побежал.");
    }

    @Override
    void sail() {
        System.out.println("Коты не плавают.");
    }

    @Override
    void jump() {
        System.out.println("Коты могут перепрыгнуть 1-2 метра.");
    }

    @Override
    public String toString() {
        return super.toString() + "кот " + super.getName();
    }
}