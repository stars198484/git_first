package ru.geekbrains.java1.lesson5;

/**
 * Created by Home-pc on 19.05.2016.
 */
public class SuperBoss extends Manager {
    @Override
    public int getSalary() {
        return super.getSalary() + 10000;
    }
}
