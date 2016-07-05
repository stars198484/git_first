package ru.geekbrains.java2.dz.dz6.AlekseyNabor.temp.test;

public class Main {
    public static void main(String[] args) {

        sh1();
        System.out.println("======");
        sh2();

    }

    static void sh1(){
        B b = new B();
        A a = b;
        b.setName(5);
        System.out.println("A: "+a.getName()+"\nB: "+b.getName());
    }

    static void sh2(){
        B b = new B();
        A a = b;
        b.i = 5;
        System.out.println("A: "+a.i+"\nB: "+b.i);
    }
}
