package ru.geekbrains.java1.dz.dz5.АлександрВасиленко;

/**
 * Created by Home-pc on 23.05.2016.
 */
public class Dog extends Animals {
    @Override
    public void run() {
        System.out.println("Собака бежит!");
    }

    @Override
    public void swim() {
        System.out.println("Собака плывёт!");
    }

    @Override
    public void jump(double i) {
        if(i<=0.5){
            System.out.println("Собака перепрыгнула препятсвие "+i+" метра!");
        }else {
            System.out.println("Собака не смогла перепрыгнуть:(");
        }
    }

}