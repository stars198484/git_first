package ru.geekbrains.java2.dz.dz7.AlekseyNabor.Client;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by AlekseyN 18.06.2016.
 */
public class Message implements Serializable {
    private String message;
    private String nickname;
    private Date date;
    private final String dateFormat = "HH:mm:ss";    //ФОРМАТ ПРЕДСТАВЛЕНИЯ ДАТЫ

    public Message(String msg, String name) {
        this.date = new Date();
        this.message = msg;
        this.nickname = name;
    }

    public Message(String msg) { //SERVER MESSAGE
        this.date = new Date();
        this.message = msg;
        this.nickname = "<b>SERVER<b>";
    }

    //ГЕТТЕРЫ
    public String getMessage() {
        return message;
    }
    public String getNickname() {
        return nickname;
    }
    Date getDate() {
        return date;
    }

    //ГЕТТЕР ДАТЫ ПО ШАБЛОНУ
    String getSimpleDate() {
        DateFormat df = new SimpleDateFormat(dateFormat);
        return df.format(this.date);
    }
}
