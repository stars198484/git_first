package ru.geekbrains.java1.dz.dz5.УльянаКриши;

/**
 * Created by I_V_Zhukov on 24.05.2016.
 */
public class Main {
    public static void main(String[] args) {
        Cat c1= new Cat("White", "Mr.Kote", 3, 1, 1, "British");
        Dog d1=new Dog ("Black", "Blacky", 5, 1, 1, "Pudle");
        Horse h1=new Horse ("Grey", "Lutik", 4, 1, 1);
        System.out.println ("Cat# 1 " + c1 + " ");
        c1.jump();
        c1.run();
        c1.swim();
        System.out.println ("The Dog #1 " + d1 + " ");
        d1.jump();
        d1.run();
        d1.swim();
        System.out.println ("The Horse #1 " + h1 + " ");
        h1.jump();
        h1.run();
        h1.swim();


    }
}
