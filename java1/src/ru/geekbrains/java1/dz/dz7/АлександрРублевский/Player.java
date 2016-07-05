package ru.geekbrains.java1.dz.dz7.АлександрРублевский;

public abstract class Player {
	private GameField gameField;

	public GameField getField() { return gameField; };

	public Player() {
		gameField = new GameField();
	}

	public abstract void turn(GameField fl);
}