package ru.geekbrains.java1.dz.dz5.ЭдуардГригорян;

/**
 * Created by Home-pc on 23.05.2016.
 */
public class Horse extends Animals {
    public static final String ANSI_GREEN = "\u001B[32m";


    @Override
    void run() {
        System.out.println(ANSI_GREEN + "Лошадь умеет скакать со скоростью 15 км. в час");
        if (run > 15) {System.out.println("Лошадь " + name + " не может скакать с такой скоростью!");}
        else {System.out.println("Скорость с которой скачет лошадь " + name + " составляет: " + run + " км. в час");}
    }

    @Override
    void swim() {
        System.out.println("Лошадь умеет плавать со скоростью 20 км. в час");
        if (swim > 20) {System.out.println("Лошадь " + name + " не может плавать с такой скоростью!");}
        else {System.out.println("Скорость с которой плывет лошадь " + name + " составляет: " + run + " км. в час");}
    }

    @Override
    void jump() {
        System.out.println("Лошадь умеет прыгать на три метра");
        if (jump > 3) {System.out.println("Лошадь " + name + " не может настолько прыгать!");}
        else {System.out.println("Скорость с которой прыгает лошадь " + name + " составляет: " + jump + " метр");}
    }
}