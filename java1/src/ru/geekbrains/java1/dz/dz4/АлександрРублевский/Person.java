package ru.geekbrains.java1.dz.dz4.АлександрРублевский;

/**
 * Created by I_V_Zhukov on 24.05.2016.
 */
public class Person {
    String name;
    String profession;
    String email;
    String phoneNumber;
    int payment;
    int age;

    public Person(String name, String profession, String email, String phoneNumber, int payment, int age) {

        this.name = name;
        this.profession = profession;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.payment = payment;
        this.age = age;

        if (age >= 40) {

            System.out.println("Name: " + name + ". Profession: " + profession
                    + ". Email: " + email + ". Phone number: " + phoneNumber
                    + ". Payment: " + payment + ". Age: " + age + ".");
        }

    }
}
