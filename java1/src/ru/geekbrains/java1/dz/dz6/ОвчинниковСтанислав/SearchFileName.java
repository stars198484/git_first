package ru.geekbrains.java1.dz.dz6.ОвчинниковСтанислав;

import java.io.File;
import java.io.FilenameFilter;
import java.util.List;

/**
 * Created by Stars on 26.05.2016.
 */
public class SearchFileName {

    public static void main(String[] args) {
        String dirname = "C:" + File.separator + "Java";
        File fl = new File(dirname);
        FilenameFilter only = new OnlyExt("txt");
        String s[] = fl.list(only);
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }

    }
}
