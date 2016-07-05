package ru.geekbrains.java1.dz.dz6.ЮрийЛукас;

import java.io.*;
import java.nio.charset.Charset;
import java.util.ArrayList;

/**
 * Created by yurok on 26.05.16.
 */
public class SeachWordInFiles {
    private String mask; //.txt .doc
    private String word;
    private ArrayList<File> findFiles = new ArrayList<File>();
    private ArrayList<File> listFiles = new ArrayList<File>();
    private String workDirectory;

    public void getListFiles() {
        File myFolder = new File(workDirectory);
        File[] files = myFolder.listFiles();

        for (File item : files) {
            if (item.isFile()) {
                if (item.getName().contains(mask)) {
                    listFiles.add(item);
                }
            }
        }
    }

    public void searcFiles() {
        BufferedReader reader = null;
        getListFiles();
        String line;
        for (File file : listFiles) {
            try {
                reader = new BufferedReader(
                        new InputStreamReader(
                                new FileInputStream(file.getAbsolutePath()), Charset.forName("UTF-8")));
                while ((line = reader.readLine()) != null) {
                    if(line.contains(word)){
                        System.out.println(file.getAbsolutePath());
                        break;
                    }
                }
                reader.close();
            } catch (IOException e) {
                System.out.println(e.getLocalizedMessage());
            }
        }
    }

    public String getMask() {
        return mask;
    }

    public void setMask(String mask) {
        this.mask = mask;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getWorkDirectory() {
        return workDirectory;
    }

    public void setWorkDirectory(String workDirectory) {
        this.workDirectory = workDirectory;
    }
}
