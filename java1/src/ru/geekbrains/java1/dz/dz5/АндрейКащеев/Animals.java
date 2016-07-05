package ru.geekbrains.java1.dz.dz5.АндрейКащеев;

/**
 * Created by Home-pc on 23.05.2016.
 */
public abstract class Animals {

    private String name;
    public Animals(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void run(int cm);
    public abstract void swim(int cm);
    public abstract void jump(int cm);
}