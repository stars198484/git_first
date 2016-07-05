package ru.geekbrains.java1.dz.dz4.ИльяФиалковский;

/**
 * Created by I_V_Zhukov on 10.05.2016.
 */
public class Main {
    public static void main(String[] args) {
        Employee[] workArr = new Employee[5];
        workArr[0] = new Employee("Вася","Контакт-центр","intrash@none.ru","89012345678",25000,25);
        workArr[1] = new Employee("Петя","Слесарь","inmake@none.ru","89012345687",28000,39);
        workArr[2] = new Employee("Коля","Кладовщик","input@none.ru","89012345876",30000,41);
        workArr[3] = new Employee("Даша","Секретарь","inmove@none.ru","89012354678",50000,42);
        workArr[4] = new Employee("Лёша","Директор","indo@none.ru","89012346578",250000,42);

        for(int i=0;i<5;i++){
            if(workArr[i].getAge()>40) System.out.println(workArr[i]);
            // System.out.println( workArr[i].toStringGetAge()); //-для вывода, если надо больше одного модуля, например
        }
    }
}
