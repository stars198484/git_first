package ru.geekbrains.java1.dz.dz7.УльянаЧерникова;
import java.util.Scanner;

/**
 * Created by Uliana on 28.05.2016.
 */
public class Menu {
    public int menu(){
        String x;
        Scanner sc1=new Scanner(System.in);
        while (true){
            System.out.println(" Choose the game mode: ");

            System.out.println (" Input 1 for Human vs Computer");
            System.out.println (" Input 2 for Human vs Human");
            System.out.println (" Input 3 for Computer vs Computer");
            System.out.println (" Input 0 to quit the game");
            x=sc1.next();
            try {
                return Integer.parseInt(x);
            } catch (NumberFormatException e){ System.out.println(" Invalid input" + e.getMessage());}
        }





    }

}

