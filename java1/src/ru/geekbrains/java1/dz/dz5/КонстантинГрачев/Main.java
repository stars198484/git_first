package ru.geekbrains.java1.dz.dz5.КонстантинГрачев;

/**
 * Created by I_V_Zhukov on 10.05.2016.
 */
public class Main {
    public static void main(String[] args) {

        Animals an1 = new Animals("test",10,20,20,20,20);


        Animals[] persArray= new Animals[3];
        persArray [0] = new Cat("Кошка",10,50,20,30,50);
        persArray[1]= new Dog("Собака",20,30,40,50,60);
        persArray[2]=new Horse("Лошадь",30,50,90,50,60);


//        int jump, int swim, int run, int speed, int voice

        for (int i = 0; i < 3; i++) {
            if (persArray[i].getjump()>an1.getjump())
                System.out.println("животное" + persArray[i].getname() + "совершило" + persArray[i]);
            else
                System.out.println("животное" + persArray[i].getname() + "не может совершить" + persArray[i]);


        }



    }
}





