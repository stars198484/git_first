package ru.geekbrains.java1.dz.dz5.ПавелМатвеев;

/**
 * Created by Home-pc on 23.05.2016.
 */
public class Horse extends Animals {
    public Horse(String name, String color, int age) {
        super(name, color, age);
    }

    @Override
    public void isRun(int speed) {
        System.out.println("Лошадь бежит");
    }

    @Override
    public void isSwim() {
        System.out.println("Лошадь не будет плавать, только если помочить копыта)");
    }

    @Override
    public void isJump(double height) {
        System.out.println("Лошадь может перепрыгнуть через препятствие высотой " + height + "м");
    }
}