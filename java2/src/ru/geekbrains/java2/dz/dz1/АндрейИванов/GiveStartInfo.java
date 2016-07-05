package ru.geekbrains.java2.dz.dz1.АндрейИванов;

import java.util.Scanner;

/**
 * Created by a.ivanov on 08.06.2016.
 */
public class GiveStartInfo {

    public int readFigure( ) {

        Scanner sc;
        int figure;

        while(true) {
            sc = new Scanner(System.in);
            System.out.println("Выберете фигуру: \n" +
                    "1 - Пешка\n"    +
                    "2 - Ладья\n"    +
                    "3 - Конь\n"     +
                    "4 - Слон\n"     +
                    "5 - Ферзь\n"    +
                    "6 - Король");
            if(sc.hasNextInt()) {
                figure = sc.nextInt();
                if(figure >= 1 && figure <= 6) break;
                else System.out.println("Вы ввели неверное значение, нужно выбрать значение 1 - 6.");
            }
            else System.out.println("Вы ввели не цифру.");
        }
        return figure;
    }

    public int[] readPosition() {
        String position;
        int[] coor = new int[2];
        Scanner sc = new Scanner(System.in);
        while(true) {
            position = sc.nextLine();
            coor = translateCoordinate(position);
            if(coor[0] != 0 && coor[1] >= 1 && coor[1] <= 8)
                break;
            else System.out.println(("Вы ввели координаты неверно! Введите еще раз:"));
        }
        return coor;
    }

    private int[] translateCoordinate(String coordinate) {

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
