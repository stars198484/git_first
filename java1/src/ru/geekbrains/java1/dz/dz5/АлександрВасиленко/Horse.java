package ru.geekbrains.java1.dz.dz5.АлександрВасиленко;

/**
 * Created by Home-pc on 23.05.2016.
 */
public class Horse extends Animals {
    @Override
    public void run() {
        System.out.println("Лошадь скачет!");
    }

    @Override
    public void swim() {
        System.out.println("Лошадь идёт по дну подоёма!");
    }

    @Override
    public void jump(double i) {
        if (i<=1.5){
            System.out.println("Лошадь перепрыгнула препятсвие "+i+" метра!");
        }else {
            System.out.println("Лошадь сломала препятствие!!");
        }
    }

}