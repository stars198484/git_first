package ru.geekbrains.java1.dz.dz6.АндрейС;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ShowFile {
    public static void main(String[] args) {
//        char [] chr1 = new char [115];
//        char [] chr2 = new char [100];
//        for (i = 0, i < chr1.length, i++){
//
//        }


        int i;
        int y;
        FileInputStream fin = null;
        FileInputStream fin2 = null;
        FileOutputStream fout = null;
        try {
            fin = new FileInputStream("F:\\Java\\Projects\\src\\lesson6\\1.txt"); //первый файл с которого читаются данные
            fin2 = new FileInputStream("F:\\Java\\Projects\\src\\lesson6\\2.txt"); // второй файл с которого читаются данные
            fout = new FileOutputStream("F:\\Java\\Projects\\src\\lesson6\\12.txt"); // файл куда буду писаться данные
            do {
                i = fin.read(); // читаем данные из первого файла
                if (i != -1) fout.write(i); // записываем их в файл вывода
            }
            while (i !=-1);
            if (fin !=null) fin.close(); // закрываем первый файл
            do {
                y = fin2.read();// читаем данные из второго файла
                if (y != -1) fout.write(y);// записываем их в файл вывода
            }
            while (y != -1);
            if (fin2 != null) fin2.close();// закрываем второй файл
            if (fout !=null) fout.close();// закрываем файл вывода
        }
        catch (IOException e) {
            System.out.println("Error");
        }
//        try{
//            fin = new FileInputStream("F:\\Java\\Projects\\src\\lesson6\\12.txt");
//            System.out.println(fin.available());
//        }
//        catch (IOException e) {
//            System.out.println("Error");
//        }
    }
}
