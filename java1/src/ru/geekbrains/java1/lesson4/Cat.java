package ru.geekbrains.java1.lesson4;

/**
 * Created by Home-pc on 16.05.2016.
 */
public class Cat {
    static int model = 1;
    static int tempSerial;
    private int serial;
    private String name;
    private String color;
    private int age;
    private int i;
    private float[] a1 = new float[1000000];

    public float[] getA1() {
        return a1;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getAge() {
        return age;
    }

    public void incAge() {
        age++;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        if (i > 3) {
            this.i = i;
        } else {
            System.out.println("Error");
        }
    }

    private void metod() {
        System.out.println("metod");
    }

    public Cat() {
        for (int j = 0; j <a1.length ; j++) {
            a1[i]=1;
        }
        serial = tempSerial++;
    }

//    public Cat(String name, String color, int age) {
//    this();
//        this(name, color);
//        this.age = age;
//    }

    public Cat(String name, String color) {
        this();
        this.name = name;
        this.color = color;
        this.age = 0;
    }


    @Override
    public String toString() {
        return "Cat{" +
                "serial=" + serial +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                ", i=" + i +
                '}';
    }
}
