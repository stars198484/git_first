package ru.geekbrains.java1.dz.dz6.МамаевИгорь;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String[] filePaths1 =
                {System.getProperty("user.dir") + "\\src\\ru\\geekbrains\\java1\\dz\\dz6\\МамаевИгорь\\file1.txt",
                        System.getProperty("user.dir") + "\\src\\ru\\geekbrains\\java1\\dz\\dz6\\МамаевИгорь\\file2.txt"};

        String finalFilePath = System.getProperty("user.dir") + "\\src\\ru\\geekbrains\\java1\\dz\\dz6\\МамаевИгорь\\New_file1+2.txt";

        System.out.println("Объединение файлов file1.txt и file2.txt...");
        HomeWork homeWork = new HomeWork();
        homeWork.mergeFiles(finalFilePath, filePaths1);
        System.out.println("Объединение завершено!");
        System.out.println("Объединенный файл находится здесь:");
        System.out.println(finalFilePath);
        System.out.println();


        String[] filePaths2 =
                {System.getProperty("user.dir") + "\\src\\ru\\geekbrains\\java1\\dz\\dz6\\МамаевИгорь\\file1.txt",
                        System.getProperty("user.dir") + "\\src\\ru\\geekbrains\\java1\\dz\\dz6\\МамаевИгорь\\file2.txt",
                        System.getProperty("user.dir") + "\\src\\ru\\geekbrains\\java1\\dz\\dz6\\МамаевИгорь\\file3.txt",
                        System.getProperty("user.dir") + "\\src\\ru\\geekbrains\\java1\\dz\\dz6\\МамаевИгорь\\file4.txt",
                        System.getProperty("user.dir") + "\\src\\ru\\geekbrains\\java1\\dz\\dz6\\МамаевИгорь\\file5.txt",
                        System.getProperty("user.dir") + "\\src\\ru\\geekbrains\\java1\\dz\\dz6\\МамаевИгорь\\file6.txt",
                        System.getProperty("user.dir") + "\\src\\ru\\geekbrains\\java1\\dz\\dz6\\МамаевИгорь\\file7.txt",
                        System.getProperty("user.dir") + "\\src\\ru\\geekbrains\\java1\\dz\\dz6\\МамаевИгорь\\file8.txt",
                        System.getProperty("user.dir") + "\\src\\ru\\geekbrains\\java1\\dz\\dz6\\МамаевИгорь\\file9.txt",
                        System.getProperty("user.dir") + "\\src\\ru\\geekbrains\\java1\\dz\\dz6\\МамаевИгорь\\file10.txt",};

        String finalListPath = System.getProperty("user.dir") + "\\src\\ru\\geekbrains\\java1\\dz\\dz6\\МамаевИгорь\\List_file.txt";

        System.out.println("Введите слово для поиска в файлах");
        String word = new Scanner(System.in).nextLine();
        homeWork.findWordInFiles(word, finalListPath, filePaths2);
        System.out.println("Список файлов содержащих \"" + word + "\" находится здесь:");
        System.out.println(finalListPath);
    }


}