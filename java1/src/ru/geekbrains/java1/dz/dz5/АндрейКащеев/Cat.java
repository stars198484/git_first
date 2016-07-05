package ru.geekbrains.java1.dz.dz5.АндрейКащеев;

/**
 * Created by Home-pc on 23.05.2016.
 */
public class Cat extends Animals {
    private final String A_TYPE="Кот";

    public Cat(String name) {
        super(name);
    }
    @Override
    public void run(int cm) {
        System.out.println(A_TYPE+" "+super.getName()+": "+"Пробежка "+cm+" см");
    }
    @Override
    public void swim(int cm) {
        System.out.println(A_TYPE+" "+super.getName()+": "+"Извините, Я сегодня не плаваю");
    }
    @Override
    public void jump(int cm) {
        if (cm <= 200) {
            System.out.println(A_TYPE+" "+super.getName()+": "+"Прыжок на "+cm+" см");
        }
        else System.out.println(A_TYPE+" "+super.getName()+": "+"Слишком высоко ("+cm+"см)");


    }
}
