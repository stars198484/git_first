package ru.geekbrains.java1.dz.dz5.ПавелМатвеев;

/**
 * Created by Home-pc on 23.05.2016.
 */
public abstract class Animals {
    private String name;
    private String color;
    private int age;

    Animals(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public abstract void isRun(int speed);

    public abstract void isSwim();

    public abstract void isJump(double height);
}

