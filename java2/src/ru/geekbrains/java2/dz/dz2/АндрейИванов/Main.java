package ru.geekbrains.java2.dz.dz2.АндрейИванов;

/**
 * Created by a.ivanov on 07.06.2016.
 */
public class Main {

    public static void main(String[] args) {

        int[] from = new int[2];
        int[] to = new int[2];
        int figure = 0;
        FactoryChessmen fc = new FactoryChessmen();
        GiveStartInfo giveStartInfo = new GiveStartInfo();
        Chessmen chessmen;

        while (true){
            try {
                figure = giveStartInfo.readFigure();
                break;
            } catch (MyExceptions e) {
                System.out.println(e.getErrorCode() + ": " + e.getMessage());
            }
        }
        while(true) {
            System.out.println("Введите начальные координаты фигуры в формате шахматной доски: (a-h)(1-8) пример - c5.");
            try {
                from = giveStartInfo.readPosition();
                break;
            } catch (MyExceptions e) {
                System.out.println(e.getErrorCode() + ": " + e.getMessage());
            }
        }
        while(true) {
            System.out.println("Введите конечные координаты фигуры в формате шахматной доски: (a-h)(1-8) пример - c5.");
            try {
                to = giveStartInfo.readPosition();
                break;
            } catch (MyExceptions e) {
                System.out.println(e.getErrorCode() + ": " + e.getMessage());
            }
        }
        chessmen = fc.giveChessman(figure);
        System.out.println(chessmen.isRightMove(from, to));
    }
}
