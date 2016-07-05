package ru.geekbrains.java2.dz.dz3.АндрейИванов;

import java.util.Scanner;

/**
 * Created by a.ivanov on 15.06.2016.
 */
public class ReadPassenger {

    public Passenger entryPassenger() {

        Passenger passenger = new Passenger();
       // try(Scanner scanner = new Scanner(System.in)) { когда сканнер обрабатываю через тру с ресурсами, постоянно выходит ексепшен. Когда сканер используется без тру с ресурсами ексепшена нет. С чем это связанно?
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя пассажира:");
        passenger.setName(scanner.next());
        System.out.println("Введите номер документа:");
        while(true) {
            if(scanner.hasNextLong()) {
                passenger.setDocumentNumber(scanner.nextInt());
                break;
            } else System.out.println("Неверный формат данных");
        }
        System.out.println("Введите номер рейса:");
        while(true) {
            if(scanner.hasNextInt()) {
                passenger.setFlight(scanner.nextInt());
                break;
            } else System.out.println("Неверный формат данных");
        }
      //   } - закрывающая скобка тру с ресурсами
        scanner.close();
        return passenger;
    }
}


