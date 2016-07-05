package ru.geekbrains.java1.dz.dz5.УльянаКриши;

/**
 * Created by Home-pc on 23.05.2016.
 */
public class Horse extends Animals {
    public Horse(String color, String name, int age, int speed, int jumpHight) {
        super(color, name, age, speed, jumpHight );
    }

    @Override
    public int getJumpHigh() {
        return super.getJumpHigh()*3;
    }

    @Override
    public int getSpeed() {
        return super.getSpeed()*30;
    }

    @Override
    void jump() {
        System.out.println ("The horse can jump " + getJumpHigh()+ " meters hight");

    }

    @Override
    void run() {
        System.out.println ("The horse can run " + getSpeed() + " km per hour");

    }

    @Override
    void swim() {
        System.out.println("The horse can swim, but is not good at it");

    }

    @Override
    public String toString() {
        return super.toString();
    }
}
