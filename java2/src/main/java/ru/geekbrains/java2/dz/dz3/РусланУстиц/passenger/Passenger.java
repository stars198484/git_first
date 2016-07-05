package ru.geekbrains.java2.dz.dz3.РусланУстиц.passenger;

/**
 * Created by darky_000 on 16.06.2016.
 */
public class Passenger {

    private final String name;
    private final long documentNumber;
    private final long flightNumber;

    public String getName() {
        return name;
    }

    public long getDocumentNumber() {
        return documentNumber;
    }

    public long getFlightNumber() {
        return flightNumber;
    }

    Passenger(PassengerBuilder passengerBuilder) {
        this.name = passengerBuilder.getName();
        this.documentNumber = passengerBuilder.getDocumentNumber();
        this.flightNumber = passengerBuilder.getFlightNumber();
    }
}
