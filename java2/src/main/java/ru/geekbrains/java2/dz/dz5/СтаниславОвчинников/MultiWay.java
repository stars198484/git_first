package ru.geekbrains.java2.dz.dz5.СтаниславОвчинников;

/**
 * Created by Stars on 21.06.2016.
 */
class MultiWay implements Runnable{
    private final int size = 1000000;
    private final int h = size / 2;
    private  float[] a2 = new float[h];

    MultiWay(){

        float[] arr = new float[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1;
        }
        float[] a1 = new float[h];
        long start = System.currentTimeMillis();
        System.arraycopy(arr, 0, a1, 0, h);
        System.arraycopy(arr, h, a2, 0, h);
        run();
        for (int i = 0; i < a1.length; i++) {
            a1[i] = (float) (a1[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        System.arraycopy(a1, 0, arr, 0, h);
        System.arraycopy(a2, 0, arr, h, h);
        long end = System.currentTimeMillis();
        System.out.println("Двойной поток: "+(end-start));
    }

    @Override
    public void run() {
        for (int i = 0; i < a2.length; i++) {
            a2[i] = (float) (a2[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
    }
}
