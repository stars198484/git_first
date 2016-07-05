package ru.geekbrains.java1.dz.dz5.ОляМихайлюк;

/**
 * Created by Home-pc on 23.05.2016.
 */
public class Horse extends Animals {
    void type() {

        System.out.print("So, I'm Horse, ");

    }

    void run() {

        System.out.print("My running speed is 130 kmh" );

    }

    void swim() {

        System.out.print("I can swim but worse" );

    }

    void jump() {

        System.out.print("I can jump at by one to three meters" );

    }

    public Horse(String name, String color, int age) {
        super(name, color, age);
    }
}
