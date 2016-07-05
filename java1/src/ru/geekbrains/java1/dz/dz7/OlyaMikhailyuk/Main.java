package ru.geekbrains.java1.dz.dz7.OlyaMikhailyuk;



import java.util.Scanner;

/**
 * Created by Home-pc on 26.05.2016.
 */
public class Main {
    public static void main(String[] args) {

        //System.out.println("Choose game mode: \n Input \"1\" for Human vs CPU \n Input \"2\" for Human vs Human \n Input \"3\" for CPU vs CPU");
        Scanner scanner = new Scanner(System.in);
        Player p1 = new HumanPlayer();
        Player p2 = new AiPlayer();

        byte players = scanner.nextByte();
        switch (players) {
            case 1:
                break;
            case 2:
                p2 = p1;
                break;
            case 3:
                p1 = p2;
                break;
            default:
                System.out.println("Wrong option! Exiting.");
                return;
        }


        p1.getGameField().printField(true);
        while (true) {
            p1.turn(p2.getGameField());
            p2.getGameField().printField(true);
            if (p2.getGameField().isDefeated()) break;
            p2.turn(p1.getGameField());
            p1.getGameField().printField(true);
            if (p1.getGameField().isDefeated()) break;
        }
    }
}
