package ru.geekbrains.java1.dz.dz5.ЭлеонораОганджанян;

/**
 * Created by I_V_Zhukov on 10.05.2016.
 */
public class Main {
    public static void main(String[] args) {
        Animals[] animals = new Animals[3];

        animals[0] = new Cat("Котик");
        animals[1] = new Dog("Собачка");
        animals[2] = new Horse("Лошадка");

        for (Animals animal: animals) {
            System.out.println(animal);
        }

        System.out.println();

        for (Animals animal: animals) {
            animal.run();
            animal.sail();
            animal.jump();
            System.out.println();
        }
    }
}