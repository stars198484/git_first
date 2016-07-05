package ru.geekbrains.java2.dz.dz2.АндрейИванов;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by a.ivanov on 08.06.2016.
 */
public class GiveStartInfo {

    public int readFigure() throws MyExceptions {
        int figure;

        while(true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Выберете фигуру: \n" +
                    "1 - Пешка\n" +
                    "2 - Ладья\n" +
                    "3 - Конь\n" +
                    "4 - Слон\n" +
                    "5 - Ферзь\n" +
                    "6 - Король");
            try {
                figure = sc.nextInt();
            } catch (InputMismatchException e) {
                throw new MyExceptions(e.getMessage(), "InputMismatchException");
            }
            if (figure >= 1 && figure <= 6) break;
            else
                throw new MyExceptions("Неправильный диапозон чисел", "InputIncorrectRange"); // System.out.println("Вы ввели неверное значение, нужно выбрать значение 1 - 6.");
        }
        return figure;
    }

    public int[] readPosition() throws MyExceptions {
        String position;
        int[] coor;
        Scanner sc = new Scanner(System.in);
        //Scanner sc = new Scanner(System.in);
        while (true) {
            position = sc.nextLine();
            coor = translateCoordinate(position);
            if (coor[0] != 0 && coor[1] >= 1 && coor[1] <= 8)
                break;
            else
                throw new MyExceptions("Координаты за пределами диапозона", "InputIncorrectRange"); //System.out.println(("Вы ввели координаты неверно! Введите еще раз:"));
        }
        return coor;
    }

    private int[] translateCoordinate (String coordinate) {

        int[] coor = new int[2];
        switch (coordinate.charAt(0)) {
            case 'a': coor[0] = 1; break;
            case 'b': coor[0] = 2; break;
            case 'c': coor[0] = 3; break;
            case 'd': coor[0] = 4; break;
            case 'e': coor[0] = 5; break;
            case 'f': coor[0] = 6; break;
            case 'g': coor[0] = 7; break;
            case 'h': coor[0] = 8; break;
            default : coor[0] = 0;
        }
        coor[1] = Character.getNumericValue(coordinate.charAt(1)) ;
        return coor;
    }
}
