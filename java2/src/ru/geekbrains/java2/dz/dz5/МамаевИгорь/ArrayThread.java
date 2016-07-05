package ru.geekbrains.java2.dz.dz5.МамаевИгорь;


public class ArrayThread implements Runnable {

    private float[] array;
    private int number;

    //в конструкторе получаем массив над которым будем работать и номер (первый или второй) части массива
    public ArrayThread(float[] array, int number) {
        this.array = array;
        this.number = number;
    }

    @Override
    public void run() {
        for (int i = 0; i < array.length; i++) {
            array[i] = (float) (array[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        if (number == 1)
            ArrayWork.setHalfArr1(array);
        else
            ArrayWork.setHalfArr2(array);

    }

}
