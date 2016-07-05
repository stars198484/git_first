package ru.geekbrains.java1.dz.dz4.ЭлеонораОганджанян;

/**
 * Created by Home-pc on 19.05.2016.
 */
public class Employee {
//    public class Employee {
        private String fio;
        private String post;
        private String email;
        private String telephone;
        private int salary;
        private int age;

        public Employee() {
        }

        // конструктор, заполняющий все поля объекта
        public Employee(String fio, String post, String email, String telephone, int salary, int age) {
            this.fio = fio;
            this.post = post;
            this.email = email;
            this.telephone = telephone;
            this.salary = salary;
            this.age = age;
        }

        // метод проверки возраста старше...
        public boolean getAgeOlder(int age) {
            if (this.age >= age) return true;
            return false;
        }

        // метод вывода информации об объекте в консоль
        public void printEmployee(Employee Employee) {
            System.out.println(Employee);
        }

        @Override
        public String toString() {
            return "Сотрудник {" +
                    "ФИО '" + fio + '\'' +
                    ", должность '" + post + '\'' +
                    ", email '" + email + '\'' +
                    ", телефон '" + telephone + '\'' +
                    ", з/п " + salary +
                    ", возраст " + age +
                    '}';
        }
    }
