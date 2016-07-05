package ru.geekbrains.java1.dz.dz6.АндрейКащеев;

import java.io.*; //как настроить чтобы имортились конкретные классы?

/**
 * Created by kay on 25.05.2016.
 */
public class FReader {
    public void print_bytes(File file) {
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file))){
            int bv;
            while ((bv = bis.read()) > -1) {
                System.out.print(bv + " ");
            }
            System.out.println("");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void print_bytes(String file){
        print_bytes(new File(file));
    }
    public void print_chars(File file) {
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file))) {
            int bv;
            while ((bv = bis.read()) > -1) {
                System.out.print((char)bv);
            }
            System.out.println("");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void print_chars(String file){
        print_chars(new File(file));

    }
    public void println(File file,String charset){
        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file),charset))){
            String line;
            while((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public void println(String file, String charset){
        println(new File(file),charset);
    }

}
