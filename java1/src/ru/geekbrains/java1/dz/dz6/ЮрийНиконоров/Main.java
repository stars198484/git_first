package ru.geekbrains.java1.dz.dz6.ЮрийНиконоров;

import java.io.*;
import java.util.Scanner;


/**
 * Created by YurokVRS on 25.05.2016.
 */
public class Main {
    public static void main(String[] args) {
        int i;
        // Задание склеить два файла в один
        FileInputStream f1;
        FileInputStream f2;
        FileOutputStream fOut = null;

        try {
            f1 = new FileInputStream("d:\\1.txt");
            f2 = new FileInputStream("d:\\2.txt");
            fOut = new FileOutputStream("d:\\out.txt");
            do {
                i=f1.read();
                if (i!=-1) fOut.write(i);
            } while (i!=-1);
            if (f1 != null) f1.close();
            do {
                i=f2.read();
                if (i!=-1) fOut.write(i);
            } while (i!=-1);
            if (f2 != null) f2.close();
            if (fOut != null) fOut.close();
        }
        catch(IOException e){
                System.out.println("Произошла ошибка");
        }

//        // Задание вывести список файлов содержащие текст
//        FileInputStream f3;
//        Scanner sc = new Scanner(System.in);
//        File folder = new File("d:\\");
//        File[] lFile = folder.listFiles();
//        StringBuilder s;
//        String findText;
//        findText = sc.nextLine();
//
//        for (File f : lFile) {
//            if (f.isFile()) {
//                System.out.println(f.getName());
//                try{
//                    f3 = new FileInputStream(folder + f.getName());
//                    s = null;
//                    do {
//                        i = f3.read();
//                        if(i!=-1) s.append(Integer.toString(i));
//                    } while(i!=-1);
//                    if (f3!=null) f3.close();
//                    System.out.println(s.length());
//                }
//                catch (IOException e){
//                    System.out.println("Произошла ошибка");
//                }
//
//            }
//
//        }
    }

}
