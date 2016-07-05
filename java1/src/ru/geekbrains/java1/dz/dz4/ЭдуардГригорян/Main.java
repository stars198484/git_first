package ru.geekbrains.java1.dz.dz4.ЭдуардГригорян;

/**
 * Created by I_V_Zhukov on 13.05.2016.
 */
public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee();

        Employee[] em = new Employee[5];

        em[0] = new Employee("Jhony", "Engineer", "x@x.com", "3020", 12000, 45);
        em[1] = new Employee("Jhony1", "Engineer", "x@x.com", "3020", 12000, 35);
        em[2] = new Employee("Jhony2", "Engineer", "x@x.com", "3020", 12000, 25);
        em[3] = new Employee("Jhony3", "Engineer", "x@x.com", "3020", 12000, 15);
        em[4] = new Employee("Jhony4", "Engineer", "x@x.com", "3020", 12000, 55);

        for (int i = 0; i < em.length; i++) {
            if (em[i].age > 40)
            {
                System.out.println(em[i].FIO);
                System.out.println(em[i].position);
                System.out.println(em[i].email);
                System.out.println(em[i].phone);
                System.out.println(em[i].salary);
                System.out.println(em[i].age);
            }
        }
    }
}
