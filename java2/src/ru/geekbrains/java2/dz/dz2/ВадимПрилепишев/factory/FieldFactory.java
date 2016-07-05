package ru.geekbrains.java2.dz.dz2.ВадимПрилепишев.factory;

import ru.geekbrains.java2.dz.dz2.ВадимПрилепишев.Field;
import ru.geekbrains.java2.dz.dz2.ВадимПрилепишев.gameinterface.FieldFactoryInterface;

/**
 * Created by Prilepishev Vadim on 08.06.2016.
 */
public class FieldFactory implements FieldFactoryInterface {

    @Override
    public Field createField(char abc,char digi) {
        String fieldId = new StringBuilder().append(abc).append(digi).toString();
        char color = ' ';
        if((digi % 2 == 0) && (abc == 'a' || abc == 'c' || abc == 'e' || abc == 'g')){
            color = '#';
        }
        if((digi % 2 != 0) && (abc == 'b' || abc == 'd' || abc == 'f' || abc == 'h')){
            color = '#';
        }

        Field field = new Field(fieldId,color,color);

        return field;
    }
}
