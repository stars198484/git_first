package ru.geekbrains.java1.dz.dz5.АндрейСуслов;

/**
 * Created by Home-pc on 23.05.2016.
 */
public abstract class Animals {

    private int maxRunDistance;
    private int maxSwimDistance;
    private double maxJumpHigh;

    public abstract void run(int distance);
    public abstract void jump(double distance);
    public abstract void swim(int distance);

    public Animals(int maxRunDistance, int maxSwimDistance, double maxJumpHigh) {
        this.maxRunDistance = maxRunDistance;
        this.maxSwimDistance = maxSwimDistance;
        this.maxJumpHigh = maxJumpHigh;
    }

    public int getMaxRunDistance() {
        return maxRunDistance;
    }

    public int getMaxSwimDistance() {
        return maxSwimDistance;
    }

    public double getMaxJumpHigh() {
        return maxJumpHigh;
    }
}