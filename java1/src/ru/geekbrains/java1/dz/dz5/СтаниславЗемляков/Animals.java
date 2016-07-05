package ru.geekbrains.java1.dz.dz5.СтаниславЗемляков;

/**
 * Created by Home-pc on 23.05.2016.
 */
public class Animals {

    int run_distance;
    int swim_distance;
    double jump_distance;
    int max_run_distance;
    int max_swim_distance;
    double max_jump_distance;
    String s1 = "";
    String s2 = "";
    String s3 = "";

    public Animals(int swim_distance, double jump_distance, int run_distance) {
        this.swim_distance = swim_distance;
        this.jump_distance = jump_distance;
        this.run_distance = run_distance;
    }

    public int checkMax_run_distance(int max_run_distance) {
        if (run_distance <= max_run_distance)
            return run_distance;
        else {
            s1 = " and will die from exhaust.";
            return max_run_distance;
        }
    }

    public double checkMax_jump_distance(double max_jump_distance) {
        if (jump_distance <= max_jump_distance)
            return jump_distance;
        else {
            s2 = " and will hit the fence.";
            return max_jump_distance;
        }
    }

    public int checkMax_swim_distance(int max_swim_distance) {
        if (swim_distance <= max_swim_distance)
            return swim_distance;
        else {
            s3 = " and will drown.";
            return max_swim_distance;
        }
    }
}