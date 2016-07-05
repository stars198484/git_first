package ru.geekbrains.java2.dz.dz2.АндрейИванов;

/**
 * Created by a.ivanov on 14.06.2016.
 */
public class MyExceptions extends Exception{

    private String errorCode = "Unknown Exception";

    MyExceptions(String message, String errorCode) {
        super(message);
        this.errorCode = errorCode;
    }

    public String getErrorCode() {
        return errorCode;
    }
}
