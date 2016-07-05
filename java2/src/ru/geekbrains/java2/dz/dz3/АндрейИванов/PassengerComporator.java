package ru.geekbrains.java2.dz.dz3.АндрейИванов;

import java.util.Comparator;

/**
 * Created by a.ivanov on 16.06.2016.
 */

public class PassengerComporator implements Comparator<Passenger>{
    @Override
    public int compare(Passenger o1, Passenger o2) {

        return o1.getName().compareTo(o2.getName());
    }
}
