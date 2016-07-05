package ru.geekbrains.java1.dz.dz5.УльянаКриши;

/**
 * Created by Home-pc on 23.05.2016.
 */
public class Dog extends Animals {
    private String type;

    public Dog(String color, String name, int age, int speed, int jumpHight, String type) {
        super(color, name, age, speed, jumpHight);
        this.type=type;
    }

    @Override
    public int getJumpHigh() {
        return super.getJumpHigh()*2;
    }

    @Override
    public int getSpeed() {
        return super.getSpeed()*3;
    }

    @Override
    void jump() {
        System.out.println ("The dog can jump " + getJumpHigh()+ " meters hight");
    }

    @Override
    void run() {
        System.out.println("The dog can run " + getSpeed() + " km per hour" );

    }

    @Override
    void swim() {
        System.out.println("The dog likes to swim");

    }

    @Override
    public String toString() {
        return super.toString() + " Dog{" +
                "type='" + type + '\'' +
                '}';
    }


}
