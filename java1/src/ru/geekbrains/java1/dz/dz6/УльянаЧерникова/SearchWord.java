package ru.geekbrains.java1.dz.dz6.УльянаЧерникова;

import java.io.*;

/**
 * Created by Uliana on 25.05.2016.
 */
public class SearchWord {
    public static void main(String[] args) {


        int i;
        String w = inputWord();// вызываем метод ввода с консоли


        int amount = 0;
        String s;
        String s1;

// создаем массив с именами файлов
        File file1 = new File("src/ru/geekbrains/java1/lesson6/ru/geekbrains/java1/hw6/1");
        File file2 = new File("src/ru/geekbrains/java1/lesson6/ru/geekbrains/java1/hw6/2");
        File file3 = new File("src/ru/geekbrains/java1/lesson6/ru/geekbrains/java1/hw6/3");
        File file4 = new File("src/ru/geekbrains/java1/lesson6/ru/geekbrains/java1/hw6/4");
        File file5 = new File("src/ru/geekbrains/java1/lesson6/ru/geekbrains/java1/hw6/5");
        File file6 = new File("src/ru/geekbrains/java1/lesson6/ru/geekbrains/java1/hw6/6");
        File file7 = new File("src/ru/geekbrains/java1/lesson6/ru/geekbrains/java1/hw6/7");
        File file8 = new File("src/ru/geekbrains/java1/lesson6/ru/geekbrains/java1/hw6/8");
        File file9 = new File("src/ru/geekbrains/java1/lesson6/ru/geekbrains/java1/hw6/9");
        File file10 = new File("src/ru/geekbrains/java1/lesson6/ru/geekbrains/java1/hw6/1.txt");
        File[] filename = {file1, file2, file3, file4, file5, file6, file7, file8, file9, file10};
        BufferedReader br = null;
// идем по массиву файлов
        for (int j = 0; j < filename.length; j++) {


// каждый файл читаем по срочно, строку из файла переводим в строчную переменную и в ней ищем заданное слово
            try {
                br = new BufferedReader(new FileReader(filename[j]));

                do {
                    s = br.readLine();
                    i = br.read();
                    s1 = s.toString();
                    boolean isContain1 = s1.contains(w);


                    if (isContain1) {


                        //System.out.println(s); Можно еще Выводить строку, где содержиться слово, так же можно считать
                        // количество раз, сколько слово встретилось и выводить на экран все строки, где оно есть. Думаю ,это полезно, но в задании не было)
                        System.out.println(filename[j]);
                        amount++;
                        break;
                    }
                } while (i != -1);


            } catch (IOException e) {
                System.out.println(e);
            } finally {
                try {


                    if (br != null) br.close();

                } catch (IOException e) {
                    System.out.println(e);
                }

            }
        }
        if (amount == 0) System.out.println("No such word ");


    }
    //метод для ввода слова с консоли

    public static String inputWord() {
        String word = "";
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input any word");


        try {
            word = buf.readLine();
        } catch (IOException e) {
            System.out.println("Input Error" + e);

        }
        System.out.println("The word " + word + " can be found the following files: ");
        return word;
    }


}