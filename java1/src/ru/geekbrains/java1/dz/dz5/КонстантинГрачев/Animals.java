package ru.geekbrains.java1.dz.dz5.КонстантинГрачев;

/**
 * Created by Home-pc on 23.05.2016.
 */
public class Animals {

    String name;
    int jump;
    int swim;
    int run;
    int speed;
    int voice;

    public Animals(String name,int jump, int swim, int run, int speed, int voice) {
        this.name=name;
        this.jump = jump;
        this.swim = swim;
        this.run = run;
        this.speed = speed;
        this.voice = voice;
    }
    String getname() {
        return name;
    }

    int getjump () {
        return jump;
    }

    int getswim() {
        return swim;
    }

    int getrun() {
        return run;
    }

    int getspeed() {
        return speed;
    }

    int voice() {
        return voice;
    }




    @Override
    public String toString() {
        return "Animals{" +
                name+
                "jump='" + jump + '\'' +
                ", swim='" + swim + '\'' +
                ", run='" + run + '\'' +
                ", speed='" + speed + '\'' +
                ", voice='" + voice + '\'' +
                '}';
    }
}
