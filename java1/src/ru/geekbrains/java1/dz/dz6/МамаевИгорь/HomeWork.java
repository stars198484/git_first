package ru.geekbrains.java1.dz.dz6.МамаевИгорь;

import java.io.*;

public class HomeWork {
    // метод объединяет файлы, пути которых записаны в массив строк filesPaths, в создаваемый файл с путем finalFilePath
    public void mergeFiles(String finalFilePath, String... filesPaths) {
        FileInputStream fin;
        FileOutputStream fout;
        try {
            fout = new FileOutputStream(finalFilePath);

            for (int j = 0; j < filesPaths.length; j++) {
                fin = new FileInputStream(filesPaths[j]);
                int i;
                do {
                    i = fin.read();
                    if (i != -1) {
                        fout.write(i);
                    }
                } while (i != -1);
                fin.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //метод ищет строку targetString в файлах, пути которых записаны в массив строк filesPaths,
    // и записывает пути файлов, в которых присутвует эта строка в файл, с путем finalListPath
    public void findWordInFiles(String targetString, String finalListPath, String... filesPaths) {
        FileReader fileReader;
        try(FileWriter fileWriter = new FileWriter(finalListPath)) {
            for (int j = 0; j < filesPaths.length; j++) {
                fileReader = new FileReader(filesPaths[j]);
                int i;
                String s = "";
                do {
                    i = fileReader.read();
                    if (i != -1) {
                        s = s + (char) i;
                    }
                } while (i != -1);
                if (s.contains(targetString)) {
                    fileWriter.append(filesPaths[j]);
                    fileWriter.append('\n');
                }
                fileReader.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
