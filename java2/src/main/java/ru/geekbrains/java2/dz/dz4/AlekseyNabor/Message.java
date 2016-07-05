package ru.geekbrains.java2.dz.dz4.AlekseyNabor;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by AlekseyN 18.06.2016.
 */
class Message implements Serializable {
    private String message;
    private String nickname;
    private Date date;
    private final String dateFormat = "HH:mm:ss";    //ФОРМАТ ПРЕДСТАВЛЕНИЯ ДАТЫ

    Message(String msg, String name) {
        this.date = new Date();
        this.message = msg;
        this.nickname = name;
    }

    //ВЕРНУТЬ ТЕКСТ СООБЩЕНИЯ
    public String getMessage() {
        return message;
    }

    //ВЕРНУТЬ НИКНЕЙМ
    String getNickname() {
        return nickname;
    }

    //ВЕРНУТЬ ДАТУ
    Date getDate() {
        return date;
    }

    //ВЕРНУТЬ String ДАТЫ В УКАЗАННОМ ФОРМАТЕ
    String getSimpleDate() {
        DateFormat df = new SimpleDateFormat(dateFormat);
        return df.format(this.date);
    }
}
