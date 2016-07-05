package ru.geekbrains.java1.dz.dz4.СергейШаповалов;

/**
 * Created by Home-pc on 19.05.2016.
 */
public class Employee {
    String name, position, email, phoneNamber;//обозначаем поля и их типы
    int age;
    double salary;
    public Employee(String name, String position, String email, String phoneNamber, double salary, int age) {//мутим конструктор
        this.name= name;
        this.position= position;
        this.email= email;
        this.phoneNamber= phoneNamber;
        this.salary=salary;
        this.age=age;
    }
    public String getName(){return name;}//тут и 5 строк ниже возвращаемые гет-ом значения и их типы (через эти методы можно будет вывести данные в консоль)
    public String getPosition(){return position;}
    public String getEmail(){return email;}
    public String getPhoneNamber(){return phoneNamber;}
    public int getAge(){return age;}
    public double getSalary(){return salary;}

}
