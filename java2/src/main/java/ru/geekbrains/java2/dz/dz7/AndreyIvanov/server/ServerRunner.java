package ru.geekbrains.java2.dz.dz7.AndreyIvanov.server;

/**
 * Created by a.ivanov on 29.06.2016.
 */
public class ServerRunner {

        public static void main(String[] args) {
            SQLHandler.connect();
          //  SQLHandler.fillTable();
            ChatServer chatServer = new ChatServer();
            //SQLHandler.disconnect();
        }
    }



