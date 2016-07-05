package ru.geekbrains.java2.dz.dz2.ВадимПрилепишев;

import ru.geekbrains.java2.dz.dz2.ВадимПрилепишев.Exception.CreateException;
import ru.geekbrains.java2.dz.dz2.ВадимПрилепишев.Exception.GameException;
import ru.geekbrains.java2.dz.dz2.ВадимПрилепишев.Exception.InputGameException;
import ru.geekbrains.java2.dz.dz2.ВадимПрилепишев.factory.BlackChessManFactory;
import ru.geekbrains.java2.dz.dz2.ВадимПрилепишев.factory.WhiteChessManFactory;
import ru.geekbrains.java2.dz.dz2.ВадимПрилепишев.gameinterface.ChessMan;

import java.util.Scanner;

/**
 * Created by Prilepishev Vadim on 07.06.2016.
 */
public class Main {
    public static void main(String[] args) throws GameException {
        ChessMan[] whiteChess = new ChessMan[16];
        ChessMan[] blackChess = new ChessMan[16];
        WhiteChessManFactory whiteFactory = new WhiteChessManFactory();
        BlackChessManFactory blackFactory = new BlackChessManFactory();
        ChessBoard.getInstance();
        Scanner scanner = new Scanner(System.in);
        String from;
        String to;

        try {
            for(int i = 0; i < whiteChess.length; i++){
                whiteChess[i] = whiteFactory.createChess(WhiteInitDiapazon.getInstance().whiteDiapazon[i]);
            }

            for(int i = 0; i < blackChess.length; i++){
                blackChess[i] = blackFactory.createChess(BlackInitDiapazon.getInstance().blackDiapazon[i]);
            }

            ChessBoard.getInstance().printBoard();

            System.out.println();
            System.out.println("Введите координаты фигуры для хода");
            from = scanner.next();
            System.out.println("Введите координаты поля для хода");
            to = scanner.next();

            for(int i = 0; i < whiteChess.length; i++){
                if(from.equals(whiteChess[i].getCurrentPosition())){
                    whiteChess[i].isRightMove(from,to);
                }
            }

            for(int i = 0; i < blackChess.length; i++){
                if(from.equals(blackChess[i].getCurrentPosition())){
                    blackChess[i].isRightMove(from,to);
                }
            }

            ChessBoard.getInstance().printBoard();

        } catch(RuntimeException e){
            System.out.println("Ошибка создания массива фигур.");
            throw new CreateException(e);
        }
        catch (Exception e){
            System.out.println("Ошибка ввода данных пользователем.");
            throw new InputGameException(e);
        }

    }
}
