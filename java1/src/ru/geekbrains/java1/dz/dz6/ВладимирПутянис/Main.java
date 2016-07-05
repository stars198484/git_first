package ru.geekbrains.java1.dz.dz6.ВладимирПутянис;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by Vladimir on 26.05.2016.
 */
public class Main
{
    public static void main(String[] args)
    {
        concat_files();
        
    }

    public static void concat_files()
    {
        FileInputStream fin1 = null;
        FileInputStream fin2 = null;
        FileOutputStream fout = null;

        try
        {
            fin1 = new FileInputStream("src/ru/geekbrains/java1/dz/dz6/ВладимирПутянис/text1.txt");
            fin2 = new FileInputStream("src/ru/geekbrains/java1/dz/dz6/ВладимирПутянис/text2.txt");
            fout = new FileOutputStream("src/ru/geekbrains/java1/dz/dz6/ВладимирПутянис/concat.txt");

            int i = 1;
            do
            {
                i = fin1.read();
                if (i != -1)
                {
                    fout.write((char)i);
                }
            }
            while (i != -1);
            if (fin1 != null) fin1.close();

            int j = 1;
            do
            {
                j = fin2.read();
                if (j != -1)
                {
                    fout.write((char)j);
                }
            }
            while (j != -1);
            if (fin2 != null) fin2.close();

            if (fout != null) fout.close();
        }
        catch (IOException e)
        {
            System.out.println("An error");
        }
    }
}
