package ru.geekbrains.java2.lesson1;

/**
 * Created by Home-pc on 06.06.2016.
 */
public class Truck extends GroundTransport {

    @Override
    public void move() {
        System.out.println("машина едет");
    }

    @Override
    public String toString() {
        return "Truck{}";
    }
}
