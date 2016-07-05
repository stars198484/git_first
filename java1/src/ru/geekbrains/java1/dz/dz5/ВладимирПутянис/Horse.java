package ru.geekbrains.java1.dz.dz5.ВладимирПутянис;

/**
 * Created by Home-pc on 23.05.2016.
 */
public class Horse extends Animals {
    @Override
    void toRun()
    {
        System.out.println("Horse is running");
    }

    @Override
    boolean toJump(float meters)
    {
        return meters <= 3.5f;
    }
}