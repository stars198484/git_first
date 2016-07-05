package ru.geekbrains.java1.dz.dz4.АлександрАнатольевичСмирнов;

/**
 * Created by I_V_Zhukov on 10.05.2016.
 */
public class Main {
    public static void main(String[] args) {
        Employee[] persArray = new Employee[5];
        persArray[0] = new Employee();
        persArray[1] = new Employee("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, (byte) 30);
        persArray[2] = new Employee("Иванов Иван Иванович", "Главный инженер", "II.Ivanov@bureau.ru", "111-01-01 (111)", 40000, (byte) 50);
        persArray[3] = new Employee("Иванов Николай Иванович", "Главный бухгалтер", "IN.Ivanov@bureau.ru", "111-01-01 (112)", 40000, (byte) 48);
        persArray[4] = new Employee("Иванов Даниил Иванович", "Инженер", "DI.Ivanov@bureau.ru", "111-01-01 (324)", 25000, (byte) 25);

        for (Employee item: persArray) {
            if (item.isSuitableForAge((byte) 41, (byte) 80)) System.out.println(item);

            // или так
            //if (item.getAge() > 40) System.out.println(item);

        } // for
    } // main
}


