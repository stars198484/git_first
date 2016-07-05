package ru.geekbrains.java1.dz.dz7.АлександрРублевский;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Choose with who you want to play: 1 - Human vs AI, 2 - Human vs Human, 3 - AI vs AI.");
		String option = sc.next();

		switch (option) {
		case "1":
			System.out.println("You chose option Human vs AI.");
			ru.geekbrains.java1.dz.dz7.АлександрРублевский.Player p1 = new HumanPlayer();
			ru.geekbrains.java1.dz.dz7.АлександрРублевский.Player p2 = new ru.geekbrains.java1.dz.dz7.АлександрРублевский.AiPlayer();
			p1.getField().printField(true);
			while (true) {
				p1.turn(p2.getField());
				p2.getField().printField(true);
				if (p2.getField().isDefeated())
					break;
				p2.turn(p1.getField());
				p1.getField().printField(true);
				if (p1.getField().isDefeated())
					break;
			}
		case "2":
			System.out.println("You chose option Human vs Human.");
			ru.geekbrains.java1.dz.dz7.АлександрРублевский.Player p3 = new HumanPlayer1();
			ru.geekbrains.java1.dz.dz7.АлександрРублевский.Player p4 = new HumanPlayer();
			p3.getField().printField(true);
			while (true) {
				p3.turn(p4.getField());
				p4.getField().printField(true);
				if (p4.getField().isDefeated())
					break;
				p4.turn(p3.getField());
				p3.getField().printField(true);
				if (p3.getField().isDefeated())
					break;
			}
		case "3":
			System.out.println("You chose option AI vs AI.");
			ru.geekbrains.java1.dz.dz7.АлександрРублевский.Player p5 = new ru.geekbrains.java1.dz.dz7.АлександрРублевский.AiPlayer();
			ru.geekbrains.java1.dz.dz7.АлександрРублевский.Player p6 = new ru.geekbrains.java1.dz.dz7.АлександрРублевский.AiPlayer();
			p5.getField().printField(true);
			while (true) {
				p5.turn(p6.getField());
				p6.getField().printField(true);
				if (p6.getField().isDefeated())
					break;
				p6.turn(p5.getField());
				p5.getField().printField(true);
				if (p5.getField().isDefeated())
					break;
			}
			sc.close();
		}
	}
}
