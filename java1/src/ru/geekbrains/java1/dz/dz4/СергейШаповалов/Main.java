package ru.geekbrains.java1.dz.dz4.СергейШаповалов;

/**
 * Created by I_V_Zhukov on 10.05.2016.
 */
public class Main {
    public static void main(String[] args) {
        Employee[] staff = new Employee [5];//тут обьявляем массив обьектов
        staff[0]= new Employee("Adams E.F.","s.engineer","adams_ef@post.com","88002000600",75000,35);// тут и следующие 4 строки создаем объекты с инициализацией
        staff[1]= new Employee("Frost M.A.","sgt","frost_ma@post.com","88002000601",60000,38);
        staff[2]= new Employee("Brown K.S.","rct","brown_ks@post.com","88002000602",45000,42);
        staff[3]= new Employee("Thorn A.A.","chief","thorn_aa@post.com","88002000603",65000,44);
        staff[4]= new Employee("Teylor J.E.","m.engineer","teylor_je@post.com","88002000604",75000,50);

        for(int i=0;i<staff.length;i++){//делаем цикл для езды по всему массиву
            Employee e = staff[i];//кладем значения каждого элемента массива в переменную е класса емплое, что позволит сократить код вывода на печать с staff[i].get* до записи вида e.get*
            if (e.getAge()>40) {//прикручиваем условие для вывода на печать сотрудников с возрастом 40+
                System.out.println("имя " + e.getName() + " должность " + e.getPosition() + " почта " + e.getEmail() + " телефон " + e.getPhoneNamber() + " зарплата " + e.getSalary() + " возраст " + e.getAge());
            }
        }
        System.out.println("------------------------------------------"); //визуально отделяет вывод на печать всех и тех кому за 40
        for(int i=0;i<staff.length;i++) {//повторим
            Employee e = staff[i];
            System.out.println("имя " + e.getName() + " должность " + e.getPosition() + " почта " + e.getEmail() + " телефон " + e.getPhoneNamber() + " зарплата " + e.getSalary() + " возраст " + e.getAge());
            //строкой выше вывели всех сотрудников
        }
    }
}
//вот и все дела, оп оп