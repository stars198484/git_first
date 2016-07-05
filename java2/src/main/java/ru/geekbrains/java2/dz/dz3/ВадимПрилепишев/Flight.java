package ru.geekbrains.java2.dz.dz3.ВадимПрилепишев;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Prilepishev Vadim on 15.06.2016.
 */
public class Flight {
    private int flightId;
    private String from;
    private String to;
    private List<Passenger> passengerList = new ArrayList<Passenger>();

    public Flight(int flightId, String from, String to) {
        this.flightId = flightId;
        this.from = from;
        this.to = to;
    }

    public int getFlightId() {
        return flightId;
    }

    public void setFlightId(int flightId) {
        this.flightId = flightId;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public List<Passenger> getPassengerList() {
        return passengerList;
    }

    public static class SortByNumber implements Comparator<Flight> {

        public int compare(Flight o1, Flight o2) {

            if(o1.getFlightId() > o2.getFlightId()){
                return 1;
            }

            if(o1.getFlightId() > o2.getFlightId()){
                return -1;
            }

            else {
                return 0;
            }
        }
    }

}
