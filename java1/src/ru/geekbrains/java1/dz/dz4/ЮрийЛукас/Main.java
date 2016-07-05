package ru.geekbrains.java1.dz.dz4.ЮрийЛукас;

/**
 * Created by I_V_Zhukov on 10.05.2016.
 */
public class Main {
    public static void main(String[] args) {
        Employee[] emploement = new Employee[10];

        emploement[0] = new Employee("Вася", "Пупкин", "адепт", "vasja@magecschool.org", "none", 2500,14);
        emploement[1] = new Employee("Петя", "Васечкин", "адепт", "petja@magecschool.org", "none", 2500,15);
        emploement[2] = new Employee("Дуся", "Морозова", "адепт", "dusja@magecschool.org", "none", 2500,15);
        emploement[3] = new Employee("Михаил", "Абракадабрович", "магистр", "boss@magecschool.org", "222353232", 15000,65);
        emploement[4] = new Employee("Барбара", "Еговна", "колдунья", "barbara@magecschool.org", "222357822", 10000,55);
        emploement[5] = new Employee("Изя", "Глюкин", "алхимик", "gljukin@magecschool.org", "212524252", 10000,51);
        emploement[6] = new Employee("Циля", "Шамахановна", "ведьма", "cilja@magecschool.org", "223257202", 10000,45);
        emploement[7] = new Employee("Марта", "Торчкова", "оракул", "marta@magecschool.org", "2622357802", 10000,33);
        emploement[8] = new Employee("Аня", "Маслова", "адепт второго круга", "anja@magecschool.org", "242273587822", 10000,17);
        emploement[9] = new Employee("Коля", "Кукушкин", "адепт второго круга", "kolja@magecschool.org", "22326358782", 10000,18);

        for (int i=0; i< emploement.length; i++){
            if(emploement[i].getAge() > 40){
                System.out.println(emploement[i].toString());
            }
        }
    }
}
