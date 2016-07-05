package ru.geekbrains.java1.dz.dz5.ЭдуардГригорян;

/**
 * Created by I_V_Zhukov on 13.05.2016.
 */
public class Main {
    public static void main(String[] args) {
        Dog doggy = new Dog();
        doggy.name = "Barsik";
        doggy.run = 8;
        doggy.run();
        doggy.swim = 10;
        doggy.swim();
        doggy.jump = 1;
        doggy.jump();

        Cat catty = new Cat();
        catty.run = 4;
        catty.swim = 10;
        catty.jump = 3;
        catty.run();
        catty.swim();
        catty.jump();

        Horse hoses = new Horse();
        hoses.run = 15;
        hoses.swim = 30;
        hoses.jump = 5;
        hoses.run();
        hoses.swim();
        hoses.jump();



    }
}
