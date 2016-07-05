package ru.geekbrains.java1.dz.dz5.АлександрАнатольевичСмирнов;

/**
 * Created by Home-pc on 23.05.2016.
 */
public class Dog extends Animals {
    @Override
    void voice() {
        System.out.println("    Собака " + getName() + " залаяла!");
    }

    @Override
    void race() {
        System.out.println("    Собака " + getName() + " рванула со скоростью " + getSpeed() + " км/ч!");
    }

    @Override
    void sail() {
        System.out.println("    Собака " + getName() + " поплыла со скоростью 2 км/ч!");
    }

    @Override
    void jump() {
        System.out.println("    Собака " + getName() + " подпрыгнула на " + getHeight() + " м!");
    }

    public Dog() {
        super();
    }

    public Dog(String name) {
        super(name);
    }

    public Dog(String name, float speed, float height) {
        super(name, speed, height);
    }

}