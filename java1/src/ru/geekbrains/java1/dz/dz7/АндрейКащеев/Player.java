package ru.geekbrains.java1.dz.dz7.АндрейКащеев;

/**
 * Created by Home-pc on 26.05.2016.
 */
public abstract class Player {
    private GameField gameField;

    public Player() {
        gameField = new GameField();
    }

    public GameField getGameField() {
        return gameField;
    }

    public abstract boolean turn(GameField gameField);
}
