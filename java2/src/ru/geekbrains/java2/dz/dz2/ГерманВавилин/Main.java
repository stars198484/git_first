package ru.geekbrains.java2.dz.dz2.ГерманВавилин;

import java.util.Scanner;

/**
 * Created by gta5 on 08.06.2016.
 */
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        FactoryChess factoryChess = new FactoryChess();
        String chessFigureType;
        ChessFigure figure;
        boolean isWhite;
        ChessCoordinate coordinateFrom;
        ChessCoordinate coordinateTo;
        //Выбираем цвет: если не b/B или w/W - исключение и выход.
        try {
            isWhite = factoryChess.isChessWhite(scanner);
        } catch (FigureTypeException e) {
            System.out.println(e.getMessage());
            return;
        }
        //Указываем фигуру на поле, если не совпадет ни с чем, будет исключние и выход.
        System.out.println("Введите название фигуры.\nK - король, Q - ферзь, R - ладья,\nN - конь, B - слон, p - пешка: ");
        chessFigureType = scanner.nextLine();
        //Запускаем фабрику по генерации шахмат
        try {
            figure = factoryChess.chessGenerator(chessFigureType, isWhite);
        } catch (FigureTypeException e) {
            System.out.println(e.getMessage());
            return;
        }
        //Задаем кооринаты ОТ и ДО и анализ
        try {
            coordinateFrom = new ChessCoordinate("откуда");
            try {
                coordinateTo = new ChessCoordinate("куда");
                if (figure.isRightMove(coordinateFrom, coordinateTo)) System.out.println(figure.getName() + " сможет дойти за 1 ход");
                else System.out.println(figure.getName() + " не может дойти за 1 ход");
            }catch (NumberFormatException|CoordinateException e) {
                throw new Exception(e);
            }
        } catch (CoordinateException e) {
            System.out.println(e.getMessage());
        }
        catch (NumberFormatException e) {
            System.out.println("Неверный формат.");
        }
    }
}
