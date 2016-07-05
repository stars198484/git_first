package ru.geekbrains.java1.dz.dz6.СусловАндрей;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by SuslovAV on 26.05.2016.
 */
public class FindWordInFile {
    private String catalogpath = "C:\\Users\\SuslovAV\\Desktop\\Текстовики\\";

    public void FindWordInFile(String SearchWord) {
        File catalog = new File(catalogpath);
        String[] list = catalog.list();
        String word = "";
        for (String Filename : list) {
            try {
                Scanner sc = new Scanner(new File(catalogpath.concat(Filename)));
                while (sc.hasNext()) {
                    word = sc.next();
                    if(word.equals(SearchWord)){System.out.println(Filename); break;}

                }
            } catch (IOException e) {
            }

        }
    }

}
