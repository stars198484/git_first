package ru.geekbrains.java2.dz.dz1.ПавелСуходоев;

import java.util.Scanner;

/**
 * Created by xcyxoux on 09.06.16.
 */
public class Player {

    private String input;
    Coordinate temp;

    public Coordinate getCoordinate() {
        Scanner scanner = new Scanner(System.in);
        temp = new Coordinate();
        input = scanner.nextLine();
        parseInput(input);
        return temp;
    }

    private void parseInput(String input) {
        if (input.length() == 2) {
            char x = input.charAt(0);
            char y = input.charAt(1);
            if (x >= 97 && x <= 104) {
                temp.x = (int) x - 96;
            }
            if (y >= 49 && y <= 56) {
                temp.y = (int) y - 48;
            }
        }
    }

    public int selectFigure() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();

    }
}
