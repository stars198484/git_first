package ru.geekbrains.java1.dz.dz4.УльянаКриши;

/**
 * Created by I_V_Zhukov on 24.05.2016.
 */
public class Main {
    public static void main(String[] args) {
        Person [] persArray=new Person[5];//создаем и инициализируем массив типа Person
        persArray[0] = new Person ("Ivanov I.I.", "Engineer", "ivivan@mail.ru", "89246785764", 30000, 30);
        persArray[1]=new Person("Petrov P.P", "Leading Engineer", "petpet@mail.ru", "8927678456", 60000, 43);
        persArray[2]=new Person("Alekseev A.A", "Assistent", "aleksal@mail.ru", "89381234567", 15000, 23);
        persArray[3]=new Person("Sidorov S.S", "Director", "sidor@mail.ru", "89234657891", 120000, 45);
        persArray[4]=new Person("Nikolaev N.N", "Manager", "nikolnik@mail.ru", "8152673456", 50000, 31);

//Выводим на консоль тот ( или те) объект(ы) типа Person, возраст которого(ых) больше 40
        for (int i=0; i<persArray.length; i++) {
            if (persArray[i].age >40)

                System.out.println(persArray[i]);
        }

    }
}

