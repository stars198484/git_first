package ru.geekbrains.java1.dz.dz5.АндрейИванов;

/**
 * Created by I_V_Zhukov on 24.05.2016.
 */
public class Main {
    public static void main(String[] args) {

        Animals[] an = new Animals[3];

        an[0] = new Dog(1f, 25, 5);
        an[1] = new Cat(1f, 15);
        an[2] = new Horse(2f, 50, 14);

        for (Animals a : an) {
            a.run();
            a.swim();
            a.jump();
            System.out.println();
        }
    }
}


