package ru.geekbrains.java2.dz.dz3.АндрейИванов;

import java.util.Scanner;

/**
 * Created by a.ivanov on 15.06.2016.
 */
public class Menu {

    public String readInformation() {
        String str;
        // try(Scanner scanner = new Scanner(System.in)) { когда сканнер обрабатываю через тру с ресурсами, постоянно выходит ексепшен. Когда сканер используется
        Scanner sc = new Scanner(System.in);//;) {
            while(true) {
                System.out.println("Ввод пассажиров:\n" +
                        "Введите 1, чтобы добавить нового пассажира\n" +
                        "Введите 2, чтобы завершить ввод пассажиров");
                str = sc.nextLine();
                if(str.equals("1") || str.equals("2"))
                    break;
                else System.out.println("Неверные значения");
            }
       //   } - закрывающая скобка тру с ресурсами
        sc.close();
        return str;
    }
}
