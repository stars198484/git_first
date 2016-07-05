package ru.geekbrains.java1.dz.dz7.ВадимПрилепишев;

/**
 * Created by Prilepishev Vadim on 28.05.2016.
 */
public class Main {
    public static void main(String[] args) {

        Menu menu = new Menu();
        String gameType;
        String player1FieldText = GameTextConstant.PLAYER1FIELD;
        String player2FieldText = GameTextConstant.COMP2FIELD;
        String player1WinText = GameTextConstant.PLAYER1HUMANWIN;
        String player2WinText = GameTextConstant.PLAYER2COMPWIN;
        Player p1 = new HumanPlayer();
        Player p2 = new AiPlayer();
        boolean p2VisibleStatus = false;

      while(true) {
          gameType = menu.gameType();
          if (gameType == "playerVsCompMode") {
              break;
          }

          if (gameType == "playerVsPlayerMode") {
              p1 = new HumanPlayer();
              p2 = new HumanPlayer();
              player1FieldText = GameTextConstant.PLAYER1FIELD;
              player2FieldText = GameTextConstant.PLAYER2FIELD;
              player1WinText = GameTextConstant.PLAYER1HUMANWIN;
              player2WinText = GameTextConstant.PLAYER2HUMANWIN;
              p2VisibleStatus = true;
              break;
          }

          if (gameType == "compVsCompMode") {
              p1 = new AiPlayer();
              p2 = new AiPlayer();
              player1FieldText = GameTextConstant.COMP1FIELD;
              player2FieldText = GameTextConstant.COMP2FIELD;
              player1WinText = GameTextConstant.PLAYER1COMPWIN;
              player2WinText = GameTextConstant.PLAYER2COMPWIN;
              p2VisibleStatus = true;
              break;
          } else {
              System.out.println(gameType);
          }
      }

        System.out.println(player1FieldText);
        p1.getGameField().printField(true);
        System.out.println(player2FieldText);
        p2.getGameField().printField(p2VisibleStatus);

        while (true) {
            p1.turn(p2.getGameField()); //передаем поле противника игроку для стрельбы

            System.out.println(player2FieldText);
            p2.getGameField().printField(p2VisibleStatus);

            if (p2.getGameField().isDefeated()) {
                System.out.println(player1WinText);
                break;
            }
            p2.turn(p1.getGameField());//выстрел компьютера

            System.out.println(player1FieldText);
            p1.getGameField().printField(true);

            if (p1.getGameField().isDefeated()) {
                System.out.println(player2WinText);
                break;
            }
        }





    }
}
