package ru.geekbrains.java1.dz.dz5.АлександрРублевский;

/**
 * Created by Home-pc on 23.05.2016.
 */
public class Dog extends Animals {
    int DogSpeed = 3;
    int DogSpeedOfSwim = 6;

    void showNameAndColor() {

        System.out
                .println("Dog Color: " + color + "." + " Name: " + name + ".");
    }

    @Override
    void voice() {
        System.out.println("Dog: bark! bark!");
    }

    @Override
    void jump() {
        if (Height < 3) {
            System.out.println("Dog jumps");
        } else {
            System.out.println("Dog fell");
        }
    }
    @Override
    void swim() {
        if (DogSpeedOfSwim >= MaxSpeedofSwim) {

            System.out.println("Dog swim fastest!");

        } else if (DogSpeedOfSwim >= MinSpeedofSwim) {

            System.out.println("Dog swim.");

        } else {

            System.out.println("Dog drowns.");
        }
    }

    @Override
    void ran() {
        if (DogSpeed >= MaxSpeed) {
            System.out.println("Dog run fastest!");
        } else if (DogSpeed > MinSpeed) {
            System.out.println("Dog run fast.");
        } else {
            System.out.println("Dog run slowest.");
        }
    }
}
