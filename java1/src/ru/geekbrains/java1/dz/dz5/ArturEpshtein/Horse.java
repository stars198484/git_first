package ru.geekbrains.java1.dz.dz5.ArturEpshtein;

/**
 * Created by Home-pc on 23.05.2016.
 */
public class Horse extends Animals {
    String name = "Лошадь Коняшка";
    String swim = "неплохо плавает.";
    String run = "oтлично бегает.";
    String jump = "хорошо прыгает.";

    @Override
    void setJump() {
        super.setJump();
        System.out.println(name + " " + jump + " На раз проходит - это препядствие.");
        System.out.println();
    }

    @Override
    void setRun() {
        super.setRun();
        System.out.println(name + " " + run + " С радостью преодолевает препядствие.");
        System.out.println();
    }

    @Override
    void setName() {
        super.setName();
        System.out.println(name);
    }

    @Override
    void setSwim() {
        super.setSwim();
        System.out.println(name + " " + swim + " Медленно, но верно преодолевает водоём.");
        System.out.println();
    }
}