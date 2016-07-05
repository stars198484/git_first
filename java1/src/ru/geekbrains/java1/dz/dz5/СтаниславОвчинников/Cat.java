package ru.geekbrains.java1.dz.dz5.СтаниславОвчинников;

/**
 * Created by Home-pc on 23.05.2016.
 */
public class Cat extends Animals {

    public Cat() {
        super(2, 45, false);
    }

    @Override
    void jump() {
        System.out.println("Кот может прыгнуть на 2м");
    }

    @Override
    void run() {
        System.out.println("Кот бежит со скоростью 45км/ч");
    }

    @Override
    void swim() {
        System.out.println("Кот не умеет плавать");
    }
}
