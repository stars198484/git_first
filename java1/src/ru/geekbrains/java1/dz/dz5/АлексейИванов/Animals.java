package ru.geekbrains.java1.dz.dz5.АлексейИванов;

/**
 * Created by Home-pc on 23.05.2016.
 */
public class Animals {
    String kind;
    double highJump=0;
    double runlength =0;
    boolean swimskill=false;
    String sound="Животное издало звук";


    public void jump(int high) {
        System.out.println((highJump >= high  ? "перепрыгну " : "не перепрыгну ") + high +" метровую преграду" );
    }

    void voice() {
        System.out.println(sound);
    }

    void getKing() {
        System.out.println("Привет, я "+kind);
    }

    void getSwimSkill() {
        System.out.println(swimskill ? "Я умею плвать :)" : "Я не умею плавать :(");
    }

    void runDist(int distanse) {
        System.out.println((runlength >= distanse ? "пробегу " : "не пробегу " )+distanse+" метров");
    }

}

