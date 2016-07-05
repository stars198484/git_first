package ru.geekbrains.java2.lesson3;

import java.util.*;

/**
 * Created by Home-pc on 14.06.2016.
 */
public class Main {
    public static void main(String[] args) {
        String s = "string";
        Stack stack = new Stack();
        stack.push(s);
        String s2 = (String) stack.pop();
        stack.push("534654");
        stack.push("2");
        Iterator iterator = stack.iterator();
        while (iterator.hasNext()){
            String s1 = (String) iterator.next();
            System.out.println("s1 = "+s1);
        }
        for (Object s1 : stack){
            String s3 = (String) s1;
            System.out.println("s2 = "+s3);
        }

//        Integer s2 = (Integer) stack.pop();
//        System.out.println(s2);
        Integer[] integers = {1,3,4,5};

        for (int i = 0; i < integers.length; i++) {
            int ints = integers[i];
        }

        List list = new ArrayList();
        List list2 = new LinkedList();
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "rertryhtrfh");
        System.out.println("map " + map.get(1));

    }
}
