package ru.geekbrains.java1.dz.dz5.АлександрАнатольевичСмирнов;

/**
 * Created by Home-pc on 23.05.2016.
 */
public abstract class Animals {

    private String name;
    private float speed; // скорость бега
    private float height; // высота прыжка

    // подать голос
    abstract void voice();

    // бежать
    abstract void race();

    // плыть
    abstract void sail();

    // подпрыгнуть
    abstract void jump();

    public Animals() {
        this.name = "<Кличка не заслужена!>";
        this.speed = 2.5f;
        this.height = 0.5f;
    }

    public Animals(String name) {
        this();
        this.name = name;
    }

    public Animals(String name, float speed, float height) {
        this();
        this.name = name;
        this.speed = speed;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public float getSpeed() {
        return speed;
    }

    public float getHeight() {
        return height;
    }
}
