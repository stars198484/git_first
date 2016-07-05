package ru.geekbrains.java1.dz.dz5.АлександрАнатольевичСмирнов;

/**
 * Created by I_V_Zhukov on 24.05.2016.
 */
public class Main {
    public static void main(String[] args) {

        Animals[] animalArr = new Animals[6];
        animalArr[0] = new Dog("Сорбонна", 55f, 1.2f);
        animalArr[1] = new Dog("Берта", 50f, 0.9f);
        animalArr[2] = new Cat("Гепард", 120f, 3f);
        animalArr[3] = new Cat("Снежинка", 18f, 2.5f);
        animalArr[4] = new Horse("Мадлен", 50f, 2.2f);
        animalArr[5] = new Horse("Гроза", 52f, 2.3f);

        System.out.println();
        System.out.println("Дана команда \"Голос\"");
        for (Animals item : animalArr) item.voice();

        System.out.println();
        System.out.println("Дана команда \"Взять\"");
        for (Animals item : animalArr) item.race();

        System.out.println();
        System.out.println("Дана команда \"Плыть\"");
        for (Animals item : animalArr) item.sail();

        System.out.println();
        System.out.println("Дана команда \"Барьер\"");
        for (Animals item : animalArr) item.jump();

    }
}
