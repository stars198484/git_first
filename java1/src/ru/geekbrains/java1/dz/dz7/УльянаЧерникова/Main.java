package ru.geekbrains.java1.dz.dz7.УльянаЧерникова;

/**
 * Created by Uliana on 26.05.2016.
 */
public class Main {

    public static void main(String[] args) {
        Menu m = new Menu();
        int mx=m.menu();
        if (mx == 1) {
            Player p1 = new HumanPlayer();
            Player p2 = new AIPlayer();

            p1.getField().printField(true);
            while (true) {
                p1.turn(p2.getField());
                p2.getField().printField(true);
                if (p2.getField().isDefeated()) break;
                p2.turn(p1.getField());
                p1.getField().printField(true);
                if (p1.getField().isDefeated()) break;
            }
        } else if (mx== 2) {
            Player p1 = new HumanPlayer();
            Player p11 = new HumanPlayer();
            p1.getField().printField(true);
            while (true) {
                p1.turn(p11.getField());
                p11.getField().printField(true);
                if (p11.getField().isDefeated()) break;
                p11.turn(p1.getField());
                p1.getField().printField(true);
                if (p1.getField().isDefeated()) break;
            }
        } else if (mx == 3) {
            Player p22 = new AIPlayer();
            Player p2 = new AIPlayer();
            p22.getField().printField(true);
            while (true) {
                p22.turn(p2.getField());
                p2.getField().printField(true);
                if (p2.getField().isDefeated()) break;
                p2.turn(p22.getField());
                p22.getField().printField(true);
                if (p22.getField().isDefeated()) break;
            }


        } else {
            System.out.println(" End of the Game");
        }
    }
}
