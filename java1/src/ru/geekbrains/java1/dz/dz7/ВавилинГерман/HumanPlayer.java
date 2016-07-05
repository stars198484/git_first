package ru.geekbrains.java1.dz.dz7.ВавилинГерман;



import java.util.Scanner;

/**
 * Created by gta5 on 26.05.2016.
 */
public class HumanPlayer extends Player {
    String name;
    private Scanner sc = new Scanner(System.in);

    public HumanPlayer() { super(); }
    public HumanPlayer(String name) {
        super();
        this.name = name;
    }

    @Override
    public void turn(GameField field, boolean isVisible) {
        int x,y;
        System.out.println("Ходит " + this.getName());
        do {
            System.out.println("Ход - " + Main.count);
            do {
                System.out.println("Введите координаты стрельбы в формате X и Y");
                x = sc.nextInt() - 1;
                y = sc.nextInt() - 1;
            } while ((!isXYCorrect(x, y)) || field.getPoint(x, y) == 'X');

            field.strike(x, y);
            Main.count++;
            field.printField(isVisible);
        } while(field.getPoint(x, y) == 'X' & !field.isDefeated());

    }

    private boolean isXYCorrect (int x, int y) {
        if((x < 0) || (x > 9) || (y < 0) ||(y > 9)) return false;
        return true;
    }
    public String getName() {return this.name;}

}
