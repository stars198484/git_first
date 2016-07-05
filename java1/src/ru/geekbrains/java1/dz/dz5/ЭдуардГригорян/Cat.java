package ru.geekbrains.java1.dz.dz5.ЭдуардГригорян;

/**
 * Created by Home-pc on 23.05.2016.
 */
public class Cat extends Animals {

    public static final String ANSI_RED = "\u001B[31m";

    @Override
    void run() {
        System.out.println(ANSI_RED + "Кошка умеет бегать со скоростью 5 км. в час");
        if (run > 5) {System.out.println("Кошка " + name + " не может бегать с такой скоростью");}
        else {System.out.println("Скорость бега кошки " + name + " составляет: " + run + " км. в час");}
    }

    @Override
    void swim() {
        System.out.println("Кошки не умеют плавать");
        if (swim > 0) {System.out.println("Кошка " + name + " мутант");}
    }

    @Override
    void jump() {
        System.out.println("Кошка умеет прыгает на два метра");
        if (run > 2) {System.out.println("Кошка " + name + " не может настолько прыгать");}
        else {System.out.println("Скорость прыжка кошки " + name + " составляет: " + run + " метр");}
    }
}

