package ru.geekbrains.java1.dz.dz5.РусланУстиц;

/**
 * Created by Home-pc on 23.05.2016.
 */
public class Cat extends Animals {

    private static final double RUN_LIMITATION = 2000;
    private static final double JUMP_LIMITATION = 2;

    private static int lifesCount = 9;

    public Cat(String name) {
        super(name);
    }

    @Override
    public void run(double distance) {
        if (lifesCount <= 0)
            System.out.println(super.getName() + " допрыгался - не побежит уже никуда :(");
        else {
            if (distance < RUN_LIMITATION)
                System.out.println(super.getName() + " пробежал " + distance + " метров");
            else {
                System.out.println(super.getName() + " пробежал " + getExtraMetersAtRange(RUN_LIMITATION) + " метров и выдохся");
            }
        }
    }

    @Override
    public void swim(double distance) {
        if (lifesCount <= 0)
            System.out.println(super.getName() + " допрыгался - не поплывет уже никуда :(");
        else
            System.out.println(super.getName() + " боится воды, поэтому даже не стал пытаться плыть");
    }

    @Override
    public void jump(double distance) {
        if (distance < JUMP_LIMITATION)
            System.out.println(super.getName() + " перепрыгнул " + distance + " метров");
        else {
            lifesCount--;
            if (lifesCount <= 0)
                System.out.println(super.getName() + " прыгнул на " + getExtraMetersAtRange(JUMP_LIMITATION) + " метров и упал. Он потерял все свои жизни и трагически погиб");
            else
                System.out.println(super.getName() + " прыгнул на " + getExtraMetersAtRange(JUMP_LIMITATION) + " метров и упал. У него осталось " + lifesCount + " жизней");
        }
    }
}