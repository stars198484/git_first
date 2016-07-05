package ru.geekbrains.java1.dz.dz6.ОвчинниковСтанислав;

import java.io.*;

/**
 * Created by Stars on 25.05.2016.
 */
public class Main {
    public static void main(String[] args) throws IOException {

        try(FileWriter writer = new FileWriter("C:"+ File.separator+"second.txt", false))
        {
            // запись всей строки
            String text = "— Я знаю ВСЕ! — сказала Википедия. \n" +
                    "— Во мне все можно найти! — похвастался Googlе. \n" +
                    "— Я самый главный в мире! — заявил Intеrnеt. \n" +
                    "— Ну, ну… — тихо ответило электричество.";
            writer.write(text);

            writer.flush();
        }
        catch(IOException ex) {

            System.out.println(ex.getMessage());
        }
        try(FileWriter writer = new FileWriter("C:"+ File.separator+"first.txt", false))
        {
            // запись всей строки
            String text = "Мне батя сказал если я еще буду долго сидеть у компа и в одноклассниках, не сделав уроки, то он меня мордой по клавиатуре возить будет, но я не лыком шитпрауекрогр8гоп66гшамджзщ8п679шгппппвукнпеирщз...";
            writer.write(text);

            writer.flush();
        }
        catch(IOException ex) {

            System.out.println(ex.getMessage());
        }
        int i;
        FileInputStream fin = null;
        FileOutputStream fout = null;

        // Копирование файла
        try

        {
            // Попытка открытия файлов
            fin = new FileInputStream("C:" + File.separator + "first.txt");
            fout = new FileOutputStream("C:" + File.separator + "second.txt", true);
            do {
                i = fin.read();
                if (i != -1) fout.write(i);
            } while (i != -1);
        } catch (
                IOException exc
                )

        {
            System.out.println("Ошибка ввода-вывода:" + exc);
        } finally

        {
            try {
                if (fin != null) fin.close();
            } catch (IOException exc) {
                System.out.println("Ошибка при закрытии входного файла");
            }
            try {
                if (fout != null) fout.close();
            } catch (IOException exc) {
                System.out.println("Ошибка при закрытии выходного файла");
            }

        }
    }
}
