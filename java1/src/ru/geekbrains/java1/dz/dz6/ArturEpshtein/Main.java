package ru.geekbrains.java1.dz.dz6.ArturEpshtein;

import java.io.*;

/**
 * Created by I_V_Zhukov on 24.05.2016.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        File file1 = new File("file (1).txt");
        File file2 = new File("file (2).txt");
        MyFileModifier.delete("file (3).txt");
        File file3 = new File("file (3).txt");
        MyFileModifier.copyFile(file1, file3);
        MyFileModifier.gluing(file3, file2);
        System.out.println(file1.length());
        System.out.println(file2.length());
        System.out.println(file3.length());
        MyFileModifier.SerName = "It is a word which must be found :(";
        System.out.println(MyFileModifier.SerName);
    }
}

