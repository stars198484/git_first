package ru.geekbrains.java1.dz.dz5.ПавелМатвеев;

/**
 * Created by Home-pc on 23.05.2016.
 */
public class Dog extends Animals {
    Dog(String name, String color, int age) {
        super(name, color, age);
    }

    @Override
    public void isRun(int speed) {
        System.out.println("Собака \"" + this.getName() + "\" бежит со скоростью " + speed + " км/ч");
    }

    @Override
    public void isSwim() {
        System.out.println("Собака плывет");
    }

    @Override
    public void isJump(double height) {
        System.out.println("Собака может перепрыгнуть через препятствие высотой" + height + "м");
    }
}