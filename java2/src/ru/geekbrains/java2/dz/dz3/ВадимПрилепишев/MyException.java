package ru.geekbrains.java2.dz.dz3.ВадимПрилепишев;

/**
 * Created by Prilepishev Vadim on 16.06.2016.
 */
public class MyException extends Exception {
    public MyException(Throwable e){
        initCause(e);
    }
}
