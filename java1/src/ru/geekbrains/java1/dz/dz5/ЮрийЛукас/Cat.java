package ru.geekbrains.java1.dz.dz5.ЮрийЛукас;

/**
 * Created by Home-pc on 23.05.2016.
 */
public class Cat extends Animals {

    public Cat(String name, float maxJumpHeigth, int age, float maxJumpLength) {
        super(name, maxJumpHeigth, age, maxJumpLength);
    }

    @Override
    void run() {
        System.out.println("Кошка побежала");
    }

    @Override
    void jump(float heigthBarjer, float lengthBarjer) {
        System.out.println("Кошка пользуясь когтями, в несколько прыжков преодалела препятствие.");
    }

    @Override
    void go() {
        System.out.println("Кошка пошла.");
    }

    @Override
    void voice() {
        System.out.println("Кошка замяукала.");
    }

    @Override
    void swim() {
        System.out.println("Кошка выразила неудовольство, и отказалась плыть.");
    }
}
