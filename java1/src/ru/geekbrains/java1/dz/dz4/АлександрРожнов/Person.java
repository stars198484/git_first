package ru.geekbrains.java1.dz.dz4.АлександрРожнов;

/**
 * Created by I_V_Zhukov on 24.05.2016.
 */
public class Person {
    private String name;
    private String position;
    private String email;
    private int telephonenumber;
    private int salary;
    private int age;



    public String getName() {
        return name;

    }

    public String getPosition() {
        return position;
    }

    public String getEmail() {
        return email;
    }

    public int getTelephonenumber() {
        return telephonenumber;
    }

    public int getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }


    public Person(String name, String position, String email, int telephonenumber, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.telephonenumber = telephonenumber;
        this.salary = salary;
        this.age = age;
    }

}




