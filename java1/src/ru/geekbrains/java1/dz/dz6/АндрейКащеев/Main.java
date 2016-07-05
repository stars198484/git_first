package ru.geekbrains.java1.dz.dz6.АндрейКащеев;

import java.io.File;
import java.io.FileInputStream;

/**
 * Created by kay on 25.05.2016.
 */
public class Main {
    final static String pref = "src/ru/geekbrains/java1/dz/dz6/АндрейКащеев/";
    final static String charset = "CP1251";
    public static void main(String[] args) {
        FReader fr = new FReader();
        //fr.print_bytes(pref + "test.txt");
        fr.println(pref + "test.txt",charset);
        fr.println(pref + "test2.txt",charset);

    }
}
