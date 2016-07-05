package ru.geekbrains.java1.dz.dz5.АлександрРублевский;

/**
 * Created by Home-pc on 23.05.2016.
 */
public class Cat extends Animals {

    int CatSpeed = 2;
    int CatSpeedOfSwim = 0; // считаем чтокоты не умеют плавать и т.д.).

    void showNameAndColor() {
        System.out
                .println("Cat Color: " + color + "." + " Name: " + name + ".");
    }

    @Override
    void voice() {
        System.out.println("Cat: meow! meow!");
    }

    @Override
    void jump() {

        if (Height < 2) {
            System.out.println("Cat jumps.");

        } else {

            System.out.println("Cat fell.");
        }
    }

    @Override
    void swim() {
        if (CatSpeedOfSwim > MaxSpeedofSwim) {

            System.out.println("Cat swim fastest!");

        } else if (CatSpeedOfSwim > MinSpeedofSwim) {

            System.out.println("Cat swim.");

        } else {
            System.out.println("Cat drowns!");
        }
    }

    @Override
    void ran() {
        if (CatSpeed >= MaxSpeed) {

            System.out.println("Cat run fastest!");

        } else if (CatSpeed > MinSpeed) {

            System.out.println("Cat run fast.");
        } else {

            System.out.println("Cat run slowest.");
        }
    }
}
