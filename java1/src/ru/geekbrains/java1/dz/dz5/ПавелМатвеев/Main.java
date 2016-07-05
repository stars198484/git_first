package ru.geekbrains.java1.dz.dz5.ПавелМатвеев;

/**
 * Created by I_V_Zhukov on 10.05.2016.
 */
public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Шарик", "Черный", 3);
        Cat cat = new Cat("Матильда", "Белый", 2);
        Horse horse = new Horse("Стрела", "Белый", 4);

        dog.isRun(14);
        cat.isRun(7);
        cat.isSwim();
        horse.isJump(0.6);
    }
}