package ru.geekbrains.java1.dz.dz4.АндрейСуслов;

/**
 * Created by Home-pc on 19.05.2016.
 */
public class Employee {
    private String name;
    private int age;
    private String telephone;
    private String email;
    private String position;
    private int salary;

    public Employee(String name, int age, String telephone, String email, String position, int salary) {
        this.name = name;
        this.age = age;
        this.telephone = telephone;
        this.email = email;
        this.position = position;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (salary >18)  this.age = age;
        else System.out.println("Сотрудник долже быть не моложе 18 лет");

    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        if (salary >0)  this.salary = salary;
        else System.out.println("Зарпалата должна быть больше нуля!");
    }

    public void information()
    {
        System.out.println("ФИО: " + this.name +" Должность: "+ this.position + " email: "+ this.email +" Телефон:"+this.telephone+" Зарплата:"+this.salary+" Возраст:"+this.age );

    }
}