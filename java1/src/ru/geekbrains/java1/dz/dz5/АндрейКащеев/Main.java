package ru.geekbrains.java1.dz.dz5.АндрейКащеев;

/**
 * Created by I_V_Zhukov on 10.05.2016.
 */
public class Main {
    public static void main(String[] args) {
        Animals[] anarr = new Animals[3];

        anarr[0] = new Cat("Тихон");
        anarr[1] = new Dog("Кефирчик");
        anarr[2] = new Horse("Снежок");

        for (Animals a: anarr) {
            a.run(400);
            a.jump(120);
            a.swim(10000);
        }


    }
}
