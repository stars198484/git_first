package ru.geekbrains.java1.dz.dz5.СтаниславОвчинников;

/**
 * Created by Home-pc on 23.05.2016.
 */
public class Dog extends Animals {
    public Dog() {
        super(1, 65, true);
    }
    @Override
    void jump() {
        System.out.println("Собака может прыгнуть на 1м");
    }

    @Override
    void run() {
        System.out.println("Собака бежит со скоростью 65км/ч");
    }

    @Override
    void swim() {
        System.out.println("Собака умеет плавать");
    }
}
