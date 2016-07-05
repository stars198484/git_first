package ru.geekbrains.java2.dz.dz7.AlekseyNabor.Server;

import ru.geekbrains.java2.dz.dz7.AlekseyNabor.Client.Message;

import java.sql.*;
import java.util.Properties;

/**
 * Created by nabor on 30.06.2016.
 */
public class SQLConnection implements AutoCloseable {

    private String dbURL = "jdbc:postgresql://127.0.0.1:5432/postgres";
    private Connection connection;
    private Properties properties = new Properties();

    SQLConnection() {

        properties.setProperty("user","postgresql");
        properties.setProperty("password","postgresql");
     //   properties.setProperty("ssl","true");

        try {
            Class.forName("org.postgresql.Driver");
            this.connection = DriverManager.getConnection(dbURL,"postgres","postgres");
        } catch (ClassNotFoundException e) {
            System.err.println("Нет драйвера для работы с БД");
        } catch (SQLException e) {
            System.err.println("Connection error");
        }

    }

    boolean auth(Message message) {

        String[] auth = message.getMessage().split(" ");

        if (auth.length < 2)  return false;

        try {
            PreparedStatement statement = connection.prepareStatement("SELECT login,password FROM main WHERE login = ? AND password = ?");
            statement.setString(1, auth[0]);
            statement.setString(2, auth[1]);
            ResultSet result = statement.executeQuery();
            if (result.next()) {
                return true;
            }
        } catch (SQLException e) {
            System.err.println("Auth failed");
    }
        return false;
    }

    @Override
    public void close() throws Exception {
        connection.close();
    }
}
