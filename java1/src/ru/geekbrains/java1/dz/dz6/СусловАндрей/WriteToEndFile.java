package ru.geekbrains.java1.dz.dz6.СусловАндрей;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by SuslovAV on 26.05.2016.
 */
public class WriteToEndFile {
    private String Filepath1  = "C:\\Users\\SuslovAV\\Desktop\\Текстовики\\Текстовик 1.txt";
    private String Filepath2  = "C:\\Users\\SuslovAV\\Desktop\\Текстовики\\Текстовик 2.txt";

    public void concatFiles(){
        FileInputStream fin = null;
        FileOutputStream fout = null;
        int i ;
        try {
            fin = new FileInputStream(Filepath1);
            fout = new FileOutputStream(Filepath2,true);

            while(fin.read()!= -1 ){
                i = fin.read();
                fout.write(i);
            }
        }
        catch (IOException e){
            System.out.println("Произошла ошибка при работе с файлами") ;
        }
        try{
            if (fin != null) fin.close();
            if (fout != null) fout.close();}
        catch (IOException e) {};}
    private void createfile(String filepath, char ch){

        FileOutputStream fout = null;
        int i ;
        try {

            fout = new FileOutputStream(filepath);


            for (int j = 0; j < 110 ; j++) {
                fout.write((int)ch );
            }


        }
        catch (IOException e){
            System.out.println("Произошла ошибка при работе с файлами") ;
        }
        try{

            if (fout != null) fout.close();}
        catch (IOException e) {};



    };
    public void createfiles() {

    createfile(Filepath1,'a');
    createfile(Filepath2,'b');
    }
}

