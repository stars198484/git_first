package ru.geekbrains.java2.dz.dz3.ВадимПрилепишев;

import java.util.*;

/**
 * Created by Prilepishev Vadim on 15.06.2016.
 */
public class Menu {
    private int menuFlag;
    private Passenger passenger;
    String passengerName,passengerSurname,passNumber;
    Scanner scanner = new Scanner(System.in);

    private static final String ADD_PASSENGER_FIRST_MENU = "Добавить пассажира. Нажмите 1.";
    private String FLIGHT_SEARCH_FIRST_MENU = "Поиск рейса. Нажмите 2.";
    private String FLIGHT_FLIGHTINFO_FIRST_MENU = "Показать список рейсов. Нажмите 3.";
    private String EXIT_FIRST_MENU = "Выход. Нажмите 0.";
    private String PASSENGER_ENTER_NAME_MENU = "Введите имя пасажира.";
    private String ADD_PASSENGER_SURNAME_MENU = "Введите фамилию пасажира.";
    private String ADD_PASSENGER_PASSID_MENU = "Введите номер паспорта.";
    private String ROUTE_MENU = "Выберите направление.";
    private String ROUTE_LIST = "Список рейсов.";
    private String ROUTE_LIST_SELECTION = "Выберите рейс для получения подробной информации.";
    private String FLIGHT_NUMBER = " Номер рейса: ";
    private String PASSENGER_COUNT = "Количество пасажиров на рейсе: ";

    public void firstMenu(){
        System.out.println();
        System.out.println(ADD_PASSENGER_FIRST_MENU);
        System.out.println(FLIGHT_SEARCH_FIRST_MENU);
        System.out.println(FLIGHT_FLIGHTINFO_FIRST_MENU);
        System.out.println(EXIT_FIRST_MENU);
        System.out.println();
        menuFlag = scanner.nextInt();
    }

    public void addPassengerMenu() throws MyException {

        System.out.println(PASSENGER_ENTER_NAME_MENU);
        passengerName = scanner.next();

        System.out.println(ADD_PASSENGER_SURNAME_MENU);
        passengerSurname = scanner.next();

        System.out.println(ADD_PASSENGER_PASSID_MENU);
        passNumber = scanner.next();

        int flightId = routeMenu();

        passenger = new Passenger(passengerName,passengerSurname,passNumber,flightId);

        //добавление пассажира к рейсу(К Singletone FlightList)
        FlightList.getInstance().getFlightList().get(flightId-1).getPassengerList().add(passenger);
    }

    private int routeMenu(){

        System.out.println(ROUTE_MENU);
        List<Flight> flights = FlightList.getInstance().getFlightList();

        for(Flight flight: flights) {
            System.out.println(flight.getFrom() + " - " + flight.getTo() + " Нажмите " + flight.getFlightId());
        }

        return scanner.nextInt();
    }

    public void searchMenu() throws MyException {

        System.out.println(ROUTE_LIST);

        List<Flight> flights = FlightList.getInstance().getFlightList();

        //Сортировка по номеру рейса, через подкласс SortByNumber с интерфейсом Comparator
        Collections.sort(flights,new Flight.SortByNumber());

        for(Flight flight: flights) {
            System.out.println(flight.getFrom() + " - " + flight.getTo() + FLIGHT_NUMBER + flight.getFlightId());
        }
      System.out.println(ROUTE_LIST_SELECTION);
      int flightNumber = scanner.nextInt();
      Map<Integer, List<Passenger>> passengersTreeMap = FlightList.getInstance().getPassengersTreeMap();

      //получение списка пассажиров из TreeMap по номеру рейса
      List<Passenger> passengers = passengersTreeMap.get(flightNumber);

      //Сортировка по имени, через подкласс SortByNames с интерфейсом Comparator
      Collections.sort(passengers, new Passenger.SortByNames());

      for (Passenger passenger : passengers) {
         System.out.println(passenger.getPassengerName() +
                         " - " + passenger.getPassengerSurname() +
                         " - " + passenger.getPassNumber()
         );
      }

       System.out.println(PASSENGER_COUNT + passengers.size());
    }

    public void flightMenu(){
        List<Flight> flights = FlightList.getInstance().getFlightList();

        for(Flight flight: flights) {
            System.out.println(flight.getFrom() + " - " + flight.getTo() + FLIGHT_NUMBER + flight.getFlightId());
            for(int i = 0; i < flight.getPassengerList().size(); i++){
                System.out.println(flight.getPassengerList().get(i).getPassengerName() +
                                " - " + flight.getPassengerList().get(i).getPassengerSurname() +
                                " - " + flight.getPassengerList().get(i).getPassNumber()
                );
            }
            System.out.println(PASSENGER_COUNT + flight.getPassengerList().size());
        }
    }

    public int getMenuFlag() {
        return menuFlag;
    }

}