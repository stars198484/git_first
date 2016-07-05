package java1.src.ru.geekbrains.java1.dz.dz7.АндрейСуслов;

import java.util.Scanner;

/**
 * Created by Home-pc on 26.05.2016.
 */
public class HumanPlayer extends Player {
    private Scanner sc = new Scanner(System.in);
    private String name ;
    public HumanPlayer(String name) {
        super();
        this.name = name;
    }

    @Override
    public void turn(GameField fl) {
        System.out.println("Ходит " + getName());
        System.out.println("Введите координаты стрельбы в формате X и Y");
        int x = sc.nextInt() - 1;
        int y = sc.nextInt() - 1;
       if( fl.strike(x, y)){ fl.printField(true);}

    }

    public String getName() {
        return name;
    }
}
