package ru.geekbrains.java1.dz.dz4.АлександрРожнов;

/**
 * Created by I_V_Zhukov on 24.05.2016.
 */
public class Main {
    public static void main(String[] args) {

        Person [] persArray = new Person[6];

        persArray[0] = new Person("Mark", "QA", "mark@qa.com", 789987, 90, 26);

        persArray[1] = new Person("Alex", "admin", "alex@qa.com", 781187, 95, 26);

        persArray[2] = new Person("Sergey", "Developer", "Sergey@qa.com", 789977, 100, 29);

        persArray[3] = new Person("Ivan", "Manager", "Ivan@qa.com", 785987, 130, 50);

        persArray[4] = new Person("Max", "Developer", "Max@qa.com", 685987, 110, 44);

        persArray[5] = new Person("Alexandr", "Manager", "Alexandr@qa.com", 285987, 127, 39);

        for(int n = 0; n<persArray.length; n++){
            Person currentPerson = persArray[n];

            int age = currentPerson.getAge();
            String name = currentPerson.getName();
            String position = currentPerson.getPosition();
            String email = currentPerson.getEmail();
            int telephonenumber = currentPerson.getTelephonenumber();
            int salary = currentPerson.getSalary();

            if(age>40){
                System.out.println(age + " " + name  + " " + position + " " + email + " " + salary + " " + telephonenumber);
            }
        }
    }
}

