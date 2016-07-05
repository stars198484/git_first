package ru.geekbrains.java2.dz.dz1.ГерманВавилин;

import java.util.Scanner;

/**
 * Created by gta5 on 08.06.2016.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String chessFigureType;
        //Выбираем цвет
        boolean isWhite = FactoryChess.isChessWhite(scanner);
        //Указываем фигуру на поле, если не совпадет ни с чем, будет пешка.
        System.out.println("Введите название фигуры.\nK - король, Q - ферзь, R - ладья,\nN - конь, B - слон, p - пешка (по-умолчанию): ");
        chessFigureType = scanner.nextLine();
        //Задаем кооринаты ОТ и ДО
        ChessCoordinate coordinateFrom = new ChessCoordinate("откуда");
        ChessCoordinate coordinateTo = new ChessCoordinate("куда");
        //Запускаем фабрику по генерации шахмат
        FactoryChess factoryChess = new FactoryChess();
        ChessFigure figure = factoryChess.chessGenerator(chessFigureType, isWhite);
        //Сообщение - сможет ли дойти фигура из указаннной клетки в конечную.
        if (figure.isRightMove(coordinateFrom, coordinateTo)) System.out.println(figure.getName() + " сможет дойти за 1 ход");
        else System.out.println(figure.getName() + " не может дойти за 1 ход");
    }
}
