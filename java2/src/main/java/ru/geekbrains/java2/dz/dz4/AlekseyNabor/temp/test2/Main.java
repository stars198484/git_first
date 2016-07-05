package ru.geekbrains.java2.dz.dz4.AlekseyNabor.temp.test2;

import java.util.*;

/**
 * Created by A on 18.06.2016.
 */
public class Main {
    public static void main(String[] args) {
        int elements = Integer.MAX_VALUE/1000;
        System.out.println("Elements: " + elements);;
        System.out.println("\nArrayList time: "+arrayListTest(elements));
       // System.out.println("\nLinkedList time: "+linkedListTest(elements));
        System.out.println("\nVector time: "+vectorListTest(elements));
    }

    private static String arrayListTest(int count) {
        List arrayList = new ArrayList();
        String result = null;
        long start = System.nanoTime();
        for (int i=0;i<count;i++) {
            arrayList.add(i);
        }
        result = result + ("\nAL add: "+(System.nanoTime()-start)/1000000);
        start = System.nanoTime();
        for (int i=0;i<count;i++) {
            arrayList.set(i,i+1);
        }
        result = result + ("\nAL set: "+(System.nanoTime()-start)/1000000);
        start = System.nanoTime();
        for (int i=0;i<count;i++) {
            arrayList.get(i);
        }
        result = result + ("\nAL get: "+(System.nanoTime()-start)/1000000);
        start = System.nanoTime();
        for (int i=0;i<count;i++) {
            arrayList.remove(count-i-1);
        }
        result = result + ("\nAL remove: "+(System.nanoTime()-start)/1000000);

        arrayList = null;
        return result;
    }

    private static String linkedListTest(int count) {
        List linkedlist = new LinkedList();
        String result = null;
        long start = System.nanoTime();
        for (int i=0;i<count;i++) {
            linkedlist.add(i);
        }
        result = result + ("\nLL add: "+(System.nanoTime()-start)/1000000);
        start = System.nanoTime();
        for (int i=0;i<count;i++) {
            linkedlist.set(i,i+1);
        }
        result = result + ("\nLL set: "+(System.nanoTime()-start)/1000000);
        start = System.nanoTime();
        for (int i=0;i<count;i++) {
            linkedlist.get(i);
        }
        result = result + ("\nLL get: "+(System.nanoTime()-start)/1000000);
        start = System.nanoTime();
        for (int i=0;i<count;i++) {
            linkedlist.remove(count-i-1);
        }
        result = result + ("\nLL remove: "+(System.nanoTime()-start)/1000000);

        linkedlist = null;
        return result;
    }

    private static String vectorListTest(int count) {
        List vectorlist = new Vector();
        String result = null;
        long start = System.nanoTime();
        for (int i=0;i<count;i++) {
            vectorlist.add(i);
        }
        result = result + ("\nVL add: "+(System.nanoTime()-start)/1000000);
        start = System.nanoTime();
        for (int i=0;i<count;i++) {
            vectorlist.set(i,i+1);
        }
        result = result + ("\nVL set: "+(System.nanoTime()-start)/1000000);
        start = System.nanoTime();
        for (int i=0;i<count;i++) {
            vectorlist.get(i);
        }
        result = result + ("\nVL get: "+(System.nanoTime()-start)/1000000);
        start = System.nanoTime();
        for (int i=0;i<count;i++) {
            vectorlist.remove(count-i-1);
        }
        result = result + ("\nVL remove: "+(System.nanoTime()-start)/1000000);

        vectorlist = null;
        return result;
    }


}
