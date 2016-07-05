package ru.geekbrains.java2.dz.dz1.ГерманВавилин;

import java.util.Scanner;

/**
 * Created by gta5 on 08.06.2016.
 */

//Класс координат для фигур

public class ChessCoordinate {
    int x = 0;
    int y = 0;
    private Scanner scanner = new Scanner(System.in);

    public ChessCoordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }

    ChessCoordinate(String type) {
        do {
            System.out.println("Введите координату в пределах поля: " + type);
            coordinateBuilder(scanner.nextLine());
        }while (!isCoordinateValid());
    }

    private void coordinateBuilder(String coordinate) {
        char xChar = coordinate.toUpperCase().charAt(0);
        char yChar = coordinate.toUpperCase().charAt(1);
        switch (xChar) {
            case 'A' : x = 1; break;
            case 'B' : x = 2; break;
            case 'C' : x = 3; break;
            case 'D' : x = 4; break;
            case 'E' : x = 5; break;
            case 'F' : x = 6; break;
            case 'G' : x = 7; break;
            case 'H' : x = 8; break;
        }
        switch (yChar) {
            case '1' : y = 1; break;
            case '2' : y = 2; break;
            case '3' : y = 3; break;
            case '4' : y = 4; break;
            case '5' : y = 5; break;
            case '6' : y = 6; break;
            case '7' : y = 7; break;
            case '8' : y = 8; break;
        }
    }

    private boolean isCoordinateValid() {
        if((x > 0)&(x < 9)&(y > 0)&(y < 9)) return true;
        else return false;
    }
}
