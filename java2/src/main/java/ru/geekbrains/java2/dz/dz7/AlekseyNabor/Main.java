package ru.geekbrains.java2.dz.dz7.AlekseyNabor;

import ru.geekbrains.java2.dz.dz7.AlekseyNabor.Client.Engine;
import ru.geekbrains.java2.dz.dz7.AlekseyNabor.Server.Server;

/**
 * Created by AlekseyN on 18.06.2016.
 */
public class Main {
    public static void main(String[] args) {
        new Thread(new Runnable() { //СТАРТУЕМ СЕРВЕР ЕСЛИ НЕ ЗАПУЩЕН
            @Override
            public void run() {
                    Server server = new Server();
            }
        }).start();
        Engine engine = new Engine("127.0.0.1"); //СТАРТУЕМ КЛИЕНТ
    }
}
