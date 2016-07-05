package ru.geekbrains.java2.dz.dz2.ПавелСуходоев;

import ru.geekbrains.java2.dz.dz2.ПавелСуходоев.Exceptions.WrongCoordinateException;
import ru.geekbrains.java2.dz.dz2.ПавелСуходоев.Exceptions.WrongFigureException;
import ru.geekbrains.java2.dz.dz2.ПавелСуходоев.Exceptions.WrongMoveException;

import java.util.InputMismatchException;

/**
 * Created by xcyxoux on 09.06.16.
 */
public class Main {
    public static void main(String[] args) {
        Player player = new Player();
        Figure figure;

        System.out.println("0 - Слон, 1 - Ладья, 2 - Ферзь, 3 - Король, 4 - Конь, 5 - Пешка ");
        int figureId = -1;

        do {
            try {
                System.out.println("Выберите фигуру: ");
                figureId = player.selectFigure();
            } catch (WrongFigureException e) {
                System.out.println(e);
            } catch (InputMismatchException e) {
                System.out.println("Ошибка при вводе данных");
            }
        } while (figureId < 0 | figureId > 5);

        switch (figureId) {
            case 0:
                figure = new Bishop();
                break;
            case 1:
                figure = new Rook();
                break;
            case 2:
                figure = new Queen();
                break;
            case 3:
                figure = new King();
                break;
            case 4:
                figure = new Knight();
                break;
            case 5:
                figure = new Pawn();
                break;
            default:
                figure = new Pawn();
                break;
        }

        Turn turn = new Turn();
        do {
            System.out.println("Введите начальную координату: ");
            try {
                turn.from = player.getCoordinate();
            } catch (WrongCoordinateException e) {
                System.out.println(e.toString());
            }
        } while (turn.from.getX() == 0 | turn.from.getY() == 0);

        do {
            System.out.println("Введите конечную координату: ");
            try {
                turn.to = player.getCoordinate();
            } catch (WrongCoordinateException e) {
                System.out.println(e.toString());
            }
        } while (turn.to.getX() == 0 | turn.to.getY() == 0);

        try {
            if (figure.isRightMove(turn)) {
                System.out.println(figure.getName() + " может так ходить");
            } else {
                throw new WrongMoveException();
            }
        } catch (WrongMoveException e) {
            System.out.println(e.toString(figure.getName()));
        }

    }
}
