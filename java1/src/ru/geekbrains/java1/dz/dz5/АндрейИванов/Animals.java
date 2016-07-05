package ru.geekbrains.java1.dz.dz5.АндрейИванов;

/**
 * Created by Home-pc on 23.05.2016.
 */
public class Animals {
    private float height_block;
    private int speed_run;
    private int speed_swin;

    public float getHeight_block() {
        return height_block;
    }

    public int getSpeed_run() {
        return speed_run;
    }

    public int getSpeed_swin() {
        return speed_swin;
    }

    public Animals(float height_block, int speed_run, int speed_swin)
    {
        this.height_block = height_block;
        this.speed_run = speed_run;
        this.speed_swin = speed_swin;
    }

    public Animals()
    {

    }

    protected void run() {
        System.out.println("Животное бежит");
    }
    public void swim() {
        System.out.println("Животное плывет");
    }
    public void jump() {
        System.out.println("Животное перепрыгивает препятсвие");
    }

}

