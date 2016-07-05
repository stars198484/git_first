package ru.geekbrains.java2.dz.dz2.ЭлеонораОганджанян;

import java.util.Scanner;

/**
 * Created by М.видео 60 on 11.06.2016.
 */
public class DataEntry {
    Scanner sc = new Scanner(System.in);

    public int entryChess() throws EntryChessException {
        int i = 0;
            System.out.println("p - пешка, r - ладья, kn - конь, b - слон, q - ферзь, k - король, ");
            String sym = sc.next();
            switch (sym) {
                case "p": i = 1; break;
                case "r": i = 2; break;
                case "kn": i = 3; break;
                case "b": i = 4; break;
                case "q": i = 5; break;
                case "k": i = 6; break;
            }
        if (i == 0 || i > 6)
            throw new EntryChessException();
        return i;
    }

    public boolean entryCoordinates(MoveChess moveChess) throws EntryCoordinatesException {
        System.out.println("Начальные координаты фигуры (формат а 1/ a-h, 1-8).");
        String sym = sc.next();
        int x = installX(sym);
        int y = sc.nextInt() - 1;

        if (isOutOfRange(x, y))
            throw new EntryCoordinatesException();

        System.out.println("Координаты точки, в кот. хотите переместить фигуру (формат a 1/ a-h, 1-8).");
        String sym1 = sc.next();
        int x1 = installX(sym1);
        int y1 = sc.nextInt() - 1;

        if (isOutOfRange(x1, y1))
            throw new EntryCoordinatesException();

        int diffX = Math.abs(x - x1);
        int diffY = Math.abs(y - y1);

        return moveChess.isRightMove(diffX, diffY);
    }

    private int installX(String sym) {
        int x = -1;
        switch (sym){
            case "a": x = 0; break;
            case "b": x = 1; break;
            case "c": x = 2; break;
            case "d": x = 3; break;
            case "e": x = 4; break;
            case "f": x = 5; break;
            case "g": x = 6; break;
            case "h": x = 7; break;
            default: System.out.println("Неверный символ."); break;
        }
        return x;
    }
    private boolean isOutOfRange(int coordX, int coordY){
        if ((coordX < 0 || coordX > 7) || (coordY < 0 || coordY > 7))
            return true;
        return false;
    }
}
