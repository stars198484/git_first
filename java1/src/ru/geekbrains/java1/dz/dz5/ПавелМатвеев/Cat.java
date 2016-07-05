package ru.geekbrains.java1.dz.dz5.ПавелМатвеев;

/**
 * Created by Home-pc on 23.05.2016.
 */
public class Cat extends Animals {


    public Cat(String name, String color, int age) {
        super(name, color, age);
    }

    @Override
    public void isRun(int speed) {
        System.out.println("Кошка \"" + this.getName() + "\" бежит со скоростью " + speed + "км/ч");
    }

    @Override
    public void isSwim() {
        System.out.println("Кошка \"" + this.getName() + "\" не будет плавать, она этого крайне не любит");
    }

    @Override
    public void isJump(double height) {
        System.out.println("Кошка перепрыгивает через препятствие");
    }
}