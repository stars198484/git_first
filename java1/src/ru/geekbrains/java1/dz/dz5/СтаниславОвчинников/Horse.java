package ru.geekbrains.java1.dz.dz5.СтаниславОвчинников;

/**
 * Created by Home-pc on 23.05.2016.
 */
public class Horse  extends Animals {
    public Horse() {
        super(2, 60, true);
    }

    @Override
    void jump() {

        System.out.println("Лошадь может прыгнуть на 2м");
    }

    @Override
    void run() {

        System.out.println("Лошадь бежит со скоростью 60км/ч");
    }

    @Override
    void swim() {

        System.out.println("Лошадь умеет плавать");
    }
}
