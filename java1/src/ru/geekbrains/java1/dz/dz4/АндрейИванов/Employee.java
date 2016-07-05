package ru.geekbrains.java1.dz.dz4.АндрейИванов;

/**
 * Created by I_V_Zhukov on 24.05.2016.
 */
public class Employee {
    private String fio;
    private String position;
    private String email;
    private String tel;
    private int pay;
    private int age;

    Employee(String fio, String position, String email, String tel, int pay, int age) {
        this.fio = fio;
        this.position = position;
        this.email = email;
        this.tel = tel;
        this.pay = pay;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "fio='" + fio + '\'' +
                ", position='" + position + '\'' +
                ", email='" + email + '\'' +
                ", tel='" + tel + '\'' +
                ", pay=" + pay +
                ", age=" + age +
                '}';
    }
    public void printEmployee(){

        System.out.println(toString());
    }

    public void printEmployee(int age)
    {
        if(this.age > age)
            System.out.println(toString());
    }
}

