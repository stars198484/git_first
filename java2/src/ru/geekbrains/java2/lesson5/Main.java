package ru.geekbrains.java2.lesson5;

/**
 * Created by Home-pc on 20.06.2016.
 */
public class Main {
    public static void main(String[] args) {
        Thread thread = new Thread(new TestThreadClass());
        thread.start();
        MyThread myThread = new MyThread();
        myThread.start();
        System.out.println("вперед Main");
        try {
            for (int i = 0; i < 10; i++) {
                Thread.sleep(100);
                System.out.println("Main i= " + i);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("конец Main");
    }
}
