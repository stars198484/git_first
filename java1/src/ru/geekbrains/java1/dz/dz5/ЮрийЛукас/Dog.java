package ru.geekbrains.java1.dz.dz5.ЮрийЛукас;

/**
 * Created by Home-pc on 23.05.2016.
 */
public class Dog extends Animals {
    public Dog(String name, float maxJumpHeigth, int age, float maxJumpLength) {
        super(name, maxJumpHeigth, age, maxJumpLength);
    }

    @Override
    void run() {
        System.out.println("Собака побежала.");
    }


    @Override
    void jump(float heigthBarjer, float lengthBarjer) {
        if(this.getMaxJumpHeigth() <= heigthBarjer & this.getMaxJumpLength() <= lengthBarjer){
            System.out.println("Собака преодолела препятствие.");
        } else {
            System.out.println("Собака не смогла преодолеть препятствие.");
        }
    }

    @Override
    void go() {
        System.out.println("Собака пошла.");
    }

    @Override
    void voice() {
        System.out.println("Собака залаяла.");
    }

    @Override
    void swim() {
        System.out.println("Собака поплыла.");
    }

}