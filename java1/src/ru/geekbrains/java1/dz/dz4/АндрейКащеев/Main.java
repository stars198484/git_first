package ru.geekbrains.java1.dz.dz4.АндрейКащеев;

/**
 * Created by I_V_Zhukov on 10.05.2016.
 */
public class Main {
    public static void main(String[] args) {
        Employee[] emparr = new Employee[5];
        for (int i = 0; i < emparr.length; i++) {
            emparr[i] = new Employee("Name "+i,"Dep "+i,"e-mail "+i,"+7"+100*i+100*i+200*i,10000*i+10000,(18+i)*2+1);
            emparr[i].print();
        }
        System.out.println("----------");
        for (int i = 0; i < emparr.length; i++) {
            if (emparr[i].getEmpAge()>40) emparr[i].print();
        }


    }
}
