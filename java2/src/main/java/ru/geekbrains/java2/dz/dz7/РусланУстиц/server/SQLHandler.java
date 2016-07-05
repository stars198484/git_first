package ru.geekbrains.java2.dz.dz7.РусланУстиц.server;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.*;
import java.util.Properties;

/**
 * Created by darky_000 on 28.06.2016.
 */
public class SQLHandler {

    private static Connection connection;
    private static PreparedStatement statement;

    public static void connect() {
        Properties dbProperties = new Properties();
        try  {
            InputStream in = Files.newInputStream(Paths.get("D:\\Projects\\geekbrains\\src\\main\\java\\ru\\geekbrains\\java2\\dz\\dz7\\РусланУстиц\\server\\database.properties"));
            dbProperties.load(in);

            final String drivers = dbProperties.getProperty("jdbc.drivers");
            if (drivers != null) Class.forName(drivers);
            final String dbUrl = dbProperties.getProperty("jdbc.url");
            final String user = dbProperties.getProperty("jdbc.username");
            final String password = dbProperties.getProperty("jdbc.password");

            connection = DriverManager.getConnection(dbUrl, user, password);
        } catch (SQLException e) {
            System.out.println("SQLHandler error: SQLException in connect()");
        } catch (IOException e) {
            System.out.println("SQLHandler error: IOException in connect()");
        } catch (Exception e) {
            System.out.println("SQLHandler error: Some error occurred in connect()");
        }
    }

    public static void disconnect() {
        try {
            connection.close();
        } catch (SQLException e) {
            System.out.println("SQLHandler error: IOException in disconnect()");
        }
    }

    public static String getNickname(String login, String password) {
        String nickname = "";
        try {
            statement = connection.prepareStatement("SELECT nickname FROM users WHERE login = ? AND password = ?;");
            statement.setString(1, login);
            statement.setString(2, password);
            ResultSet result = statement.executeQuery();
            if (result.next())
                nickname = result.getString("nickname");
            else nickname = "ERROR: No such nickname"; // костыли - наше все
        } catch (SQLException e) {
            System.out.println("SQLHandler error: error in getNickname() -> " + e.getMessage());
            System.out.println(statement.toString());
        }
        return nickname;
    }

    private static void createUser(final String login, final String name, final String password) {
        try {
            statement = connection.prepareStatement("INSERT INTO users (login, nickname, password) VALUES (?, ?, ?)");
            statement.setString(1, login);
            statement.setString(2, name);
            statement.setString(3, password);
            statement.execute();
        } catch (SQLException e) {
            System.out.println("SQLHandler error: error in createUser() -> " + e.getMessage());
        }
    }
}
