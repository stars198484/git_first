package ru.geekbrains.java1.dz.dz5.ЮрийЛукас;

/**
 * Created by Home-pc on 23.05.2016.
 */
public abstract class Animals {

    private String name;
    private float maxJumpHeigth;
    private int age;
    private float maxJumpLength;

    public Animals(String name, float maxJumpHeigth, int age, float maxJumpLength) {
        this.name = name;
        this.maxJumpHeigth = maxJumpHeigth;
        this.age = age;
        this.maxJumpLength = maxJumpLength;
    }

    abstract void run();

    abstract void jump(float heigthBarjer, float lengthBarjer);

    abstract void go();

    abstract void voice();

    abstract void swim();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getMaxJumpHeigth() {
        return maxJumpHeigth;
    }

    public void setMaxJumpHeigth(float maxJumpHeigth) {
        this.maxJumpHeigth = maxJumpHeigth;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getMaxJumpLength() {
        return maxJumpLength;
    }

    public void setMaxJumpLength(float maxJumpLength) {
        this.maxJumpLength = maxJumpLength;
    }
}