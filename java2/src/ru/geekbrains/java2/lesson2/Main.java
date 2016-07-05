package ru.geekbrains.java2.lesson2;

import java.io.IOException;
import java.util.Scanner;

import static java.lang.System.in;

/**
 * Created by Home-pc on 09.06.2016.
 */
public class Main {

    public static final boolean isEx = true;

    public static void main(String[] args) throws Exception {
        Scanner scanner = null;
        try {
            scanner = new Scanner(in);
            System.out.println("start");
            exMetod();
            scanner.hasNext();
            System.out.println("not error");
        } catch (IOException|IllegalArgumentException|MyException e) {
            System.out.println(" error " + e.getMessage());
            throw new Exception(e);
        } finally {
            System.out.println("finally");
            if (scanner != null) {
                scanner.close();
            }
        }

    }

    private static void exMetod() throws IOException, IllegalArgumentException, MyException {
        if (isEx) {
            throw new MyException("MyException");
        } else {
            throw new IllegalArgumentException("IllegalArgumentException");
        }
    }
}
