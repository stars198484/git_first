package ru.geekbrains.java1.dz.dz5.РусланУстиц;

import java.util.Random;

/**
 * Created by Home-pc on 23.05.2016.
 */
public class Dog extends Animals {
    private static final double RUN_LIMITATION = 4000;
    private static final double SWIM_LIMITATION = 10;
    private static final double JUMP_LIMITATION = 0.5;

    private boolean isMad;

    public Dog(String name) {
        super(name);
    }

    @Override
    public void run(double distance) {
        if (!isMad) {
            if (distance < RUN_LIMITATION)
                System.out.println(super.getName() + " пробежал " + distance + " метров");
            else {
                System.out.println(super.getName() + " пробежал " + getExtraMetersAtRange(RUN_LIMITATION) + " метров и выдохся");
                generateMadness();
            }
        } else
            System.out.println("Для бешеной собаки семь верст - не крюк! " + super.getName()
                    + " пробежал " + distance + " без каких-либо трудностей");
    }

    @Override
    public void swim(double distance) {
        if (distance < SWIM_LIMITATION)
            System.out.println(super.getName() + " переплыл " + distance + "метров");
        else {
            System.out.println(super.getName() + " проплыл " + getExtraMetersAtRange(SWIM_LIMITATION) + " метров и выдохся");
            generateMadness();
        }
    }

    @Override
    public void jump(double distance) {
        if (distance < JUMP_LIMITATION)
            System.out.println(super.getName() + " перепрыгнул " + distance + " метров");
        else {
            System.out.println(super.getName() + " прыгнул на " + getExtraMetersAtRange(JUMP_LIMITATION) + " метров и упал");
            generateMadness();
        }
    }

    private void generateMadness() {
        if (!isMad) {
            Random random = new Random();
            if (random.nextInt(5) > 3)
                isMad = true;
        }
    }
}