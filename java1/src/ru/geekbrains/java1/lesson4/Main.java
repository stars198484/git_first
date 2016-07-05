package ru.geekbrains.java1.lesson4;

/**
 * Created by I_V_Zhukov on 16.05.2016.
 */
public class Main {
    public static void main(String[] args) {
        Cat c = new Cat("Вася", "red");//1
//        System.out.println(c);
//        Cat cat2 = new Cat("Вася", "red", 2);//2
//        System.out.println(cat2);
//
//        cat2 = c;
//        System.out.println(cat2);
//
//        c = new Cat("Вася", "red");;//3
//        System.out.println(c);
//        System.out.println(cat2);
//
//        c = new Cat();
//        System.out.println(c);
//        c.metod();
        System.out.println(c);
        c.incAge();
        System.out.println(c);
        c.incAge();
        System.out.println(c);
        System.out.println(c.getName());
        System.out.println(c.getColor());
        System.out.println(c.getAge());
        System.out.println(c.getI());
        c.setI(5);
        System.out.println(c.getI());

        c = new Cat("Вася", "red");//1
        System.out.println(c);

        c = new Cat("Вася2", "red");//1
        System.out.println(c);


        c = new Cat("Вася3", "red");//1
        System.out.println(c);

        System.out.println("массив "+c.getA1()[0]);
    }
}
