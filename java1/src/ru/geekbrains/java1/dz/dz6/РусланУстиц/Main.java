package ru.geekbrains.java1.dz.dz6.РусланУстиц;



/**
 * Created by darky_000 on 24.05.2016.
 */
public class Main {
    public static void main(String[] args) {
//        FilesManager.generateFile(160, "text1");
//        FilesManager.generateFile(180, "text2");
//        FilesManager.generateFile(180, "text3");
//        FilesManager.generateFile(180, "text4");
//        FilesManager.generateFile(168, "text5");
//        FilesManager.generateFile(180, "text6");
//        FilesManager.generateFile(120, "text7");
//        FilesManager.generateFile(150, "text8");
//        FilesManager.generateFile(180, "text9");
//        FilesManager.generateFile(180, "text10");

        FilesManager.joinFiles("text1", "text2", "output");
        String[] files = new String[10];
        files[0] = "text1";
        files[1] = "text2";
        files[2] = "text3";
        files[3] = "text4";
        files[4] = "text5";
        files[5] = "text6";
        files[6] = "text7";
        files[7] = "text8";
        files[8] = "text9";
        files[9] = "text10";

        FilesManager.printFilesContaining(files, "test");
    }
}
