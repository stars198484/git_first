package ru.geekbrains.java1.dz.dz5.РусланУстиц;

/**
 * Created by Home-pc on 23.05.2016.
 */
public class Horse extends Animals {
    private static final double RUN_LIMITATION = 10000;
    private static final double SWIM_LIMITATION = 5;
    private static final double JUMP_LIMITATION = 1.5;

    public Horse(String name) {
        super(name);
    }

    @Override
    public void run(double distance) {
        if (distance < RUN_LIMITATION)
            System.out.println(super.getName() + " пробежал " + distance + " метров");
        else {
            System.out.println(super.getName() + " пробежал " + getExtraMetersAtRange(RUN_LIMITATION) + " метров и выдохся");
        }
    }

    @Override
    public void swim(double distance) {
        if (distance < SWIM_LIMITATION)
            System.out.println(super.getName() + " переплыл " + distance + "метров");
        else {
            System.out.println(super.getName() + " проплыл " + getExtraMetersAtRange(SWIM_LIMITATION) + " метров и выдохся");
        }
    }

    @Override
    public void jump(double distance) {
        if (distance < JUMP_LIMITATION)
            System.out.println(super.getName() + " перепрыгнул " + distance + " метров");
        else {
            System.out.println(super.getName() + " прыгнул на " + getExtraMetersAtRange(JUMP_LIMITATION) + " метров и упал");
        }
    }
}