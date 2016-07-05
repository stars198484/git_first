package ru.geekbrains.java1.dz.dz5.АндрейСуслов;

/**
 * Created by Home-pc on 23.05.2016.
 */
public class Horse extends Animals {
    public void swim(int distance){
        if (distance <= getMaxSwimDistance()) System.out.println("Лошадь проплыла дистанию"); else System.out.println("Лошадь не проплыла дистанцию");}
    public void run(int distance){
        if (distance <= getMaxRunDistance()) System.out.println("Лошадь пробежала дистанию"); else System.out.println("Лошадь не пробежала дистанцию");}
    public void jump(double distance){
        if (distance <= getMaxJumpHigh()) System.out.println("Лошадь Перепрыгнула препятсвие ");else System.out.println("Лошадь не перепрыгнула препятсвие");}


    public Horse() {
        super(150, 50, 1.3);
    }
}