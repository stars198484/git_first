package ru.geekbrains.java1.dz.dz4.КонстантинГрачев;

/**
 * Created by I_V_Zhukov on 10.05.2016.
 */
public class Main {
    public static void main(String[] args) {


        Employee c = new Employee("Jack", "Boss", "mail1", "777", 100, 30);

        System.out.println(c);
        System.out.println(c.getAge());



        // 4-ая часть задания

        Employee[] persArray= new Employee[5];
        persArray[0]=new Employee("Ivanov", "Sotrudnik", "mail", "000-00-00",100,40);
        persArray[1]=new Employee("Ivanov1", "Sotrudnik1", "mail1", "111-11-11",200,10);
        persArray[2]=new Employee("Ivanov2", "Sotrudnik2", "mail2", "222-22-22",300,50);
        persArray[3]=new Employee("Ivanov3", "Sotrudnik3", "mail3", "333-33-33",1000,20);
        persArray[4]=new Employee("Ivanov4", "Sotrudnik4", "mail4", "444-44-44",100000,100);


        System.out.println("последнее задание с циклом - кому за 40");

        for (int i=0; i<5;i++) {

            if (persArray[i].getAge()>40)
                System.out.println(persArray[i]);
        }

    }

}




