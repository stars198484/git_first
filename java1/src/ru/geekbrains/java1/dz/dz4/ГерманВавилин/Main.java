package ru.geekbrains.java1.dz.dz4.ГерманВавилин;

import java.util.Scanner;

/**
 * Created by I_V_Zhukov on 10.05.2016.
 */
public class Main {
    public static void main(String[] args) {
        int numberOfWorkers = 5;
        Employee[] workers = new Employee[numberOfWorkers];
        workers[0] = new Employee(); //РџСѓСЃС‚РѕР№ РєРѕРЅСЃС‚СЂСѓРєС‚РѕСЂ

        //РёСЃРїРѕР»СЊР·РѕРІР°РЅРёРµ РїР°СЂРµРјРµС‚СЂРёР·РѕРІР°РЅРЅРѕРіРѕ РєРѕРЅСЃС‚СЂСѓРєС‚РѕСЂР° РїРѕ Р¤РРћ, РїРѕС‡С‚Рµ, С‚РµР»РµС„РѕРЅСѓ Рё РІРѕР·СЂР°СЃС‚Сѓ.
        workers[1] = new Employee("Р’Р°РІРёР»РёРЅ Р“РµСЂРјР°РЅ", "mybox@domain.com", "+7(916)000-0000", 31);
        Scanner sc = new Scanner(System.in);
        String full_name;
        String position;
        String email;
        String phone;
        int salary;
        int age;
        for (int i = 2; i < numberOfWorkers; i++) {
            System.out.println("РЎРѕС‚СЂСѓРґРЅРёРє " + (i+1) + " РёР· " + numberOfWorkers);
            System.out.println("Р’РІРµРґРёС‚Рµ Р¤РРћ:");
            full_name = sc.next();
            System.out.println("Р’РІРµРґРёС‚Рµ РґРѕР»Р¶РЅРѕСЃС‚СЊ:");
            position = sc.next();
            System.out.println("Р’РІРµРґРёС‚Рµ email:");
            email = sc.next();
            System.out.println("Р’РІРµРґРёС‚Рµ С‚РµР»РµС„РѕРЅ:");
            phone = sc.next();
            System.out.println("Р’РІРµРґРёС‚Рµ Р·Р°СЂРїР»Р°С‚Сѓ:");
            salary = sc.nextInt();
            System.out.println("Р’РІРµРґРёС‚Рµ РІРѕР·СЂР°СЃС‚:");
            age = sc.nextInt();
            workers[i] = new Employee(full_name, position, email, phone, salary, age); //РџРѕР»РЅС‹Р№ РєРѕРЅСЃС‚СЂСѓРєС‚РѕСЂ
        }

        // Р’С‹РІРµРґРµРј РІСЃРµС… СЃРѕС‚СЂСѓРґРЅРёРєРѕРІ С‡РµСЂРµР· toString;
        for (Employee worker : workers) {
            System.out.println(worker.toString());
        }

        //Р Р°Р±РѕС‚Р°РµРј СЃ СЃРµС‚С‚РµСЂР°РјРё
        workers[3].setAge(40);
        workers[3].setFullName("РџРµС‚СЂРѕРІ РџРµС‚СЂ");
        workers[4].setAge(40);

        //Р’С‹РІРµРґРµРј РІСЃРµС… СЃРѕС‚СЂСѓРґРЅРёРєРѕРІ РІ РІРѕР·СЂР°СЃС‚Рµ 40 Р»РµС‚ РёСЃРїРѕР»СЊР·СѓСЏ РіРµС‚С‚РµСЂ
        System.out.println("РЎРѕС‚СЂСѓРґРЅРёРєРё РІРѕР·СЂР°СЃС‚Р° 40 Р»РµС‚:");
        for (Employee worker : workers) {
            if(worker.getAge() == 40) System.out.println( worker.toString());
        }
    }
}
