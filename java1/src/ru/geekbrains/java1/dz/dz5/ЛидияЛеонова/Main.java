package ru.geekbrains.java1.dz.dz5.ЛидияЛеонова;

import java.util.Scanner;

/**
 * Created by I_V_Zhukov on 10.05.2016.
 */
public class Main {
    public static void main(String[] args) {

    Cat cat = new Cat();
    Dog dog = new Dog();
    Horse horse = new Horse();

    while (true) {
        System.out.println("Выберите действие, которое должны выполнить животные: 1 - бежать, 2 - плыть, 3 - прыгать, или 0 - для выхода)");
        Scanner scanner = new Scanner(System.in);
        String c = scanner.next();
        switch (c) {
            case "0": {
                return;
            }
            case "1": {
                cat.run();
                dog.run();
                horse.run();
                break;
            }
            case "2": {
                cat.swim();
                dog.swim();
                horse.swim();
                break;
            }
            case "3": {
                System.out.println("Задайте высоту (в метрах) препятствия, которое должно перепрыгнуть животное");
                float h = scanner.nextFloat();
                cat.jump(h);
                dog.jump(h);
                horse.jump(h);
                break;
            }
            default: {
                System.out.println("Неизвестное действие");
                break;
            }
        }
    }
}
}
