package ru.geekbrains.java1.dz.dz6.КонстантинГрачев;

/**
 * Created by Константин on 25.05.2016.
 */


import ru.geekbrains.java1.dz.dz5.КонстантинГрачев.Animals;

import java.awt.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Method;

import static javax.print.attribute.standard.MediaSizeName.C;

public class Main {
  public static void main(String[] args) {



      int i;
      String address = "C:\\Users\\Константин\\Desktop\\Обучение\\ДЗ\\6 урок\\java1\\src\\ru\\geekbrains\\java1\\dz\\dz6\\КонстантинГрачев\\File1";

      File FF = new File(address);
      System.out.print(FF.getName());
      System.out.print(":");

      Method1(address);
      System.out.print("+");
      String address1 = "C:\\Users\\Константин\\Desktop\\Обучение\\ДЗ\\6 урок\\java1\\src\\ru\\geekbrains\\java1\\dz\\dz6\\КонстантинГрачев\\File2";
      Method1(address1);}



   public static void Method1 (String address){
       int i;
       FileInputStream fin;

       try {
           fin = new FileInputStream(address);
           do {
               i = fin.read();
               if (i != -1) System.out.print((char) i);
           } while (i != -1);
           fin.close();
       } catch (IOException е) {
           System.out.println("Произошла ошибкa чтения файла");
       }

   }
}
