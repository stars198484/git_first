package ru.geekbrains.java1.dz.dz5.АлександрРублевский;

/**
 * Created by Home-pc on 23.05.2016.
 */
public class Horse extends Animals {
    int HorseSpeed = 6;
    int HorseSpeedOfSwim = 3;

    void showNameAndColor() {

        System.out.println("Horse Color: " + color + "." + " Name: " + name
                + ".");
    }

    @Override
    void voice() {

        System.out.println("Horse: whinnied!");
    }

    @Override
    void jump() {
        if (Height < 6) {

            System.out.println("Horse jumps.");

        } else {

            System.out.println("Horse fell.");
        }
    }

    @Override
    void swim() {
        if (HorseSpeedOfSwim >= MaxSpeedofSwim) {
            System.out.println("Horse swim fastest!");

        } else if (HorseSpeedOfSwim >= MinSpeedofSwim) {
            System.out.println("Horse swim.");

        } else {
            System.out.println("Horse drowns.");
        }
    }

    @Override
    void ran() {
        if (HorseSpeed >= MaxSpeed) {

            System.out.println("Horse run fastest!");

        } else if (HorseSpeed > MinSpeed) {

            System.out.println("Dog run fast.");

        } else {

            System.out.println("Dog run slowest.");
        }
    }
}