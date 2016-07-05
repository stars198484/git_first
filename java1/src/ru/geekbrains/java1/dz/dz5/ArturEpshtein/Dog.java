package ru.geekbrains.java1.dz.dz5.ArturEpshtein;

/**
 * Created by Home-pc on 23.05.2016.
 */
public class Dog extends Animals {
    String name = "Собака Мухтар";
    String swim = "отлично плавает.";
    String run = "замечательно  бегает.";
    String jump = "неплохо прыгает.";

    @Override
    void setName() {
        super.setName();
        System.out.println(name);
    }

    @Override
    void setSwim() {
        super.setSwim();
        System.out.println(name + " " + swim + " Прыгнул и переплыл водоём.");
        System.out.println();
    }

    @Override
    void setRun() {
        super.setRun();
        System.out.println(name + " " + run + " Не задумываясь преодолевает этот этап.");
        System.out.println();
    }

    @Override
    void setJump() {
        super.setJump();
        System.out.println(name + " " + jump + " Немного собравшись с силами, проходит - это препядствие.");
        System.out.println();
    }
}