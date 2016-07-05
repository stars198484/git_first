package ru.geekbrains.java1.dz.dz7.ЮрийНиконоров;

/**
 * Created by YurokVRS on 28.05.2016.
 */
public abstract class Player {
    private GameField gameField;

    public GameField getGameField() {
        return gameField;
    }

    public Player() {
        gameField = new GameField();
    }

    public abstract boolean turn(GameField gameField, String namePl);
}
