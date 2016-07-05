package ru.geekbrains.java1.dz.dz5.ОляМихайлюк;

/**
 * Created by I_V_Zhukov on 10.05.2016.
 */
public class Main {
    public static void main(String[] args) {

        Animals[] animals = new Animals[3];

        animals[0] = new Dog("Spike", "Brown", 5);
        animals[1] = new Cat("Tiger", "White", 3);
        animals[2] = new Horse("Boxer", "Black", 7);

        for (Animals animal : animals) {

            System.out.println("Hi! My name is " + animal.name + ". I'm " + animal.color + " and " + animal.age + " years old.");

            animal.type();
            animal.run();
            animal.swim();
            animal.jump();
            System.out.println();
            System.out.println();

        }


    }


}

