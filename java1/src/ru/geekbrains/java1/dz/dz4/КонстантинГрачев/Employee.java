package ru.geekbrains.java1.dz.dz4.КонстантинГрачев;

/**
 * Created by Home-pc on 19.05.2016.
 */
public class Employee {
//    public class Employee {
        String name;
        String post;
        String email;
        String telNumber;
        int salary;
        int age;

        Employee (String name, String post, String email, String telNumber, int salary, int age) {

            this.name = name;
            this.post = post;
            this.email = email;
            this.telNumber=telNumber;
            this.salary=salary;
            this.age=age;
        }



        int getAge() {
            return age;
        }

        public String toString() {
            return "Сотрудник{" +
                    "Имя -" + name +
                    ", Должность -'" + post + '\'' +
                    ", Email -" + email + '\'' +
                    ", Телефон -" + telNumber +
                    ", ЗП -" + salary +
                    ", Возраст -" + age +
                    '}';
        }

    }
 