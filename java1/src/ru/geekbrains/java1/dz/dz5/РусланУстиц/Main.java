package ru.geekbrains.java1.dz.dz5.РусланУстиц;

/**
 * Created by I_V_Zhukov on 10.05.2016.
 */
public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Барсик");
        Dog dog = new Dog("Шарик");
        Horse horse = new Horse("Вольт");

        cat.swim(10);
        cat.run(1000);
        cat.jump(14);

        dog.swim(9999);
        dog.run(2999);
        dog.jump(10);

        horse.swim(10);
        horse.run(1999);
        horse.jump(10);
    }
}
