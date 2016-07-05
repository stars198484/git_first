package ru.geekbrains.java2.dz.dz2.ГерманВавилин;

import java.util.Scanner;

/**
 * Created by gta5 on 08.06.2016.
 */

//Класс координат для фигур

public class ChessCoordinate {
    int x = 0;
    int y = 0;
    Scanner scanner = new Scanner(System.in);
    public ChessCoordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }

    ChessCoordinate(String type) throws CoordinateException {
        System.out.println("Введите координату в пределах поля: " + type);
        try {
            String coordinationString = scanner.nextLine();
            coordinateBuilder(coordinationString);
            coordinateValidation();
        } catch (CoordinateException e) {
            throw e;
        }


    }

    private void coordinateBuilder(String coordinate) throws CoordinateException {
        char xChar = coordinate.toUpperCase().charAt(0);
        try {
            switch (xChar) {
                case 'A' : x = 1; break;
                case 'B' : x = 2; break;
                case 'C' : x = 3; break;
                case 'D' : x = 4; break;
                case 'E' : x = 5; break;
                case 'F' : x = 6; break;
                case 'G' : x = 7; break;
                case 'H' : x = 8; break;
                default: throw new CoordinateException("За пределами доски");
            }
            y = Integer.parseInt(coordinate.charAt(1)+"");
        } catch (NumberFormatException e) {
            throw e;
        }
    }
    public void coordinateValidation() throws CoordinateException {
        if(!((x > 0)&(x < 9)&(y > 0)&(y < 9))){
            throw new CoordinateException("За пределами доски");
        }
    }
}
