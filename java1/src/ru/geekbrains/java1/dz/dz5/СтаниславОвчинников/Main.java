package ru.geekbrains.java1.dz.dz5.СтаниславОвчинников;

import java.util.Scanner;

/**
 * Created by I_V_Zhukov on 10.05.2016.
 */
public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        int x, y;
//        boolean z;
        Animals[] animalses = new Animals[3];
        animalses[0] = new Cat();
        animalses[1] = new Dog();
        animalses[2] = new Horse();
        for (Animals animals : animalses) {
            animals.showInfo();
        }


//        System.out.println("Введите параметры действия животного прыжок-высота(м), бег-скорость(км/ч), плавание-(true, false)");
//        x = scanner.nextInt();
//        y = scanner.nextInt();
//        z = scanner.nextBoolean();
//
//        if (c.getJumpHeight() >= x) {
//            c.jump();
//        } else {
//            System.out.println("Кот не может прыгать  так высоко");
//        }
//        if (d.getJumpHeight() >= x) {
//            d.jump();
//        } else {
//            System.out.println("Собака не может прыгать  так высоко");
//        }
//        if (h.getJumpHeight() >= x) {
//            h.jump();
//        } else {
//            System.out.println("Лошадь не может прыгать  так высоко");
//        }
//
//
//        if (c.getRunSpeed() >= y) {
//            c.run();
//        } else {
//            System.out.println("Кот не может бежать так быстро");
//        }
//        if (d.getRunSpeed() >= y) {
//            d.run();
//        } else {
//            System.out.println("Собака не может бежать так быстро");
//        }
//        if (h.getRunSpeed() >= y) {
//            h.run();
//        } else {
//            System.out.println("Лошадь не может бежать так быстро");
//        }
//
//        if (c.isSwimChance() == z) {
//            c.swim();
//        } else {
//            System.out.println("Кот не умеет плавать");
//        }
//        if (d.isSwimChance() == z) d.swim();
//        if (h.isSwimChance() == z) h.swim();


    }
}