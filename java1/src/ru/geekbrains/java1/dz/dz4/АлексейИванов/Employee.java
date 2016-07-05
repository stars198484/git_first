package ru.geekbrains.java1.dz.dz4.АлексейИванов;

/**
 * Created by Home-pc on 19.05.2016.
 */
public class Employee {
//    public class Worker {
        private String name;
        private String post;
        private String email;
        private int cash;
        private int age;

        public Employee(String name, String post, String email, int age, int cash) {
            this.name = name;
            this.post = post;
            this.email= email;
            this.cash = cash;
            this.age = age;
        }

        @Override
        public String toString() {
            return
                    "name='" + name + '\'' +
                            ", post='" + post + '\'' +
                            ", email='" + email + '\'' +
                            ", age=" + age +
                            ", cash=" + cash +
                            '}';
        }

        public int getAge()
        {
            return this.age;
        }

    }