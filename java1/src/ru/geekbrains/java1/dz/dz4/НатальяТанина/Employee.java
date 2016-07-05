package ru.geekbrains.java1.dz.dz4.НатальяТанина;

/**
 * Created by I_V_Zhukov on 24.05.2016.
 */
public class Employee {
    private String name;        // ФИО
    private String position;    // должность
    private String email;       // email
    private String phone;       // телефон
    private double salary;      // зарплата
    private int age;            // возраст

    Employee() {
        this.name = "Unknown";
        this.position = "undefine";
        this.email = "none";
        this.phone = "-";
        this.salary = 0;
        this.age = 0;
    }

    Employee(String _name, String _position, String _email, String _phone, double _salary, int _age) {
        this.name = _name;
        this.position = _position;
        this.email = _email;
        this.phone = _phone;
        this.salary = _salary;
        this.age = _age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }
}
