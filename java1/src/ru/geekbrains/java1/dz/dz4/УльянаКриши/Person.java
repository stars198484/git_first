package ru.geekbrains.java1.dz.dz4.УльянаКриши;

/**
 * Created by I_V_Zhukov on 24.05.2016.
 */
public class Person {
    String name;
    String position;
    String email;
    String tel;
    int salary;
    int age;
    public Person (String name, String position, String email, String tel, int salary, int age){//Создаем конструктор для класса Person с теме же параметрами
        this.name=name;
        this.position=position;
        this.email=email;
        this.tel=tel;
        this.salary=salary;
        this.age=age;

    }



    @Override //метод для вывода на экран
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", email='" + email + '\'' +
                ", tel=" + tel +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }
}