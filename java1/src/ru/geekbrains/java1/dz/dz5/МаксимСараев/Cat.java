package ru.geekbrains.java1.dz.dz5.МаксимСараев;

/**
 * Created by Home-pc on 23.05.2016.
 */
public class Cat extends Animals {

    private static int totalSpeed = 60;
    private static boolean isSwim = false;
    private static double totalAlt = 2;

    public Cat(String name, String owner, int id) {

        super(name, owner, id, totalSpeed, isSwim, totalAlt);
    }

    @Override
    public void run(int speed) {
        super.run(speed);
    }

    @Override
    public void swim() {
        super.swim();
    }

    @Override
    public void jump(double alt) {
        super.jump(alt);
    }


}