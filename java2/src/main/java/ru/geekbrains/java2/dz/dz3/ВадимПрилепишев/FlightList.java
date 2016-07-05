package ru.geekbrains.java2.dz.dz3.ВадимПрилепишев;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by Prilepishev Vadim on 15.06.2016.
 * FlightList это Singleton который содержит уникальные объекты flightList() который генерируется один раз при создании объекта,
 * и passengersTreeMap который содержит List<Passenger> каждого рейса.
 *
 */

public class FlightList {
    private List<Flight> flightList = new ArrayList<Flight>();
    private Map<Integer,List<Passenger>> passengersTreeMap = new TreeMap<Integer,List<Passenger>>();
    private static FlightList instance = new FlightList();

    private FlightList(){
        Flight berlin = new Flight(1,"Москва","Берлин");
        Flight dubai = new Flight(2,"Москва","Дубай");
        Flight bangkok = new Flight(3,"Москва","Бангок");
        flightList.add(berlin);
        flightList.add(dubai);
        flightList.add(bangkok);
        for(int i = 0; i < flightList.size(); i++){
            //добавление листов пассажиров к списку passengersTreeMap
            passengersTreeMap.put(flightList.get(i).getFlightId(),flightList.get(i).getPassengerList());
        }
    }

    public static FlightList getInstance() {
        return instance;
    }

    public List<Flight> getFlightList() {
        return flightList;
    }

    public Map<Integer, List<Passenger>> getPassengersTreeMap() {
        return passengersTreeMap;
    }
}
