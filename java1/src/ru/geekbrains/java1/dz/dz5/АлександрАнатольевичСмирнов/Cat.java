package ru.geekbrains.java1.dz.dz5.АлександрАнатольевичСмирнов;

/**
 * Created by Home-pc on 23.05.2016.
 */
public class Cat extends Animals {

    @Override
    void voice() {
        System.out.println("    Кошка " + getName() + " замяукала!");
    }

    @Override
    void race() {
        System.out.println("    Кошка " + getName() + " рванула со скоростью " + getSpeed() + " км/ч!");
    }

    @Override
    void sail() {
        System.out.println("    Кошка " + getName() + " отказалась плыть!");
    }

    @Override
    void jump() {
        System.out.println("    Кошка " + getName() + " подпрыгнула на " + getHeight() + " м!");
    }

    public Cat() {
        super();
    }

    public Cat(String name) {
        super(name);
    }

    public Cat(String name, float speed, float height) {
        super(name, speed, height);
    }

}
