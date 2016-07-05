package ru.geekbrains.java1.dz.dz6.УльянаЧерникова;
import java.io.*;
/**
 * Created by Uliana on 25.05.2016.
 */
public class CopyFromFile
{
    public static void main( String[] args )
    {
        int i;
        FileInputStream fin= null;
        FileOutputStream fout=null;

        try {


        fin = new FileInputStream("src/ru/geekbrains/java1/lesson6/ru/geekbrains/java1/hw6/1.txt");
        fout = new FileOutputStream("src/ru/geekbrains/java1/lesson6/ru/geekbrains/java1/hw6/2.txt", true);


        //true = append file
        do {
            i = fin.read();
            if (i != -1) fout.write(i);
        } while (i != -1);
        if (fin != null) fin.close();
        if (fout != null) fin.close();

    } catch (IOException e) {

            System.out.println(e);


        }
        System.out.println("The parsing file 1.txt to file 2.txt was succesful, open file 2.txt to see the result");
    }
}