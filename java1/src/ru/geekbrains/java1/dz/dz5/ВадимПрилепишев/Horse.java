package ru.geekbrains.java1.dz.dz5.ВадимПрилепишев;

/**
 * Created by Home-pc on 23.05.2016.
 */
public class Horse extends Animals {
    @Override
    public void run() {
        System.out.println("Я лошадь, я бегу");
    }

    @Override
    public void swim() {
        System.out.println("Я лошадь, я плыву");
    }

    @Override
    public void jump(double height) {
        if(height > 3) System.out.println("Лошадь, я не могу перепрыгнуть, слишком высоко.");
        else System.out.println("Лошадь, перепрыгнула " + height + " метров.");
    }
}