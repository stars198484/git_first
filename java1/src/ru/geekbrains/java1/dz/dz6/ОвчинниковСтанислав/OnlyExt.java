package ru.geekbrains.java1.dz.dz6.ОвчинниковСтанислав;

import java.io.File;
import java.io.FilenameFilter;

/**
 * Created by Stars on 26.05.2016.
 */
public class OnlyExt implements FilenameFilter {
String ext;
    public OnlyExt(String ext){
        this.ext = "."+ ext;
    }
    public boolean accept(File dir, String name){
        return name.endsWith (ext);
    }
}
