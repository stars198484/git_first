package ru.geekbrains.java1.dz.dz7.АлександрРублевский;

import java.util.Random;

public class AiPlayer extends Player {
	private Random rand = new Random();
	
	public AiPlayer() {
		super();
	}

	@Override
	public void turn(ru.geekbrains.java1.dz.dz7.АлександрРублевский.GameField fl) {
		System.out.println("����� ���������");
		int x = rand.nextInt(10);
		int y = rand.nextInt(10);
		fl.strike(x, y);
	}
}