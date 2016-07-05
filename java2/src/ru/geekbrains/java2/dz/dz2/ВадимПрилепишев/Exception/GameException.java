package ru.geekbrains.java2.dz.dz2.ВадимПрилепишев.Exception;

/**
 * Created by Prilepishev Vadim on 13.06.2016.
 */
public class GameException extends Exception {
    public GameException(Throwable e){
        initCause(e);
    }
}
