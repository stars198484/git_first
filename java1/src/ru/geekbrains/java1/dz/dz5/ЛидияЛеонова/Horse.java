package ru.geekbrains.java1.dz.dz5.ЛидияЛеонова;

/**
 * Created by Home-pc on 23.05.2016.
 */
public class Horse extends Animals {
    @Override
    void run() {
        System.out.println("Лошадь бегает по манежу");
    }

    @Override
    void swim() {
        System.out.println("Лошадь переплыла реку");
    }

    @Override
    void jump(float height) {
        if (1.2 < height) {
            System.out.println("Лошадь не может перепрыгнуть препятствие высотой больше 120 см");
        } else {
            System.out.println("Лошадь перепрыгнула препятствие");
        }

    }
}
