package ru.geekbrains.java1.dz.dz4.АлексейИванов;

/**
 * Created by I_V_Zhukov on 13.05.2016.
 */
public class Main {
    public static void main(String[] args) {
        Employee[] wor=new Employee[5];

        wor[0]=new Employee("Ivanov Alexey","manager","ivanoval@mail.ru",43,48000);
        wor[1]=new Employee("Valeev Kamil", "manager","valeevkamil@mail.ru",18,30000);
        wor[2]=new Employee("Ivan Soloviev","boss","asdasda@asda.ru",41,20000);
        wor[3]=new Employee("Popova Sveta","manager","popovasveta@mail.ru",50,50000);
        wor[4]=new Employee("Ivan Obrzstov","engineer","ivanobrz@mail.ru",20,15000);
        for (int i = 0; i <5; i++) {
            if (wor[i].getAge()>40) {
                System.out.println("Worker [" + i + "] : " + wor[i].toString());

            }
        }


    }

}