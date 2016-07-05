package ru.geekbrains.java2.dz.dz1.ПавелСуходоев;

/**
 * Created by xcyxoux on 09.06.16.
 */
public class Main {
    public static void main(String[] args) {
        Player player = new Player();


        Figure[] figures = new Figure[6];
        figures[0] = new Bishop();
        figures[1] = new Rook();
        figures[2] = new Queen();
        figures[3] = new King();
        figures[4] = new Knight();
        figures[5] = new Pawn();

        System.out.println("0 - Слон, 1 - Ладья, 2 - Ферзь, 3 - Король, 4 - Конь, 5 - Пешка ");
        int figureId;
        do {
            System.out.println("Выберите фигуру: ");
            figureId = player.selectFigure();
        } while (figureId < 0 | figureId >= figures.length);

        Turn turn = new Turn();
        do {
            System.out.println("Введите начальную координату: ");
            turn.from = player.getCoordinate();
        } while (turn.from.x == 0 | turn.from.y == 0);

        do {
            System.out.println("Введите конечную координату: ");
            turn.to = player.getCoordinate();
        } while (turn.to.x == 0 | turn.to.y == 0);

        if (figures[figureId].isRightMove(turn)) {
            System.out.println(figures[figureId].name + " может так ходить");
        } else {
            System.out.println(figures[figureId].name + " не может так ходить");
        }

    }
}
