package java1.src.ru.geekbrains.java1.dz.dz7.АндрейСуслов;



/**
 * Created by Home-pc on 26.05.2016.
 */
public class Main {
    public static void main(String[] args) {
        int a;
        java.util.Scanner scan = new java.util.Scanner(System.in);
        System.out.println("Выберите режим игры");
        System.out.println("1.Человек ИИ");
        System.out.println("2.Человек Человек");
        System.out.println("3.ИИ ИИ");
        a = scan.nextInt();

        Player p1;
        Player p2;
        switch (a)
        {case 1:   p1 = new HumanPlayer("Человек");
                   p2 = new AiPlayer("Компьютер"); break;
            case 2:   p1 = new HumanPlayer("Человек1");
                 p2 = new HumanPlayer("Человек2"); break;
            case 3:   p1 = new AiPlayer("Компьютер1");
                 p2 = new AiPlayer("Компьютер2"); break;
            default: p1 = new HumanPlayer("Человек");
                p2 = new AiPlayer("Компьютер");
        }

        p1.getGameField().printField(true);
        while (true) {
            p1.turn(p2.getGameField());
            p2.getGameField().printField(true);
            if (p2.getGameField().isDefeated()) {System.out.println("Победил " + p1.getName()); break;};
            p2.turn(p1.getGameField());
            p1.getGameField().printField(true);
            if (p1.getGameField().isDefeated()) {System.out.println("Победил " + p2.getName()); break;}
        }
    }
}
