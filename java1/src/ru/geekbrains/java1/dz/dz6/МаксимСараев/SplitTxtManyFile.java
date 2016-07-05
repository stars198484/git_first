package ru.geekbrains.java1.dz.dz6.МаксимСараев;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by desarz on 26.05.2016.
 */
public class SplitTxtManyFile {

    public SplitTxtManyFile() {
    }

    public static void splitFile(String[] fileNameArrArr, String resultFileName) throws IOException {

        FileOutputStream resultFile = null;
        try {
            resultFile = new FileOutputStream(resultFileName);
        } catch (IOException e) {
            System.out.println("Ошибка записи файлов");
        }

        for (String elementArr:fileNameArrArr) {
            int i;
            FileInputStream fin = null;
            try {
                fin = new FileInputStream(elementArr);

                do {
                    i = fin.read();
                    if (i != -1){
                        resultFile.write(i);
                    }
                } while (i != -1);
                if (fin!=null) {
                    fin.close();
                }

            } catch (IOException e) {
                System.out.println("Ошибка записи файлов");
            }
        }
        if (resultFile!=null) {
            resultFile.close();
        }

    }
}
