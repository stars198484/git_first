package ru.geekbrains.java2.dz.dz1.YuryLukas.interfaces;

/**
 * Created by yurok on 9.06.16.
 */
public interface Field {
    int WHITE = 0;
    int BLACK = 1;


    boolean isEmpty();
    Figure getContent();
    void setColor(int color);
    int getColor();
    String getName();
}
