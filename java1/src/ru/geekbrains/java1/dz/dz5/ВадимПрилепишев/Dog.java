package ru.geekbrains.java1.dz.dz5.ВадимПрилепишев;

/**
 * Created by Home-pc on 23.05.2016.
 */
public class Dog extends Animals {
    public void run() {
        System.out.println("Я собака, я бегу");
    }

    @Override
    public void swim() {
        System.out.println("Я собака, я плыву");
    }

    @Override
    public void jump(double height) {
        if(height > 0.5) System.out.println("Собака, я не могу перепрыгнуть, слишком высоко.");
        else System.out.println("Собака, перепрыгнула " + height + " метров.");
    }
}