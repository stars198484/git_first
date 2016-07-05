package ru.geekbrains.java2.dz.dz2.АндрейИванов;

/**
 * Created by a.ivanov on 08.06.2016.
 */
public class FactoryChessmen {

    public Chessmen giveChessman(int figure)
    {
        switch (figure) {
            case 1: return new Pawn();
            case 2: return new Gun();
            case 3: return new Knight();
            case 4: return new Officer();
            case 5: return new Queen();
            case 6: return new King();
            default: return null;
        }
    }
}
