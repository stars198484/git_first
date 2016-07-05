package ru.geekbrains.java1.dz.dz7.УльянаЧерникова;
import java.util.Scanner;

/**
 * Created by Uliana on 27.05.2016.
 */
public class HumanPlayer extends Player {
    private Scanner sc=new Scanner(System.in);
    public HumanPlayer(){
        super();
    }

    @Override
    public void turn(Game f1) {
        System.out.println("Input coordinates in the format x and y");
        int x=sc.nextInt()-1;
        int y=sc.nextInt()-1;
        //   f1.strike(x,y);
        while (f1.strike(x, y)==true) {
            System.out.println("You have another turn" + "\n" + "Input coordinates in the format x and y");
            x=sc.nextInt()-1;
            y=sc.nextInt()-1;

        }
    }
}