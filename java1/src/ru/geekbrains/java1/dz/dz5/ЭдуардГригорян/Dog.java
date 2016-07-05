package ru.geekbrains.java1.dz.dz5.ЭдуардГригорян;

/**
 * Created by Home-pc on 23.05.2016.
 */
public class Dog extends Animals {
    @Override
    void run() {
        System.out.println("Собака умеет бегать со скоростью 10 км. в час");
        if (run > 10) {System.out.println("Собака " + name + " не может бегать с такой скоростью");}
        else {System.out.println("Скорость бега собаки " + name + " составляет: " + run + " км. в час");}
    }

    @Override
    void swim() {
        System.out.println("Собака умеет плавать со скоростью 6 км. в час");
        if (swim > 6) {System.out.println("Собака " + name + " не может плавать с такой скоростью");}
        else {System.out.println("Скорость плавания собаки " + name + " составляет: " + swim + " км. в час");}
    }

    @Override
    void jump() {
        System.out.println("Собака умеет прыгать на полтора метра");
        if (jump > 1.5) {System.out.println("Собака " + name + " не может настолько прыгать");}
        else {System.out.println("Скорость прыжка собаки " + name + " составляет: " + jump + " метр");}
    }
}