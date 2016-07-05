package ru.geekbrains.java1.dz.dz4.ВладимирПутянис;

/**
 * Created by I_V_Zhukov on 10.05.2016.
 */
public class Main {
   public static void main(String[] args)
   {
      Employee[] arEmployees = new Employee[5];

      for (int n = 0; n < 5; n++)
      {
         arEmployees[n] = new Employee("Name " + n, "Position " + n, "mail" + n + "@mail.mail", "+7 900 000 00 0" + n, (10000f * (n + 1)), (20 + 10 * (n + 1)));
      }

      for (int i = 0; i < arEmployees.length; i++)
      {
         if (arEmployees[i].getAge() > 40)
         {
            arEmployees[i].print();
         }
      }
   }
}
