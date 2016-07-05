package ru.geekbrains.java1.dz.dz5.УльянаКриши;

/**
 * Created by Home-pc on 23.05.2016.
 */
public class Cat extends Animals {

    private String type;

    public Cat(String color, String name, int age, int speed, int jumpHight, String type) {
        super(color, name, age, speed, jumpHight);
        this.type=type;

    }

    @Override
    public int getJumpHigh() {
        return super.getJumpHigh()*1;
    }

    @Override
    public int getSpeed() {
        return super.getSpeed()*2;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    void jump() {
        System.out.println ("The cat can jum " + getJumpHigh() +" meters hight ");

    }

    @Override
    void run() {
        System.out. println("The cat can run " + getSpeed() + " km per hour") ;
    }

    @Override
    void swim() {

    }

    @Override
    public String toString() {
        return super.toString() + " Cat{" +
                "type='" + type + '\'' +
                '}';
    }


}