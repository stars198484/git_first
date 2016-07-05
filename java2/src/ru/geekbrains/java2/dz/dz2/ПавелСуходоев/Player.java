package ru.geekbrains.java2.dz.dz2.ПавелСуходоев;

import ru.geekbrains.java2.dz.dz2.ПавелСуходоев.Exceptions.WrongCoordinateException;
import ru.geekbrains.java2.dz.dz2.ПавелСуходоев.Exceptions.WrongFigureException;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by xcyxoux on 09.06.16.
 */
public class Player {

    private String input;
    Coordinate temp;

    public Coordinate getCoordinate() throws WrongCoordinateException {

        Scanner scanner = new Scanner(System.in);
        temp = new Coordinate();
        input = scanner.nextLine();
        if (input.length() == 2) {
            char x = input.charAt(0);
            char y = input.charAt(1);
            if (x >= 97 && x <= 104) {
                temp.setX((int) x - 96);
            } else {
                throw new WrongCoordinateException();
            }
            if (y >= 49 && y <= 56) {
                temp.setY((int) y - 48);
            } else {
                throw new WrongCoordinateException();
            }
        }
        else {
            throw new WrongCoordinateException();
        }
        return temp;
    }

    public int selectFigure() throws WrongFigureException, InputMismatchException {
        int choice;
            Scanner scanner = new Scanner(System.in);
            choice = scanner.nextInt();
            if (choice < 0 | choice > 5) {
                throw new WrongFigureException();
            }
        return choice;
    }
}
