package ru.geekbrains.java1.dz.dz5.РусланУстиц;

import java.util.Random;

/**
 * Created by Home-pc on 23.05.2016.
 */
public abstract class Animals {

    private String name;
    private static Random random = new Random();

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public Animals(String name) { setName(name); }

    abstract public void run(double distance);
    abstract public void swim(double distance);
    abstract public void jump(double distance);

    protected static double getExtraMetersAtRange(double limit) {
        double extraCoef = 0.05;
        double extraMeters = limit * extraCoef;
        if (extraMeters < 1)
            extraMeters = 1;

        int integerPart = random.nextInt((int)extraMeters);
        double fractionalPart = random.nextDouble();
        double result = Math.round((limit + integerPart + fractionalPart) * 100) / 100.00;
        return result;
    }
}