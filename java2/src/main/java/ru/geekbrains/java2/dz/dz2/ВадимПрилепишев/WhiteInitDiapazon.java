package ru.geekbrains.java2.dz.dz2.ВадимПрилепишев;

/**
 * Created by Prilepishev Vadim on 08.06.2016.
 */
public class WhiteInitDiapazon {

    public static String[] whiteDiapazon = new String[16];

    private static WhiteInitDiapazon instance = new WhiteInitDiapazon();

    public static WhiteInitDiapazon getInstance(){
        return instance;
    }

    private WhiteInitDiapazon(){
        setWhitePawnDiapazon();
        setWhiteBishop();
        setWhiteKnight();
        setWhiteOfficer();
        setWhiteQueen();
        setWhiteKing();
    }

    private void setWhitePawnDiapazon() {
        whiteDiapazon[0] = "a2";
        whiteDiapazon[1] = "b2";
        whiteDiapazon[2] = "c2";
        whiteDiapazon[3] = "d2";
        whiteDiapazon[4] = "e2";
        whiteDiapazon[5] = "f2";
        whiteDiapazon[6] = "g2";
        whiteDiapazon[7] = "h2";
    }

    private void setWhiteBishop() {
        whiteDiapazon[8] = "a1";
        whiteDiapazon[9] = "h1";
    }

    private void setWhiteKnight() {
        whiteDiapazon[10] = "b1";
        whiteDiapazon[11] = "g1";
    }

    private void setWhiteOfficer() {
        whiteDiapazon[12] = "c1";
        whiteDiapazon[13] = "f1";
    }

    private void setWhiteQueen() {
        whiteDiapazon[14] = "e1";
    }

    private void setWhiteKing() {
        whiteDiapazon[15] = "d1";
    }
}
