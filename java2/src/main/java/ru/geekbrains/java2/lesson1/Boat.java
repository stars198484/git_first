package ru.geekbrains.java2.lesson1;

/**
 * Created by Home-pc on 06.06.2016.
 */
public class Boat implements Vehicle{


    @Override
    public void move() {
        System.out.println("лодка плывет");
    }

    @Override
    public String toString() {
        return "Boat{}";
    }
}
