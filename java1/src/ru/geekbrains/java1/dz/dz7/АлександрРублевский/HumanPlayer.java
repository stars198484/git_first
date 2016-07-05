package ru.geekbrains.java1.dz.dz7.АлександрРублевский;

import java.util.Scanner;

public class HumanPlayer extends Player {
	private Scanner sc = new Scanner(System.in);
	public HumanPlayer() {
		super();
	}

	@Override
	public void turn(ru.geekbrains.java1.dz.dz7.АлександрРублевский.GameField fl) {
		System.out.println("������� ���������� �������� � ������� X � Y");
		int x = sc.nextInt() - 1;
		int y = sc.nextInt() - 1;
		fl.strike(x, y);
	}
}
