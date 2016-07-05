package ru.geekbrains.java1.dz.dz5.ОляМихайлюк;

/**
 * Created by Home-pc on 23.05.2016.
 */
public abstract class Animals {

    protected String name;
    protected String color;
    protected int age;

    abstract void type();

    abstract void run();

    abstract void swim();

    abstract void jump();

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

    public Animals(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

}