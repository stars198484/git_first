package ru.geekbrains.java1.dz.dz4.СтаниславЗемляков;

/**
 * Created by I_V_Zhukov on 24.05.2016.
 */
public class Main {
    public static void main(String[] args) {
        Person[] mas = new Person[5];
        mas[0] = new Person("Muhammad Ali", "Director", "muha.v.uhe@mail.ru", "89117660880", "$100 000", 55);
        mas[1] = new Person("Taji Murat", "Sorcerer", "mag.i.tank@mail.ru", "89115579313", "$10", 97);
        mas[2] = new Person("Kuzma Filatov", "Barman", "lampogoloviy@mail.ru", "89549789797", "$500", 30);
        mas[3] = new Person("Olga Genina", "Gogo girls", "kissmyb-52@yandex.ru", "89719557618", "2500/hour", 20);
        mas[4] = new Person("Baba Shura", "Babulya", "marfusha@yandex.ru", "88123162251", "$107", 65);
        for (int x = 0; x < mas.length; x++) {
            if(Person.AGE >60)
                System.out.println(mas[x].getPerson()); // РІС‹РґР°С‘С‚ С‚РѕР»СЊРєРѕ Р±Р°Р±СѓР»СЋ, РЅРµ Р·РЅР°СЋ, РїРѕС‡РµРјСѓ
        }
    }
}
