package ru.geekbrains.java1.dz.dz4.ИгорьМамаев;

/**
 * Created by I_V_Zhukov on 10.05.2016.
 */
public class Main {
    public static void main(String[] args) {
        Employee[] employyeArr = {
                new Employee("John Smith", "Senior Java developer", "smith@mail.ru", "+74955554345", 120000, 24),
                new Employee("Bob Black", "Cleaning manager", "black@mail.ru", "+79995551122", 12000, 34),
                new Employee("Lila Jain", "Manager", "lila@yandex.ru", "+73335554466", 34500, 43),
                new Employee("Steve Jobs", "SEO", "steve@apple.ru", "+16754443322", 3000000, 56),
                new Employee("Rick Grimes", "policeman", "loveatlanta@gmail.com", "+72223334455", 46000.24, 40)
        };

        for (Employee e:employyeArr){
            if (e.getAge()>40){
                System.out.println(e);
            }
        }
    }
}

