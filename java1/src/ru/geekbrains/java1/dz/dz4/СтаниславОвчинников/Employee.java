package ru.geekbrains.java1.dz.dz4.СтаниславОвчинников;

/**
 * Created by Home-pc on 19.05.2016.
 */
public class Employee {
//    public class Employee {
        private String name;
        private String position;
        private String email;
        private String phoneNumber;
        private long wages;
        private int age;

        public Employee(String name, String position, String email, String phoneNumber, long wages, int age) {
            this.name = name;
            this.position = position;
            this.email = email;
            this.phoneNumber = phoneNumber;
            this.wages = wages;
            this.age = age;
        }


        public void printPerson(){
            System.out.print(name+ " ");
            System.out.print(position+" ");
            System.out.print(email+" ");
            System.out.print(wages+" ");
            System.out.print(age);
            System.out.println(" ");

        }

        public int getAge() {
            return age;
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "name='" + name + '\'' +
                    ", position='" + position + '\'' +
                    ", email='" + email + '\'' +
                    ", phoneNumber=" + phoneNumber +
                    ", wages=" + wages +
                    ", age=" + age +
                    '}';
        }
    }
