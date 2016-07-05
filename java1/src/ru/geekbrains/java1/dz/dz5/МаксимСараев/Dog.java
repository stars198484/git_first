package ru.geekbrains.java1.dz.dz5.МаксимСараев;

/**
 * Created by Home-pc on 23.05.2016.
 */
public class Dog extends Animals {

    private static int totalSpeed = 50;
    private static boolean isSwim = true;
    private static double totalAlt = 0.5;

    public Dog(String name, String owner, int id) {
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
