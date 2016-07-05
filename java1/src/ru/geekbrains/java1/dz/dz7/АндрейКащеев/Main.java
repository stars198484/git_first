package ru.geekbrains.java1.dz.dz7.АндрейКащеев;

import java.util.Scanner;

/**
 * Created by Home-pc on 26.05.2016.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Выберите режим иргы:");
        System.out.println("1. Человек - Компьютер");
        System.out.println("2. Человек - Человек");
        System.out.println("3. Компьютер - Компьютер");

        Player p1;
        Player p2;
        switch (sc.nextInt()) {
            case 1:
                p1 = new HumanPlayer();
                p2 = new AiPlayer();
                break;
            case 2:
                p1 = new HumanPlayer();
                p2 = new HumanPlayer();
                break;
            case 3:
                p1 = new AiPlayer();
                p2 = new AiPlayer();
                break;
            default:
                p1 = new HumanPlayer();
                p2 = new AiPlayer();
        }


        p1.getGameField().printField(true);
        while (true) {
            while (p1.turn(p2.getGameField())) {
                p2.getGameField().printField(true);
                if (p2.getGameField().isDefeated()) break;
            }
            p2.getGameField().printField(true);

            if (p2.getGameField().isDefeated()) break;

            while (p2.turn(p1.getGameField())) {
                p1.getGameField().printField(true);
                if (p1.getGameField().isDefeated()) break;
            }
            p1.getGameField().printField(true);

            if (p1.getGameField().isDefeated()) break;
        }
    }
}
