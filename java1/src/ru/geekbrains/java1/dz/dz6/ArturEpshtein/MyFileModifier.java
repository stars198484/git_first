package ru.geekbrains.java1.dz.dz6.ArturEpshtein;

import java.io.*;
import java.nio.file.Files;
import java.util.Arrays;

/**
 * Created by artur on 26.05.2016.
 */
public class MyFileModifier {
    static String SerName;

    public MyFileModifier(String serName) {
        SerName = serName;
    }

    public static void copyFile(File source, File dest) throws IOException {
        Files.copy(source.toPath(), dest.toPath());
    }

    private static void exists(String nameFile) {
    }

    public static void delete(String nameFile) throws FileNotFoundException {
        exists(nameFile);
        new File(nameFile).delete();
    }

    public static void gluing(File nameFile1, File nameFile2) {
        try {
            BufferedOutputStream bufOut = new BufferedOutputStream(new FileOutputStream(nameFile1, true)); //TRUE!!!
            BufferedInputStream bufRead = new BufferedInputStream(new FileInputStream(nameFile2));
            int n;
            while ((n = bufRead.read()) != -1) {
                bufOut.write(n);
            }
            bufOut.flush();      // Принудительно выталкиваем данные с буфера
            bufOut.close();     // Закрываем соединения
            bufRead.close();
        } catch (IOException ex) {
            System.out.println("ERRORE!!!");
        }
    }
    // NE POLUCHAETSYA
//    public static void FileMas(){
//
//        MyFileModifier[] fileMas = new MyFileModifier[10];
//        int count = -1;
//        for (int i = 0; i < fileMas.length; i++) {
//
//            while(SerName.hasNext()){
//
//                fileMas[++count] = Float.parseFloat(SerName.nextLine());
//            }
//            int ii;
//            FileInputStream fin;
//            try {
//                fin = new FileInputStream(String.valueOf(fileMas[0]));
//                do {
//                    ii = fin.read();
//                    if (ii != -1) System.out.print((char)SerName);
//                } while (ii != -1);
//                fin.close();
//            } catch (IOException е) {
//                System.out.println("Произошла ошибкa чтения файла");
//            }
//        }
//    }
}
