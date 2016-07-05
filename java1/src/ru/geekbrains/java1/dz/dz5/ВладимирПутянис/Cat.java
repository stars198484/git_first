package ru.geekbrains.java1.dz.dz5.ВладимирПутянис;

/**
 * Created by Home-pc on 23.05.2016.
 */
public class Cat extends Animals {
    @Override
    void toRun()
    {
        System.out.println("Cat is sleeping");
    }

    @Override
    boolean toJump(float meters)
    {
        return meters <= 2F;
    }

    @Override
    public boolean toSwim()
    {
        return false;
    }
}