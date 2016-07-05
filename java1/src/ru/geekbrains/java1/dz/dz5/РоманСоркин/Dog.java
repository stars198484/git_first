package ru.geekbrains.java1.dz.dz5.РоманСоркин;

/**
 * Created by Home-pc on 23.05.2016.
 */
public class Dog extends Animals {
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public String toString() {
        return  "Dog Имя = " + getName() + ", возраст = " + getAge();
    }

    @Override
    void run(int a) {
        if (a > 0 && a <= 3) {
            System.out.println(this.getName() + " побежал со скоростью " + a + "км/ч");
        } else if (a < 0 && a >= -3) {
            System.out.println(this.getName() + " пятится назад со скоростью " + a + "км/ч");
        } else {
            System.out.println("Собаки с такой скоростью не бегают");
        }
    }

    @Override
    void swim() {
        System.out.println(this.getName() + " поплыл");
    }

    @Override
    void jump(int a) {
        if (a >= 0 && a <= 2) {
            System.out.println(this.getName() + " перепрыгнул препятствие");
        } else if (a > 2) {
            System.out.println("Собаки так высоко не прыгают");
        } else {
            System.out.println(this.getName() + " прорыл подкоп");
        }
    }


}
