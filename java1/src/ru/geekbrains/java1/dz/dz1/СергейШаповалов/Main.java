package ru.geekbrains.java1.dz.dz1.СергейШаповалов;

/**
 * Created by I_V_Zhukov on 10.05.2016.
 */
public class Main {
    public static void main(String[] arg) {
        //Создаем переменные всех пройденных типов данных, и инициализируем их значения;
        byte f = 125;
        short g = -32750;
        int x = 75240;
        long i = 9223685;
        float j = 6;
        double k = 8;
        boolean l = false;
        char m = 'ц';
        String n = "hhh";
        //Ниже будут осуществляться проверки вывода, так я сам себя проверяю..))
        //Проверяем вывод всех созданных элементов через запятую.
        System.out.println(f+", "+g+", "+x+", "+i+", "+j+", "+k+", "+l+", "+m+", "+n);
        //Делаем проверочный вывод методов summ и summ2
        System.out.println(summ(10, 10, 10, 10));
        System.out.println(summ2(9, 12));
        //Делаем проверочный вывод метода yearV
        System.out.println(yearV(2016));
    }
    //Создаем метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
    // где a,b,c,d – входные параметры этого метода;
    private static int summ(int a, int b, int c, int d){
        return a * (b + (c / d));//!
    }
    //Создаем метод, принимающий на вход два числа, и проверяющий что их сумма лежит
    // в пределах 10 до 20, если да – вернуть true, в противном случае – false
    private static boolean summ2(int a, int b){
        if((a + b) > 10 & (a + b) < 20) {
            return true;
        }else {//!
            return false;
        }
    }
    //Создаем метод, который определяет является ли год високосным. Каждый 4-й год является високосным,
    // кроме каждого 100-го, при этом каждый 400-й – високосный.
    private static String yearV(int a){
        if(a%4==0 && a%100 !=0 || a%400==0){
            return "Год високосный";
        }else {
            return "Год не високосный";
        }
    }

}
