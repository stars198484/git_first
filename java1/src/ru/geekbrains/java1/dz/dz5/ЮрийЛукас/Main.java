package ru.geekbrains.java1.dz.dz5.ЮрийЛукас;

/**
 * Created by I_V_Zhukov on 10.05.2016.
 */
public class Main {
    public static void main(String[] args) {

        Animals animals[] = new Animals[5];

        animals[0] = new Cat("Мурзик", 0, 4,0);
        animals[1] = new Dog("Шарик",2,3,3);
        animals[2] = new Horse("Лошарик", 2,4,5);
        animals[3] = new Dog("Фани",1,4,2);
        animals[4] = new Cat("Мурка",0,4,0);

        for(Animals item: animals){
            item.jump(3,3);
        }

        System.out.println("------------------------------");

        for(Animals item: animals){
            item.swim();
        }

        System.out.println("------------------------------");

        for(Animals item: animals){
            item.voice();
        }
    }
}
