package ru.geekbrains.java1.dz.dz5.ОляМихайлюк;

/**
 * Created by Home-pc on 23.05.2016.
 */
public class Cat extends Animals {

    void type() {

        System.out.print("So, I'm Cat, ");

    }

    void run() {

        System.out.print("my running speed is 60 kmh " );

    }

    void swim() {

        System.out.print("I can't swim " );

    }

    void jump() {

        System.out.print(" but I can jump at by one to two meters" );

    }

    public Cat(String name, String color, int age) {
        super(name, color, age);
    }
}
