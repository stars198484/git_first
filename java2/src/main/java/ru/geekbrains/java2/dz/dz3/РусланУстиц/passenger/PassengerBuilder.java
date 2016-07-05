package ru.geekbrains.java2.dz.dz3.РусланУстиц.passenger;

/**
 * Created by darky_000 on 16.06.2016.
 */
public class PassengerBuilder {

    private String name;
    private long documentNumber;
    private long flightNumber;

    public String getName() {
        return name;
    }

    public long getDocumentNumber() {
        return documentNumber;
    }

    public long getFlightNumber() {
        return flightNumber;
    }

    public PassengerBuilder name(final String name) {
        this.name = name;
        return this;
    }

    public PassengerBuilder documentNumber(final long documentNumber) {
        this.documentNumber = documentNumber;
        return this;
    }

    public PassengerBuilder flightNumber(final long flightNumber) {
        this.flightNumber = flightNumber;
        return this;
    }

    public Passenger build() {
        return new Passenger(this);
    }
}
