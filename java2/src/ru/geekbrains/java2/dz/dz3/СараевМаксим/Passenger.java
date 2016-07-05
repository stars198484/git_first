package ru.geekbrains.java2.dz.dz3.СараевМаксим;

/**
 * Created by desarz on 16.06.2016.
 */
public class Passenger {
    private String fullName;
    private int documentNumber;
    private int flightNumber;

    public Passenger(String fullName, int documentNumber, int flightNumber) {
        this.fullName = fullName;
        this.documentNumber = documentNumber;
        this.flightNumber = flightNumber;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public void setDocumentNumber(int documentNumber) {
        this.documentNumber = documentNumber;
    }

    public String getFullName() {

        return fullName;
    }

    public int getDocumentNumber() {
        return documentNumber;
    }

    public int getFlightNumber() {
        return flightNumber;
    }
}
