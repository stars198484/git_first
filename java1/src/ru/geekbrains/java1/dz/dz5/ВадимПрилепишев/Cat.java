package ru.geekbrains.java1.dz.dz5.ВадимПрилепишев;

/**
 * Created by Home-pc on 23.05.2016.
 */
public class Cat extends Animals {

    @Override
    public void run() {
        System.out.println("Я кот, я бегу");
    }

    @Override
    public void swim() {
        System.out.println("Я кот, я не умею плавать");
    }

    @Override
    public void jump(double height) {
        if(height > 2) System.out.println("Кот, я не могу перепрыгнуть, слишком высоко.");
        else System.out.println("Кот, перепрыгнул " + height + " метров.");
    }
}
