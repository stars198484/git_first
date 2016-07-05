package ru.geekbrains.java1.dz.dz5.АндрейСуслов;

/**
 * Created by Home-pc on 23.05.2016.
 */
public class Cat extends Animals {

    public void swim(int distance){
        System.out.println("Кот не умеет плавать");}
    public void run(int distance){
        if (distance <= getMaxRunDistance()) System.out.println("Кот пробежал дистанию"); else System.out.println("Кот не пробежал дистанцию");}
    public void jump(double distance){
        if (distance <= getMaxJumpHigh()) System.out.println("Кот Перепрыгнул препятсвие ");else System.out.println("Кот не перепрыгнул препятсвие");}

    public Cat() {
        super(80,0,2d);
    }
}