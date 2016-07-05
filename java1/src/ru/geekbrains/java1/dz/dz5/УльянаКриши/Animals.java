package ru.geekbrains.java1.dz.dz5.УльянаКриши;

/**
 * Created by Home-pc on 23.05.2016.
 */
public abstract class Animals {

    private String color;
    private String name;
    private int age;
    private int speed;
    private int jumpHigh;

    public Animals (String color, String name, int age, int speed, int jumpHigh) {
        this.color=color;
        this.name=name;
        this.age=age;
        this.speed=speed;
        this.jumpHigh=jumpHigh;
    }
    abstract void jump() ;
    abstract void  run ();
    abstract void swim ();


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getJumpHigh() {
        return jumpHigh;
    }

    public void setJumpHigh(int jumpHigh) {
        this.jumpHigh = jumpHigh;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "color='" + color + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", speed=" + speed +
                '}';
    }
}