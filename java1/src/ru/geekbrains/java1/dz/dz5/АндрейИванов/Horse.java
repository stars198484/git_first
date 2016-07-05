package ru.geekbrains.java1.dz.dz5.АндрейИванов;

/**
 * Created by Home-pc on 23.05.2016.
 */
public class Horse extends Animals {
    Horse (float height_block, int speed_run, int speed_swin) {
        super(height_block , speed_run, speed_swin);
    }

    @Override
    public void run() {
        if(super.getSpeed_run() <= 65)
            System.out.println("Лошадь может бежать со скоростью - " + super.getSpeed_run());
        else
            System.out.println("Лошадь не может бежать со скоростью -" + super.getSpeed_run());
    }

    @Override
    public void swim() {
        if(super.getSpeed_swin() <= 15)
            System.out.println("Лошадь может плыть со скоростью - " + super.getSpeed_swin());
        else
            System.out.println("Лошадь не может плыть со скоростью -" + super.getSpeed_swin());
    }

    @Override
    public void jump() {
        if(super.getHeight_block() <= 2.47)
            System.out.println("Лощадь может перепргынуть препятсвие высотой - " + super.getHeight_block());
        else
            System.out.println("Лошадь не может перепрыгнуть препятсвие высотой -" + super.getHeight_block());
    }

}
