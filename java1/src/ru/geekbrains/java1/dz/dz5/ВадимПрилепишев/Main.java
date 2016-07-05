package ru.geekbrains.java1.dz.dz5.ВадимПрилепишев;

/**
 * Created by I_V_Zhukov on 10.05.2016.
 */
public class Main {
   public static void main(String[] args) {

      Animals animal[] = new Animals[3];

      animal[0] = new Dog();
      animal[1] = new Cat();
      animal[2] = new Horse();

      double height = 0.5;

      for(Animals a:animal){
         a.run();
         a.swim();
         a.jump(height);
         height++;
      }
   }
}
