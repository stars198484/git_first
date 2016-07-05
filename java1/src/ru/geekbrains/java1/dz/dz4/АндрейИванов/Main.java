package ru.geekbrains.java1.dz.dz4.АндрейИванов;

/**
 * Created by I_V_Zhukov on 24.05.2016.
 */
public class Main {
    public static void main(String[] args) {

        Employee[] empl = new Employee[5];

        empl[0] = new Employee("ИАГ", "Программист Андроид", "email@email" , "777777", 300000, 29);
        empl[1] = new Employee("КСП", "Программист java", "email@email1" , "777776", 150000, 25);
        empl[2] = new Employee("НДС", "Программист C#", "email@email2" , "777775", 100000, 31);
        empl[3] = new Employee("ИИИ", "Программист C++", "email@email3" , "777774", 90000, 41);
        empl[4] = new Employee("ПИВ", "Программист PHP", "email@email4" , "777773", 800000, 45);


//        for (int i = 0; i < empl.length; i++) {
//            empl[i].printEmployee();
//        }
        //первый способ
        for (int i = 0; i < empl.length ; i++) {
            empl[i].printEmployee(40);
        }
        System.out.println();
        //второй способ
        for (int i = 0; i < empl.length; i++) {
            if(empl[i].getAge() > 40)
                empl[i].printEmployee();
        }

    }

}
