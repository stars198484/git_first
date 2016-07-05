package ru.geekbrains.java1.dz.dz7.МаксимСараев;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Array;
import java.util.Random;

/**
 * Created by desarz on 28.05.2016.
 */
public class SwingGameField {

    private JFrame window; // окно игры
    private JToggleButton[][] arrButtonPlayer; // массив кнопок
    private JToggleButton[][] arrButtonAi; // массив кнопок
    private char[][] playerFl; // массив игрока
    private char[][] aiFl; // массив компьютера
    private final char WATER = '~'; // Вода
    private final char SHIP  = 'O'; // Корабль
    private final char MISS  = '*'; // Промах
    private final char HIT   = 'X'; // Подбитый корабль
    private int scorePlayer1;
    private int scorePlayer2;
    private JTextField scoreFiledPlayer1;
    private JTextField scoreFiledPlayer2;
    private JTextArea actionTextGame;

    private Random rand = new Random();

    public SwingGameField() {

        this.scorePlayer1 = 20;
        this.scorePlayer2 = 20;

        //Создадим форму
        JFrame window = new JFrame("SEA BATLE");
        window.setSize(1200, 700);
        //Событие "закрыть" при нажатии по крестику окна
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

       // Создаим панель
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setSize(500, 500);
        panel.setLocation(50, 50);

        JLabel lPlayer1 = new JLabel("Player 1");
        lPlayer1.setBounds(50, 10, 100 , 25);
        panel.add(lPlayer1);

        scoreFiledPlayer1 = new JTextField();
        scoreFiledPlayer1.setText("");
        scoreFiledPlayer1.setBounds(350, 10, 200, 25);
        scoreFiledPlayer1.setHorizontalAlignment(SwingConstants.RIGHT);
        scoreFiledPlayer1.setEditable(false);
        panel.add(scoreFiledPlayer1);

        JLabel lPlayer2 = new JLabel("Player 2");
        lPlayer2.setBounds(650, 10, 100 , 25);
        panel.add(lPlayer2);

        scoreFiledPlayer2 = new JTextField();
        scoreFiledPlayer2.setText("...");
        scoreFiledPlayer2.setBounds(950, 10, 200, 25);
        scoreFiledPlayer2.setHorizontalAlignment(SwingConstants.RIGHT);
        scoreFiledPlayer2.setEditable(false);
        panel.add(scoreFiledPlayer2);

        actionTextGame = new JTextArea();
        actionTextGame.setText("");
        actionTextGame.setBounds(500, 50, 200, 50);
        actionTextGame.setEditable(false);
        actionTextGame.setLineWrap(true);
        panel.add(actionTextGame);


        // созадим массив кнопок
        arrButtonPlayer = new JToggleButton[10][10];
        arrButtonAi = new JToggleButton[10][10];

        // заполним массив кнопок игрока
        for (int y = 0; y < 10; y++) {
            for (int x = 0; x < 10; x++) {
                JToggleButton button = new JToggleButton("");
                button.setBounds((x*50)+50, (y*50)+150, 50 ,50);
                button.setEnabled(false);
                panel.add(button);
                arrButtonPlayer[x][y] = button;
            }
        }
        // заполним массив кнопок компьютера
        for (int y = 0; y < 10; y++) {
            for (int x = 0; x < 10; x++) {
                JToggleButton button = new JToggleButton("");
                button.setBounds((x*50)+650, (y*50)+150, 50 ,50);
                panel.add(button);
                arrButtonAi[x][y] = button;
                button.addActionListener(new ActionListener()
                {
                    public void actionPerformed(ActionEvent e)
                    {
                        pushButton(button);
                    }
                });

            }
        }
        // добавим панель на форму
        window.add(panel);

        //Разместим программу по центру
        window.setLocationRelativeTo(null);
        window.setVisible(true);

        // создадим массив игры
        playerFl = new char[10][10];
        for (int y = 0; y < 10; y++) {
            for (int x = 0; x < 10; x++) {
                playerFl[x][y] = WATER;
            }
        }
        aiFl = new char[10][10];
        for (int y = 0; y < 10; y++) {
            for (int x = 0; x < 10; x++) {
                aiFl[x][y] = WATER;
            }
        }

        setAllShips(playerFl);
        setAllShips(aiFl);

        refreshField(arrButtonPlayer, playerFl, true);
        refreshField(arrButtonAi, aiFl, false);
        refreshScore();

    }

    public void pushButton(JToggleButton buttonPush){
        for (int y=0; y<10; y++){
            for (int x=0; x<10; x++){
                JToggleButton currentButton = arrButtonAi[x][y];
                if (currentButton.equals(buttonPush)) {
                    actionTextGame.append("Ходит игрок"+"\n");
                    strike(x, y, aiFl, false);
                    refreshField(arrButtonAi, aiFl, false);
                    buttonPush.setEnabled(false);
                    buttonPush.setBackground(Color.BLACK);
                    turnAi();
                    return;
                }
            }
        }
    }

    public void setAllShips(char[][] fl) {
        int[] shipLens = {4, 3, 3, 2, 2, 2, 1, 1, 1, 1};
        char dir;
        for (int i = 0; i < shipLens.length; i++) {
            if (rand.nextInt(2) == 0) dir = 'H';
            else dir = 'V';
            while (!setShip(rand.nextInt(10), rand.nextInt(10), shipLens[i], dir, fl)) ;
        }
    }

    public boolean setShip(int cx, int cy, int l, char dir, char[][] fl) {
        int vx = 0;
        int vy = 0;
        // установочная диагональ = 1
        if (dir == 'V') vy = 1;
        if (dir == 'H') vx = 1;
        // входные параметры, нос корабля
        // проверяем координаты увеличенные на длину корабля по нужной диагонали - корма корабля,
        // и если не выходим за поле, то идем дальше
        if (cx + vx * l > 9) return false;
        if (cy + vy * l > 9) return false;
        // запускаем цикл, счетчик длина корабля
        for (int i = 0; i < l; i++) {
            // цикл перебирает установочные координаты корабля
            // от носа до кормы и проверяет каждую
            if (!checkAround(cx + vx * i, cy + vy * i, fl)) return false;
        }

        //  координаты проверены, запускаем цикл установки корабля на поле
        for (int i = 0; i < l; i++) {
            fl[cy + vy * i][cx + vx * i] = SHIP;
        }
        return true;
    }

    public boolean checkAround(int cx, int cy, char[][] fl) {
        // проверяем вокруг переданной координаты точки,
        // везде должно быть "море" или -1 = край поля.
        for (int x = cy - 1; x <= cy + 1; x++) {
            for (int y = cx - 1; y <= cx + 1; y++) {
                if (x > -1 && y > -1 && x < 10 && y < 10)
                    if (fl[x][y] != WATER) return false;
            }
        }
        return true;
    }

    public void refreshField(JToggleButton[][] arrButton, char[][] arrfl, boolean visible){
        for (int y=0; y<10; y++) {
            for (int x=0; x<10; x++){
                JToggleButton currentButton = arrButton[x][y];
                char currentIcon = arrfl[x][y];
                if (visible == false && currentIcon == SHIP)  {
                    currentButton.setText(Character.toString(WATER));
                } else currentButton.setText(Character.toString(arrfl[x][y]));
            }
        }
    }

    public void turnAi() {
        actionTextGame.append("Ходит компьютер"+"\n");
        int x = rand.nextInt(10);
        int y = rand.nextInt(10);
        strike(x, y, playerFl,true);
        refreshField(arrButtonPlayer, playerFl, true);
        refreshScore();
    }

    public void strike(int cx, int cy, char[][] fl, boolean isAiTurn) {

        int scoreCurrentPlayer = 0;

        if (fl[cx][cy] == WATER) {
            fl[cx][cy] = MISS;
            actionTextGame.append("Промах"+"\n");
        }
        if (fl[cx][cy] == SHIP) {
            fl[cx][cy] = HIT;
            actionTextGame.append("Попадание"+"\n");
            scoreCurrentPlayer = 1;
        }
        if (isAiTurn==false) {
            scorePlayer2 = scorePlayer2 - scoreCurrentPlayer;
        } else {
            scorePlayer1 = scorePlayer1 - scoreCurrentPlayer;
        }


        refreshScore();
    }

    private void refreshScore() {
        this.scoreFiledPlayer1.setText(Integer.toString(this.scorePlayer1));
        this.scoreFiledPlayer2.setText(Integer.toString(this.scorePlayer2));

        if (scorePlayer1 > 0 && scorePlayer2 == 0) endGame(true, false);
        if (scorePlayer1 == 0 && scorePlayer2 > 0) endGame(false, true);
        if (scorePlayer1 == 0 && scorePlayer2 == 0) endGame(false, false);
    }

    private void endGame(boolean playerWin, boolean aiWin) {
        new SwingGameField();
    }
}
