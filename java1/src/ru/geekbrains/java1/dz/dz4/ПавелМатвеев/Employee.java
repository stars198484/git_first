package ru.geekbrains.java1.dz.dz4.ПавелМатвеев;

/**
 * Created by Home-pc on 19.05.2016.
 */
public class Employee {
//    public class Employee {
        private String fio;
        private String position;
        private String email;
        private String phone;
        private float pay;
        private int age;


        /**
         * @param fio      - ФИО
         * @param position - должность
         * @param email    - Почтовый адрес
         * @param phone    - телефон
         * @param pay      - зарплата
         * @param age      - возраст
         */
        public Employee(String fio, String position, String email, String phone, float pay, int age) {
            this.fio = fio;
            this.position = position;
            this.email = email;
            this.phone = phone;
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
                    ", phone=" + phone +
                    ", pay=" + pay +
                    ", age=" + age +
                    '}';
        }
    }