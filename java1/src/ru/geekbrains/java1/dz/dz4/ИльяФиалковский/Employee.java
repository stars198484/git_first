package ru.geekbrains.java1.dz.dz4.ИльяФиалковский;

/**
 * Created by Home-pc on 19.05.2016.
 */
public class Employee {
//    public class Employee {
        String name, prof, email, phone;
        int money, age;

   /* public Employee() { // базовый конструктор
        name = "Иванов Иван Иванович";
        prof = "Разнорабочий";
        email = "none@none.ru";
        phone = "89876543210";
        money = 20000;
        age = 28;
    }*/

        public Employee(String name, String prof,String email,String phone,int money, int age) {
            this.name = name;
            this.prof = prof;
            this.email = email;
            this.phone = phone;
            this.money = money;
            this.age = age;
        }

        public int getAge(){
            return age;
        }

        public String toString(){
            return (" || Имя: "+name+" || Профессия: "+prof+" || Почта: "+email+" || Телефон: "+phone+" || Зарплата: "+money+" || Возраст: "+age+" ||");
        }

   /*public String toStringGetAge(){ // для вывода дополнительно
        return (" || Возраст: "+age+" ||");
    }*/

    }