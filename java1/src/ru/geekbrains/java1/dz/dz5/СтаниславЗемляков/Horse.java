package ru.geekbrains.java1.dz.dz5.СтаниславЗемляков;

/**
 * Created by Home-pc on 23.05.2016.
 */
public class Horse extends Animals {
    protected Horse(int run_distance, double jump_distance, int swim_distance) {
        super(swim_distance, jump_distance, run_distance);
        this.run_distance = run_distance;
        this.swim_distance = swim_distance;
        this.jump_distance = jump_distance;
    }

    @Override
    public int checkMax_run_distance(int max_run_distance) {
        return super.checkMax_run_distance(50000);
    }

    @Override
    public double checkMax_jump_distance(double max_jump_distance) {
        return super.checkMax_jump_distance(2);
    }

    @Override
    public int checkMax_swim_distance(int max_swim_distance) {
        return super.checkMax_swim_distance(500);
    }
}