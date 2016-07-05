package ru.geekbrains.java2.lesson5;

import java.io.Serializable;

/**
 * Created by Home-pc on 20.06.2016.
 */
public class MyThread extends Thread implements Serializable{
    @Override
    public void run() {
        System.out.println("вперед MyThread");
        try {
            for (int i = 0; i < 10; i++) {
                Thread.sleep(100);
                System.out.println("MyThread i= " + i);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("конец MyThread");
    }
}

