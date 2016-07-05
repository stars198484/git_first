package ru.geekbrains.java1.dz.dz5.ЛидияЛеонова;

/**
 * Created by Home-pc on 23.05.2016.
 */
public class Dog extends Animals {
    @Override
    void run() {
        System.out.println("Собака бежит рядом с хозяином");
    }

    @Override
    void swim() {
        System.out.println("Собака переплыла бассейн");
    }

    @Override
    void jump(float height) {
        if (1 < height) {
            System.out.println("Собака не может перепрыгнуть препятствие высотой больше 1 м");
        } else {
            System.out.println("Собака перепрыгнула препятствие");
        }

    }
}