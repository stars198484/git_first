package ru.geekbrains.java2.dz.dz5.ГерманВавилин;

/**
 * Created by gta5 on 22.06.2016.
 */
public class ThreadTester {
    private static final int size = 10000000;
    private static final int h = size/2;
    private float[] array = new float[size];
    //забиваем массив единицами
    private void arrayOnesFiller(){
        for (int i = 0; i < size; i++) {
            array[i] = 1f;
        }
    }
    //Метод для расчета в 1 поток
    public void singleThreadCalculation() {
        arrayOnesFiller();
        ArrayComputerThread singleThread = new ArrayComputerThread();
        singleThread.setName("Единый поток");
        singleThread.setArray(array);
        singleThread.start();
        //Ждем завершения потока.
        try {
            singleThread.join();
        } catch (InterruptedException e) {
            System.out.println("Ошибка при выполнении потока: " + e.getMessage());
        }
    }
    //Метод для расчета в 2 потока
    public synchronized void multithreadCalculation() {
        arrayOnesFiller();
        long s,c;
        //создаем 2 объекта-потока
        ArrayComputerThread firstThread = new ArrayComputerThread();
        firstThread.setName("Поток рассчета № 1");
        ArrayComputerThread secondThread = new ArrayComputerThread();
        secondThread.setName("Поток рассчета № 2");
        //создаем 2 дочерних массива из основного и замеряем время
        float[] a1 = new float[h];
        float[] a2 = new float[h];
        s = System.currentTimeMillis();
        System.arraycopy(array, 0, a1, 0, h);
        System.arraycopy(array, h, a2, 0, h);
        s = System.currentTimeMillis() - s;
        //устанавливаем массивы для обработки потокам
        firstThread.setArray(a1);
        secondThread.setArray(a2);
        //запускаем потоки
        firstThread.start();
        secondThread.start();
        System.out.println("Разделение массива: " + s + " мсек");
        //ниже ждем завершения работы потоков и в случае успеха сшиваем массив заново с замером времени.
        try {
            firstThread.join();
            secondThread.join();
            c = System.currentTimeMillis();
            System.arraycopy(firstThread.getArray(), 0, array, 0, h);
            System.arraycopy(secondThread.getArray(), 0, array, h, h);
            c = System.currentTimeMillis() - c;
            System.out.println("Склейка массива: " + c + " мсек");
            System.out.println("Общее время работы метода c 2 потоками: " + (s + c + firstThread.getTime() + secondThread.getTime()) + " мсек");
        } catch (InterruptedException e) {
            System.out.println("Произошла ошибка при работе с потоком: " + e.getMessage());
        }
    }
}
