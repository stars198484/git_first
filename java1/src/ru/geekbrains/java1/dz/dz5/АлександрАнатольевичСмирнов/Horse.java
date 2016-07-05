package ru.geekbrains.java1.dz.dz5.АлександрАнатольевичСмирнов;

/**
 * Created by Home-pc on 23.05.2016.
 */
public class Horse extends Animals {
    @Override
    void voice() {
        System.out.println("    Лошадь " + getName() + " дико заржала!");
    }

    @Override
    void race() {
        System.out.println("    Лошадь " + getName() + " рванула со скоростью " + getSpeed() + " км/ч!");
    }

    @Override
    void sail() {
        System.out.println("    Лошадь " + getName() + " степенно окунулась в воду!");
    }

    @Override
    void jump() {
        System.out.println("    Лошадь " + getName() + " подпрыгнула на " + getHeight() + " м!");
    }

    public Horse() {
        super();
    }

    public Horse(String name) {
        super(name);
    }

    public Horse(String name, float speed, float height) {
        super(name, speed, height);
    }

}

