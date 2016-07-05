package ru.geekbrains.java2.dz.dz1.ВадимПрилепишев;

/**
 * Created by Prilepishev Vadim on 08.06.2016.
 */
public class Field {

    private String fieldId;
    private char color;
    private char content;

    public Field(String fieldId, char color, char content){
        this.fieldId = fieldId;
        this.color = color;
        this.content = content;
    }

    public String getFieldId() {
        return fieldId;
    }

    public void setFieldId(String fieldId) {
        this.fieldId = fieldId;
    }

    public char getColor() {
        return color;
    }

    public void setColor(char color) {
        this.color = color;
    }

    public char getContent() {
        return content;
    }

    public void setContent(char content) {
        this.content = content;
    }
}
