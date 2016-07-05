package ru.geekbrains.java1.dz.dz5.ЮрийНиконоров;

/**
 * Created by Home-pc on 23.05.2016.
 */
public class Animals {

    private String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "Name='" + name + '\'' +
                '}';
    }

}