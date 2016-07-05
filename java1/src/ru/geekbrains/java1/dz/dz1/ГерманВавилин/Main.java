package ru.geekbrains.java1.dz.dz1.ГерманВавилин;

/**
 * Created by I_V_Zhukov on 10.05.2016.
 */
public class Main {
    public static void main(String[] args){
        byte a = 100;
        short b = 15000;
        int c = 102598;
        long k = 9852441L;
        float l = 200.5f;
        double m = 500.55d;
        boolean n = false;
        char x = 'x';
        String y = "Java";

        System.out.println("РџРµСЂРµРјРµРЅРЅР°СЏ a С‚РёРїР° byte = " + a);
        System.out.println("РџРµСЂРµРјРµРЅРЅР°СЏ b С‚РёРїР° short = " + b);
        System.out.println("РџРµСЂРµРјРµРЅРЅР°СЏ c С‚РёРїР° int = " + c);
        System.out.println("РџРµСЂРµРјРµРЅРЅР°СЏ k С‚РёРїР° long = " + k);
        System.out.println("РџРµСЂРµРјРµРЅРЅР°СЏ l С‚РёРїР° float = " + l);
        System.out.println("РџРµСЂРµРјРµРЅРЅР°СЏ m С‚РёРїР° double = " + m);
        System.out.println("РџРµСЂРµРјРµРЅРЅР°СЏ n С‚РёРїР° boolean = " + n);
        System.out.println("РџРµСЂРµРјРµРЅРЅР°СЏ x С‚РёРїР° char = " + x);
        System.out.println("РџРµСЂРµРјРµРЅРЅР°СЏ y С‚РёРїР° String = " + y + "\n");


        System.out.println("a * (b + (c / d))  = " + calculator(1, 2, 3, 4));
        System.out.println("\n");
        System.out.println("РЎСѓРјРјР° a Рё b РІ РїСЂРµРґРµР»Р°С… РѕС‚ 10 РґРѕ 20? - " + sumVerify(10, 15));

        System.out.println("\n");
        yearLeapChecker(2016);
        yearLeapChecker(2000);
        yearLeapChecker(2100);
        yearLeapChecker(400);
        yearLeapChecker(100);
        yearLeapChecker(16);
    }
    private static double calculator (float a, float b, float c, float d) {
        if (d != 0)  return a * (b + (c / d));
        else {
            System.out.println("Р”РµР»РёС‚РµР»СЊ РЅРµ РјРѕР¶РµС‚ Р±С‹С‚СЊ 0. Р РµР·СѓР»СЊС‚Р°С‚ РЅРµРґРµР№СЃС‚РІРёС‚РµР»РµРЅ.");
            return 0.0f;
        }
    }

    private static boolean sumVerify (int a, int b){
        if((a + b >= 10)&&(a + b <= 20)) return true;
        else return false;
    }

    private static void yearLeapChecker (int year) {

        if(year < 0){
            System.out.println("Р“РѕРґ РЅРµ РјРѕР¶РµС‚ Р±С‹С‚СЊ РѕС‚СЂРёС†Р°С‚РµР»СЊРЅС‹Рј!");
            return;
        }
        boolean isLeap;
        if(year % 400 == 0){
            isLeap = true;
        }
        else if((year % 4 == 0) && !(year % 100 == 0)) {
            isLeap = true;
        }
        else isLeap = false;
        if(isLeap) System.out.println("Р“РѕРґ " + year + " СЏРІР»СЏРµС‚СЃСЏ РІРёСЃРѕРєРѕСЃРЅС‹Рј");
        else System.out.println("Р“РѕРґ " + year + " РЅРµ СЏРІР»СЏРµС‚СЃСЏ РІРёСЃРѕРєРѕСЃРЅС‹Рј");
    }
}
