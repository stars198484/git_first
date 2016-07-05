package ru.geekbrains.java1.dz.dz6.ЮрийЛукас;

/**
 * Created by yurok on 25.05.16.
 */

import java.io.*;

public class SumFiles {
    private final int firstInputFile = 0;
    private final int secondInputFile = 1;

    FileInputStream filesInputFirst = null;
    FileInputStream filesInputSecond = null;
    FileOutputStream outFile;
    private String firstFileName;
    private String secondFileName;
    private String nameFile;


    public SumFiles(String firstFileName, String secondFile, String nameFile) {
        this.firstFileName = firstFileName;
        this.secondFileName = secondFile;
        this.nameFile = nameFile;
    }

    public void concatFiles() throws IOException {
        StringBuilder result = new StringBuilder();
        int i;
        FileInputStream currentFIle = null;
        FileOutputStream resultFile = null;

        try {
            openFiles();
            currentFIle = filesInputFirst;
            resultFile = createOutFile();

            do {
                i = currentFIle.read();
                result.append((char) i);

            } while (i != -1);

            currentFIle = filesInputSecond;
            do {
                i = currentFIle.read();
                result.append((char) i);

            } while (i != -1);


            for (i = 0; i < result.length(); i++) {
                resultFile.write(result.charAt(i));
            }

        } catch (IOException e) {
            System.out.println(e.getLocalizedMessage());
        } finally {
            if (resultFile != null) resultFile.close();
            if (filesInputFirst != null) filesInputFirst.close();
            if (filesInputSecond != null) filesInputSecond.close();
        }
    }

    public void openFiles() {
        try {
            this.filesInputFirst = new FileInputStream(firstFileName);
            this.filesInputSecond = new FileInputStream(secondFileName);
        } catch (IOException e) {
            System.out.println(e.getLocalizedMessage());
        }
    }

    public FileOutputStream createOutFile() {
        try {
            outFile = new FileOutputStream(nameFile);
            return outFile;
        } catch (IOException e) {
            System.out.println(e.getLocalizedMessage());
        }
        return null;
    }

    public String getFirstFileName() {
        return firstFileName;
    }

    public void setFirstFileName(String firstFileName) {
        this.firstFileName = firstFileName;
    }

    public String getSecondFileName() {
        return secondFileName;
    }

    public void setSecondFileName(String secondFileName) {
        this.secondFileName = secondFileName;
    }

    public String getNameFile() {
        return nameFile;
    }

    public void setNameFile(String nameFile) {
        this.nameFile = nameFile;
    }
}
