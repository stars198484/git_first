package ru.geekbrains.java1.dz.dz4.АндрейСуслов;

/**
 * Created by I_V_Zhukov on 10.05.2016.
 */
public class Main {
    public static void main(String[] args) {

        Employee[] emploeeArray1 = new Employee[5];

        emploeeArray1[0]= new Employee("Shemenkov.A.R",18,"+79164322980","email","engineer",30000);
        emploeeArray1[1]= new Employee("Semenov.S.A.",26,"79152875602","email","engineer",50000);
        emploeeArray1[2]= new Employee("Volkov D.D.",25,"79135972465","email","engineer",60000);
        emploeeArray1[3]= new Employee("Sidorov P.P",45,"79125792657","email","engineer",80000);
        emploeeArray1[4]= new Employee("Petrov A.V.",50,"79178432165","email","director",900000);

        for (int i = 0; i <5 ; i++) {
            if (emploeeArray1[i].getAge() > 40)
            {emploeeArray1[i].information(); }

        }

    }
}
