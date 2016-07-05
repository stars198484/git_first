package ru.geekbrains.java1.dz.dz5.АндрейСуслов;

/**
 * Created by Home-pc on 23.05.2016.
 */
public class Dog extends Animals {
    public void swim(int distance){
        if (distance <= getMaxSwimDistance()) System.out.println("Собака проплыла дистанию"); else System.out.println("Собака не проплыла дистанцию");}
    public void run(int distance){
        if (distance <= getMaxRunDistance()) System.out.println("Собака пробежала дистанию"); else System.out.println("Собака не пробежала дистанцию");}
    public void jump(double distance){
        if (distance <= getMaxJumpHigh()) System.out.println("Собака Перепрыгнула препятсвие ");else System.out.println("Собака не перепрыгнула препятсвие");}

    public Dog() {
        super(100,100,0.5d);
    }
}