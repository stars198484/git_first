package ru.geekbrains.java2.lesson1;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by Home-pc on 06.06.2016.
 */
public class Main {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[10];
        FactoryVehicle factoryVehicle =new FactoryVehicle();
        Random random = new Random(4);
        for (int i = 0; i < vehicles.length; i++) {
            vehicles[i] = factoryVehicle.factoryMetod(random.nextInt(4));
        }
        System.out.println(Arrays.toString(vehicles));
        for (Vehicle vehicle : vehicles) {
           if (vehicle != null) {
               vehicle.move();
           }
        }
    }

}
