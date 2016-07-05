package ru.geekbrains.java2.dz.dz3.АндрейИванов;

import java.util.*;

/**
 * Created by a.ivanov on 15.06.2016.
 */
public class Main {

    public static void main(String[] args) {

        int i = 0;
        PassengerComporator pc = new PassengerComporator(); // обьект для упорядочивания пассажиров
        Set<Passenger> passengers = new TreeSet<>(pc);
        Map<Integer, List<Passenger>> passengersMap = new TreeMap<>();
        Menu menu = new Menu();
        ReadPassenger rp = new ReadPassenger();

        while(menu.readInformation().equals("1")) {
            passengers.add(rp.entryPassenger());
            System.out.println("Пассажир добавлен");
        }
        for (Passenger passenger : passengers) {
            if(passengersMap.containsKey(passenger.getFlight())){  // если в мапе имеется уже такой рейс, то пассажир добавляется в этот рейс в список List<Passenger>

                passengersMap.get(passenger.getFlight()).add(passenger);
            }
            else {                                                 // если нет, то добавляется новый клюс с рейсом и в этом ключе создается новый List<Passenger>>
                List<Passenger> list = new ArrayList<>();
                list.add(passenger);
                passengersMap.put(passenger.getFlight(), list);
            }
        }
        for (Map.Entry<Integer, List<Passenger>> entry : passengersMap.entrySet()) {

            System.out.println("Номер рейса - "+ entry.getKey() + "\nКолличество пассажиров - " + entry.getValue().size() + "\nСписок пассажиров:\n" + entry.getValue().toString());
        }
    }
}
