package ru.geekbrains.java1.dz.dz7.LeonovaLydia;

import java.util.Scanner;

/**
 * Created by LiLeo on 28.05.2016.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Выберите игроков: 1 - человек-ИИ, 2 - человек-человек, 3 - ИИ-ИИ, или введите любой другой символ для выхода)");
        Scanner scanner = new Scanner(System.in);
        int players = scanner.nextInt();
        Player player1 = new HumanPlayer();
        player1.setName("Человек");
        Player player2 = new AiPlayer();
        player2.setName("ИИ");

        if (1 != players & 2 != players & 3 != players)
            return;

        switch (players) {
            case 1: {
                player1 = new HumanPlayer();
                player1.setName("Человек");
                player2 = new AiPlayer();
                player2.setName("ИИ");
                break;
            }
            case 2: {
                player1 = new HumanPlayer();
                player1.setName("Человек1");
                player2 = new HumanPlayer();
                player2.setName("Человек2");
                break;
            }
            case 3: {
                player1 = new AiPlayer();
                player1.setName("ИИ1");
                player2 = new AiPlayer();
                player2.setName("ИИ2");
                break;
            }
        }
        if (!(player1 instanceof AiPlayer))
            player1.getField().printField(true, player1.getName());

        while (true) {

            player1.turn(player2.getField(), player1.getName(), player2);
            boolean gfVisible = !(player2 instanceof AiPlayer);
            player2.getField().printField(gfVisible, player2.getName());
            if (player2.getField().isDefeated()) {
                System.out.println("Игра завершена, победил " + player1.getName());
                break;
            }

            player2.turn(player1.getField(), player2.getName(), player1);
            gfVisible = !(player1 instanceof AiPlayer);
            player1.getField().printField(gfVisible, player1.getName());
            if (player1.getField().isDefeated()) {
                System.out.println("Игра завершена, победил " + player2.getName());
                break;
            }
        }
    }
}
