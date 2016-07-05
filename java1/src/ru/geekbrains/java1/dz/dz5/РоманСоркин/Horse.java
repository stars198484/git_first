package ru.geekbrains.java1.dz.dz5.РоманСоркин;

/**
 * Created by Home-pc on 23.05.2016.
 */
public class Horse extends Animals {
    @Override
    public String toString() {
        return "Horse Имя = " + getName() + ", возраст = " + getAge();
    }

    public Horse(String name, int age) {
        super(name, age);
    }

    @Override
    void run(int a) {
        if (a > 0 && a <= 16) {
            System.out.println(this.getName() + " побежала со скоростью " + a + "км/ч");
        } else if (a < 0 && a >= -5) {
            System.out.println(this.getName() + " пятится назад со скоростью " + a + "км/ч");
        } else {
            System.out.println("Лошади с такой скоростью не бегают");
        }
    }

    @Override
    void swim() {
        System.out.println(this.getName() + " поплыла");
    }

    @Override
    void jump(int a) {
        if (a >= 0 && a <= 5) {
            System.out.println(this.getName() + " перепрыгнула препятствие");
        } else if (a > 5) {
            System.out.println("Лошади так высоко не прыгают");
        } else {
            System.out.println(this.getName() + " не может прорыть подкоп");
        }
    }
}
