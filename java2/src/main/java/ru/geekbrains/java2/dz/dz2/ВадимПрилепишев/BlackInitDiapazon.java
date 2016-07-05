package ru.geekbrains.java2.dz.dz2.ВадимПрилепишев;

/**
 * Created by Prilepishev Vadim on 08.06.2016.
 */
public class BlackInitDiapazon {

    public static String[] blackDiapazon = new String[16];

    private static BlackInitDiapazon instance = new BlackInitDiapazon();

    public static BlackInitDiapazon getInstance(){
        return instance;
    }

    private BlackInitDiapazon(){
        setBlackPawnDiapazon();
        setBlackBishop();
        setBlackKnight();
        setBlackOfficer();
        setBlackQueen();
        setBlackKing();
    }

    private void setBlackPawnDiapazon() {
        blackDiapazon[0] = "a7";
        blackDiapazon[1] = "b7";
        blackDiapazon[2] = "c7";
        blackDiapazon[3] = "d7";
        blackDiapazon[4] = "e7";
        blackDiapazon[5] = "f7";
        blackDiapazon[6] = "g7";
        blackDiapazon[7] = "h7";
    }

    private void setBlackBishop() {
        blackDiapazon[8] = "a8";
        blackDiapazon[9] = "h8";
    }

    private void setBlackKnight() {
        blackDiapazon[10] = "b8";
        blackDiapazon[11] = "g8";
    }

    private void setBlackOfficer() {
        blackDiapazon[12] = "c8";
        blackDiapazon[13] = "f8";
    }

    private void setBlackQueen() {
        blackDiapazon[14] = "e8";
    }

    private void setBlackKing() {
        blackDiapazon[15] = "d8";
    }
}