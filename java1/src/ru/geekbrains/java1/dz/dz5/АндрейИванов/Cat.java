package ru.geekbrains.java1.dz.dz5.АндрейИванов;

/**
 * Created by Home-pc on 23.05.2016.
 */
public class Cat extends Animals {

    Cat (float height_block, int speed_run) {
        super(height_block , speed_run, 0);
    }

    @Override
    public void run() {
        if(super.getSpeed_run() < 40)
            System.out.println("Кот может бежать со скоростью - " + super.getSpeed_run());
        else
            System.out.println("Кот не может бежать со скоростью -" + super.getSpeed_run());
    }

    @Override
    public void swim() {
        System.out.println("Кот не умеет плавать!");

    }

    @Override
    public void jump() {
        if(super.getHeight_block() <= 1f)
            System.out.println("Кот может перепргынуть препятсвие высотой - " + super.getHeight_block());
        else
            System.out.println("Кот не может перепрыгнуть препятсвие высотой -" + super.getHeight_block());
    }
}