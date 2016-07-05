package ru.geekbrains.java1.dz.dz4.ArturEpshtein;

/**
 * Created by I_V_Zhukov on 10.05.2016.
 */
public class Main {
    public static void main(String[] args) {
    Employee e1 = new Employee("Иванов Иван Иванович", "Директор", "Директор@email.com", 378903030, 30000, 50);
    Employee e2 = new Employee("Петров Петр Петрович", "Друг Директора", "ДругДиректора@email.com", 371275203, 20000, 45);
    Employee e3 = new Employee("Степанюк Степан Степанович", "Начальник", "Начальник@email.com", 371863153, 17000, 38);
    Employee e4 = new Employee("Незнайка Артур Болбесович", "Менеджер", "Менеджер@email.com", 371248543, 14000, 33);
    Employee e5 = new Employee("Летюков Василий Батькович", "Уборщик", "ДругДиректора@email.com", 374906203, 5000, 68);

//    System.out.println(e1);
//    System.out.println(e2);
//    System.out.println(e3);
//    System.out.println(e4);
//    System.out.println(e5);

        Employee[] persArray = new Employee[5]; // Вначале объявляем массив объектов
    persArray[0] = e1;
    persArray[1] = e2;
    persArray[2] = e3;
    persArray[3] = e4;
    persArray[4] = e5;

//        for (Employee employee : persArray) {
//            if (employee.getAge() > 40) {
//                System.out.println(employee);
//            }
//        }

//        Arrays.stream(persArray)
//                .filter(item -> item.getAge() > 40)
//                .map(item -> item.getFullname())
//                .forEach(System.out::println);
}
}
