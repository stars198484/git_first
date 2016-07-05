package ru.geekbrains.java2.lesson1;

/**
 * Created by Home-pc on 06.06.2016.
 */
public class FactoryVehicle {
    public Vehicle factoryMetod(int i) {
        Vehicle vehicle = null;
        switch (i) {
            case 0: vehicle = new Train(); break;
            case 1: vehicle = new Aircraft(); break;
            case 2: vehicle = new Boat(); break;
            case 3: vehicle = new Car(); break;
            case 4: vehicle = new Truck(); break;
            default: vehicle = new Train();
        }
        return vehicle;
    }
}
