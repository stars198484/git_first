package ru.geekbrains.java2.dz.dz7.МамаевИгорь.Server;

import java.sql.*;

/**
 * Created by Игорь on 30.06.2016.
 */
public class SQLHandler {
    private static Connection conn;
    private static PreparedStatement stmt;
    private static final String dbUrl = "jdbc:postgresql://127.0.0.1:5432/postgres";
    private static final String user = "postgres";
    private static final String password = "mamaev23021992";

    public static void connect() {
        try {
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection(dbUrl,user,password);
        } catch (Exception c) {
            System.out.println("Connection Error");
            c.printStackTrace();
        }
    }

    public static void disconnect() {
        try {
            conn.close();
        } catch (Exception c) {
            System.out.println("Connection Error");
        }
    }


    public static String getNickByLoginPassword(String login, String password) {
        String w = null;
        try {
            stmt = conn.prepareStatement("SELECT nickname FROM main WHERE login = ? AND password = ?;");
            stmt.setString(1, login);
            stmt.setString(2, password);
            ResultSet rs = stmt.executeQuery();
            if(rs.next())
                w = rs.getString("nickname");
        } catch (SQLException e) {
            System.out.println("SQL Query Error");
        }
        System.out.println(w);
        return w;
    }


    public static void registration(String login, String password, String nick) {
        try {
            stmt = conn.prepareStatement("INSERT INTO main(login, password, nickname) VALUES (?, ?, ?)");
            stmt.setString(1, login);
            stmt.setString(2, password);
            stmt.setString(3, nick);
            stmt.execute();
            System.out.println("add ok");
        } catch (SQLException e) {
                        System.out.println("SQL Query Error");
            e.printStackTrace();
        }

    }
}
