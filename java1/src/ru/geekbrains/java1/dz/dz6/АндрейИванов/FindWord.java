package ru.geekbrains.java1.dz.dz6.АндрейИванов;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by a.ivanov on 25.05.2016.
 */
public class FindWord {

    //Написать программу, которая составляет список файлов, в которых это слово присутствует, указанное пользователем. Для проверки работы программы необходимо создать ~10 текстовых файлов.
    public static void main(String[] args) {

        String path = "C:/geekbrains/Java 1/lesson6/";
        String[] list;
        String findtext;
        File dir = new File(path);
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите слово для поиска.");
        findtext = sc.nextLine();

        if(dir.exists()) {
            list = dir.list(); // Класс java.io.File может представлять имя определённого файла, а также имена группы файлов, находящихся в каталоге.
                               // Если класс представляет каталог, то его метод list() возвращает массив строк с именами всех файлов.
            System.out.println("Следующие файлы содержат ваше слово:");
            for (String str : list) {

                if (readText(path + str).toLowerCase().contains(findtext.toLowerCase()))
                    System.out.println(str);
            }
        }
        else System.out.println("Такой директории не существует!");
    }

    public static String readText(String filePath) {

        String str = "";
        byte[] bt;
        int i;
        FileInputStream fin = null;
        try {
            fin = new FileInputStream(filePath);
            bt = new byte[fin.available()];
            do {
                i = fin.read(bt);
            }
            while (i != -1);
            str = new String(bt, "windows-1251"); // Создаёт новый объект, расшифровывая указанный массив bytes с использованием заданной кодировки charset. Подробнее: http://cyclowiki.org/wiki/String_(Java)
            if(fin != null) fin.close();
        }
        catch (IOException e) {
            System.out.println("Error read file.");
        }
        return str;
    }
}