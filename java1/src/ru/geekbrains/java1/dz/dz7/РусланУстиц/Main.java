package ru.geekbrains.java1.dz.dz7.РусланУстиц;

import java.util.Scanner;

/**
 * Created by darky_000 on 27.05.2016.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int choice;
        String gameStyle;
        Player player1;
        Player player2;

        while (true) {
            System.out.println("Выберите игру:");
            System.out.println();
            System.out.println("\t 1. Player vs AI");
            System.out.println("\t 2. Player vs Player");
            System.out.println("\t 3. AI vs AI\n");

            if (sc.hasNextInt())
                choice = sc.nextInt();
            else choice = 1;

            switch (choice) {
                case 1:
                    player1 = new HumanPlayer("Human");
                    player2 = new AiPlayer();
                    gameStyle = "Player vs AI";
                    break;
                case 2:
                    System.out.println("Введите имя первого игрока:");
                    String playerName1 = sc.next();
                    player1 = new HumanPlayer(playerName1);
                    System.out.println("Введите имя второго игрока:");
                    String playerName2 = sc.next();
                    player2 = new HumanPlayer(playerName2);
                    gameStyle = "Player vs Player";
                    break;
                case 3:
                    player1 = new AiPlayer();
                    player2 = new AiPlayer();
                    gameStyle = "AI vs AI";
                    break;
                default:
                    continue;
            }
            break;
        }
        System.out.println(gameStyle + '\n');

        player1.getField().printField(true);
        while (true) {
            player1.turn(player2.getField());
            player2.getField().printField(true);
            if (player2.getField().isDefeated()) {
                System.out.printf("Победил %s", player1.getPlayerName());
                break;
            }
            player2.turn(player1.getField());
            player1.getField().printField(true);
            if (player1.getField().isDefeated()) {
                System.out.printf("Победил %s", player2.getPlayerName());
                break;
            }
        }
    }
}
