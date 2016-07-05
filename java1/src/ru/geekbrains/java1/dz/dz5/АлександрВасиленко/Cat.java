package ru.geekbrains.java1.dz.dz5.АлександрВасиленко;

/**
 * Created by Home-pc on 23.05.2016.
 */
public class Cat extends Animals {

    @Override
    public void run() {
        System.out.println("Кот бежит!");
    }

    @Override
    public void swim() {
        System.out.println("Кот не умеет плавать ):");
    }

    @Override
    public void jump(double i) {
        if (i<=2){
            System.out.println("Кот перепрыгнул препятсвие "+i+" метра!");
        }else {
            System.out.println("кот не допрыгнул :(");
        }
    }

}