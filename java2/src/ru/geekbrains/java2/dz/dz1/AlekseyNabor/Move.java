package ru.geekbrains.java2.dz.dz1.AlekseyNabor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by A on 08.06.2016.
 */
class Chess {
    Chess() throws IOException {
        String command = null;
        String figure = null;
        String from, to = null;
        int fromX, fromY = 0;
        int toX, toY = 0;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //чтение и парсинг строки
        command = bufferedReader.readLine().toLowerCase().trim();
        String[] temp = command.split("\\s+");
        figure = temp[0]; from = temp[1]; to = temp[2];

        Figure newFigure = null;
        switch (figure) {
            case "пешка" : newFigure = new Pawn();  break;
            case "конь" : newFigure = new Knight(); break;
            case "слон" : newFigure = new Bishop(); break;
            case "ладья" : newFigure = new Rook();  break;
            case "ферзь" : newFigure = new Queen(); break;
            case "король" : newFigure = new King(); break;
            default: newFigure = new Pawn();
        }

        if (newFigure.isRightMove(from,to)) {
            System.out.println("Фигура может выполнить такой ход.");
        } else {
            System.out.println("Нельзя сделать такой ход");
        }

    }
}
