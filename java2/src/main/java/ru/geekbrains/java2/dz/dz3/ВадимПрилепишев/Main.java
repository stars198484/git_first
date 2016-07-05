package ru.geekbrains.java2.dz.dz3.ВадимПрилепишев;

/**
 * Created by Prilepishev Vadim on 15.06.2016.
 */
public class Main {

    public static void main(String[] args) throws MyException {
        int menuFlag = 777;
        Menu menu = new Menu();

        while(menuFlag != 0){

            menu.firstMenu();
            menuFlag = menu.getMenuFlag();

            if(menuFlag == 1){
                try {
                    menu.addPassengerMenu();
                }
                catch(RuntimeException e){
                    System.out.println("Ошибка ввода данных пользователем.");
                    menu.searchMenu();
                }
            }

            if(menuFlag == 2){
                try {
                    menu.searchMenu();
                }
                catch(RuntimeException e){
                    System.out.println("Ошибка ввода данных пользователем.");
                    menu.searchMenu();
                }
            }

            if(menuFlag == 3){
                  menu.flightMenu();
            }
        }

    }

}
