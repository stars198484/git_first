package ru.geekbrains.java2.dz.dz5.МамаевИгорь;


public class ArrayWork {
    private static final int size = 10000000;
    private static final int h = size / 2;
    private float[] arr;

    private static float[] halfArr1 = new float[h];
    private static float[] halfArr2 = new float[h];


    public void changeArray1() {
        arr = new float[size];
        for (int i = 0; i < size; i++) {
            arr[i] = 1;
        }
        long a = System.currentTimeMillis();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }

        System.out.println("changeArray1 time = " + (System.currentTimeMillis() - a) + " millisec");
    }

    public void changeArray2() {
        arr = new float[size];
        for (int i = 0; i < size; i++) {
            arr[i] = 1;
        }

        long a = System.currentTimeMillis();

        System.arraycopy(arr, 0, halfArr1, 0, h);
        System.arraycopy(arr, h, halfArr2, 0, h);
        Thread thread0 = new Thread(new ArrayThread(halfArr1, 1));
        Thread thread1 = new Thread(new ru.geekbrains.java2.dz.dz5.МамаевИгорь.ArrayThread(halfArr2, 2));
        thread0.start();
        thread1.start();
        try {
            thread0.join();
            thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.arraycopy(halfArr1, 0, arr, 0, h);
        System.arraycopy(halfArr2, 0, arr, halfArr1.length, h);

        System.out.println("changeArray2 time = " + (System.currentTimeMillis() - a) + " millisec");

    }

    public static void setHalfArr2(float[] halfArr2) {
        ArrayWork.halfArr2 = halfArr2;
    }

    public static void setHalfArr1(float[] halfArr1) {
        ArrayWork.halfArr1 = halfArr1;
    }
}
