package ru.geekbrains.java1.dz.dz1.DmitryPotekhin;

/**
 * Created by I_V_Zhukov on 10.05.2016.
 */
public class Main {
    public static void main(String[] args) {
        byte a = 127;
        short b = 32767;
        int c = 2147483647;
        long d = 9223372036854775807L;
        float e = 435345.6f;
        double f = 8768767.43d;
        boolean g = false;
        char h = 'J';
        String j = "Javastriing";
        System.out.println(MetodRaschet(23.45d, 545.76d, 213.76d, 6534.54d));
        System.out.println(MetodProverka1(3d, 13d));
        System.out.println(MetodVisokosniy(2018));
    }

    private static double MetodRaschet(double a, double b, double c, double d) {//!
        double Resultat = 0d;//!
        Resultat = a * (b + (c / d));//!
        return Resultat;//!
    }

    private static boolean MetodProverka1(double x, double y) {//!
        boolean Resultat = false;//!
        double Summa = x + y;//!
        if (Summa >= 10 & Summa <= 20)
            Resultat = true;
        return Resultat;
    }

    private static boolean MetodVisokosniy(int z) {
        boolean Resultat = false;
        if (z % 400 == 0) {
            Resultat = true;//!
        } else {
            if (z % 100 == 0) {
            } else if (z % 4 == 0) {
                Resultat = true;
            }
            return Resultat;
        }
  return false;

    }
}