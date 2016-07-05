package ru.geekbrains.java2.dz.dz2.РусланУстиц;

import ru.geekbrains.java2.dz.dz2.РусланУстиц.exceptions.InvalidCoordinateException;
import ru.geekbrains.java2.dz.dz2.РусланУстиц.exceptions.InvalidFigureException;
import ru.geekbrains.java2.dz.dz2.РусланУстиц.exceptions.InvalidLineException;
import ru.geekbrains.java2.dz.dz2.РусланУстиц.figures.Figure;
import ru.geekbrains.java2.dz.dz2.РусланУстиц.helpers.CoordinatesParser;

import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * Created by darky_000 on 07.06.2016.
 */
public class ChessGame {

    public static void main(String[] args) {
        final ChessField chessField = new ChessField();
        chessField.initField();
        chessField.printField();
        initGameProcess();
    }

    private static void initGameProcess() {
       try(Scanner sc = new Scanner(System.in)) {

           while (true) {
               System.out.println("Print from and to coordinates:");

               try {
                   String line = sc.nextLine();
                   if (line.equals("quit")) break;

                   final String sFrom = CoordinatesParser.parseFromCoordinate(line);
                   final String sTo = CoordinatesParser.parseToCoordinate(line);

                   if (!ChessField.isOccupied(sFrom)) {
                       System.out.println("Warning: Cell is empty");
                       continue;
                   }

                   final Figure figure = Figure.getFigure(sFrom);

                   if (figure.isRightMove(sFrom, sTo))
                       System.out.printf("Figure: %s; Coordinates: %s; Correct way: TRUE\n", figure.getName(), sTo);
                   else System.out.printf("Figure: %s; Coordinates: %s; Correct way: FALSE\n", figure.getName(), sTo);

               } catch (NoSuchElementException | IllegalStateException e) {
                   System.out.println("ChessGame Error: Scanner exception: " + e.getMessage());
                   System.out.println("Terminating...");
                   System.exit(1);
               } catch (InvalidLineException e) {
                   System.out.println("ChessGame Error: Wrong line");
               } catch (InvalidCoordinateException e) {
                   System.out.println("ChessGame Error: Wrong coordinates");
               } catch (InvalidFigureException e) {
                   System.out.println("ChessGame Error: Can`t find figure with such coordinates");
               }
           }
       }
    }
}
