package ru.geekbrains.java2.dz.dz3.РусланУстиц;

import ru.geekbrains.java2.dz.dz3.РусланУстиц.passenger.Passenger;
import ru.geekbrains.java2.dz.dz3.РусланУстиц.passenger.PassengerBuilder;

import java.util.*;

/**
 * Created by darky_000 on 16.06.2016.
 */
public class Main {

    public static void main(String[] args) {
        List<Passenger> passengers = new ArrayList<>();
        Map<Long, List<Passenger>> flightsInfo = new TreeMap<>();

        printFlightsInfo(flightsInfo, getPassengersInfo(passengers));
    }

    private static List<Passenger> getPassengersInfo(List<Passenger> passengers) {
        while (true) {
            Scanner sc = new Scanner(System.in);
            sc.reset();
            String nameMenu = "Enter passenger name: ";
            System.out.printf("%s", nameMenu);
            String name = sc.nextLine();
            if (name.equals("quit")) break;

            String documentMenu = "Enter document number: ";
            System.out.printf("%s", documentMenu);
            long documentNumber = sc.nextLong();

            String flightMenu = "Enter flight number: ";
            System.out.printf("%s", flightMenu);
            long flightNumber = sc.nextLong();
            System.out.println(flightNumber);

            Passenger passenger = new PassengerBuilder()
                    .name(name)
                    .documentNumber(documentNumber)
                    .flightNumber(flightNumber)
                    .build();
            passengers.add(passenger);
        }
        System.out.println();

        return passengers;
    }

    private static void printFlightsInfo(Map<Long, List<Passenger>> flightsInfo, List<Passenger> passengers) {
        buildFlightsInfo(flightsInfo, passengers);

        for (Map.Entry<Long, List<Passenger>> entry : flightsInfo.entrySet()) {
            System.out.printf("Flight number: %d\n", entry.getKey());
            if (entry.getValue().size() <= 1)
                System.out.printf("%d passenger:\n", entry.getValue().size());
            else
                System.out.printf("%d passengers:\n", entry.getValue().size());
            for (Passenger passenger : entry.getValue()) {
                System.out.printf("\tname: %s; document: %d\n", passenger.getName(), passenger.getFlightNumber());
            }
            System.out.println();
        }
    }

    private static void buildFlightsInfo(Map<Long, List<Passenger>> flightsInfo, List<Passenger> passengers) {
        for (Passenger passenger : passengers) {
            long flightNumber = passenger.getFlightNumber();
            if (flightsInfo.containsKey(flightNumber)) {
                flightsInfo.get(flightNumber).add(passenger);
            } else {
                flightsInfo.put(flightNumber, new ArrayList<>());
                flightsInfo.get(flightNumber).add(passenger);
            }
            sortPassengers(flightsInfo.get(flightNumber));
        }
    }

    private static void sortPassengers(List<Passenger> passengers) {
         Collections.sort(passengers, (o1, o2) -> o1.getName().compareToIgnoreCase(o2.getName()));
    }
}
