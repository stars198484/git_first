package ru.geekbrains.java1.dz.dz5.ВладимирПутянис;

/**
 * Created by I_V_Zhukov on 10.05.2016.
 */
public class Main {
   public static void main(String[] args)
   {
      Animals arAnimals[] = new Animals[3];

      arAnimals[0] = new Dog();
      arAnimals[1] = new Cat();
      arAnimals[2] = new Horse();

      for (Animals animal : arAnimals)
      {
         System.out.println( animal.toSwim() ? "can" : "can't" );
      }
      System.out.println();
      for (Animals animal : arAnimals)
      {
         System.out.println( animal.toJump(2) ? "can" : "can't" );
      }
      System.out.println();
      for (Animals animal : arAnimals)
      {
         animal.toRun();
      }
   }
}