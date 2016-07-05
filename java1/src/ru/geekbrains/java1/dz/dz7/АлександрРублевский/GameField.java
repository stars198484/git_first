package ru.geekbrains.java1.dz.dz7.АлександрРублевский;

import java.util.Random;

public class GameField {
	private char[][] f1;
	private final char WATER = '~';
	private final char SHIP = 'O';
	private final char HIT = 'X';
	private final char MISS = '*';
    private Random rand = new Random();
    
	public GameField() {
		f1 = new char[10][10];
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				f1[i][j] = WATER;
			}
		}
		setAllShips();
	}

	private void setAllShips() {
		int[] shipLens = { 4, 3, 3, 2, 2, 2, 1, 1, 1, 1 };
		char dir;
		for (int i = 0; i < shipLens.length; i++) {
			if (rand.nextInt(2) == 0)dir = 'H';
			else
				dir = 'V';
			while (!setShip(rand.nextInt(10), rand.nextInt(10), shipLens[i],dir));
		}

	}

	public boolean setShip(int cx, int cy, int len, char dir) {
		int vx = 0;
		int vy = 0;
		if (dir == 'V')vy = 1;
		if (dir == 'H')vx = 1;
		if (cx + vx * len > 9)return false;
		if (cy + vy * len > 9)return false;
		for (int i = 0; i < len; i++) {
			if (!checkAround(cx + vx * i, cy + vy * i))return false;
		}
		for (int i = 0; i < len; i++) {
			f1[cy + vy * i][cx + vx * i] = SHIP;
		}
		return true;
	}

	public boolean checkAround(int cx, int cy) {
		for (int i = cy - 1; i <= cy + 1; i++) {
			for (int j = cx - 1; j <= cx + 1; j++) {
				if (i > -1 && j > -1 && i < 10 && j < 10)
					if (f1[i][j] != WATER)
						return false;
			}
		}
		return true;
	}

	public void printField(boolean visible) {
		for (int i = 0; i < 11; i++) {
			System.out.printf("%2d ", i);
		}
		System.out.println();
		for (int i = 0; i < 10; i++) {
			System.out.printf("%2d ", (i + 1));
			for (int j = 0; j < 10; j++) {
				if (visible) {
					System.out.printf("%2c ", f1[i][j]);
				} else {
					if (f1[i][j] == SHIP)
						System.out.printf("%2c ", '~');
					else
						System.out.printf("%2c ", f1[i][j]);
				}
			}
			System.out.print('\n');
		}
		System.out.print('\n');
	}

	public void strike(int cx, int cy) {
		if (f1[cy][cx] == WATER) {
			f1[cy][cx] = MISS;

			System.out.println("������");
		}
		
		if (f1[cy][cx] == HIT) {
			System.out.println("��� ������");
		}
		if (f1[cy][cx] == SHIP) {
			f1[cy][cx] = HIT;
			if(f1[cy][cx] == HIT) {
			System.out.println("���������");
			}
		}
	}
	
	
	public boolean isDefeated() {
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				if (f1[i][j] == SHIP)
					return false;
			}
		}
		return true;
	}

}
