package ru.geekbrains.java2.dz.dz2.СтаниславОвчинников;

/**
 * Created by Stars on 14.06.2016.
 */
public class MyChessException extends Exception {

    public MyChessException() {

    }

    @Override
    public String toString() {
        return "Ошибка, ввод координат в формате a1-h8";
    }


}
