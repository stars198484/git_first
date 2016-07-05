package ru.geekbrains.java1.dz.dz5.АндрейИванов;

/**
 * Created by Home-pc on 23.05.2016.
 */
public class Dog extends Animals {
    Dog(float heigth_block, int speed_run, int speed_swin) {
        super(heigth_block, speed_run, speed_swin);
    }
    @Override
    protected void run() {
        if(super.getSpeed_run() <= 50)
            System.out.println("Собака может бежать со скоростью - " + super.getSpeed_run());
        else
            System.out.println(("Собака не может бежать со скоростью - " + super.getSpeed_run()));
    }

    @Override
    public void swim() {
        if(super.getSpeed_swin() <= 7)
            System.out.println("Собака может плыть со скоростью - " + super.getSpeed_swin());
        else
            System.out.println("Собака не может плыть со скоростью - " + super.getSpeed_swin());
    }

    @Override
    public void jump() {
        if(super.getHeight_block() <= 0.5)
            System.out.println("Собака может перепрыгнуть препятсвие высотой - " + super.getHeight_block());
        else
            System.out.println("Собака не может перепргынуть препятсвие высотой- " + super.getHeight_block());
    }
}
