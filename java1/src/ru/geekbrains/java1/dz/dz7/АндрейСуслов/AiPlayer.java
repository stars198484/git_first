package java1.src.ru.geekbrains.java1.dz.dz7.АндрейСуслов;

import java.util.Random;

/**
 * Created by Home-pc on 26.05.2016.
 */
public class AiPlayer extends Player {
    private Random rand = new Random();
    private String name ;
    public AiPlayer(String name) {
        super();
        this.name = name;
    }

    @Override
    public void turn(GameField gameField) {
        System.out.println("Ходит " + getName());
        int x = rand.nextInt(10);
        int y = rand.nextInt(10);
        if( gameField.strike(x, y)){ gameField.printField(true); this.turn(gameField);}
    }

    public String getName() {
        return name;
    }
}
