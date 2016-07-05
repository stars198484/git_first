package ru.geekbrains.java2.dz.dz3.ВадимПрилепишев;

import java.util.Comparator;

/**
 * Created by Prilepishev Vadim on 15.06.2016.
 */
public class Passenger {
    private String passengerName;
    private String passengerSurname;
    private String passNumber;
    private int flightId;

    public Passenger(String passengerName, String passengerSurname, String passNumber, int flightId) {
        this.passengerName = passengerName;
        this.passengerSurname = passengerSurname;
        this.passNumber = passNumber;
        this.flightId = flightId;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
    }

    public String getPassengerSurname() {
        return passengerSurname;
    }

    public void setPassengerSurname(String passengerSurname) {
        this.passengerSurname = passengerSurname;
    }

    public String getPassNumber() {
        return passNumber;
    }

    public void setPassNumber(String passNumber) {
        this.passNumber = passNumber;
    }

    public int getFlightId() {
        return flightId;
    }

    public void setFlightId(int flightId) {
        this.flightId = flightId;
    }

    public static class SortByNames implements Comparator<Passenger> {

        public int compare(Passenger o1, Passenger o2) {
            return o1.getPassengerName().compareTo(o2.getPassengerName());
        }

    }
}
