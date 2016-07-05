package ru.geekbrains.java1.dz.dz5.СтаниславЗемляков;

/**
 * Created by I_V_Zhukov on 24.05.2016.
 */
public class Main {
    public static void main(String[] args) {
        Dog d1 = new Dog(1000, 5, 100);
        System.out.println("Dog will run " + d1.checkMax_run_distance(d1.max_run_distance)+ "m."  + d1.s1);
        System.out.println("Dog will jump " + d1.checkMax_jump_distance(d1.max_jump_distance)+ "m."  + d1.s2);
        System.out.println("Dog will swim " + d1.checkMax_swim_distance(d1.max_swim_distance)+ "m."  + d1.s3);
        Cat c1 = new Cat(500, 2, 5);
        System.out.println("Cat will run " + c1.checkMax_run_distance(c1.max_run_distance) + "m." + c1.s1);
        System.out.println("Cat will jump " + c1.checkMax_jump_distance(c1.max_jump_distance)+ "m."  + c1.s2);
        System.out.println("Cat will swim " + c1.checkMax_swim_distance(c1.max_swim_distance)+ "m."  + c1.s3);
        Horse h1 = new Horse(500000, 1.5 , 150);
        System.out.println("Horse will run " + h1.checkMax_run_distance(h1.max_run_distance)+ "m."  + h1.s1);
        System.out.println("Horse will jump " + h1.checkMax_jump_distance(h1.max_jump_distance)+ "m."  + h1.s2);
        System.out.println("Horse will swim " + h1.checkMax_swim_distance(h1.swim_distance)+ "m."  + h1.s3);
    }
}
