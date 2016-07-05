package ru.geekbrains.java2.dz.dz5.ГерманВавилин;

/**
 * Created by gta5 on 22.06.2016.
 */
public class ArrayComputerThread extends Thread {
    private float[] array;
    private long time;

    public synchronized void run()
    {
        time = System.currentTimeMillis();
        for (int i = 0; i < array.length; i++) {
            array[i] = (float)(array[i] * Math.sin(0.2f + i/5) * Math.cos(0.2f + i/5) * Math.cos(0.4f + i/2));
        }
        time = System.currentTimeMillis() - time;
        System.out.println("Время пересчета в потоке \'" + this.getName() + "\': " + time + " мсек");
    }

    public void setArray(float[] array) {
        this.array = array;
    }

    public float[] getArray() {
        return array;
    }

    public long getTime() {
        return time;
    }
}
