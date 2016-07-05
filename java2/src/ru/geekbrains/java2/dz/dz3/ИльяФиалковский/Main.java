package ru.geekbrains.java2.dz.dz3.ИльяФиалковский;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by Demo on 14.06.2016.
 *  Я использовал те конструкции, с которыми лучше умею работать (Buffer reader и Array List)
 *  Программа работает полноценно, и не дает делать "пустые" записи.
 */
public class Main {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); //Чтение строк
        TreeMap<String, ArrayList<Passenger>> lines = new TreeMap<String, ArrayList<Passenger>>(); //Массив массивов

        while (true) {
            try {
                System.out.println("Введите имя пассажира, или end для вывода списка рейсов и пассажиров.");
                String name = reader.readLine();
                if (name.equals("end")) break; //Выход из цикла
                System.out.println("Введите номер документа пассажира.");
                String document = reader.readLine();
                System.out.println("Введите номер рейса).");
                String line = reader.readLine(); //Рейс поидее может иметь спецсимволы, по этому String
                Passenger passenger = new Passenger(); //Создаем объект пассажира
                passenger.setName(name); //Добавляем имя...
                passenger.setDocument(document); //...и номер док-та
                if(name.equals("")||document.equals("")||line.equals("")){ //Защита от пустых полей
                    System.err.println("Имя пассажира, номер документа и номер рейса должны быть указаны обязательно! Повторите ввод.");
                    continue;
                }
                if (!lines.containsKey(line)) lines.put(line, new Passengers().getPassengers()); //Проверяем, есть ли у нас массив по номеру док-та, и, если его нет, добавляем.
                lines.get(line).add(passenger); //Добавляем пассажира в рейс
            } catch (IOException e) {
                System.err.println("Не знаю как, но вы её сломали:)");
                e.printStackTrace();
            }
        }

        for (Map.Entry<String, ArrayList<Passenger>> line: lines.entrySet()) { //перебираем массив массивов...
            System.out.println("Рейс № "+line.getKey()); //..выводим номер рейса...
            for (Passenger p : line.getValue()) { //...перебираем список пассажиров рейса...
                System.out.println("Имя: "+p.getName()+". Документ: "+p.getDocument()); //...и выводим их.
            }
        }

    }
}
