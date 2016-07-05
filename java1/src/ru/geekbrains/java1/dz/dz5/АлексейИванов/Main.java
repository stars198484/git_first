package ru.geekbrains.java1.dz.dz5.АлексейИванов;

/**
 * Created by I_V_Zhukov on 13.05.2016.
 */
public class Main {
    public static void main(String[] args) {
    Cat c = new Cat();
    Dog d = new Dog();
    Horse h = new Horse();
    c.getKing();
    c.voice();
    c.getSwimSkill();
    c.runDist(20);
    c.jump(2);

    d.getKing();
    d.voice();
    d.getSwimSkill();
    d.runDist(20);
    d.jump(2);

    h.getKing();
    h.voice();
    h.getSwimSkill();
    h.runDist(20);
    h.jump(2);

}
}
