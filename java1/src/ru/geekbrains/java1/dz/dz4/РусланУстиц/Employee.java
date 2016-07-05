package ru.geekbrains.java1.dz.dz4.РусланУстиц;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Home-pc on 19.05.2016.
 */
public class Employee {
    private static List<Employee> employees = new ArrayList<Employee>();

    private String firstName;
    private String middleName;
    private String lastName;
    private positionList position;
    private String email;
    private String phoneNumber;
    private double salary;
    private int age;

    enum positionList { unknown, trainee, specialist, leadingSpecialist, chiefSpecialist, CEO };

    public Employee() {
        employees.add(this);
        this.firstName = "Unknown";
        this.middleName = "Unknown";
        this.lastName = "Unknown";
        this.position = positionList.unknown;
        this.email = "Unknown";
        this.phoneNumber = "Unknown";
        this.salary = 0.0;
        this.age = 0;
    }

    public Employee(String firstName, String middleName, String lastName, int age) {
        this();
        if (!firstName.isEmpty())
            this.firstName = firstName;
        if (!middleName.isEmpty())
            this.middleName = middleName;
        else this.middleName = "";
        if (!lastName.isEmpty())
            this.lastName = lastName;
        if (age > 0)
            this.age = age;
    }

    public Employee(String firstName, String middleName, String lastName, int age, positionList position, String email, String phoneNumber, double salary) {
        this(firstName, middleName, lastName, age);
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
    }

    public static void printOlderThan(int age) {
        for (Employee employee : employees) {
            if (employee.age > age)
                System.out.println(employee.firstName + " " +
                        employee.middleName + " " +
                        employee.lastName + " " +
                        employee.position + " " +
                        employee.email + " " +
                        employee.phoneNumber + " " +
                        employee.salary);
        }
    }

    public void setPosition(positionList position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", position=" + position +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }
}