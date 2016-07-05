package ru.geekbrains.java1.dz.dz7.ВадимПрилепишев;

import java.util.Scanner;

/**
 * Created by Prilepishev Vadim on 28.05.2016.
 */
public class Menu {
    Scanner sc = new Scanner(System.in);

    public String gameType(){
         int gameType;

         System.out.println("Выберите тип игры");
         System.out.println("Человек против компьютера. Нажмите 1");
         System.out.println("Человек против человек. Нажмите 2");
         System.out.println("Компьютер против компьютера. Нажмите 3");
         gameType = sc.nextInt();

         switch(gameType) {
             case 1:
                 return "playerVsCompMode";
             case 2:
                 return "playerVsPlayerMode";
             case 3:
                 return "compVsCompMode";
         }
        return "error";
    }


}
