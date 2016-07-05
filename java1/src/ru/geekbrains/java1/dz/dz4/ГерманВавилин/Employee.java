package ru.geekbrains.java1.dz.dz4.ГерманВавилин;

/**
 * Created by Home-pc on 19.05.2016.
 */
public class Employee {
//    public class Employee {
        private String fullName;
        private String position;
        private String email;
        private String phone;
        private int salary;
        private int age;

        //РљРѕРЅСЃС‚СЂСѓРєС‚РѕСЂ СЃСЂРµРґРЅРµСЃС‚Р°С‚РёСЃС‚РёС‡РµСЃРєРѕРіРѕ СЃРѕС‚СЂСѓРґРЅРёРєР°
        public Employee(){
            this.fullName = "РРІР°РЅРѕРІ РРІР°РЅ";
            this.position = "РџСЂРѕРіСЂР°РјРјРёСЃС‚";
            this.email = "Employeeal_mailbox@our_domain.com";
            this.phone = "+7(000)000-00-00";
            this.salary = 65000;
            this.age = 30;
        }

        //РљРѕРЅСЃС‚СЂСѓРєС‚РѕСЂ РґР»СЏ РёРЅРёС†РёР°Р»РёР·Р°С†РёРё РѕР±СЉРµРєС‚Р° РїРѕ РІСЃРµРј РїРѕР»СЏРј
        public Employee(String fullName, String position, String email, String phone, int salary, int age) {
            this.fullName = fullName;
            this.position = position;
            this.email = email;
            this.phone = phone;
            this.salary = salary;
            this.age = age;
        }

        //РљРѕРЅСЃС‚СЂСѓРєС‚РѕСЂ РґР»СЏ РёРЅРёС†РёР°Р»РёР·Р°С†РёРё С‚РѕР»СЊРєРѕ РїРѕ Р¤РРћ, РїРѕС‡С‚Рµ, С‚РµР»РµС„РѕРЅСѓ Рё РІРѕР·СЂР°СЃС‚Сѓ
        public Employee(String fullName, String email, String phone, int age) {
            this();
            this.fullName = fullName;
            this.email = email;
            this.phone = phone;
            this.age = age;
        }

        //РќР°Р±РѕСЂ СЃРµС‚С‚РµСЂРѕРІ РґР»СЏ РІСЃРµС… РїРѕР»РµР№ РєР»Р°СЃСЃР°
        public void setFullName(String fullName) {
            if(fullName.equals("")) System.out.println("\nРќРµ РјРѕР¶РµС‚ Р±С‹С‚СЊ РїСѓСЃС‚С‹Рј:");
            else this.fullName = fullName;
        }

        public void setPosition(String position) {
            if(position.equals("")) System.out.println("\nРќРµ РјРѕР¶РµС‚ Р±С‹С‚СЊ РїСѓСЃС‚РѕР№:");
            else this.position = position;

        }

        public void setEmail(String email) {
            if(email.equals("")) System.out.println("\nРќРµ РјРѕР¶РµС‚ РјРµРЅСЊС€Рµ РїСѓСЃС‚С‹Рј:");
            else this.email = email;
        }

        public void setPhone(String phone) {
            if(phone.equals("")) System.out.println("\nРќРµ РјРѕР¶РµС‚ Р±С‹С‚СЊ РїСѓСЃС‚С‹Рј:");
            else this.phone = phone;
        }

        public void setSalary(int salary) {
            if(salary < 0) System.out.println("\nРќРµ РјРѕР¶РµС‚ Р±С‹С‚СЊ РјРµРЅСЊС€Рµ 0:");
            else this.salary = salary;
        }

        public void setAge(int age) {
            if(age < 14) System.out.println("\nРќРµ РјРѕР¶РµС‚ Р±С‹С‚СЊ РјРµРЅСЊС€Рµ 14:");
            else this.age = age;
        }

        int getAge() {
            return age;
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "fullName='" + fullName + '\'' +
                    ", position='" + position + '\'' +
                    ", email='" + email + '\'' +
                    ", phone='" + phone + '\'' +
                    ", salary='" + salary + '\'' +
                    ", age=" + age +
                    '}';
        }
    }
