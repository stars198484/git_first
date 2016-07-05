package ru.geekbrains.java1.dz.dz6.СусловАндрей;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by SuslovAV on 26.05.2016.
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 // WriteToEndFile  a = new WriteToEndFile();
   //a.createfiles();
   //a.concatFiles();

   FindWordInFile b = new FindWordInFile();
        System.out.println("Введие искомое слово");
        b.FindWordInFile(sc.nextLine());




    }
}
