package ru.geekbrains.java1.dz.dz4.ЮрийЛукас;

/**
 * Created by Home-pc on 19.05.2016.
 */
public class Employee {
//    public class Employee {
        public String name;
        public String surname;
        public String position;
        public String email;
        public String phone;
        public float salary;
        public int age;

        public Employee(String name, String surname, String position) {
            this.name = name;
            this.surname = surname;
            this.position = position;
        }

        public Employee(String name, String surname, String position, String email, String phone, float salary, int age) {
            this( name, surname, position);
            this.email = email;
            this.phone = phone;
            this.salary = salary;
            this.age = age;
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "name='" + name + '\'' +
                    ", surname='" + surname + '\'' +
                    ", position='" + position + '\'' +
                    ", email='" + email + '\'' +
                    ", phone='" + phone + '\'' +
                    ", salary=" + salary +
                    ", age=" + age +
                    '}';
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getSurname() {
            return surname;
        }

        public void setSurname(String surname) {
            this.surname = surname;
        }

        public String getPosition() {
            return position;
        }

        public void setPosition(String position) {
            this.position = position;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public float getSalary() {
            return salary;
        }

        public void setSalary(float salary) {
            this.salary = salary;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }
