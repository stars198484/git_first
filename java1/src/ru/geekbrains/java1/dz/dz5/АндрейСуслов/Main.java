package ru.geekbrains.java1.dz.dz5.АндрейСуслов;

/**
 * Created by I_V_Zhukov on 10.05.2016.
 */
public class Main {
    public static void main(String[] args) {
    Cat cat = new Cat();
    Dog dog = new Dog();
    Horse horse = new Horse();

    System.out.println("Заплыв на 100 мтров");
    cat.swim(100);
    dog.swim(100);
    horse.swim(100);

    System.out.println();
    System.out.println("Заплыв на 40 мтров");
    cat.swim(40);
    dog.swim(40);
    horse.swim(40);

    System.out.println();
    System.out.println("Прыжок через препятствие высотой 1 метр");
    cat.jump(1);
    dog.jump(1);
    horse.jump(1);

    System.out.println();
    System.out.println("Прыжок через препятствие высотой 2 метр");
    cat.jump(2);
    dog.jump(2);
    horse.jump(2);

    System.out.println();
    System.out.println("Прыжок через препятствие высотой 0.1 метр");
    cat.jump(0.1);
    dog.jump(0.1);
    horse.jump(0.1);

    System.out.println();
    System.out.println("Забег на 100 км");
    cat.run(100);
    dog.run(100);
    horse.run(100);

    System.out.println();
    System.out.println("Забег на 80 км");
    cat.run(80);
    dog.run(80);
    horse.run(80);

    System.out.println();
    System.out.println("Забег на 150 км");
    cat.run(150);
    dog.run(150);
    horse.run(150);
};


}

