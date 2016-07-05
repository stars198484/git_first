package ru.geekbrains.java1.dz.dz5.АлександрРожнов;

/**
 * Created by Home-pc on 23.05.2016.
 */
public class Horse extends Animals {
    String name;
    String color;
    String family;

    void showNameAndColor(){
        System.out.println("Name: " + name + "|" + "Class: " + family + "|" + "Color: " + color);
    }

    @Override
    void run(){
        System.out.println("The Horse is running");
    }

    @Override
    void jump(){
        System.out.println("The Horse is jumping");
    }

    @Override
    void swim(){
        System.out.println("The Horse is swimming");
    }

    @Override
    void creep(){
        System.out.println("The Horse can't creep");
    }
}



