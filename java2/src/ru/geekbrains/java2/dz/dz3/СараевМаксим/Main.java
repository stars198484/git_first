package ru.geekbrains.java2.dz.dz3.СараевМаксим;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * Created by desarz on 16.06.2016.
 */
public class Main{

    public static void main(String[] args) {

        // запускаем метод получения данных о пасажирах и рейсах из консоли
        Map<Integer, List<Passenger>> dataPassanger = inputPasangerData();
        // выводим на печать данные о рейсах и пасажирах.
        printData(dataPassanger);
    }

    public static Map<Integer, List<Passenger>> inputPasangerData(){

        Map<Integer, List<Passenger>> passengers = new TreeMap<Integer, List<Passenger>>();

        // запускаем бесконечный цикл, на заполнение данных
        while (true){

            // запускаем метод на получение данных о новом пасажире
            Passenger newPassenger = nextPassenger();

            // если метод не создал пасажира и вернул null, завершаем цикл заполнения данных о пасажирах
            // и переходим дальше по коду
            if (newPassenger == null) break;;

            // если метод создал пасажира, то заполняем данные в Map
            if (passengers.containsKey(newPassenger.getFlightNumber())) // рейс уже есть в коллекции
            {
                List<Passenger> list = passengers.get(newPassenger.getFlightNumber());
                list.add(newPassenger);
                passengers.put(newPassenger.getFlightNumber(), list);
            } else // новый рейс
            {
                List<Passenger> list = new ArrayList<Passenger>();
                list.add(newPassenger);
                passengers.put(newPassenger.getFlightNumber(), list);
            }
            System.out.println("Пасажир : "+newPassenger.getFullName()+" документа № "+newPassenger.getDocumentNumber()+" зарегестрирован на рейс №"+newPassenger.getFlightNumber());
            System.out.println();
        }

        return passengers;
    }
    public static Passenger nextPassenger(){

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("***************** Регистрация нового пасажира *****************");

        System.out.println("Введите полное имя пасажира :");
        String fullName = null;
        try {
            fullName = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (fullName.isEmpty()) return null;

        System.out.println("Введите номер документа :");
        int documentNumber = 0;
        try {
            documentNumber = Integer.parseInt(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (documentNumber == 0) return null;

        System.out.println("Введите номер рейса :");
        int flightNumber = 0;
        try {
            flightNumber = Integer.parseInt(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (flightNumber == 0) return  null;

        // создаем нового пассажира
        return new Passenger(fullName, documentNumber, flightNumber);
    }

     public static void printData(Map<Integer, List<Passenger>> passengers){

        for (Map.Entry<Integer, List<Passenger>> el:passengers.entrySet()) {
            System.out.println("Рейс №"+el.getKey()+" пасажиров на рейсе - "+el.getValue().size());
            // получаем список пасажиров
            List<Passenger> list = el.getValue();
            // сортируем список пасажиров
            Collections.sort(list, new SortPassengersByName());
            // выводим список пасажиров
            int count = 0;
            for (Passenger pas:list) {
                count++;
                System.out.println(count+". "+pas.getFullName()+" документы №"+pas.getDocumentNumber());
            }
        }

    }

}
