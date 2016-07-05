package ru.geekbrains.java1.dz.dz5.ArturEpshtein;

import java.util.Scanner;

/**
 * Created by I_V_Zhukov on 24.05.2016.
 */
public class Main {
    public static void main(String[] args) {
        Animals animal = new Animals();
        Cat c = new Cat();
        Dog d = new Dog();
        Horse h = new Horse();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите понравившееся Вам животное:");
        System.out.println("1 - Кот, 2 - Собака, 3 - Лошадь");
        int a = scanner.nextInt();


        if (a == 1 || a == 2 || a == 3) {
            System.out.println("Выберите интересующее вас препятствие:");
            System.out.println("1 - Открытая местность:, 2 - Высокая преграда:, 3 - Водоём:");
            int b = scanner.nextInt();
            if (b == 1 || b == 2 || b == 3) {
                if (a == 1) {
                    if (b == 1) {
                        System.out.println("Укажите длину препятствия в км:");
                        int step1 = scanner.nextInt();
                        if (step1 <= 1 || step1 >= 5) {
                            System.out.println(c.name + " - не может преодолеть препятствие");
                        } else {
                            c.setRun();
                        }
                    }
                    if (b == 2) {
                        System.out.println("Укажите высоту препятствия в метрах:");
                        int step2 = scanner.nextInt();
                        if (step2 <= 0 || step2 >= 2) {
                            System.out.println(c.name + " - не может преодолеть препятствие");
                        } else {
                            c.setJump();
                        }
                    }
                    if (b == 3) {
                        System.out.println("Укажите глубину препятствия в метрах:");
                        int step3 = scanner.nextInt();
                        if (step3 == 0) {
                            System.out.println(c.name + " - Без проблем преодолевает его.");
                        } else {
                            c.setSwim();
                        }
                    }
                }

                if (a == 2) {
                    if (b == 1) {
                        System.out.println("Укажите длину препятствия в км:");
                        int step1 = scanner.nextInt();
                        if (step1 <= 1 || step1 >= 10) {
                            System.out.println(d.name + " - не может преодолеть препятствие");
                        } else {
                            d.setRun();
                        }
                    }
                    if (b == 2) {
                        System.out.println("Укажите высоту препятствия в метрах:");
                        int step2 = scanner.nextInt();
                        if (step2 <= 0 || step2 >= 1) {
                            System.out.println(d.name + " - не может преодолеть препятствие");
                        } else {
                            d.setJump();
                        }
                    }
                    if (b == 3) {
                        d.setSwim();

                    }

                }
                if (a == 3) {
                    if (b == 1) {
                        System.out.println("Укажите длину препятствия в км:");
                        int step1 = scanner.nextInt();
                        if (step1 <= 1 || step1 >= 100) {
                            System.out.println(h.name + " - не может преодолеть препятствие");
                        } else {
                            h.setRun();
                        }
                    }
                    if (b == 2) {
                        System.out.println("Укажите высоту препятствия в метрах:");
                        int step2 = scanner.nextInt();
                        if (step2 <= 0 || step2 >= 4) {
                            System.out.println(h.name + " - не может преодолеть препятствие");
                        } else {
                            h.setJump();
                        }
                    }
                    if (b == 3)
                        h.setSwim();
                }
            } else {
                System.out.println(animal.getName() + " растерялось и заснуло от скуки:((((");
            }
        } else

        {
            System.out.println(animal.getName() + " растерялось и заснуло от скуки:((((");
        }
    }
}
