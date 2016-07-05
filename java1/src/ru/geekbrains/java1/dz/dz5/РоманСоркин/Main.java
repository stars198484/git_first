package ru.geekbrains.java1.dz.dz5.РоманСоркин;

import java.util.Scanner;

/**
 * Created by I_V_Zhukov on 24.05.2016.
 */
public class Main {
    public static void main(String[] args) {
        int a = 0;
        // Инициализируем животных и печатаем их
        Dog dog = new Dog("Шарик", 12);
        Horse horse = new Horse("Кобылка", 5);
        Cat cat = new Cat("Барсик", 6);
        System.out.println(dog);
        System.out.println(horse);
        System.out.println(cat);

        Scanner sc = new Scanner(System.in);

        // Вводим в консоль скорость бега и печатаем результат для каждого из животных
        System.out.println("Введите скорость бега");
        a = sc.nextInt();
        dog.run(a);
        horse.run(a);
        cat.run(a);
        System.out.println();

        // Определение возможности плыть
        dog.swim();
        horse.swim();
        cat.swim();
        System.out.println();

        // Вводим в консоль высоту прыжка и печатаем результат для каждого из животных
        System.out.println("Введите высоту прыжка");
        int c = sc.nextInt();
        dog.jump(c);
        horse.jump(c);
        cat.jump(c);
    }
}


