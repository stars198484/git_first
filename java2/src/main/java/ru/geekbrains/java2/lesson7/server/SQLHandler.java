package ru.geekbrains.java2.lesson7.server;import java.sql.*;

public class SQLHandler {
    private static Connection conn;
    private static PreparedStatement stmt;
    private static final String dbUrl = "jdbc:postgresql://127.0.0.1:5433/postgres";
    private static final String user = "postgres";
    private static final String password = "postgres";

    public static void connect() {
        try {
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection(dbUrl,user,password);
        } catch (Exception c) {
            System.out.println("Connection Error");
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
        return w;
    }

    public static void fillTable() {
        try {
            for (int i = 0; i < 20; i++) {
                stmt = conn.prepareStatement("INSERT INTO main (login, password, nickname) VALUES (?, ?, ?)");
                stmt.setString(1, "login" + i);
                stmt.setString(2, "pass" + i);
                stmt.setString(3, "nick" + i);
                stmt.execute();
            }
        } catch (SQLException e) {
        }
    }
}
