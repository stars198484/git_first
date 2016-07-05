package ru.geekbrains.java2.lesson1;

/**
 * Created by Home-pc on 06.06.2016.
 */
public class Train implements Vehicle {
    @Override
    public void move() {
        System.out.println("поезд едет");
    }

    @Override
    public String toString() {
        return "Train{}";
    }
}
