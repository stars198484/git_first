package ru.geekbrains.java1.dz.dz5.ArturEpshtein;

/**
 * Created by Home-pc on 23.05.2016.
 */
public class Cat extends Animals {

    String name = "Кот Васька";
    String swim = "не умеет плавать.";
    String run = "неплохо бегает.";
    String jump = "отлично прыгает.";
    final static int cat = 1;

    public static int getCat() {
        return cat;
    }

    @Override
    void setJump() {
        super.setJump();
        System.out.println(name + " " + jump + " Без проблем преодолевает его.");
        System.out.println();
    }

    @Override
    void setRun() {
        super.setRun();
        System.out.println(name + " " + run + " И непренужденно проходит - это препядствие.");
        System.out.println();
    }

    @Override
    void setSwim() {
        super.setSwim();
        System.out.println(name + " " + swim + "Посмотрел на воду, и решил обойти.");
        System.out.println();
    }


}