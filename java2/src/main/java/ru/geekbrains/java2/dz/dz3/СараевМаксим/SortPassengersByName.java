package ru.geekbrains.java2.dz.dz3.СараевМаксим;

import java.util.Comparator;

/**
 * Created by desarz on 16.06.2016.
 */
public class SortPassengersByName implements Comparator<Passenger> {
    @Override
    public int compare(Passenger o1, Passenger o2) {
        String str1 = o1.getFullName();
        String str2 = o2.getFullName();
        return str1.compareTo(str2);
    }
}
