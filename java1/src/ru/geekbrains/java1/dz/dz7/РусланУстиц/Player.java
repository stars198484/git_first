package ru.geekbrains.java1.dz.dz7.РусланУстиц;

import java.util.ArrayList;

/**
 * Created by darky_000 on 27.05.2016.
 */
public abstract class Player {
    private GameField gameField;

    public GameField getField() {
        return gameField;
    }

    private String playerName = "Unknown";

    public void setPlayerName(String name) {
        playerName = name;
    }

    public String getPlayerName() {
        return playerName;
    }

    public Player() {
        gameField = new GameField();
        ArrayList<Ship> ships = gameField.getShips();
        for (Ship ship : ships) {
            ship.setMaster(this);
        }
    }

    public Player(String playerName) {
        this();
        setPlayerName(playerName);
    }

    public abstract void turn(GameField gameField);
}
