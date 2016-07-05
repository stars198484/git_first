//package UlianaChernikova;
package ru.geekbrains.java2.dz.dz5.UlianaChernikova;

/**
 * Created by Uliana on 23.06.2016.
 */
public class ArrayClass {

    final static int size = 10000000;
final static int h=size/2;
    //первый метод просто считает массив
   public static void calc1() {


        final float [] arr = new float[size];

        for(int i=0;i<size;++i) {
            arr[i] = 1;
        }
        long t1 = System.currentTimeMillis();
        for(int i=0; i<arr.length; ++i) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        System.out.println("FINISH 1ST METHOD TIME - "+(System.currentTimeMillis()-t1)+" ms");
    }



//второй метод разбивает массив на два и считает в двух потоках
public static void calc2(){
    final float [] arr = new float[size];
    for(int i=0;i<size;++i) {
        arr[i] = 1;
    }

    long t1 = System.currentTimeMillis();
    float[] a1 = new float[size/2];
    float[] a2 = new float[size/2];

    System.arraycopy(arr, 0, a1, 0, h);
    System.arraycopy(arr, h, a2, 0, h);

    Thread thread = new Thread(new Runnable() {
        @Override
        public void run() {
            for(int i=0; i<a1.length; ++i) {
                a1[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            }
            System.arraycopy(a1, 0, arr, 0, size/2);
        }
    });
    thread.start();

    for(int i=0; i<a2.length; ++i) {
        a1[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
    }
    System.arraycopy(a2, 0, arr, (size/2), size/2);

    try {
        thread.join(0);
    } catch (InterruptedException ex) {
        System.err.println("Error - "+ex.getLocalizedMessage());
    }

    System.out.println("FINISH 2ND METHOD TIME - "+(System.currentTimeMillis()-t1)+" ms");
}

}
