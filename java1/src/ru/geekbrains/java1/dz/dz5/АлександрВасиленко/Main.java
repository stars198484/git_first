package ru.geekbrains.java1.dz.dz5.АлександрВасиленко;

/**
 * Created by I_V_Zhukov on 24.05.2016.
 */
public class Main {
    public static void main(String[] args) {

        //Создадим массив животных
        Animals [] arrAnimals = new Animals[3];
        arrAnimals[0] = new Dog();
        arrAnimals[1] = new Cat();
        arrAnimals[2] = new Horse();

        for (double j = 0.5; j < 3; j+=0.5) {//высота препятсвия
            //посмотрим, как животные выполняют ту или иную команду.
            for (int i = 0; i < arrAnimals.length; i++) {
                arrAnimals[i].run();
                arrAnimals[i].swim();
                arrAnimals[i].jump(j);
                System.out.println();
            }
        }



    }

}

