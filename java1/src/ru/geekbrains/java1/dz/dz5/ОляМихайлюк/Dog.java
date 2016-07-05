package ru.geekbrains.java1.dz.dz5.ОляМихайлюк;

/**
 * Created by Home-pc on 23.05.2016.
 */
public class Dog extends Animals {
    void type() {

        System.out.print("So, I'm Dog, ");

    }

    void run() {

        System.out.print("My running speed is 50 kmh" );

    }

    void swim() {

        System.out.print("I can swim!" );

    }

    void jump() {

        System.out.print("I'm jumping at half of meter" );

    }

    public Dog(String name, String color, int age) {
        super(name, color, age);
    }

}