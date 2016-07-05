package ru.geekbrains.java1.dz.dz5.ЮрийЛукас;

/**
 * Created by Home-pc on 23.05.2016.
 */
public class Horse extends Animals {
    public Horse(String name, float maxJumpHeigth, int age, float maxJumpLength) {
        super(name, maxJumpHeigth, age, maxJumpLength);
    }

    @Override
    void run() {
        System.out.println("Лошадь побежала");
    }

    @Override
    void jump(float heigthBarjer, float lengthBarjer) {
        if(this.getMaxJumpHeigth() <= heigthBarjer & this.getMaxJumpLength() <= lengthBarjer){
            System.out.println("Лошадь преодолела препятствие.");
        } else {
            System.out.println("Лошадь не смогла преодолеть препятствие.");
        }
    }

    @Override
    void go() {
        System.out.println("Лошадь пошла.");
    }

    @Override
    void voice() {
        System.out.println("Лошадь заржала.");
    }

    @Override
    void swim() {
        System.out.println("Лошадь поплыла.");
    }
}