package ru.geekbrains.java2.level2homework1;

import java.util.Scanner;

/**
 * Created by Olya on 08.06.2016.
 */
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        defineFigure defineFigure;
        Figure figure;
        String gotFigure;
        do {
            System.out.println("Choose the figure you want to move.\nType: Pawn, Rook, Bishop, Knight, Queen or King");
            gotFigure = scanner.nextLine();
            defineFigure = new defineFigure();
            figure = defineFigure.defineMethod(gotFigure);
        } while (figure == null);

        parseCoordinates Coordinates = new parseCoordinates();

        System.out.println("Input cell coordinates From (ex. e2)");
        String from = scanner.nextLine();
        if (from.length() <= 0 || from.length() > 2) {
            System.out.println("Incorrect coordinates");
            return;
        }

        int x1 = Coordinates.parseMethod(from, "x1");
        int y1 = Coordinates.parseMethod(from, "y1");
        if ((x1<0)||(x1>7)||(y1<0)||(y1>7)) {
            System.out.println("Incorrect coordinates");
            return;
        }

        System.out.println("Input cell coordinates To (ex. e4)");

        String to = scanner.nextLine();
        if (to.length()<=0 || to.length()>2) {
            System.out.println("Incorrect coordinates");
            return;
        }

        int x2 = Coordinates.parseMethod(to, "x2");
        int y2 = Coordinates.parseMethod(to, "y2");
        if ((x2<0)||(x2>7)||(y2<0)||(y2>7)) {
            System.out.println("Incorrect coordinates");
            return;
        }


        if (figure.isRightMove(x1, y1, x2, y2)) {
            System.out.println("Correct move for "+figure);
        }
        else System.out.println("Incorrect move for "+figure);




    }

}