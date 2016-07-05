package ru.geekbrains.java1.lesson7;



/**
 * Created by Home-pc on 26.05.2016.
 */
public class Main {
    public static void main(String[] args) {
        Player p1 = new HumanPlayer();
        Player p2 = new AiPlayer();
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
