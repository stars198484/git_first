package ru.geekbrains.java1.dz.dz5.РоманСоркин;

/**
 * Created by Home-pc on 23.05.2016.
 */
public abstract class Animals {

    private String name;
    private int age;

    abstract void run(int a);

    abstract void swim();

    abstract void jump(int a);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Animals(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return  " Имя = " + name + ", возраст = " + age;
    }
}
