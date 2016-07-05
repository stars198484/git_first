package ru.geekbrains.java2.lesson5;

/**
 * Created by Home-pc on 20.06.2016.
 */
public class TestThreadClass implements Runnable {
    private volatile String string;
    @Override
    public void run() {
        System.out.println("вперед TestThreadClass");
        try {
            for (int i = 0; i < 10; i++) {
                Thread.sleep(100);
                System.out.println("TestThreadClass i= " + i);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("конец TestThreadClass");
    }
}
