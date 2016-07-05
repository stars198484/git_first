package ru.geekbrains.java1.dz.dz5.АлександрРублевский;

/**
 * Created by I_V_Zhukov on 10.05.2016.
 */
public class Main {

    public static void main(String[] args) {
        Animals animal = new Animals();
        Cat animalData0 = new Cat();
        Dog animalData1 = new Dog();
        Horse animalData2 = new Horse();
        animalData1.color = "Red";
        animalData1.name = "Baks";
        animalData2.color = "Black";
        animalData2.name = "Ponny";
        animalData0.color = "White";
        animalData0.name = "Barsik";
        animalData0.showNameAndColor();
        animalData1.showNameAndColor();
        animalData2.showNameAndColor();
        animal.voice();
        animalData0.voice();
        animalData1.voice();
        animalData2.voice();
        animal.jump();
        animalData0.jump();
        animalData1.jump();
        animalData2.jump();
        animal.swim();
        animalData0.swim();
        animalData1.swim();
        animalData2.swim();
        animal.ran();
        animalData0.ran();
        animalData1.ran();
        animalData2.ran();

    }
}
