package ru.geekbrains.java1.dz.dz5.ЮрийНиконоров;

/**
 * Created by I_V_Zhukov on 10.05.2016.
 */
public class Main {
      public static void main(String[] args) {
    Animals a = new Animals();
    a.setName("Животные");

    Dog d = new Dog("Лабрадор", 1.43f, 0.53f, 10.2f);
    Horse h = new Horse("Лошадь", 2.13f, 1.28f, 56f);
    Cat c = new Cat("Персицкий кот", 0.01f, 2.04f, 0.98f);

    //
    d.actionRun(5f);
    d.actionJump(0.489f);
    d.actionSwim(2f);

    h.actionRun(5f);
    h.actionJump(0.489f);
    h.actionSwim(2f);

    c.actionRun(5f);
    c.actionJump(0.489f);
    c.actionSwim(2f);



}


}
