package ru.geekbrains.java2.dz.dz3.МамаевИгорь;

import java.util.*;

public class MainMenu {
    public MainMenu() {
        Scanner scanner = new Scanner(System.in);
        boolean stop = false;
        List<Passenger> passengers = new ArrayList<Passenger>();
        Map<Integer, ArrayList<Passenger>> flights = new TreeMap<Integer, ArrayList<Passenger>>();

        // Запрашиваем у пользователя данные по каждому пассажиру и заносим их в общий массив пассажиров
        do {
            String name;
            String identityDocumentNumber;
            int flightNumber;
            String nextPassenger;
            System.out.println("Введите имя пассажира:");
            name = scanner.next();
            System.out.println("Введите номер документа:");
            identityDocumentNumber = scanner.next();
            System.out.println("Введите номер рейса:");
            flightNumber = scanner.nextInt();
            System.out.println("Ввести данные следующего пассажира? (д/н)");
            nextPassenger = scanner.next();
            if (nextPassenger.toLowerCase().equals("н")) stop = true;
            passengers.add(new Passenger(name, identityDocumentNumber, flightNumber));
        } while (!stop);
        scanner.close();

        // Для каждого пассажира смотрим существует ли такой рейс, если да, добавляем его в список пассажиров этого рейса
        // если нет, то добавляем рейс в список рейсов и пассажира в список пассажиров
        for (Passenger passenger : passengers) {
            if (flights.containsKey(passenger.getFlightNumber())) {
                flights.get(passenger.getFlightNumber()).add(passenger);
            } else {
                flights.put(passenger.getFlightNumber(), new ArrayList<Passenger>());
                flights.get(passenger.getFlightNumber()).add(passenger);
            }
        }

        //Выводим список пассажиров в разбивке по рейсам
        System.out.println("Список пассажиров по рейсам:");
        for (Map.Entry<Integer, ArrayList<Passenger>> entry : flights.entrySet()) {
            for (Passenger passanger : entry.getValue()) {
                System.out.println(passanger);
            }
            System.out.println();
        }
    }
}