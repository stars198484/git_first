package ru.geekbrains.java2.dz.dz2.СареавМаксим;

/**
 * Created by Terminator on 09.06.2016.
 */
public class Coordinate {

    private int x;
    private int y;
    private boolean correctCoordinate;

    public Coordinate(String textCord) {

        if (textCord.length() != 2) {
            this.correctCoordinate = checkCorrectCoordinate();
            return;
        }

        // определяем перменные
        int x = 0;
        int y = 0;

        String[] mas = {"", "a", "b", "c", "d", "e", "f", "g", "h"};
        String s1 = Character.toString(textCord.charAt(0));
        String s2 = Character.toString(textCord.charAt(1));


        for (int i = 1; i < mas.length; i++)
        {
            if (mas[i].equals(s1))
            {
                x = i;
                break;
            };
        }
        this.x = x;

        // определяем координату y
        if (Integer.parseInt(s2) >= 1 && Integer.parseInt(s2) <= 8)
        {
            y = Integer.parseInt(s2);
        }
        this.y = y;

        // проверяем правильность координат и заполням
        this.correctCoordinate = checkCorrectCoordinate();

    }

    private boolean checkCorrectCoordinate(){
        if (this.x == 0 ||this.y == 0) {
            return false;
        }
        return true;
    }

    public static Integer minusToPlus(Integer i){
        if (i < 0) return -i;
        return i;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public boolean isCorrectCoordinate() {
        return correctCoordinate;
    }

    public static boolean checkCoordinateEqaully(Coordinate cor1, Coordinate cor2){

        if (cor1.getX() == cor2.getX() && cor1.getY() == cor2.getY()) return true;
        return false;
    }
}
