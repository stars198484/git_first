package ru.geekbrains.java1.dz.dz5.СтаниславОвчинников;

/**
 * Created by Home-pc on 23.05.2016.
 */
public abstract class Animals {
    private int jumpHeight;
    private int runSpeed;
    private boolean swimChance;

    public Animals(int jumpHeight, int runSpeed, boolean swimChance) {
        this.jumpHeight = jumpHeight;
        this.runSpeed = runSpeed;
        this.swimChance = swimChance;
    }

    public int getJumpHeight() {
        return jumpHeight;
    }

    public int getRunSpeed() {
        return runSpeed;
    }

    public boolean isSwimChance() {
        return swimChance;
    }

    abstract void jump();

    void run() {
        System.out.println("животное животное бежит");
    }

    abstract void swim();

    public void showInfo() {
        run();
        jump();
        swim();
    }

}