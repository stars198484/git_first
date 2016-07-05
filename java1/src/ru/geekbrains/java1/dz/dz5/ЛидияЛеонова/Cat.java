package ru.geekbrains.java1.dz.dz5.ЛидияЛеонова;

/**
 * Created by Home-pc on 23.05.2016.
 */
public class Cat extends Animals {

    @Override
    void run() {
        System.out.println("Кошка бежит к кормушке");
    }

    @Override
    void swim() {
        System.out.println("Кошка не умеет плавать");
    }

    @Override
    void jump(float height) {
        if (2 < height) {
            System.out.println("Кошка не может перепрыгнуть препятствие высотой больше 2м");
        } else {
            System.out.println("Кошка перепрыгнула препятствие");
        }

    }
}